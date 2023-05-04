package com.brutus.abio.service;

import com.brutus.abio.armsoft.wsdl._6.*;
import com.brutus.abio.armsoft.wsdl.tempuri.ITradeService;
import com.brutus.abio.controller.customer.dto.CartDTO;
import com.brutus.abio.controller.customer.dto.CartProductDTO;
import com.brutus.abio.exception.BadRequestException;
import com.brutus.abio.persistance.order.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@Service
@RequiredArgsConstructor
public class ArmSoftService {

    private final ITradeService iTradeService;
    private final CartDTOMapper cartDTOMapper;

    @Value("${armsoft.username}")
    private String username;
    @Value("${armsoft.password}")
    private String password;
    @Value("${armsoft.dbname}")
    private String dbName;

    public void sendSaleDocument(OrderDetails orderDetails) throws DatatypeConfigurationException {

        boolean isCash = orderDetails.getPaymentType().equals(PaymentType.CASH);

        ObjectFactory objectFactory = new ObjectFactory();

        // Start the session
        String sessionId = iTradeService.startSession(username, password, dbName, "HY-ARM");

        String id = orderDetails.getId();
        LocalDateTime orderDateTime = orderDetails.getOrderDateTime();
        Customer customer = orderDetails.getCustomer();
        Cart cart = orderDetails.getCart();
        CartDTO cartDTO = cartDTOMapper.apply(cart);


        // Create the document
        CreateSaleDocInfo createSaleDocInfo = objectFactory.createCreateSaleDocInfo();

//        DocumentNumber	Փաստաթղթի համար:	Տեքստային	Ոչ	O + Վաճառքի հերթական համար։ Օրինակ՝ O1001
        createSaleDocInfo.setDocumentNumber("O" + id);

//        DocumentDate Փաստաթղթի ամսաթիվ:	Ամսաթիվ	Այո	Վաճառքի ամսաթիվ։ Օրինակ՝ 2022-06-03 00։00։00
        createSaleDocInfo.setDocumentDate(createXMLGregorianFromLocalDateTime(orderDateTime));

//        ECRCheckNumber	ՀԴՄ կտրոնի համար:	Տեքստային	Ոչ	Դատարկ տեքստ
        createSaleDocInfo.setECRCheckNumber(objectFactory.createCreateSaleDocInfoECRCheckNumber(""));

//        CurrencyCode	Արժույթի կոդ:	Տեքստային	Այո	AMD
        createSaleDocInfo.setCurrencyCode("AMD");

//        Storage	Պահեստ:	Տեքստային	Այո	11
        createSaleDocInfo.setStorage("11");

//        CashDesk	Դրամարկղի կոդ:	Տեքստային	Այո	001
        createSaleDocInfo.setCashDesk("001");

//        BuyerCode	Գնորդի կոդ:	Տեքստային	Ոչ	Եթե վճարումը կանխիկ է, դատարկք տեքստ։ Եթե վճարումը անկանխիկ է 00000115
        if (isCash) {
            createSaleDocInfo.setBuyerCode(objectFactory.createCreateSaleDocInfoBuyerCode(""));
        } else {
            createSaleDocInfo.setBuyerCode(objectFactory.createCreateSaleDocInfoBuyerCode("00000115"));
        }

//        SalesConsultant	Վաճառող:	Տեքստային	Ոչ	Դատարկ տեքստ
        createSaleDocInfo.setSalesConsultant(objectFactory.createCreateSaleDocInfoSalesConsultant(""));

        BigDecimal originalPrice = cartDTO.getGlobalNormalPrice().add(cartDTO.getDeliveryPrice());
        BigDecimal discountAmount = originalPrice.subtract(cartDTO.getGlobalPrice());
        BigDecimal discountPercentage = discountAmount.divide(originalPrice, 2, RoundingMode.HALF_UP)
                .multiply(new BigDecimal("100"));

//        DiscountPercent	Զեղչի տոկոս:	Թվային	Այո	0
        createSaleDocInfo.setDiscountPercent(discountPercentage);

//        ReceivedAmount	Ստացված գումար:	Թվային	Այո	0
        createSaleDocInfo.setReceivedAmount(cartDTO.getGlobalPrice());

//        TotalAmount	Ընդհանուր գումար:	Թվային	Այո	0
        createSaleDocInfo.setTotalAmount(cartDTO.getGlobalPrice());

//        ChangeAmount	Մանր:	Թվային	Այո	0
        createSaleDocInfo.setChangeAmount(BigDecimal.ZERO);

//        AmountVAT	ԱԱՀ-ի գումար:	Թվային	Այո	0
        createSaleDocInfo.setAmountVAT(BigDecimal.ZERO);

//        Comment	Մեկնաբանություն:	Տեքստային	Ոչ	Հաճախորդի անուն ազգանուն + եթե օգտագործվել է կուպոն, օգտագործվել է կուպոն, կուպոնի կոդ։ Օրինակ՝ Գագիկ Վարդանյան 091997788, օգտագործվել է կուպոն N5577799
        String comment = customer.getFirst_name() + " " + customer.getLast_name();
        if (cart.getPromoCode() != null) {
            comment += " , օգտագործվել է կուպոն " + cart.getPromoCode().getCode();
        }
        createSaleDocInfo.setComment(objectFactory.createCreateSaleDocInfoComment(comment));

//        BankAcquiringPartner	POS-տերմինալ տրամադրող բանկի կոդ:	Տեքստային	Ոչ	Եթե վճարումը կանխիկ է, դատարկք տեքստ։ Եթե վճարումը անկանխիկ է 00000115
//        BankAcquiringContract	POS-տերմինալի տրամադրման պայմանագիր:	Տեքստային	Ոչ	Եթե վճարումը կանխիկ է, դատարկք տեքստ։ Եթե վճարումը անկանխիկ է 001
//        BankAcquiringCardIndex	Վճարային համակարգ (1-ARCA, 2-VISA, 3-MASTER, 4-AMEX, 5-MIR):	Տեքստային	Ոչ	Եթե վճարումը կանխիկ է, դատարկք տեքստ։ Եթե վճարումը անկանխիկ է ( ARCA, VISA, MASTER, AMEX, MIR արժեքներից որևէ մեկը )
        if (isCash) {
            createSaleDocInfo.setBankAcquiringPartner(objectFactory.createCreateSaleDocInfoBankAcquiringPartner(""));
            createSaleDocInfo.setBankAcquiringContract(objectFactory.createCreateSaleDocInfoBankAcquiringContract(""));
            createSaleDocInfo.setBankAcquiringCardIndex(objectFactory.createCreateSaleDocInfoBankAcquiringCardIndex(""));
        } else {
            createSaleDocInfo.setBankAcquiringPartner(objectFactory.createCreateSaleDocInfoBankAcquiringPartner("00000115"));
            createSaleDocInfo.setBankAcquiringContract(objectFactory.createCreateSaleDocInfoBankAcquiringContract("001"));
            createSaleDocInfo.setBankAcquiringCardIndex(objectFactory.createCreateSaleDocInfoBankAcquiringCardIndex("VISA"));
        }

//        PrePaymentPartner	Կանխավճարի գործընկեր:	Տեքստային	Ոչ	Դատարկ տեքստ
        createSaleDocInfo.setPrePaymentPartner(objectFactory.createCreateSaleDocInfoPrePaymentPartner(""));

//        PrePaymentContract	Կանխավճարի գործընկերոջ պայմանագիր:	Տեքստային	Ոչ	Դատարկ տեքստ
        createSaleDocInfo.setPrePaymentContract(objectFactory.createCreateSaleDocInfoPrePaymentContract(""));

//        PlasticCardAmount	Անկանխիկ վճարվող գումար:	Թվային	Այո	Եթե վճարումը կանխիկ է, 0։ Եթե վճարումը անկանխիկ է, վճարվող գումարը։
        if (isCash) {
            createSaleDocInfo.setPlasticCardAmount(BigDecimal.ZERO);
        } else {
            createSaleDocInfo.setPlasticCardAmount(cartDTO.getGlobalPrice());
        }

//        CreditAmount	Ապառիկ գումար:	Թվային	Այո	0
        createSaleDocInfo.setCreditAmount(BigDecimal.ZERO);

//        PayByBonusAmount	Բոնուսով մարվող գումար:	Թվային	Այո	0
        createSaleDocInfo.setPayByBonusAmount(BigDecimal.ZERO);

//        PayByPrePaymentAmount	Կանխավճարով մարվող գումար:	Թվային	Այո	0
        createSaleDocInfo.setPayByPrePaymentAmount(BigDecimal.ZERO);

//        VATType	ԱԱՀ-ի հաշվարկի ձև. 1 - ԱԱՀ-ով, 2 - ԱԱՀ-ն այդ թվում,  3 - Առանց ԱԱՀ, 4 - Զրոյական ԱԱՀ:		Այո	1
        createSaleDocInfo.setVATType(objectFactory.createCreateSaleDocInfoVATType("1"));

//        Owner	Հեղինակ:	Տեքստային	Ոչ	WEB
        createSaleDocInfo.setOwner(objectFactory.createCreateSaleDocInfoOwner("WEB"));

//        ISN	Փաստաթղթի նույնացուցիչ {GUID}:	Տեքստային	Ոչ	Դատարկ տեքստ
        createSaleDocInfo.setISN(objectFactory.createCreateSaleDocInfoISN(""));

//        IsDraft	Փաստաթղթի սևագիր վիճակի բնութագիր:	Բուլյան	Այո	0
        createSaleDocInfo.setIsDraft(false);

//        IsDeleted	Փաստաթղթի հեռացված վիճակի բնութագիր:	Բուլյան	Այո	0
        createSaleDocInfo.setIsDeleted(false);

//        ExtBody	Ընդլայնում:	Տեքստային	Ոչ	Դատարկ տեքստ
        createSaleDocInfo.setExtBody(objectFactory.createCreateSaleDocInfoExtBody(""));

//        Օբյեկտ InvoiceSpecificationRow (Անվանացուցակ օբյեկտի տողեր)
        ArrayOfInvoiceSpecificationRow arrayOfInvoiceSpecificationRow = new ArrayOfInvoiceSpecificationRow();

        for (CartProductDTO cartProductDTO :
                cartDTO.getCartProductDTOList()) {

            InvoiceSpecificationRow product = new InvoiceSpecificationRow();
//        ItemType	Տողի տեսակ (1-Ապրանք, 2-Ծառայություն):		Այո	Ապրանքի դեպքում 1, Առաքման դեպքում 2
            product.setItemType("1");

//        Storage	Պահեստի կոդ, որտեղից ելքագրվում են ապրանքներ:	Տեքստային	Այո	Ապրանքի դեպքում 11, Առաքման դեպքում դատարկ տեքստ
            product.setStorageCode(objectFactory.createInvoiceSpecificationRowStorageCode("11"));

//        ItemCode	Ապրանքի կամ ծառայության կոդ:	Տեքստային	Այո	Ապրանքի դեպքում, ապրանքի կոդը, առաքման դեպքում 0108002
            product.setItemCode(cartProductDTO.getProductCode());

//        ItemName	Ապրանքի կամ ծառայության անվանում:	Տեքստային	Ոչ	Դատարկ տեքստ
            product.setItemName(objectFactory.createInvoiceSpecificationRowItemName(""));

//        UnitCode	Ապրանքի կամ ծառայության չափման միավոր	Տեքստային	Այո	Դատարկ տեքստ
            product.setUnitCode("");

//        Quantity	Ապրանքի քանակը կամ ծառայության ծավալ:	Թվային	Այո	Ապրանքի դեպքում վաճառքի քանակ, առաքման դեպքում 1
            product.setQuantity(new BigDecimal(cartProductDTO.getQuantity()));

//        Price	Վաճառքի գին:	Թվային	Ոչ	Գին
            product.setPrice(cartProductDTO.getPrice().divide(product.getQuantity(), RoundingMode.UNNECESSARY));

//        Discount	Զեղչ:	Թվային	Ոչ	Զեղչ, եթե օգտագործվել է զեղչի կուպոն, զեղչի տոկոս, եթե օգտագործվել է գումարի կուպոն, զեղչը պետք է հաշվարկվի *** վերջին դեպքը առաքման վրա չի գործում
            //product.setDiscount(BigDecimal.ZERO);

//        DiscountPrice	Զեղչված գին:	Թվային	Այո	Գին - Գին * Զեղչ / 100
            product.setDiscountPrice(cartProductDTO.getDiscountPrice().divide(product.getQuantity(), RoundingMode.UNNECESSARY));

//        Amount	Գումար:	Թվային	Ոչ	Քանակ * Զեղչված գին
            product.setAmount(cartProductDTO.getDiscountPrice());

//        DiscountAmount	Զեղչված գումար:	Թվային	Այո	0
            product.setDiscountAmount(BigDecimal.ZERO);

//        AmountWithoutVAT	Գումար առանց ԱԱՀ:	Թվային	Այո	0
            product.setAmountWithoutVAT(BigDecimal.ZERO);
//        BeginAmount	Առանց զեղչի գումար:	Թվային	Ոչ	0
            product.setBeginAmount(BigDecimal.ZERO);
//        EnvironmentalFeePercent	Բնապահպանական հարկի տոկոս:	Թվային	Այո	0
            product.setEnvironmentalFeePercent(BigDecimal.ZERO);
//        EnvironmentalFeeAmount	Բնապահպանական հարկի գումար:	Թվային	Այո	0
            product.setEnvironmentalFeeAmount(BigDecimal.ZERO);
//        VAT	ԱԱՀ-ով հարկման հայտանիշ:	Բուլյան	Այո	1
            product.setVAT(true);
//        BarCode	Գծիկավոր կոդ:	Տեքստային	Ոչ	Դատարկ տեքստ
            product.setBarCode(objectFactory.createInvoiceSpecificationRowBarCode(""));
//        UsedBonus	Օգտագործված բոնուս:	Թվային	Ոչ	0
            product.setUsedBonus(BigDecimal.ZERO);
//        AccumulatedBonus	Կուտակված բոնուս:	Թվային	Ոչ	0
            product.setAccumulatedBonus(BigDecimal.ZERO);
//        PartyMethod	Խմբաքանակ: Կարող է լինել Ավտոընտրություն, եթե ընտրված չէ խմբաքանակ, կամ Ընտրված է խմբաքանակ, եթե ընտրվել է կոնկրետ խմբաքանակ:	Տեքստային	Ոչ	Դատարկ տեքստ
            product.setPartyMethod(objectFactory.createInvoiceSpecificationRowPartyMethod(""));
//        RowDescription	Տողի նկարագրություն:	Տեքստային	Ոչ	Դատարկ տեքստ
            product.setRowDescription(objectFactory.createInvoiceSpecificationRowRowDescription(""));
//        ExternalCode	Արտաքին կոդ:	Տեքստային	Ոչ	Դատարկ տեքստ
            product.setExternalCode(objectFactory.createInvoiceSpecificationRowExternalCode(""));

            arrayOfInvoiceSpecificationRow.getInvoiceSpecificationRow().add(product);
        }

        InvoiceSpecificationRow delivery = new InvoiceSpecificationRow();
        if (cartDTO.getDeliveryPrice().compareTo(BigDecimal.ZERO) > 0) {

//        ItemType	Տողի տեսակ (1-Ապրանք, 2-Ծառայություն):		Այո	Ապրանքի դեպքում 1, Առաքման դեպքում 2
            delivery.setItemType("2");

//        Storage	Պահեստի կոդ, որտեղից ելքագրվում են ապրանքներ:	Տեքստային	Այո	Ապրանքի դեպքում 11, Առաքման դեպքում դատարկ տեքստ
            delivery.setStorageCode(objectFactory.createInvoiceSpecificationRowStorageCode(""));

//        ItemCode	Ապրանքի կամ ծառայության կոդ:	Տեքստային	Այո	Ապրանքի դեպքում, ապրանքի կոդը, առաքման դեպքում 0108002
            delivery.setItemCode("0108002");

//        ItemName	Ապրանքի կամ ծառայության անվանում:	Տեքստային	Ոչ	Դատարկ տեքստ
            delivery.setItemName(objectFactory.createInvoiceSpecificationRowItemName(""));

//        UnitCode	Ապրանքի կամ ծառայության չափման միավոր	Տեքստային	Այո	Դատարկ տեքստ
            delivery.setUnitCode("");

//        Quantity	Ապրանքի քանակը կամ ծառայության ծավալ:	Թվային	Այո	Ապրանքի դեպքում վաճառքի քանակ, առաքման դեպքում 1
            delivery.setQuantity(new BigDecimal("1"));

//        Price	Վաճառքի գին:	Թվային	Ոչ	Գին
            delivery.setPrice(cartDTO.getDeliveryPrice());

//        Discount	Զեղչ:	Թվային	Ոչ	Զեղչ, եթե օգտագործվել է զեղչի կուպոն, զեղչի տոկոս, եթե օգտագործվել է գումարի կուպոն, զեղչը պետք է հաշվարկվի *** վերջին դեպքը առաքման վրա չի գործում
            //product.setDiscount();

//        DiscountPrice	Զեղչված գին:	Թվային	Այո	Գին - Գին * Զեղչ / 100
            delivery.setDiscountPrice(cartDTO.getDeliveryPrice());

//        Amount	Գումար:	Թվային	Ոչ	Քանակ * Զեղչված գին
            delivery.setAmount(delivery.getQuantity().multiply(delivery.getPrice()));

//        DiscountAmount	Զեղչված գումար:	Թվային	Այո	0
            delivery.setDiscountAmount(BigDecimal.ZERO);

//        AmountWithoutVAT	Գումար առանց ԱԱՀ:	Թվային	Այո	0
            delivery.setAmountWithoutVAT(BigDecimal.ZERO);
//        BeginAmount	Առանց զեղչի գումար:	Թվային	Ոչ	0
            delivery.setBeginAmount(BigDecimal.ZERO);
//        EnvironmentalFeePercent	Բնապահպանական հարկի տոկոս:	Թվային	Այո	0
            delivery.setEnvironmentalFeePercent(BigDecimal.ZERO);
//        EnvironmentalFeeAmount	Բնապահպանական հարկի գումար:	Թվային	Այո	0
            delivery.setEnvironmentalFeeAmount(BigDecimal.ZERO);
//        VAT	ԱԱՀ-ով հարկման հայտանիշ:	Բուլյան	Այո	1
            delivery.setVAT(true);
//        BarCode	Գծիկավոր կոդ:	Տեքստային	Ոչ	Դատարկ տեքստ
            delivery.setBarCode(objectFactory.createInvoiceSpecificationRowBarCode(""));
//        UsedBonus	Օգտագործված բոնուս:	Թվային	Ոչ	0
            delivery.setUsedBonus(BigDecimal.ZERO);
//        AccumulatedBonus	Կուտակված բոնուս:	Թվային	Ոչ	0
            delivery.setAccumulatedBonus(BigDecimal.ZERO);
//        PartyMethod	Խմբաքանակ: Կարող է լինել Ավտոընտրություն, եթե ընտրված չէ խմբաքանակ, կամ Ընտրված է խմբաքանակ, եթե ընտրվել է կոնկրետ խմբաքանակ:	Տեքստային	Ոչ	Դատարկ տեքստ
            delivery.setPartyMethod(objectFactory.createInvoiceSpecificationRowPartyMethod(""));
//        RowDescription	Տողի նկարագրություն:	Տեքստային	Ոչ	Դատարկ տեքստ
            delivery.setRowDescription(objectFactory.createInvoiceSpecificationRowRowDescription(""));
//        ExternalCode	Արտաքին կոդ:	Տեքստային	Ոչ	Դատարկ տեքստ
            delivery.setExternalCode(objectFactory.createInvoiceSpecificationRowExternalCode(""));

            arrayOfInvoiceSpecificationRow.getInvoiceSpecificationRow().add(delivery);
        }

        JAXBElement<ArrayOfInvoiceSpecificationRow> arrayOfInvoiceSpecificationJaxb = objectFactory.createArrayOfInvoiceSpecificationRow(arrayOfInvoiceSpecificationRow);

        createSaleDocInfo.setSpecification(arrayOfInvoiceSpecificationJaxb);

        CreateSaleDoc createSaleDoc = new CreateSaleDoc();
        createSaleDoc.setSaleDocInfo(objectFactory.createCreateSaleDocInfo(createSaleDocInfo));

        createSaleDoc.setSessionId(sessionId);
        createSaleDoc.setSeqNumber(100);

        //iTradeService.createSaleDoc(sessionId, 100, createSaleDoc.getSaleDocInfo().getValue());


        try {
            JAXBContext context = JAXBContext.newInstance(CreateSaleDoc.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            marshaller.marshal(createSaleDoc, new File("C://Users//Grisha Pipoyan//Desktop//CreateSaleDoc.xml"));
        } catch (JAXBException e) {
           throw new BadRequestException(e.getMessage());
        }


        String response = iTradeService.createSaleDoc(sessionId, 1, createSaleDocInfo);

        // Stop the session
        iTradeService.stopSession(sessionId);
    }

    public static XMLGregorianCalendar createXMLGregorianFromLocalDateTime(LocalDateTime dateTime) throws DatatypeConfigurationException {
        ZonedDateTime zonedDateTime = dateTime.atZone(ZoneId.systemDefault()); // <== default
        OffsetDateTime offsetDateTime = zonedDateTime.toOffsetDateTime();

        return DatatypeFactory.newInstance()
                .newXMLGregorianCalendar(offsetDateTime.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
    }

}
