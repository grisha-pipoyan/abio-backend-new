
package com.brutus.abio.armsoft.wsdl._6;

import com.brutus.abio.armsoft.wsdl.serialization.arrays.ArrayOfstring;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the am.armsoft.accountant._6 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CashInDocInfoBaseISN_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "BaseISN");
    private final static QName _CashInDocInfoPartnerCode_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "PartnerCode");
    private final static QName _CashInDocInfoOwner_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "Owner");
    private final static QName _CashInDocInfoBase_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "Base");
    private final static QName _CashInDocInfoBankAcquiringContract_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "BankAcquiringContract");
    private final static QName _CashInDocInfoEmployee_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "Employee");
    private final static QName _CashInDocInfoContract_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "Contract");
    private final static QName _CashInDocInfoBankAcquiringPartner_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "BankAcquiringPartner");
    private final static QName _CashInDocInfoAppendix_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "Appendix");
    private final static QName _CashInDocInfoComment_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "Comment");
    private final static QName _CashInDocInfoISN_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ISN");
    private final static QName _CashInDocInfoECRCheckNumber_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ECRCheckNumber");
    private final static QName _CashInDocInfoCashOutDesk_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "CashOutDesk");
    private final static QName _CashInDocInfoCashierShiftNumber_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "CashierShiftNumber");
    private final static QName _CashInDocInfoExtBody_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ExtBody");
    private final static QName _CashInDocInfoAccountCode_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "AccountCode");
    private final static QName _CashInDocInfoBankAcquiringCardIndex_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "BankAcquiringCardIndex");
    private final static QName _CashListRowNextNumIn_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "NextNumIn");
    private final static QName _CashListRowNextMTBillNum_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "NextMTBillNum");
    private final static QName _CashListRowNextMTBillReturnNum_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "NextMTBillReturnNum");
    private final static QName _CashListRowNextCashierShiftNum_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "NextCashierShiftNum");
    private final static QName _CashListRowNextNumOut_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "NextNumOut");
    private final static QName _ArrayOfMTReturnFromCustomerSpecificationRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ArrayOfMTReturnFromCustomerSpecificationRow");
    private final static QName _ArrayOfProductListRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ArrayOfProductListRow");
    private final static QName _ChunkedResultOfMTBarCodes_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ChunkedResultOfMTBarCodes");
    private final static QName _InternalMoveSpecificationRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "InternalMoveSpecificationRow");
    private final static QName _ArrayOfCashRemains_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ArrayOfCashRemains");
    private final static QName _ArrayOfProductGroupListRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ArrayOfProductGroupListRow");
    private final static QName _ArrayOfProductShortListRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ArrayOfProductShortListRow");
    private final static QName _BankInDocInfo_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "BankInDocInfo");
    private final static QName _MTComplectationDocInfo_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "MTComplectationDocInfo");
    private final static QName _ArrayOfMTComplectationSpecificationRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ArrayOfMTComplectationSpecificationRow");
    private final static QName _ChunkedResultOfPartCashBankAccRemainsRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ChunkedResultOfPartCashBankAccRemainsRow");
    private final static QName _ArrayOfPartnerSettlementAccountInfo_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ArrayOfPartnerSettlementAccountInfo");
    private final static QName _PartnerBonusRemainsListRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "PartnerBonusRemainsListRow");
    private final static QName _ArrayOfPartnerListRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ArrayOfPartnerListRow");
    private final static QName _ChunkedResultOfCreateProductInfo_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ChunkedResultOfCreateProductInfo");
    private final static QName _ChunkedResultOfPartnerListRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ChunkedResultOfPartnerListRow");
    private final static QName _ArrayOfDocumentsListRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ArrayOfDocumentsListRow");
    private final static QName _ChunkedResultOfDocumentsListRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ChunkedResultOfDocumentsListRow");
    private final static QName _MTStockTakingDocInfo_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "MTStockTakingDocInfo");
    private final static QName _MTIncomeSpecificationRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "MTIncomeSpecificationRow");
    private final static QName _ArrayOfSalesAnalysisRowGroupedbyGoodsAndServices_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ArrayOfSalesAnalysisRowGroupedbyGoodsAndServices");
    private final static QName _ArrayOfSalesAnalysisRowGroupedByPartner_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ArrayOfSalesAnalysisRowGroupedByPartner");
    private final static QName _MTComplectationSpecificationRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "MTComplectationSpecificationRow");
    private final static QName _ArrayOfInternalMoveSpecificationRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ArrayOfInternalMoveSpecificationRow");
    private final static QName _CreateProductInfo_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "CreateProductInfo");
    private final static QName _PartnerContractInfo_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "PartnerContractInfo");
    private final static QName _ChunkedResultOfSalesAnalysisRowGroupedByPartner_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ChunkedResultOfSalesAnalysisRowGroupedByPartner");
    private final static QName _ArrayOfPartnerBusinessAddressInfo_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ArrayOfPartnerBusinessAddressInfo");
    private final static QName _VATType_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "VATType");
    private final static QName _ChunkedResultOfProductListRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ChunkedResultOfProductListRow");
    private final static QName _CreateSaleDocInfo_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "CreateSaleDocInfo");
    private final static QName _ArrayOfPriceTypeListRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ArrayOfPriceTypeListRow");
    private final static QName _ChunkedResultOfCodeCaptionListRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ChunkedResultOfCodeCaptionListRow");
    private final static QName _CashRemains_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "CashRemains");
    private final static QName _CreateInternalMoveDocInfo_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "CreateInternalMoveDocInfo");
    private final static QName _InvoiceSpecificationRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "InvoiceSpecificationRow");
    private final static QName _ArrayOfProductQuantityUnitInfo_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ArrayOfProductQuantityUnitInfo");
    private final static QName _PartCashBankAccRemainsRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "PartCashBankAccRemainsRow");
    private final static QName _MTExpenseDocInfo_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "MTExpenseDocInfo");
    private final static QName _ChunkedResultOfProductShortListRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ChunkedResultOfProductShortListRow");
    private final static QName _PriceListRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "PriceListRow");
    private final static QName _CashOutDocInfo_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "CashOutDocInfo");
    private final static QName _SerializationBase_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "SerializationBase");
    private final static QName _ArrayOfProductBarCodeInfo_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ArrayOfProductBarCodeInfo");
    private final static QName _ArrayOfPartnerGroupListRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ArrayOfPartnerGroupListRow");
    private final static QName _MTExpenseSpecificationRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "MTExpenseSpecificationRow");
    private final static QName _MTBarCodes_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "MTBarCodes");
    private final static QName _CreatePartnerInfo_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "CreatePartnerInfo");
    private final static QName _GoodAvailabilityRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GoodAvailabilityRow");
    private final static QName _ProductGroupListRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ProductGroupListRow");
    private final static QName _ArrayOfStorageListRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ArrayOfStorageListRow");
    private final static QName _ArrayOfGoodAvailabilityRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ArrayOfGoodAvailabilityRow");
    private final static QName _CreateInvoiceDocInfo_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "CreateInvoiceDocInfo");
    private final static QName _ChunkedResultOfCashRemains_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ChunkedResultOfCashRemains");
    private final static QName _ReportCurrsTypesEnum_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ReportCurrsTypesEnum");
    private final static QName _ProductBarCodeInfo_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ProductBarCodeInfo");
    private final static QName _StorageListRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "StorageListRow");
    private final static QName _ChunkedResultOfPriceListRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ChunkedResultOfPriceListRow");
    private final static QName _MTStockTakingSpecificationRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "MTStockTakingSpecificationRow");
    private final static QName _DocumentState_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "DocumentState");
    private final static QName _ArrayOfMTBarCodes_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ArrayOfMTBarCodes");
    private final static QName _ChunkedResultOfSalesAnalysisRowGroupedbyGoodsAndServices_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ChunkedResultOfSalesAnalysisRowGroupedbyGoodsAndServices");
    private final static QName _SalesAnalysisRowGroupedbyGoodsAndServices_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "SalesAnalysisRowGroupedbyGoodsAndServices");
    private final static QName _CashListRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "CashListRow");
    private final static QName _ArrayOfMTStockTakingSpecificationRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ArrayOfMTStockTakingSpecificationRow");
    private final static QName _ArrayOfMTIncomeSpecificationRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ArrayOfMTIncomeSpecificationRow");
    private final static QName _SalesAnalysisRowGroupedByPartner_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "SalesAnalysisRowGroupedByPartner");
    private final static QName _ArrayOfCreatePartnerInfo_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ArrayOfCreatePartnerInfo");
    private final static QName _ProductListRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ProductListRow");
    private final static QName _ArrayOfMTExpenseSpecificationRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ArrayOfMTExpenseSpecificationRow");
    private final static QName _ChunkedResultOfCreatePartnerInfo_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ChunkedResultOfCreatePartnerInfo");
    private final static QName _ArrayOfCodeCaptionListRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ArrayOfCodeCaptionListRow");
    private final static QName _PriceTypeListRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "PriceTypeListRow");
    private final static QName _SalesAnalysisDataProviderDataRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "SalesAnalysisDataProvider.DataRow");
    private final static QName _MTIncomeDocInfo_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "MTIncomeDocInfo");
    private final static QName _EditPartnerInfo_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "EditPartnerInfo");
    private final static QName _ProductShortListRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ProductShortListRow");
    private final static QName _ChunkedResultOfGoodAvailabilityRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ChunkedResultOfGoodAvailabilityRow");
    private final static QName _ChunkedResultOfSalesAnalysisDataProviderDataRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ChunkedResultOfSalesAnalysisDataProvider.DataRow");
    private final static QName _MTReturnFromCustomerDocInfo_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "MTReturnFromCustomerDocInfo");
    private final static QName _DocumentsListRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "DocumentsListRow");
    private final static QName _PartnerBusinessAddressInfo_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "PartnerBusinessAddressInfo");
    private final static QName _ArrayOfPartCashBankAccRemainsRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ArrayOfPartCashBankAccRemainsRow");
    private final static QName _ExtendableRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ExtendableRow");
    private final static QName _CashInDocInfo_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "CashInDocInfo");
    private final static QName _PartnerGroupListRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "PartnerGroupListRow");
    private final static QName _PartnerListRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "PartnerListRow");
    private final static QName _ArrayOfCashListRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ArrayOfCashListRow");
    private final static QName _ArrayOfInvoiceSpecificationRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "Specification");
    private final static QName _ArrayOfPartnerBonusRemainsListRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ArrayOfPartnerBonusRemainsListRow");
    private final static QName _MTReturnFromCustomerSpecificationRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "MTReturnFromCustomerSpecificationRow");
    private final static QName _ArrayOfPriceListRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ArrayOfPriceListRow");
    private final static QName _ArrayOfPartnerContractInfo_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ArrayOfPartnerContractInfo");
    private final static QName _CodeCaptionListRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "CodeCaptionListRow");
    private final static QName _PartnerSettlementAccountInfo_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "PartnerSettlementAccountInfo");
    private final static QName _PartnerRemCorrectDocInfo_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "PartnerRemCorrectDocInfo");
    private final static QName _ArrayOfCreateProductInfo_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ArrayOfCreateProductInfo");
    private final static QName _ProductQuantityUnitInfo_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ProductQuantityUnitInfo");
    private final static QName _UpdateProductInfo_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "UpdateProductInfo");
    private final static QName _ChunkedResultOfPartnerBonusRemainsListRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ChunkedResultOfPartnerBonusRemainsListRow");
    private final static QName _ArrayOfSalesAnalysisDataProviderDataRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ArrayOfSalesAnalysisDataProvider.DataRow");
    private final static QName _GetProductByBarCodeWithImageResponseGetProductByBarCodeWithImageResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetProductByBarCodeWithImageResult");
    private final static QName _GetPartnerBonusRemainsContract_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "contract");
    private final static QName _GetPartnerBonusRemainsPartnerCode_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "partnerCode");
    private final static QName _GetProductsInfoNextChunkResponseGetProductsInfoNextChunkResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetProductsInfoNextChunkResult");
    private final static QName _GetPartnersListResponseGetPartnersListResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetPartnersListResult");
    private final static QName _GetPartnerByCodeCode_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "Code");
    private final static QName _GetProductByNameWithImageResponseGetProductByNameWithImageResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetProductByNameWithImageResult");
    private final static QName _CreatePartnerInfoTaxCode_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "TaxCode");
    private final static QName _CreatePartnerInfoMainAim_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "MainAim");
    private final static QName _CreatePartnerInfoType_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "Type");
    private final static QName _CreatePartnerInfoStateRegister_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "StateRegister");
    private final static QName _CreatePartnerInfoBusinessAddresses_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "BusinessAddresses");
    private final static QName _CreatePartnerInfoPhone_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "Phone");
    private final static QName _CreatePartnerInfoNextContractNumber_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "NextContractNumber");
    private final static QName _CreatePartnerInfoLongName_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "LongName");
    private final static QName _CreatePartnerInfoManagerPosition_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ManagerPosition");
    private final static QName _CreatePartnerInfoPartnerContracts_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "PartnerContracts");
    private final static QName _CreatePartnerInfoEmail_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "Email");
    private final static QName _CreatePartnerInfoAddress_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "Address");
    private final static QName _CreatePartnerInfoManagerName_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ManagerName");
    private final static QName _CreatePartnerInfoSettlementAccounts_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "SettlementAccounts");
    private final static QName _CreatePartnerInfoPassport_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "Passport");
    private final static QName _CreatePartnerInfoBirthday_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "Birthday");
    private final static QName _CreatePartnerInfoChiefAccountantName_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ChiefAccountantName");
    private final static QName _CreatePartnerInfoBusinessAddress_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "BusinessAddress");
    private final static QName _CreatePartnerInfoSex_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "Sex");
    private final static QName _CreatePartnerInfoChiefAccountantPosition_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ChiefAccountantPosition");
    private final static QName _GetProductRemByCodeResponseGetProductRemByCodeResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetProductRemByCodeResult");
    private final static QName _StorageListRowResponse_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "Response");
    private final static QName _GetProductsInfoListByModifiedDateLikeName_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "LikeName");
    private final static QName _GetProductsInfoListByModifiedDateGroup_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "Group");
    private final static QName _GetProductRemByCodeDetailedResponseGetProductRemByCodeDetailedResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetProductRemByCodeDetailedResult");
    private final static QName _GetPartnerByCodeResponseGetPartnerByCodeResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetPartnerByCodeResult");
    private final static QName _GetDocumentsNextChunkResponseGetDocumentsNextChunkResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetDocumentsNextChunkResult");
    private final static QName _MTReturnFromCustomerDocInfoECRReturnCheckNumber_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ECRReturnCheckNumber");
    private final static QName _MTReturnFromCustomerDocInfoBaseDocTaxInvoiceDate_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "BaseDocTaxInvoiceDate");
    private final static QName _MTReturnFromCustomerDocInfoECRBaseCheckNumber_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ECRBaseCheckNumber");
    private final static QName _MTReturnFromCustomerDocInfoSpecification_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "Specification");
    private final static QName _MTReturnFromCustomerDocInfoTaxExportType_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "TaxExportType");
    private final static QName _MTReturnFromCustomerDocInfoAllower_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "Allower");
    private final static QName _MTReturnFromCustomerDocInfoTrust_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "Trust");
    private final static QName _MTReturnFromCustomerDocInfoBaseDocTaxInvoiceSeries_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "BaseDocTaxInvoiceSeries");
    private final static QName _MTReturnFromCustomerDocInfoTaxInvoiceNumber_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "TaxInvoiceNumber");
    private final static QName _MTReturnFromCustomerDocInfoCashDesk_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "CashDesk");
    private final static QName _MTReturnFromCustomerDocInfoMediator_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "Mediator");
    private final static QName _MTReturnFromCustomerDocInfoMachine_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "Machine");
    private final static QName _MTReturnFromCustomerDocInfoChiefAccountant_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ChiefAccountant");
    private final static QName _MTReturnFromCustomerDocInfoTaxInvoiceSeries_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "TaxInvoiceSeries");
    private final static QName _MTReturnFromCustomerDocInfoPriceType_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "PriceType");
    private final static QName _MTReturnFromCustomerDocInfoStorage_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "Storage");
    private final static QName _MTReturnFromCustomerDocInfoSalesConsultant_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "SalesConsultant");
    private final static QName _MTReturnFromCustomerDocInfoTaxInvoiceDate_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "TaxInvoiceDate");
    private final static QName _MTReturnFromCustomerDocInfoBaseDocTaxInvoiceNumber_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "BaseDocTaxInvoiceNumber");
    private final static QName _PartCashBankAccRemainsRowContractDate_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ContractDate");
    private final static QName _PartCashBankAccRemainsRowContractName_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ContractName");
    private final static QName _PartCashBankAccRemainsRowCurrCode_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "CurrCode");
    private final static QName _PartCashBankAccRemainsRowContractCode_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ContractCode");
    private final static QName _PartCashBankAccRemainsRowPartName_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "PartName");
    private final static QName _PartCashBankAccRemainsRowPartCode_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "PartCode");
    private final static QName _GetCountriesListResponseGetCountriesListResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetCountriesListResult");
    private final static QName _CreateCashOutDocCashOutDocInfo_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "cashOutDocInfo");
    private final static QName _CreateBankInDocBankInDocInfo_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "bankInDocInfo");
    private final static QName _CashOutDocInfoPassportNumber_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "PassportNumber");
    private final static QName _CashOutDocInfoCashInDesk_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "CashInDesk");
    private final static QName _GetPartnersBonusRemainsByPartnerGroupResponseGetPartnersBonusRemainsByPartnerGroupResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetPartnersBonusRemainsByPartnerGroupResult");
    private final static QName _GetCashesListResponseGetCashesListResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetCashesListResult");
    private final static QName _GetProductsListByCPACodesResponseGetProductsListByCPACodesResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetProductsListByCPACodesResult");
    private final static QName _ProductGroupListRowParent_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "Parent");
    private final static QName _ProductGroupListRowCaptionRU_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "CaptionRU");
    private final static QName _ProductGroupListRowCaptionEn_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "CaptionEn");
    private final static QName _MTIncomeSpecificationRowUseFulLife_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "UseFulLife");
    private final static QName _MTIncomeSpecificationRowProperty1_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "Property1");
    private final static QName _MTIncomeSpecificationRowProperty2_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "Property2");
    private final static QName _MTIncomeSpecificationRowCountry_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "Country");
    private final static QName _MTIncomeSpecificationRowProducer_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "Producer");
    private final static QName _GetForETLDocumentsListResponseGetForETLDocumentsListResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetForETLDocumentsListResult");
    private final static QName _CreateProductInfoCaptionEN_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "CaptionEN");
    private final static QName _CreateProductInfoProductBarCodes_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ProductBarCodes");
    private final static QName _CreateProductInfoBarCode_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "BarCode");
    private final static QName _CreateProductInfoDescription_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "Description");
    private final static QName _CreateProductInfoPLUCode_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "PLUCode");
    private final static QName _CreateProductInfoCPACode_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "CPACode");
    private final static QName _CreateProductInfoExternalCode_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ExternalCode");
    private final static QName _CreateProductInfoAdditionalDescription2_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "AdditionalDescription2");
    private final static QName _CreateProductInfoProductQntUnits_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ProductQntUnits");
    private final static QName _CreateProductInfoAdditionalDescription1_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "AdditionalDescription1");
    private final static QName _CreateProductInfoImage_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "Image");
    private final static QName _CreateProductInfoExpMethod_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ExpMethod");
    private final static QName _CreateProductInfoSubstituteItemsGroup_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "SubstituteItemsGroup");
    private final static QName _MTComplectationSpecificationRowPartyMethod_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "PartyMethod");
    private final static QName _GetPartnersListByModifiedDateResponseGetPartnersListByModifiedDateResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetPartnersListByModifiedDateResult");
    private final static QName _GetProductsListByExternalCodesExternalCodes_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ExternalCodes");
    private final static QName _GetSalesAnalysisGroupedByPartnerGoodCode_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GoodCode");
    private final static QName _GetSalesAnalysisGroupedByPartnerGoodsOrServices_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GoodsOrServices");
    private final static QName _GetSalesAnalysisGroupedByPartnerGoodGroup_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GoodGroup");
    private final static QName _GetSalesAnalysisGroupedByPartnerPartnerType_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "PartnerType");
    private final static QName _GetProductGroupsListResponseGetProductGroupsListResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetProductGroupsListResult");
    private final static QName _GetMTBarCodesNextChunkResponseGetMTBarCodesNextChunkResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetMTBarCodesNextChunkResult");
    private final static QName _GetDocumentsListResponseGetDocumentsListResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetDocumentsListResult");
    private final static QName _UpdatePricesPriceRow_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "PriceRow");
    private final static QName _EditPartnerInfoExtensionBody_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ExtensionBody");
    private final static QName _GetProductsListShortNextChunkResponseGetProductsListShortNextChunkResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetProductsListShortNextChunkResult");
    private final static QName _CreatePartnerRemCorrectDocPartRemCorrectDocInfo_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "partRemCorrectDocInfo");
    private final static QName _GetSalesAnalysisResponseGetSalesAnalysisResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetSalesAnalysisResult");
    private final static QName _GetProductByNameWithImageName_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "Name");
    private final static QName _GetSalesAnalysisGroupedByPartnerNextChunkResponseGetSalesAnalysisGroupedByPartnerNextChunkResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetSalesAnalysisGroupedByPartnerNextChunkResult");
    private final static QName _GetProductsListByCPACodesCPACodes_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "CPACodes");
    private final static QName _GetPartnerDiscountPercentByBarCodePartnerBarCode_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "partnerBarCode");
    private final static QName _GetPartnersBonusRemainsByPartnerGroupPartnerGroup_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "partnerGroup");
    private final static QName _GetVersionResponseGetVersionResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetVersionResult");
    private final static QName _GetPartnerByIdResponseGetPartnerByIdResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetPartnerByIdResult");
    private final static QName _CreateCashInDocCashInDocInfo_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "cashInDocInfo");
    private final static QName _CreateSaleDocInfoPrePaymentPartner_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "PrePaymentPartner");
    private final static QName _CreateSaleDocInfoPrePaymentContract_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "PrePaymentContract");
    private final static QName _CreateSaleDocInfoBuyerCode_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "BuyerCode");
    private final static QName _LoadBankInDocResponseLoadBankInDocResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "LoadBankInDocResult");
    private final static QName _GetPartnersInfoNextChunkResponseGetPartnersInfoNextChunkResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetPartnersInfoNextChunkResult");
    private final static QName _GoodAvailabilityRowPartyDocUsableDate_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "PartyDocUsableDate");
    private final static QName _GoodAvailabilityRowPartyDocCountry_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "PartyDocCountry");
    private final static QName _GoodAvailabilityRowPartyDocPropertyValue1_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "PartyDocPropertyValue1");
    private final static QName _GoodAvailabilityRowPartyPartCaption_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "PartyPartCaption");
    private final static QName _GoodAvailabilityRowPartyDocPropertyValue1Code_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "PartyDocPropertyValue1Code");
    private final static QName _GoodAvailabilityRowPartyDocType_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "PartyDocType");
    private final static QName _GoodAvailabilityRowPartyDocPropertyValue2_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "PartyDocPropertyValue2");
    private final static QName _GoodAvailabilityRowPartyContractCaption_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "PartyContractCaption");
    private final static QName _GoodAvailabilityRowPartyDocPropertyValue2Code_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "PartyDocPropertyValue2Code");
    private final static QName _GoodAvailabilityRowPartyDocPropertyType1_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "PartyDocPropertyType1");
    private final static QName _GoodAvailabilityRowPartyPartTaxCode_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "PartyPartTaxCode");
    private final static QName _GoodAvailabilityRowPartyDocPropertyType2_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "PartyDocPropertyType2");
    private final static QName _GoodAvailabilityRowPartyDocNum_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "PartyDocNum");
    private final static QName _GoodAvailabilityRowPartyDocProducer_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "PartyDocProducer");
    private final static QName _GoodAvailabilityRowPartyContractCode_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "PartyContractCode");
    private final static QName _GetProductByIdWithImageResponseGetProductByIdWithImageResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetProductByIdWithImageResult");
    private final static QName _GetSalesAnalysisNextChunkResponseGetSalesAnalysisNextChunkResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetSalesAnalysisNextChunkResult");
    private final static QName _GetProductRemsDetailedResponseGetProductRemsDetailedResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetProductRemsDetailedResult");
    private final static QName _GetPartnerGroupsListResponseGetPartnerGroupsListResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetPartnerGroupsListResult");
    private final static QName _UpdateProductInfoUnit_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "Unit");
    private final static QName _UpdateProductInfoAltUnit_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "AltUnit");
    private final static QName _UpdateProductInfoAdditionalDescr2_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "AdditionalDescr2");
    private final static QName _UpdateProductInfoAdditionalDescr1_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "AdditionalDescr1");
    private final static QName _LoadInternalMoveDocResponseLoadInternalMoveDocResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "LoadInternalMoveDocResult");
    private final static QName _GetProductsForGivenListCodesResponseGetProductsForGivenListCodesResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetProductsForGivenListCodesResult");
    private final static QName _GetPartnersNextChunkResponseGetPartnersNextChunkResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetPartnersNextChunkResult");
    private final static QName _GetProductPricesWithImagesResponseGetProductPricesWithImagesResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetProductPricesWithImagesResult");
    private final static QName _LoadCashInDocResponseLoadCashInDocResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "LoadCashInDocResult");
    private final static QName _UpdateProductProductInfo_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ProductInfo");
    private final static QName _MTIncomeDocInfoInvoiceNumber_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "InvoiceNumber");
    private final static QName _LoadPartnerRemCorrectDocResponseLoadPartnerRemCorrectDocResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "LoadPartnerRemCorrectDocResult");
    private final static QName _GetCodeCaptionListNextChunkResponseGetCodeCaptionListNextChunkResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetCodeCaptionListNextChunkResult");
    private final static QName _GetPriceTypesListResponseGetPriceTypesListResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetPriceTypesListResult");
    private final static QName _GetForETLDocumentsListDocTypesList_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "DocTypesList");
    private final static QName _GetECRChecksListResponseGetECRChecksListResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetECRChecksListResult");
    private final static QName _LoadSaleDocResponseLoadSaleDocResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "LoadSaleDocResult");
    private final static QName _GetPartnersRemsResponseGetPartnersRemsResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetPartnersRemsResult");
    private final static QName _StartSessionPassword_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "Password");
    private final static QName _StartSessionDBName_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "DBName");
    private final static QName _StartSessionCultureName_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "CultureName");
    private final static QName _StartSessionUserName_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "UserName");
    private final static QName _GetPartnerGroupsListParentGroup_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ParentGroup");
    private final static QName _GetDocumentsListCurrencyCode_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "CurrencyCode");
    private final static QName _GetProductsInfoListByModifiedDateResponseGetProductsInfoListByModifiedDateResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetProductsInfoListByModifiedDateResult");
    private final static QName _GetStoragesListResponseGetStoragesListResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetStoragesListResult");
    private final static QName _CashRemainsCurrency_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "Currency");
    private final static QName _PartnerListRowSettlementAccount_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "SettlementAccount");
    private final static QName _GetProductRemsNextChunkResponseGetProductRemsNextChunkResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetProductRemsNextChunkResult");
    private final static QName _CreateInvoiceDocInvoiceDocInfo_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "InvoiceDocInfo");
    private final static QName _CreateMTStockTakingDocMTStockTaking_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "MTStockTaking");
    private final static QName _LoadMTIncomeDocResponseLoadMTIncomeDocResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "LoadMTIncomeDocResult");
    private final static QName _GetSalesAnalysisGroupedByGoodsAndServicesNextChunkResponseGetSalesAnalysisGroupedByGoodsAndServicesNextChunkResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetSalesAnalysisGroupedByGoodsAndServicesNextChunkResult");
    private final static QName _GetProductsListResponseGetProductsListResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetProductsListResult");
    private final static QName _SalesAnalysisRowGroupedbyGoodsAndServicesGoodDescription_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GoodDescription");
    private final static QName _GetProductByIdResponseGetProductByIdResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetProductByIdResult");
    private final static QName _CreateInvoiceDocInfoSupplierAdditionalData_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "SupplierAdditionalData");
    private final static QName _CreateInvoiceDocInfoBuyerShippingMethod_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "BuyerShippingMethod");
    private final static QName _CreateInvoiceDocInfoSupplierTaxCode_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "SupplierTaxCode");
    private final static QName _CreateInvoiceDocInfoBuyerTaxCode_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "BuyerTaxCode");
    private final static QName _CreateInvoiceDocInfoSupplierManagerPost_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "SupplierManagerPost");
    private final static QName _CreateInvoiceDocInfoCredentialNumber_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "CredentialNumber");
    private final static QName _CreateInvoiceDocInfoSupplierBusinessAddress_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "SupplierBusinessAddress");
    private final static QName _CreateInvoiceDocInfoBuyerSettlementAccount_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "BuyerSettlementAccount");
    private final static QName _CreateInvoiceDocInfoBuyerAdditionalData_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "BuyerAdditionalData");
    private final static QName _CreateInvoiceDocInfoBuyerChiefAccountantPost_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "BuyerChiefAccountantPost");
    private final static QName _CreateInvoiceDocInfoSupplierManagerName_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "SupplierManagerName");
    private final static QName _CreateInvoiceDocInfoBuyerManagerName_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "BuyerManagerName");
    private final static QName _CreateInvoiceDocInfoSupplierLegalAddress_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "SupplierLegalAddress");
    private final static QName _CreateInvoiceDocInfoBuyerChiefAccountantName_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "BuyerChiefAccountantName");
    private final static QName _CreateInvoiceDocInfoPricesTypes_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "PricesTypes");
    private final static QName _CreateInvoiceDocInfoBuyerBusinessAddress_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "BuyerBusinessAddress");
    private final static QName _CreateInvoiceDocInfoSupplierChiefAccountantName_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "SupplierChiefAccountantName");
    private final static QName _CreateInvoiceDocInfoBuyerStateRegisterNumber_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "BuyerStateRegisterNumber");
    private final static QName _CreateInvoiceDocInfoCredentialDate_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "CredentialDate");
    private final static QName _CreateInvoiceDocInfoSupplierBookNumber_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "SupplierBookNumber");
    private final static QName _CreateInvoiceDocInfoBuyerLegalAddress_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "BuyerLegalAddress");
    private final static QName _CreateInvoiceDocInfoBuyerPassportNumber_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "BuyerPassportNumber");
    private final static QName _CreateInvoiceDocInfoSupplierName_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "SupplierName");
    private final static QName _CreateInvoiceDocInfoSupplierSettlementAccount_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "SupplierSettlementAccount");
    private final static QName _CreateInvoiceDocInfoBuyerName_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "BuyerName");
    private final static QName _CreateInvoiceDocInfoBuyerManagerPost_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "BuyerManagerPost");
    private final static QName _CreateInvoiceDocInfoByWhomFIO_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ByWhomFIO");
    private final static QName _CreateInvoiceDocInfoSupplierChiefAccountantPost_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "SupplierChiefAccountantPost");
    private final static QName _CreateInternalMoveDocInfoChiefAccountantFIO_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ChiefAccountantFIO");
    private final static QName _CreateInternalMoveDocInfoTransportationMethod_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "TransportationMethod");
    private final static QName _CreateInternalMoveDocInfoBookNumber_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "BookNumber");
    private final static QName _GetStorageByCodeResponseGetStorageByCodeResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetStorageByCodeResult");
    private final static QName _GetProductsListByExternalCodesResponseGetProductsListByExternalCodesResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetProductsListByExternalCodesResult");
    private final static QName _GetSalesAnalysisGroupedByGoodsAndServicesResponseGetSalesAnalysisGroupedByGoodsAndServicesResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetSalesAnalysisGroupedByGoodsAndServicesResult");
    private final static QName _LoadMTStockTakingDocResponseLoadMTStockTakingDocResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "LoadMTStockTakingDocResult");
    private final static QName _GetMTBarCodesResponseGetMTBarCodesResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetMTBarCodesResult");
    private final static QName _GetCashesRemainsResponseGetCashesRemainsResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetCashesRemainsResult");
    private final static QName _GetProductPricesResponseGetProductPricesResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetProductPricesResult");
    private final static QName _UpdateMTStockTakingDocDoc_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "doc");
    private final static QName _MTBarCodesQntUnitBrief_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "QntUnitBrief");
    private final static QName _MTBarCodesQntUnit_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "QntUnit");
    private final static QName _MTBarCodesMTCode_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "MTCode");
    private final static QName _MTBarCodesMTCaption_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "MTCaption");
    private final static QName _GetProductsListByModifiedDateResponseGetProductsListByModifiedDateResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetProductsListByModifiedDateResult");
    private final static QName _GetPricesByPeriodProductCode_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ProductCode");
    private final static QName _GetPricesByPeriodProductGroup_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ProductGroup");
    private final static QName _PartnerBonusRemainsListRowPartnerGroup_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "PartnerGroup");
    private final static QName _SalesAnalysisDataProviderDataRowSalesConsultantCode_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "SalesConsultantCode");
    private final static QName _SalesAnalysisDataProviderDataRowCashDeskCaption_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "CashDeskCaption");
    private final static QName _SalesAnalysisDataProviderDataRowECRCheckNum_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ECRCheckNum");
    private final static QName _SalesAnalysisDataProviderDataRowSalesConsultantCaption_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "SalesConsultantCaption");
    private final static QName _SalesAnalysisDataProviderDataRowPartnerCaption_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "PartnerCaption");
    private final static QName _SalesAnalysisDataProviderDataRowIncomeDate_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "IncomeDate");
    private final static QName _SalesAnalysisDataProviderDataRowStorageCaption_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "StorageCaption");
    private final static QName _SalesAnalysisDataProviderDataRowDocVATType_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "DocVATType");
    private final static QName _SalesAnalysisDataProviderDataRowDocVATTypeCaption_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "DocVATTypeCaption");
    private final static QName _GetProductsListShortResponseGetProductsListShortResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetProductsListShortResult");
    private final static QName _LoadCashOutDocResponseLoadCashOutDocResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "LoadCashOutDocResult");
    private final static QName _CreateSaleDocSaleDocInfo_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "SaleDocInfo");
    private final static QName _UpdatePartnerPartnerInfo_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "PartnerInfo");
    private final static QName _GetProductPricesWithImagesProductBarCode_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ProductBarCode");
    private final static QName _GetProductPricesWithImagesProductShowMode_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ProductShowMode");
    private final static QName _GetProductRemByBarCodeResponseGetProductRemByBarCodeResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetProductRemByBarCodeResult");
    private final static QName _GetPartnersInfoListResponseGetPartnersInfoListResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetPartnersInfoListResult");
    private final static QName _GetProductByCodeResponseGetProductByCodeResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetProductByCodeResult");
    private final static QName _CreateMTComplectationDocDocInfo_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "docInfo");
    private final static QName _GetProductByBarCodeResponseGetProductByBarCodeResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetProductByBarCodeResult");
    private final static QName _GetPartnersRemsNextChunkResponseGetPartnersRemsNextChunkResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetPartnersRemsNextChunkResult");
    private final static QName _MTExpenseDocInfoDemand_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "Demand");
    private final static QName _GetProductPricesNextChunkResponseGetProductPricesNextChunkResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetProductPricesNextChunkResult");
    private final static QName _InvoiceSpecificationRowItemName_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ItemName");
    private final static QName _InvoiceSpecificationRowStorageCode_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "StorageCode");
    private final static QName _InvoiceSpecificationRowGoodsQntUnitsList_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GoodsQntUnitsList");
    private final static QName _InvoiceSpecificationRowRowDescription_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "RowDescription");
    private final static QName _GetProductByNameResponseGetProductByNameResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetProductByNameResult");
    private final static QName _GetProductRemsResponseGetProductRemsResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetProductRemsResult");
    private final static QName _GetCashesRemainsCashCode_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "CashCode");
    private final static QName _GetProductsInfoListResponseGetProductsInfoListResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetProductsInfoListResult");
    private final static QName _ProductListRowGoodQuantityUnits_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GoodQuantityUnits");
    private final static QName _ProductListRowBody_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "Body");
    private final static QName _ProductListRowExpMethodName_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ExpMethodName");
    private final static QName _ProductListRowGoodBarCodes_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GoodBarCodes");
    private final static QName _GetProducersListResponseGetProducersListResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetProducersListResult");
    private final static QName _LoadInvoiceDocResponseLoadInvoiceDocResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "LoadInvoiceDocResult");
    private final static QName _GetProductsNextChunkResponseGetProductsNextChunkResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetProductsNextChunkResult");
    private final static QName _GetSalesAnalysisGroupedByPartnerResponseGetSalesAnalysisGroupedByPartnerResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetSalesAnalysisGroupedByPartnerResult");
    private final static QName _GetSalesAnalysisByPartiesResponseGetSalesAnalysisByPartiesResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetSalesAnalysisByPartiesResult");
    private final static QName _GetPricesByPeriodResponseGetPricesByPeriodResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetPricesByPeriodResult");
    private final static QName _GetPartnerBonusRemainsResponseGetPartnerBonusRemainsResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetPartnerBonusRemainsResult");
    private final static QName _GetProductsForGivenListCodesProductesCodeList_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "ProductesCodeList");
    private final static QName _CreateMTReturnFromCustomerDocMtReturnFromCustomerDocInfo_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "mtReturnFromCustomerDocInfo");
    private final static QName _MTComplectationDocInfoStorageExpense_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "StorageExpense");
    private final static QName _CreateInternalMoveDocInternalMoveDocInfo_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "InternalMoveDocInfo");
    private final static QName _PartnerContractInfoDiscountCard_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "DiscountCard");
    private final static QName _GetProductByCodeWithImageResponseGetProductByCodeWithImageResult_QNAME = new QName("http://www.armsoft.am/Accountant/6.0", "GetProductByCodeWithImageResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: am.armsoft.accountant._6
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CashListRow }
     * 
     */
    public CashListRow createCashListRow() {
        return new CashListRow();
    }

    /**
     * Create an instance of {@link CashInDocInfo }
     * 
     */
    public CashInDocInfo createCashInDocInfo() {
        return new CashInDocInfo();
    }

    /**
     * Create an instance of {@link GetProductByBarCodeWithImageResponse }
     * 
     */
    public GetProductByBarCodeWithImageResponse createGetProductByBarCodeWithImageResponse() {
        return new GetProductByBarCodeWithImageResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPartnerSettlementAccountInfo }
     * 
     */
    public ArrayOfPartnerSettlementAccountInfo createArrayOfPartnerSettlementAccountInfo() {
        return new ArrayOfPartnerSettlementAccountInfo();
    }

    /**
     * Create an instance of {@link GetPartnerBonusRemains }
     * 
     */
    public GetPartnerBonusRemains createGetPartnerBonusRemains() {
        return new GetPartnerBonusRemains();
    }

    /**
     * Create an instance of {@link InternalMoveSpecificationRow }
     * 
     */
    public InternalMoveSpecificationRow createInternalMoveSpecificationRow() {
        return new InternalMoveSpecificationRow();
    }

    /**
     * Create an instance of {@link GetPartnersListResponse }
     * 
     */
    public GetPartnersListResponse createGetPartnersListResponse() {
        return new GetPartnersListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfProductShortListRow }
     * 
     */
    public ArrayOfProductShortListRow createArrayOfProductShortListRow() {
        return new ArrayOfProductShortListRow();
    }

    /**
     * Create an instance of {@link GetPartnerByCode }
     * 
     */
    public GetPartnerByCode createGetPartnerByCode() {
        return new GetPartnerByCode();
    }

    /**
     * Create an instance of {@link CreatePartnerInfo }
     * 
     */
    public CreatePartnerInfo createCreatePartnerInfo() {
        return new CreatePartnerInfo();
    }

    /**
     * Create an instance of {@link GetProductRemByCodeResponse }
     * 
     */
    public GetProductRemByCodeResponse createGetProductRemByCodeResponse() {
        return new GetProductRemByCodeResponse();
    }

    /**
     * Create an instance of {@link GetCodeCaptionListNextChunk }
     * 
     */
    public GetCodeCaptionListNextChunk createGetCodeCaptionListNextChunk() {
        return new GetCodeCaptionListNextChunk();
    }

    /**
     * Create an instance of {@link GetProductsInfoListByModifiedDate }
     * 
     */
    public GetProductsInfoListByModifiedDate createGetProductsInfoListByModifiedDate() {
        return new GetProductsInfoListByModifiedDate();
    }

    /**
     * Create an instance of {@link GetPartnerByCodeResponse }
     * 
     */
    public GetPartnerByCodeResponse createGetPartnerByCodeResponse() {
        return new GetPartnerByCodeResponse();
    }

    /**
     * Create an instance of {@link GetDocumentsNextChunkResponse }
     * 
     */
    public GetDocumentsNextChunkResponse createGetDocumentsNextChunkResponse() {
        return new GetDocumentsNextChunkResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPartnerContractInfo }
     * 
     */
    public ArrayOfPartnerContractInfo createArrayOfPartnerContractInfo() {
        return new ArrayOfPartnerContractInfo();
    }

    /**
     * Create an instance of {@link GetProductByCode }
     * 
     */
    public GetProductByCode createGetProductByCode() {
        return new GetProductByCode();
    }

    /**
     * Create an instance of {@link GetPartnersList }
     * 
     */
    public GetPartnersList createGetPartnersList() {
        return new GetPartnersList();
    }

    /**
     * Create an instance of {@link CreateBankInDoc }
     * 
     */
    public CreateBankInDoc createCreateBankInDoc() {
        return new CreateBankInDoc();
    }

    /**
     * Create an instance of {@link GetCashesListResponse }
     * 
     */
    public GetCashesListResponse createGetCashesListResponse() {
        return new GetCashesListResponse();
    }

    /**
     * Create an instance of {@link MTIncomeSpecificationRow }
     * 
     */
    public MTIncomeSpecificationRow createMTIncomeSpecificationRow() {
        return new MTIncomeSpecificationRow();
    }

    /**
     * Create an instance of {@link GetMTBarCodes }
     * 
     */
    public GetMTBarCodes createGetMTBarCodes() {
        return new GetMTBarCodes();
    }

    /**
     * Create an instance of {@link GetProductRemsNextChunk }
     * 
     */
    public GetProductRemsNextChunk createGetProductRemsNextChunk() {
        return new GetProductRemsNextChunk();
    }

    /**
     * Create an instance of {@link MTComplectationSpecificationRow }
     * 
     */
    public MTComplectationSpecificationRow createMTComplectationSpecificationRow() {
        return new MTComplectationSpecificationRow();
    }

    /**
     * Create an instance of {@link ArrayOfCodeCaptionListRow }
     * 
     */
    public ArrayOfCodeCaptionListRow createArrayOfCodeCaptionListRow() {
        return new ArrayOfCodeCaptionListRow();
    }

    /**
     * Create an instance of {@link MakeDraftDocument }
     * 
     */
    public MakeDraftDocument createMakeDraftDocument() {
        return new MakeDraftDocument();
    }

    /**
     * Create an instance of {@link GetPartnersListByModifiedDateResponse }
     * 
     */
    public GetPartnersListByModifiedDateResponse createGetPartnersListByModifiedDateResponse() {
        return new GetPartnersListByModifiedDateResponse();
    }

    /**
     * Create an instance of {@link ChunkedResultOfCreateProductInfo }
     * 
     */
    public ChunkedResultOfCreateProductInfo createChunkedResultOfCreateProductInfo() {
        return new ChunkedResultOfCreateProductInfo();
    }

    /**
     * Create an instance of {@link ArrayOfMTStockTakingSpecificationRow }
     * 
     */
    public ArrayOfMTStockTakingSpecificationRow createArrayOfMTStockTakingSpecificationRow() {
        return new ArrayOfMTStockTakingSpecificationRow();
    }

    /**
     * Create an instance of {@link ProductShortListRow }
     * 
     */
    public ProductShortListRow createProductShortListRow() {
        return new ProductShortListRow();
    }

    /**
     * Create an instance of {@link GetMTBarCodesNextChunkResponse }
     * 
     */
    public GetMTBarCodesNextChunkResponse createGetMTBarCodesNextChunkResponse() {
        return new GetMTBarCodesNextChunkResponse();
    }

    /**
     * Create an instance of {@link GetDocumentsListResponse }
     * 
     */
    public GetDocumentsListResponse createGetDocumentsListResponse() {
        return new GetDocumentsListResponse();
    }

    /**
     * Create an instance of {@link GetSalesAnalysisByParties }
     * 
     */
    public GetSalesAnalysisByParties createGetSalesAnalysisByParties() {
        return new GetSalesAnalysisByParties();
    }

    /**
     * Create an instance of {@link GetProductRemByBarCode }
     * 
     */
    public GetProductRemByBarCode createGetProductRemByBarCode() {
        return new GetProductRemByBarCode();
    }

    /**
     * Create an instance of {@link UpdatePrices }
     * 
     */
    public UpdatePrices createUpdatePrices() {
        return new UpdatePrices();
    }

    /**
     * Create an instance of {@link GetProductsListShortNextChunkResponse }
     * 
     */
    public GetProductsListShortNextChunkResponse createGetProductsListShortNextChunkResponse() {
        return new GetProductsListShortNextChunkResponse();
    }

    /**
     * Create an instance of {@link EditPartnerInfo }
     * 
     */
    public EditPartnerInfo createEditPartnerInfo() {
        return new EditPartnerInfo();
    }

    /**
     * Create an instance of {@link CreateInvoiceDocResponse }
     * 
     */
    public CreateInvoiceDocResponse createCreateInvoiceDocResponse() {
        return new CreateInvoiceDocResponse();
    }

    /**
     * Create an instance of {@link GetProductByNameWithImage }
     * 
     */
    public GetProductByNameWithImage createGetProductByNameWithImage() {
        return new GetProductByNameWithImage();
    }

    /**
     * Create an instance of {@link GetProductsListByCPACodes }
     * 
     */
    public GetProductsListByCPACodes createGetProductsListByCPACodes() {
        return new GetProductsListByCPACodes();
    }

    /**
     * Create an instance of {@link GetPartnerDiscountPercentByBarCode }
     * 
     */
    public GetPartnerDiscountPercentByBarCode createGetPartnerDiscountPercentByBarCode() {
        return new GetPartnerDiscountPercentByBarCode();
    }

    /**
     * Create an instance of {@link GetPartnersBonusRemainsByPartnerGroup }
     * 
     */
    public GetPartnersBonusRemainsByPartnerGroup createGetPartnersBonusRemainsByPartnerGroup() {
        return new GetPartnersBonusRemainsByPartnerGroup();
    }

    /**
     * Create an instance of {@link GetProductPricesNextChunk }
     * 
     */
    public GetProductPricesNextChunk createGetProductPricesNextChunk() {
        return new GetProductPricesNextChunk();
    }

    /**
     * Create an instance of {@link GetPartnerByIdResponse }
     * 
     */
    public GetPartnerByIdResponse createGetPartnerByIdResponse() {
        return new GetPartnerByIdResponse();
    }

    /**
     * Create an instance of {@link CreateCashInDoc }
     * 
     */
    public CreateCashInDoc createCreateCashInDoc() {
        return new CreateCashInDoc();
    }

    /**
     * Create an instance of {@link CreateSaleDocInfo }
     * 
     */
    public CreateSaleDocInfo createCreateSaleDocInfo() {
        return new CreateSaleDocInfo();
    }

    /**
     * Create an instance of {@link GetPartnerGroupsListResponse }
     * 
     */
    public GetPartnerGroupsListResponse createGetPartnerGroupsListResponse() {
        return new GetPartnerGroupsListResponse();
    }

    /**
     * Create an instance of {@link GetProductRemsDetailedResponse }
     * 
     */
    public GetProductRemsDetailedResponse createGetProductRemsDetailedResponse() {
        return new GetProductRemsDetailedResponse();
    }

    /**
     * Create an instance of {@link CreateProductResponse }
     * 
     */
    public CreateProductResponse createCreateProductResponse() {
        return new CreateProductResponse();
    }

    /**
     * Create an instance of {@link DeleteProduct }
     * 
     */
    public DeleteProduct createDeleteProduct() {
        return new DeleteProduct();
    }

    /**
     * Create an instance of {@link MTStockTakingSpecificationRow }
     * 
     */
    public MTStockTakingSpecificationRow createMTStockTakingSpecificationRow() {
        return new MTStockTakingSpecificationRow();
    }

    /**
     * Create an instance of {@link ChunkedResultOfProductShortListRow }
     * 
     */
    public ChunkedResultOfProductShortListRow createChunkedResultOfProductShortListRow() {
        return new ChunkedResultOfProductShortListRow();
    }

    /**
     * Create an instance of {@link GetPartnersInfoList }
     * 
     */
    public GetPartnersInfoList createGetPartnersInfoList() {
        return new GetPartnersInfoList();
    }

    /**
     * Create an instance of {@link UpdateProductInfo }
     * 
     */
    public UpdateProductInfo createUpdateProductInfo() {
        return new UpdateProductInfo();
    }

    /**
     * Create an instance of {@link CodeCaptionListRow }
     * 
     */
    public CodeCaptionListRow createCodeCaptionListRow() {
        return new CodeCaptionListRow();
    }

    /**
     * Create an instance of {@link LoadInternalMoveDocResponse }
     * 
     */
    public LoadInternalMoveDocResponse createLoadInternalMoveDocResponse() {
        return new LoadInternalMoveDocResponse();
    }

    /**
     * Create an instance of {@link ArrayOfInternalMoveSpecificationRow }
     * 
     */
    public ArrayOfInternalMoveSpecificationRow createArrayOfInternalMoveSpecificationRow() {
        return new ArrayOfInternalMoveSpecificationRow();
    }

    /**
     * Create an instance of {@link GetStoragesList }
     * 
     */
    public GetStoragesList createGetStoragesList() {
        return new GetStoragesList();
    }

    /**
     * Create an instance of {@link MTExpenseSpecificationRow }
     * 
     */
    public MTExpenseSpecificationRow createMTExpenseSpecificationRow() {
        return new MTExpenseSpecificationRow();
    }

    /**
     * Create an instance of {@link SerializationBase }
     * 
     */
    public SerializationBase createSerializationBase() {
        return new SerializationBase();
    }

    /**
     * Create an instance of {@link ArrayOfProductBarCodeInfo }
     * 
     */
    public ArrayOfProductBarCodeInfo createArrayOfProductBarCodeInfo() {
        return new ArrayOfProductBarCodeInfo();
    }

    /**
     * Create an instance of {@link UpdateProductResponse }
     * 
     */
    public UpdateProductResponse createUpdateProductResponse() {
        return new UpdateProductResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCreateProductInfo }
     * 
     */
    public ArrayOfCreateProductInfo createArrayOfCreateProductInfo() {
        return new ArrayOfCreateProductInfo();
    }

    /**
     * Create an instance of {@link DeleteDocumentResponse }
     * 
     */
    public DeleteDocumentResponse createDeleteDocumentResponse() {
        return new DeleteDocumentResponse();
    }

    /**
     * Create an instance of {@link DeletePartner }
     * 
     */
    public DeletePartner createDeletePartner() {
        return new DeletePartner();
    }

    /**
     * Create an instance of {@link LoadCashInDocResponse }
     * 
     */
    public LoadCashInDocResponse createLoadCashInDocResponse() {
        return new LoadCashInDocResponse();
    }

    /**
     * Create an instance of {@link UpdateProduct }
     * 
     */
    public UpdateProduct createUpdateProduct() {
        return new UpdateProduct();
    }

    /**
     * Create an instance of {@link LoadPartnerRemCorrectDocResponse }
     * 
     */
    public LoadPartnerRemCorrectDocResponse createLoadPartnerRemCorrectDocResponse() {
        return new LoadPartnerRemCorrectDocResponse();
    }

    /**
     * Create an instance of {@link GetPartnerById }
     * 
     */
    public GetPartnerById createGetPartnerById() {
        return new GetPartnerById();
    }

    /**
     * Create an instance of {@link CreateCashOutDocResponse }
     * 
     */
    public CreateCashOutDocResponse createCreateCashOutDocResponse() {
        return new CreateCashOutDocResponse();
    }

    /**
     * Create an instance of {@link GetCodeCaptionListNextChunkResponse }
     * 
     */
    public GetCodeCaptionListNextChunkResponse createGetCodeCaptionListNextChunkResponse() {
        return new GetCodeCaptionListNextChunkResponse();
    }

    /**
     * Create an instance of {@link GetForETLDocumentsList }
     * 
     */
    public GetForETLDocumentsList createGetForETLDocumentsList() {
        return new GetForETLDocumentsList();
    }

    /**
     * Create an instance of {@link GetStorageByCode }
     * 
     */
    public GetStorageByCode createGetStorageByCode() {
        return new GetStorageByCode();
    }

    /**
     * Create an instance of {@link GetECRChecksListResponse }
     * 
     */
    public GetECRChecksListResponse createGetECRChecksListResponse() {
        return new GetECRChecksListResponse();
    }

    /**
     * Create an instance of {@link GetPartnersRemsResponse }
     * 
     */
    public GetPartnersRemsResponse createGetPartnersRemsResponse() {
        return new GetPartnersRemsResponse();
    }

    /**
     * Create an instance of {@link ChunkedResultOfCreatePartnerInfo }
     * 
     */
    public ChunkedResultOfCreatePartnerInfo createChunkedResultOfCreatePartnerInfo() {
        return new ChunkedResultOfCreatePartnerInfo();
    }

    /**
     * Create an instance of {@link UpdatePricesResponse }
     * 
     */
    public UpdatePricesResponse createUpdatePricesResponse() {
        return new UpdatePricesResponse();
    }

    /**
     * Create an instance of {@link ChunkedResultOfSalesAnalysisRowGroupedByPartner }
     * 
     */
    public ChunkedResultOfSalesAnalysisRowGroupedByPartner createChunkedResultOfSalesAnalysisRowGroupedByPartner() {
        return new ChunkedResultOfSalesAnalysisRowGroupedByPartner();
    }

    /**
     * Create an instance of {@link UpdateDocETLStateResponse }
     * 
     */
    public UpdateDocETLStateResponse createUpdateDocETLStateResponse() {
        return new UpdateDocETLStateResponse();
    }

    /**
     * Create an instance of {@link GetProductRemsNextChunkResponse }
     * 
     */
    public GetProductRemsNextChunkResponse createGetProductRemsNextChunkResponse() {
        return new GetProductRemsNextChunkResponse();
    }

    /**
     * Create an instance of {@link GetProductsListShortNextChunk }
     * 
     */
    public GetProductsListShortNextChunk createGetProductsListShortNextChunk() {
        return new GetProductsListShortNextChunk();
    }

    /**
     * Create an instance of {@link LoadMTIncomeDocResponse }
     * 
     */
    public LoadMTIncomeDocResponse createLoadMTIncomeDocResponse() {
        return new LoadMTIncomeDocResponse();
    }

    /**
     * Create an instance of {@link ArrayOfDocumentsListRow }
     * 
     */
    public ArrayOfDocumentsListRow createArrayOfDocumentsListRow() {
        return new ArrayOfDocumentsListRow();
    }

    /**
     * Create an instance of {@link SalesAnalysisRowGroupedbyGoodsAndServices }
     * 
     */
    public SalesAnalysisRowGroupedbyGoodsAndServices createSalesAnalysisRowGroupedbyGoodsAndServices() {
        return new SalesAnalysisRowGroupedbyGoodsAndServices();
    }

    /**
     * Create an instance of {@link ChunkedResultOfPartnerBonusRemainsListRow }
     * 
     */
    public ChunkedResultOfPartnerBonusRemainsListRow createChunkedResultOfPartnerBonusRemainsListRow() {
        return new ChunkedResultOfPartnerBonusRemainsListRow();
    }

    /**
     * Create an instance of {@link DocumentsListRow }
     * 
     */
    public DocumentsListRow createDocumentsListRow() {
        return new DocumentsListRow();
    }

    /**
     * Create an instance of {@link GetStorageByCodeResponse }
     * 
     */
    public GetStorageByCodeResponse createGetStorageByCodeResponse() {
        return new GetStorageByCodeResponse();
    }

    /**
     * Create an instance of {@link GetProductsListByExternalCodesResponse }
     * 
     */
    public GetProductsListByExternalCodesResponse createGetProductsListByExternalCodesResponse() {
        return new GetProductsListByExternalCodesResponse();
    }

    /**
     * Create an instance of {@link GetMTBarCodesResponse }
     * 
     */
    public GetMTBarCodesResponse createGetMTBarCodesResponse() {
        return new GetMTBarCodesResponse();
    }

    /**
     * Create an instance of {@link GetProductPricesResponse }
     * 
     */
    public GetProductPricesResponse createGetProductPricesResponse() {
        return new GetProductPricesResponse();
    }

    /**
     * Create an instance of {@link DeletePartnerResponse }
     * 
     */
    public DeletePartnerResponse createDeletePartnerResponse() {
        return new DeletePartnerResponse();
    }

    /**
     * Create an instance of {@link GetSalesAnalysis }
     * 
     */
    public GetSalesAnalysis createGetSalesAnalysis() {
        return new GetSalesAnalysis();
    }

    /**
     * Create an instance of {@link GetProductByName }
     * 
     */
    public GetProductByName createGetProductByName() {
        return new GetProductByName();
    }

    /**
     * Create an instance of {@link ExtendableRow }
     * 
     */
    public ExtendableRow createExtendableRow() {
        return new ExtendableRow();
    }

    /**
     * Create an instance of {@link MTBarCodes }
     * 
     */
    public MTBarCodes createMTBarCodes() {
        return new MTBarCodes();
    }

    /**
     * Create an instance of {@link CreateMTIncomeDoc }
     * 
     */
    public CreateMTIncomeDoc createCreateMTIncomeDoc() {
        return new CreateMTIncomeDoc();
    }

    /**
     * Create an instance of {@link GetProductByBarCodeWithImage }
     * 
     */
    public GetProductByBarCodeWithImage createGetProductByBarCodeWithImage() {
        return new GetProductByBarCodeWithImage();
    }

    /**
     * Create an instance of {@link GetProductsListByModifiedDateResponse }
     * 
     */
    public GetProductsListByModifiedDateResponse createGetProductsListByModifiedDateResponse() {
        return new GetProductsListByModifiedDateResponse();
    }

    /**
     * Create an instance of {@link GetPricesByPeriod }
     * 
     */
    public GetPricesByPeriod createGetPricesByPeriod() {
        return new GetPricesByPeriod();
    }

    /**
     * Create an instance of {@link CreateProduct }
     * 
     */
    public CreateProduct createCreateProduct() {
        return new CreateProduct();
    }

    /**
     * Create an instance of {@link ArrayOfCashRemains }
     * 
     */
    public ArrayOfCashRemains createArrayOfCashRemains() {
        return new ArrayOfCashRemains();
    }

    /**
     * Create an instance of {@link GetProductByCodeWithImage }
     * 
     */
    public GetProductByCodeWithImage createGetProductByCodeWithImage() {
        return new GetProductByCodeWithImage();
    }

    /**
     * Create an instance of {@link LoadCashInDoc }
     * 
     */
    public LoadCashInDoc createLoadCashInDoc() {
        return new LoadCashInDoc();
    }

    /**
     * Create an instance of {@link SalesAnalysisDataProviderDataRow }
     * 
     */
    public SalesAnalysisDataProviderDataRow createSalesAnalysisDataProviderDataRow() {
        return new SalesAnalysisDataProviderDataRow();
    }

    /**
     * Create an instance of {@link GetSalesAnalysisNextChunk }
     * 
     */
    public GetSalesAnalysisNextChunk createGetSalesAnalysisNextChunk() {
        return new GetSalesAnalysisNextChunk();
    }

    /**
     * Create an instance of {@link ArrayOfProductGroupListRow }
     * 
     */
    public ArrayOfProductGroupListRow createArrayOfProductGroupListRow() {
        return new ArrayOfProductGroupListRow();
    }

    /**
     * Create an instance of {@link MTStockTakingDocInfo }
     * 
     */
    public MTStockTakingDocInfo createMTStockTakingDocInfo() {
        return new MTStockTakingDocInfo();
    }

    /**
     * Create an instance of {@link ArrayOfGoodAvailabilityRow }
     * 
     */
    public ArrayOfGoodAvailabilityRow createArrayOfGoodAvailabilityRow() {
        return new ArrayOfGoodAvailabilityRow();
    }

    /**
     * Create an instance of {@link CreateSaleDoc }
     * 
     */
    public CreateSaleDoc createCreateSaleDoc() {
        return new CreateSaleDoc();
    }

    /**
     * Create an instance of {@link GetPartnerDiscountPercentByBarCodeResponse }
     * 
     */
    public GetPartnerDiscountPercentByBarCodeResponse createGetPartnerDiscountPercentByBarCodeResponse() {
        return new GetPartnerDiscountPercentByBarCodeResponse();
    }

    /**
     * Create an instance of {@link PartnerGroupListRow }
     * 
     */
    public PartnerGroupListRow createPartnerGroupListRow() {
        return new PartnerGroupListRow();
    }

    /**
     * Create an instance of {@link CreateMTReturnFromCustomerDocResponse }
     * 
     */
    public CreateMTReturnFromCustomerDocResponse createCreateMTReturnFromCustomerDocResponse() {
        return new CreateMTReturnFromCustomerDocResponse();
    }

    /**
     * Create an instance of {@link GetPartnersInfoListResponse }
     * 
     */
    public GetPartnersInfoListResponse createGetPartnersInfoListResponse() {
        return new GetPartnersInfoListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPartnerListRow }
     * 
     */
    public ArrayOfPartnerListRow createArrayOfPartnerListRow() {
        return new ArrayOfPartnerListRow();
    }

    /**
     * Create an instance of {@link GetProductByCodeResponse }
     * 
     */
    public GetProductByCodeResponse createGetProductByCodeResponse() {
        return new GetProductByCodeResponse();
    }

    /**
     * Create an instance of {@link CreateMTComplectationDoc }
     * 
     */
    public CreateMTComplectationDoc createCreateMTComplectationDoc() {
        return new CreateMTComplectationDoc();
    }

    /**
     * Create an instance of {@link ArrayOfCreatePartnerInfo }
     * 
     */
    public ArrayOfCreatePartnerInfo createArrayOfCreatePartnerInfo() {
        return new ArrayOfCreatePartnerInfo();
    }

    /**
     * Create an instance of {@link GetProductByBarCodeResponse }
     * 
     */
    public GetProductByBarCodeResponse createGetProductByBarCodeResponse() {
        return new GetProductByBarCodeResponse();
    }

    /**
     * Create an instance of {@link GetPartnersRemsNextChunkResponse }
     * 
     */
    public GetPartnersRemsNextChunkResponse createGetPartnersRemsNextChunkResponse() {
        return new GetPartnersRemsNextChunkResponse();
    }

    /**
     * Create an instance of {@link MTExpenseDocInfo }
     * 
     */
    public MTExpenseDocInfo createMTExpenseDocInfo() {
        return new MTExpenseDocInfo();
    }

    /**
     * Create an instance of {@link StopSession }
     * 
     */
    public StopSession createStopSession() {
        return new StopSession();
    }

    /**
     * Create an instance of {@link GetPartnersNextChunk }
     * 
     */
    public GetPartnersNextChunk createGetPartnersNextChunk() {
        return new GetPartnersNextChunk();
    }

    /**
     * Create an instance of {@link ArrayOfInvoiceSpecificationRow }
     * 
     */
    public ArrayOfInvoiceSpecificationRow createArrayOfInvoiceSpecificationRow() {
        return new ArrayOfInvoiceSpecificationRow();
    }

    /**
     * Create an instance of {@link GetProductRemByCode }
     * 
     */
    public GetProductRemByCode createGetProductRemByCode() {
        return new GetProductRemByCode();
    }

    /**
     * Create an instance of {@link ArrayOfSalesAnalysisDataProviderDataRow }
     * 
     */
    public ArrayOfSalesAnalysisDataProviderDataRow createArrayOfSalesAnalysisDataProviderDataRow() {
        return new ArrayOfSalesAnalysisDataProviderDataRow();
    }

    /**
     * Create an instance of {@link GetCashesRemains }
     * 
     */
    public GetCashesRemains createGetCashesRemains() {
        return new GetCashesRemains();
    }

    /**
     * Create an instance of {@link ChunkedResultOfCodeCaptionListRow }
     * 
     */
    public ChunkedResultOfCodeCaptionListRow createChunkedResultOfCodeCaptionListRow() {
        return new ChunkedResultOfCodeCaptionListRow();
    }

    /**
     * Create an instance of {@link ArrayOfMTReturnFromCustomerSpecificationRow }
     * 
     */
    public ArrayOfMTReturnFromCustomerSpecificationRow createArrayOfMTReturnFromCustomerSpecificationRow() {
        return new ArrayOfMTReturnFromCustomerSpecificationRow();
    }

    /**
     * Create an instance of {@link GetProductsInfoListResponse }
     * 
     */
    public GetProductsInfoListResponse createGetProductsInfoListResponse() {
        return new GetProductsInfoListResponse();
    }

    /**
     * Create an instance of {@link SalesAnalysisRowGroupedByPartner }
     * 
     */
    public SalesAnalysisRowGroupedByPartner createSalesAnalysisRowGroupedByPartner() {
        return new SalesAnalysisRowGroupedByPartner();
    }

    /**
     * Create an instance of {@link GetVersion }
     * 
     */
    public GetVersion createGetVersion() {
        return new GetVersion();
    }

    /**
     * Create an instance of {@link GetSalesAnalysisGroupedByPartnerResponse }
     * 
     */
    public GetSalesAnalysisGroupedByPartnerResponse createGetSalesAnalysisGroupedByPartnerResponse() {
        return new GetSalesAnalysisGroupedByPartnerResponse();
    }

    /**
     * Create an instance of {@link GetSalesAnalysisByPartiesResponse }
     * 
     */
    public GetSalesAnalysisByPartiesResponse createGetSalesAnalysisByPartiesResponse() {
        return new GetSalesAnalysisByPartiesResponse();
    }

    /**
     * Create an instance of {@link PriceTypeListRow }
     * 
     */
    public PriceTypeListRow createPriceTypeListRow() {
        return new PriceTypeListRow();
    }

    /**
     * Create an instance of {@link GetProductPrices }
     * 
     */
    public GetProductPrices createGetProductPrices() {
        return new GetProductPrices();
    }

    /**
     * Create an instance of {@link GetPricesByPeriodResponse }
     * 
     */
    public GetPricesByPeriodResponse createGetPricesByPeriodResponse() {
        return new GetPricesByPeriodResponse();
    }

    /**
     * Create an instance of {@link GetProductsInfoList }
     * 
     */
    public GetProductsInfoList createGetProductsInfoList() {
        return new GetProductsInfoList();
    }

    /**
     * Create an instance of {@link ArrayOfCashListRow }
     * 
     */
    public ArrayOfCashListRow createArrayOfCashListRow() {
        return new ArrayOfCashListRow();
    }

    /**
     * Create an instance of {@link GetProductGroupsList }
     * 
     */
    public GetProductGroupsList createGetProductGroupsList() {
        return new GetProductGroupsList();
    }

    /**
     * Create an instance of {@link GetProductsListShort }
     * 
     */
    public GetProductsListShort createGetProductsListShort() {
        return new GetProductsListShort();
    }

    /**
     * Create an instance of {@link CreateMTExpenseDoc }
     * 
     */
    public CreateMTExpenseDoc createCreateMTExpenseDoc() {
        return new CreateMTExpenseDoc();
    }

    /**
     * Create an instance of {@link CreatePartner }
     * 
     */
    public CreatePartner createCreatePartner() {
        return new CreatePartner();
    }

    /**
     * Create an instance of {@link PartnerContractInfo }
     * 
     */
    public PartnerContractInfo createPartnerContractInfo() {
        return new PartnerContractInfo();
    }

    /**
     * Create an instance of {@link CreateMTComplectationDocAndFillSpecificationRowsResponse }
     * 
     */
    public CreateMTComplectationDocAndFillSpecificationRowsResponse createCreateMTComplectationDocAndFillSpecificationRowsResponse() {
        return new CreateMTComplectationDocAndFillSpecificationRowsResponse();
    }

    /**
     * Create an instance of {@link PartnerSettlementAccountInfo }
     * 
     */
    public PartnerSettlementAccountInfo createPartnerSettlementAccountInfo() {
        return new PartnerSettlementAccountInfo();
    }

    /**
     * Create an instance of {@link UpdateMTStockTakingDocResponse }
     * 
     */
    public UpdateMTStockTakingDocResponse createUpdateMTStockTakingDocResponse() {
        return new UpdateMTStockTakingDocResponse();
    }

    /**
     * Create an instance of {@link GetDocumentsNextChunk }
     * 
     */
    public GetDocumentsNextChunk createGetDocumentsNextChunk() {
        return new GetDocumentsNextChunk();
    }

    /**
     * Create an instance of {@link ChunkedResultOfMTBarCodes }
     * 
     */
    public ChunkedResultOfMTBarCodes createChunkedResultOfMTBarCodes() {
        return new ChunkedResultOfMTBarCodes();
    }

    /**
     * Create an instance of {@link GetProductsInfoNextChunkResponse }
     * 
     */
    public GetProductsInfoNextChunkResponse createGetProductsInfoNextChunkResponse() {
        return new GetProductsInfoNextChunkResponse();
    }

    /**
     * Create an instance of {@link PartnerBusinessAddressInfo }
     * 
     */
    public PartnerBusinessAddressInfo createPartnerBusinessAddressInfo() {
        return new PartnerBusinessAddressInfo();
    }

    /**
     * Create an instance of {@link GetProductByNameWithImageResponse }
     * 
     */
    public GetProductByNameWithImageResponse createGetProductByNameWithImageResponse() {
        return new GetProductByNameWithImageResponse();
    }

    /**
     * Create an instance of {@link StorageListRow }
     * 
     */
    public StorageListRow createStorageListRow() {
        return new StorageListRow();
    }

    /**
     * Create an instance of {@link GetProductRemByCodeDetailedResponse }
     * 
     */
    public GetProductRemByCodeDetailedResponse createGetProductRemByCodeDetailedResponse() {
        return new GetProductRemByCodeDetailedResponse();
    }

    /**
     * Create an instance of {@link GetPartnersRemsNextChunk }
     * 
     */
    public GetPartnersRemsNextChunk createGetPartnersRemsNextChunk() {
        return new GetPartnersRemsNextChunk();
    }

    /**
     * Create an instance of {@link MTReturnFromCustomerDocInfo }
     * 
     */
    public MTReturnFromCustomerDocInfo createMTReturnFromCustomerDocInfo() {
        return new MTReturnFromCustomerDocInfo();
    }

    /**
     * Create an instance of {@link ArrayOfSalesAnalysisRowGroupedByPartner }
     * 
     */
    public ArrayOfSalesAnalysisRowGroupedByPartner createArrayOfSalesAnalysisRowGroupedByPartner() {
        return new ArrayOfSalesAnalysisRowGroupedByPartner();
    }

    /**
     * Create an instance of {@link CreatePartnerResponse }
     * 
     */
    public CreatePartnerResponse createCreatePartnerResponse() {
        return new CreatePartnerResponse();
    }

    /**
     * Create an instance of {@link PartCashBankAccRemainsRow }
     * 
     */
    public PartCashBankAccRemainsRow createPartCashBankAccRemainsRow() {
        return new PartCashBankAccRemainsRow();
    }

    /**
     * Create an instance of {@link CreateCashOutDoc }
     * 
     */
    public CreateCashOutDoc createCreateCashOutDoc() {
        return new CreateCashOutDoc();
    }

    /**
     * Create an instance of {@link GetCountriesListResponse }
     * 
     */
    public GetCountriesListResponse createGetCountriesListResponse() {
        return new GetCountriesListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPartnerBusinessAddressInfo }
     * 
     */
    public ArrayOfPartnerBusinessAddressInfo createArrayOfPartnerBusinessAddressInfo() {
        return new ArrayOfPartnerBusinessAddressInfo();
    }

    /**
     * Create an instance of {@link GetPartnersBonusRemainsByPartnerGroupResponse }
     * 
     */
    public GetPartnersBonusRemainsByPartnerGroupResponse createGetPartnersBonusRemainsByPartnerGroupResponse() {
        return new GetPartnersBonusRemainsByPartnerGroupResponse();
    }

    /**
     * Create an instance of {@link GetProductsListByCPACodesResponse }
     * 
     */
    public GetProductsListByCPACodesResponse createGetProductsListByCPACodesResponse() {
        return new GetProductsListByCPACodesResponse();
    }

    /**
     * Create an instance of {@link CashOutDocInfo }
     * 
     */
    public CashOutDocInfo createCashOutDocInfo() {
        return new CashOutDocInfo();
    }

    /**
     * Create an instance of {@link ProductGroupListRow }
     * 
     */
    public ProductGroupListRow createProductGroupListRow() {
        return new ProductGroupListRow();
    }

    /**
     * Create an instance of {@link GetMTBarCodesNextChunk }
     * 
     */
    public GetMTBarCodesNextChunk createGetMTBarCodesNextChunk() {
        return new GetMTBarCodesNextChunk();
    }

    /**
     * Create an instance of {@link CreateSaleDocResponse }
     * 
     */
    public CreateSaleDocResponse createCreateSaleDocResponse() {
        return new CreateSaleDocResponse();
    }

    /**
     * Create an instance of {@link GetForETLDocumentsListResponse }
     * 
     */
    public GetForETLDocumentsListResponse createGetForETLDocumentsListResponse() {
        return new GetForETLDocumentsListResponse();
    }

    /**
     * Create an instance of {@link ProcessDocument }
     * 
     */
    public ProcessDocument createProcessDocument() {
        return new ProcessDocument();
    }

    /**
     * Create an instance of {@link CreateProductInfo }
     * 
     */
    public CreateProductInfo createCreateProductInfo() {
        return new CreateProductInfo();
    }

    /**
     * Create an instance of {@link GetProductsList }
     * 
     */
    public GetProductsList createGetProductsList() {
        return new GetProductsList();
    }

    /**
     * Create an instance of {@link CreateBankInDocResponse }
     * 
     */
    public CreateBankInDocResponse createCreateBankInDocResponse() {
        return new CreateBankInDocResponse();
    }

    /**
     * Create an instance of {@link ChunkedResultOfSalesAnalysisDataProviderDataRow }
     * 
     */
    public ChunkedResultOfSalesAnalysisDataProviderDataRow createChunkedResultOfSalesAnalysisDataProviderDataRow() {
        return new ChunkedResultOfSalesAnalysisDataProviderDataRow();
    }

    /**
     * Create an instance of {@link GetProductsListByExternalCodes }
     * 
     */
    public GetProductsListByExternalCodes createGetProductsListByExternalCodes() {
        return new GetProductsListByExternalCodes();
    }

    /**
     * Create an instance of {@link GetSalesAnalysisGroupedByPartner }
     * 
     */
    public GetSalesAnalysisGroupedByPartner createGetSalesAnalysisGroupedByPartner() {
        return new GetSalesAnalysisGroupedByPartner();
    }

    /**
     * Create an instance of {@link ArrayOfSalesAnalysisRowGroupedbyGoodsAndServices }
     * 
     */
    public ArrayOfSalesAnalysisRowGroupedbyGoodsAndServices createArrayOfSalesAnalysisRowGroupedbyGoodsAndServices() {
        return new ArrayOfSalesAnalysisRowGroupedbyGoodsAndServices();
    }

    /**
     * Create an instance of {@link GetProductGroupsListResponse }
     * 
     */
    public GetProductGroupsListResponse createGetProductGroupsListResponse() {
        return new GetProductGroupsListResponse();
    }

    /**
     * Create an instance of {@link CreatePartnerRemCorrectDocResponse }
     * 
     */
    public CreatePartnerRemCorrectDocResponse createCreatePartnerRemCorrectDocResponse() {
        return new CreatePartnerRemCorrectDocResponse();
    }

    /**
     * Create an instance of {@link GetProductByBarCode }
     * 
     */
    public GetProductByBarCode createGetProductByBarCode() {
        return new GetProductByBarCode();
    }

    /**
     * Create an instance of {@link CreatePartnerRemCorrectDoc }
     * 
     */
    public CreatePartnerRemCorrectDoc createCreatePartnerRemCorrectDoc() {
        return new CreatePartnerRemCorrectDoc();
    }

    /**
     * Create an instance of {@link GetSalesAnalysisResponse }
     * 
     */
    public GetSalesAnalysisResponse createGetSalesAnalysisResponse() {
        return new GetSalesAnalysisResponse();
    }

    /**
     * Create an instance of {@link GetSalesAnalysisGroupedByPartnerNextChunkResponse }
     * 
     */
    public GetSalesAnalysisGroupedByPartnerNextChunkResponse createGetSalesAnalysisGroupedByPartnerNextChunkResponse() {
        return new GetSalesAnalysisGroupedByPartnerNextChunkResponse();
    }

    /**
     * Create an instance of {@link BankInDocInfo }
     * 
     */
    public BankInDocInfo createBankInDocInfo() {
        return new BankInDocInfo();
    }

    /**
     * Create an instance of {@link GetPartnersListByModifiedDate }
     * 
     */
    public GetPartnersListByModifiedDate createGetPartnersListByModifiedDate() {
        return new GetPartnersListByModifiedDate();
    }

    /**
     * Create an instance of {@link CreateInternalMoveDocResponse }
     * 
     */
    public CreateInternalMoveDocResponse createCreateInternalMoveDocResponse() {
        return new CreateInternalMoveDocResponse();
    }

    /**
     * Create an instance of {@link GetVersionResponse }
     * 
     */
    public GetVersionResponse createGetVersionResponse() {
        return new GetVersionResponse();
    }

    /**
     * Create an instance of {@link LoadMTStockTakingDoc }
     * 
     */
    public LoadMTStockTakingDoc createLoadMTStockTakingDoc() {
        return new LoadMTStockTakingDoc();
    }

    /**
     * Create an instance of {@link LoadBankInDocResponse }
     * 
     */
    public LoadBankInDocResponse createLoadBankInDocResponse() {
        return new LoadBankInDocResponse();
    }

    /**
     * Create an instance of {@link GetPartnersInfoNextChunkResponse }
     * 
     */
    public GetPartnersInfoNextChunkResponse createGetPartnersInfoNextChunkResponse() {
        return new GetPartnersInfoNextChunkResponse();
    }

    /**
     * Create an instance of {@link GoodAvailabilityRow }
     * 
     */
    public GoodAvailabilityRow createGoodAvailabilityRow() {
        return new GoodAvailabilityRow();
    }

    /**
     * Create an instance of {@link GetProductsListByModifiedDate }
     * 
     */
    public GetProductsListByModifiedDate createGetProductsListByModifiedDate() {
        return new GetProductsListByModifiedDate();
    }

    /**
     * Create an instance of {@link GetProductByIdWithImageResponse }
     * 
     */
    public GetProductByIdWithImageResponse createGetProductByIdWithImageResponse() {
        return new GetProductByIdWithImageResponse();
    }

    /**
     * Create an instance of {@link GetCashesList }
     * 
     */
    public GetCashesList createGetCashesList() {
        return new GetCashesList();
    }

    /**
     * Create an instance of {@link GetSalesAnalysisNextChunkResponse }
     * 
     */
    public GetSalesAnalysisNextChunkResponse createGetSalesAnalysisNextChunkResponse() {
        return new GetSalesAnalysisNextChunkResponse();
    }

    /**
     * Create an instance of {@link CreateMTStockTakingDocResponse }
     * 
     */
    public CreateMTStockTakingDocResponse createCreateMTStockTakingDocResponse() {
        return new CreateMTStockTakingDocResponse();
    }

    /**
     * Create an instance of {@link GetProductRems }
     * 
     */
    public GetProductRems createGetProductRems() {
        return new GetProductRems();
    }

    /**
     * Create an instance of {@link GetProductById }
     * 
     */
    public GetProductById createGetProductById() {
        return new GetProductById();
    }

    /**
     * Create an instance of {@link ArrayOfPartnerGroupListRow }
     * 
     */
    public ArrayOfPartnerGroupListRow createArrayOfPartnerGroupListRow() {
        return new ArrayOfPartnerGroupListRow();
    }

    /**
     * Create an instance of {@link GetSalesAnalysisGroupedByGoodsAndServices }
     * 
     */
    public GetSalesAnalysisGroupedByGoodsAndServices createGetSalesAnalysisGroupedByGoodsAndServices() {
        return new GetSalesAnalysisGroupedByGoodsAndServices();
    }

    /**
     * Create an instance of {@link GetProductsForGivenListCodesResponse }
     * 
     */
    public GetProductsForGivenListCodesResponse createGetProductsForGivenListCodesResponse() {
        return new GetProductsForGivenListCodesResponse();
    }

    /**
     * Create an instance of {@link GetPartnersNextChunkResponse }
     * 
     */
    public GetPartnersNextChunkResponse createGetPartnersNextChunkResponse() {
        return new GetPartnersNextChunkResponse();
    }

    /**
     * Create an instance of {@link GetProductRemsDetailed }
     * 
     */
    public GetProductRemsDetailed createGetProductRemsDetailed() {
        return new GetProductRemsDetailed();
    }

    /**
     * Create an instance of {@link ChunkedResultOfGoodAvailabilityRow }
     * 
     */
    public ChunkedResultOfGoodAvailabilityRow createChunkedResultOfGoodAvailabilityRow() {
        return new ChunkedResultOfGoodAvailabilityRow();
    }

    /**
     * Create an instance of {@link GetProductPricesWithImagesResponse }
     * 
     */
    public GetProductPricesWithImagesResponse createGetProductPricesWithImagesResponse() {
        return new GetProductPricesWithImagesResponse();
    }

    /**
     * Create an instance of {@link ProductQuantityUnitInfo }
     * 
     */
    public ProductQuantityUnitInfo createProductQuantityUnitInfo() {
        return new ProductQuantityUnitInfo();
    }

    /**
     * Create an instance of {@link ChunkedResultOfPriceListRow }
     * 
     */
    public ChunkedResultOfPriceListRow createChunkedResultOfPriceListRow() {
        return new ChunkedResultOfPriceListRow();
    }

    /**
     * Create an instance of {@link ArrayOfMTComplectationSpecificationRow }
     * 
     */
    public ArrayOfMTComplectationSpecificationRow createArrayOfMTComplectationSpecificationRow() {
        return new ArrayOfMTComplectationSpecificationRow();
    }

    /**
     * Create an instance of {@link DeleteProductResponse }
     * 
     */
    public DeleteProductResponse createDeleteProductResponse() {
        return new DeleteProductResponse();
    }

    /**
     * Create an instance of {@link MTIncomeDocInfo }
     * 
     */
    public MTIncomeDocInfo createMTIncomeDocInfo() {
        return new MTIncomeDocInfo();
    }

    /**
     * Create an instance of {@link GetPriceTypesListResponse }
     * 
     */
    public GetPriceTypesListResponse createGetPriceTypesListResponse() {
        return new GetPriceTypesListResponse();
    }

    /**
     * Create an instance of {@link CreateCashInDocResponse }
     * 
     */
    public CreateCashInDocResponse createCreateCashInDocResponse() {
        return new CreateCashInDocResponse();
    }

    /**
     * Create an instance of {@link LoadSaleDocResponse }
     * 
     */
    public LoadSaleDocResponse createLoadSaleDocResponse() {
        return new LoadSaleDocResponse();
    }

    /**
     * Create an instance of {@link StartSession }
     * 
     */
    public StartSession createStartSession() {
        return new StartSession();
    }

    /**
     * Create an instance of {@link GetPartnerGroupsList }
     * 
     */
    public GetPartnerGroupsList createGetPartnerGroupsList() {
        return new GetPartnerGroupsList();
    }

    /**
     * Create an instance of {@link GetProductsInfoNextChunk }
     * 
     */
    public GetProductsInfoNextChunk createGetProductsInfoNextChunk() {
        return new GetProductsInfoNextChunk();
    }

    /**
     * Create an instance of {@link GetDocumentsList }
     * 
     */
    public GetDocumentsList createGetDocumentsList() {
        return new GetDocumentsList();
    }

    /**
     * Create an instance of {@link GetProductsInfoListByModifiedDateResponse }
     * 
     */
    public GetProductsInfoListByModifiedDateResponse createGetProductsInfoListByModifiedDateResponse() {
        return new GetProductsInfoListByModifiedDateResponse();
    }

    /**
     * Create an instance of {@link GetStoragesListResponse }
     * 
     */
    public GetStoragesListResponse createGetStoragesListResponse() {
        return new GetStoragesListResponse();
    }

    /**
     * Create an instance of {@link CashRemains }
     * 
     */
    public CashRemains createCashRemains() {
        return new CashRemains();
    }

    /**
     * Create an instance of {@link GetSalesAnalysisGroupedByPartnerNextChunk }
     * 
     */
    public GetSalesAnalysisGroupedByPartnerNextChunk createGetSalesAnalysisGroupedByPartnerNextChunk() {
        return new GetSalesAnalysisGroupedByPartnerNextChunk();
    }

    /**
     * Create an instance of {@link ArrayOfPriceListRow }
     * 
     */
    public ArrayOfPriceListRow createArrayOfPriceListRow() {
        return new ArrayOfPriceListRow();
    }

    /**
     * Create an instance of {@link CreateMTComplectationDocResponse }
     * 
     */
    public CreateMTComplectationDocResponse createCreateMTComplectationDocResponse() {
        return new CreateMTComplectationDocResponse();
    }

    /**
     * Create an instance of {@link LoadBankInDoc }
     * 
     */
    public LoadBankInDoc createLoadBankInDoc() {
        return new LoadBankInDoc();
    }

    /**
     * Create an instance of {@link PartnerListRow }
     * 
     */
    public PartnerListRow createPartnerListRow() {
        return new PartnerListRow();
    }

    /**
     * Create an instance of {@link ArrayOfMTExpenseSpecificationRow }
     * 
     */
    public ArrayOfMTExpenseSpecificationRow createArrayOfMTExpenseSpecificationRow() {
        return new ArrayOfMTExpenseSpecificationRow();
    }

    /**
     * Create an instance of {@link CreateInvoiceDoc }
     * 
     */
    public CreateInvoiceDoc createCreateInvoiceDoc() {
        return new CreateInvoiceDoc();
    }

    /**
     * Create an instance of {@link CreateMTStockTakingDoc }
     * 
     */
    public CreateMTStockTakingDoc createCreateMTStockTakingDoc() {
        return new CreateMTStockTakingDoc();
    }

    /**
     * Create an instance of {@link GetSalesAnalysisGroupedByGoodsAndServicesNextChunkResponse }
     * 
     */
    public GetSalesAnalysisGroupedByGoodsAndServicesNextChunkResponse createGetSalesAnalysisGroupedByGoodsAndServicesNextChunkResponse() {
        return new GetSalesAnalysisGroupedByGoodsAndServicesNextChunkResponse();
    }

    /**
     * Create an instance of {@link GetProductsListResponse }
     * 
     */
    public GetProductsListResponse createGetProductsListResponse() {
        return new GetProductsListResponse();
    }

    /**
     * Create an instance of {@link GetProductByIdResponse }
     * 
     */
    public GetProductByIdResponse createGetProductByIdResponse() {
        return new GetProductByIdResponse();
    }

    /**
     * Create an instance of {@link CreateMTExpenseDocResponse }
     * 
     */
    public CreateMTExpenseDocResponse createCreateMTExpenseDocResponse() {
        return new CreateMTExpenseDocResponse();
    }

    /**
     * Create an instance of {@link PartnerRemCorrectDocInfo }
     * 
     */
    public PartnerRemCorrectDocInfo createPartnerRemCorrectDocInfo() {
        return new PartnerRemCorrectDocInfo();
    }

    /**
     * Create an instance of {@link GetPriceTypesList }
     * 
     */
    public GetPriceTypesList createGetPriceTypesList() {
        return new GetPriceTypesList();
    }

    /**
     * Create an instance of {@link CreateInvoiceDocInfo }
     * 
     */
    public CreateInvoiceDocInfo createCreateInvoiceDocInfo() {
        return new CreateInvoiceDocInfo();
    }

    /**
     * Create an instance of {@link CreateInternalMoveDocInfo }
     * 
     */
    public CreateInternalMoveDocInfo createCreateInternalMoveDocInfo() {
        return new CreateInternalMoveDocInfo();
    }

    /**
     * Create an instance of {@link ChunkedResultOfPartnerListRow }
     * 
     */
    public ChunkedResultOfPartnerListRow createChunkedResultOfPartnerListRow() {
        return new ChunkedResultOfPartnerListRow();
    }

    /**
     * Create an instance of {@link PriceListRow }
     * 
     */
    public PriceListRow createPriceListRow() {
        return new PriceListRow();
    }

    /**
     * Create an instance of {@link GetPartnersInfoNextChunk }
     * 
     */
    public GetPartnersInfoNextChunk createGetPartnersInfoNextChunk() {
        return new GetPartnersInfoNextChunk();
    }

    /**
     * Create an instance of {@link ChunkedResultOfDocumentsListRow }
     * 
     */
    public ChunkedResultOfDocumentsListRow createChunkedResultOfDocumentsListRow() {
        return new ChunkedResultOfDocumentsListRow();
    }

    /**
     * Create an instance of {@link GetSalesAnalysisGroupedByGoodsAndServicesResponse }
     * 
     */
    public GetSalesAnalysisGroupedByGoodsAndServicesResponse createGetSalesAnalysisGroupedByGoodsAndServicesResponse() {
        return new GetSalesAnalysisGroupedByGoodsAndServicesResponse();
    }

    /**
     * Create an instance of {@link ChunkedResultOfPartCashBankAccRemainsRow }
     * 
     */
    public ChunkedResultOfPartCashBankAccRemainsRow createChunkedResultOfPartCashBankAccRemainsRow() {
        return new ChunkedResultOfPartCashBankAccRemainsRow();
    }

    /**
     * Create an instance of {@link LoadMTStockTakingDocResponse }
     * 
     */
    public LoadMTStockTakingDocResponse createLoadMTStockTakingDocResponse() {
        return new LoadMTStockTakingDocResponse();
    }

    /**
     * Create an instance of {@link GetSalesAnalysisGroupedByGoodsAndServicesNextChunk }
     * 
     */
    public GetSalesAnalysisGroupedByGoodsAndServicesNextChunk createGetSalesAnalysisGroupedByGoodsAndServicesNextChunk() {
        return new GetSalesAnalysisGroupedByGoodsAndServicesNextChunk();
    }

    /**
     * Create an instance of {@link GetCashesRemainsResponse }
     * 
     */
    public GetCashesRemainsResponse createGetCashesRemainsResponse() {
        return new GetCashesRemainsResponse();
    }

    /**
     * Create an instance of {@link ChunkedResultOfProductListRow }
     * 
     */
    public ChunkedResultOfProductListRow createChunkedResultOfProductListRow() {
        return new ChunkedResultOfProductListRow();
    }

    /**
     * Create an instance of {@link ArrayOfProductQuantityUnitInfo }
     * 
     */
    public ArrayOfProductQuantityUnitInfo createArrayOfProductQuantityUnitInfo() {
        return new ArrayOfProductQuantityUnitInfo();
    }

    /**
     * Create an instance of {@link GetECRChecksList }
     * 
     */
    public GetECRChecksList createGetECRChecksList() {
        return new GetECRChecksList();
    }

    /**
     * Create an instance of {@link MakeDraftDocumentResponse }
     * 
     */
    public MakeDraftDocumentResponse createMakeDraftDocumentResponse() {
        return new MakeDraftDocumentResponse();
    }

    /**
     * Create an instance of {@link UpdateMTStockTakingDoc }
     * 
     */
    public UpdateMTStockTakingDoc createUpdateMTStockTakingDoc() {
        return new UpdateMTStockTakingDoc();
    }

    /**
     * Create an instance of {@link ProductBarCodeInfo }
     * 
     */
    public ProductBarCodeInfo createProductBarCodeInfo() {
        return new ProductBarCodeInfo();
    }

    /**
     * Create an instance of {@link GetProducersList }
     * 
     */
    public GetProducersList createGetProducersList() {
        return new GetProducersList();
    }

    /**
     * Create an instance of {@link PartnerBonusRemainsListRow }
     * 
     */
    public PartnerBonusRemainsListRow createPartnerBonusRemainsListRow() {
        return new PartnerBonusRemainsListRow();
    }

    /**
     * Create an instance of {@link LoadCashOutDoc }
     * 
     */
    public LoadCashOutDoc createLoadCashOutDoc() {
        return new LoadCashOutDoc();
    }

    /**
     * Create an instance of {@link ArrayOfPriceTypeListRow }
     * 
     */
    public ArrayOfPriceTypeListRow createArrayOfPriceTypeListRow() {
        return new ArrayOfPriceTypeListRow();
    }

    /**
     * Create an instance of {@link ProcessDocumentResponse }
     * 
     */
    public ProcessDocumentResponse createProcessDocumentResponse() {
        return new ProcessDocumentResponse();
    }

    /**
     * Create an instance of {@link GetProductsListShortResponse }
     * 
     */
    public GetProductsListShortResponse createGetProductsListShortResponse() {
        return new GetProductsListShortResponse();
    }

    /**
     * Create an instance of {@link ArrayOfMTIncomeSpecificationRow }
     * 
     */
    public ArrayOfMTIncomeSpecificationRow createArrayOfMTIncomeSpecificationRow() {
        return new ArrayOfMTIncomeSpecificationRow();
    }

    /**
     * Create an instance of {@link LoadCashOutDocResponse }
     * 
     */
    public LoadCashOutDocResponse createLoadCashOutDocResponse() {
        return new LoadCashOutDocResponse();
    }

    /**
     * Create an instance of {@link UpdatePartner }
     * 
     */
    public UpdatePartner createUpdatePartner() {
        return new UpdatePartner();
    }

    /**
     * Create an instance of {@link StopSessionResponse }
     * 
     */
    public StopSessionResponse createStopSessionResponse() {
        return new StopSessionResponse();
    }

    /**
     * Create an instance of {@link GetProductPricesWithImages }
     * 
     */
    public GetProductPricesWithImages createGetProductPricesWithImages() {
        return new GetProductPricesWithImages();
    }

    /**
     * Create an instance of {@link GetProductRemByBarCodeResponse }
     * 
     */
    public GetProductRemByBarCodeResponse createGetProductRemByBarCodeResponse() {
        return new GetProductRemByBarCodeResponse();
    }

    /**
     * Create an instance of {@link GetProductsNextChunk }
     * 
     */
    public GetProductsNextChunk createGetProductsNextChunk() {
        return new GetProductsNextChunk();
    }

    /**
     * Create an instance of {@link CreateMTComplectationDocAndFillSpecificationRows }
     * 
     */
    public CreateMTComplectationDocAndFillSpecificationRows createCreateMTComplectationDocAndFillSpecificationRows() {
        return new CreateMTComplectationDocAndFillSpecificationRows();
    }

    /**
     * Create an instance of {@link DeleteDocument }
     * 
     */
    public DeleteDocument createDeleteDocument() {
        return new DeleteDocument();
    }

    /**
     * Create an instance of {@link LoadInternalMoveDoc }
     * 
     */
    public LoadInternalMoveDoc createLoadInternalMoveDoc() {
        return new LoadInternalMoveDoc();
    }

    /**
     * Create an instance of {@link ArrayOfStorageListRow }
     * 
     */
    public ArrayOfStorageListRow createArrayOfStorageListRow() {
        return new ArrayOfStorageListRow();
    }

    /**
     * Create an instance of {@link GetProductPricesNextChunkResponse }
     * 
     */
    public GetProductPricesNextChunkResponse createGetProductPricesNextChunkResponse() {
        return new GetProductPricesNextChunkResponse();
    }

    /**
     * Create an instance of {@link LoadPartnerRemCorrectDoc }
     * 
     */
    public LoadPartnerRemCorrectDoc createLoadPartnerRemCorrectDoc() {
        return new LoadPartnerRemCorrectDoc();
    }

    /**
     * Create an instance of {@link GetProductRemByCodeDetailed }
     * 
     */
    public GetProductRemByCodeDetailed createGetProductRemByCodeDetailed() {
        return new GetProductRemByCodeDetailed();
    }

    /**
     * Create an instance of {@link LoadMTIncomeDoc }
     * 
     */
    public LoadMTIncomeDoc createLoadMTIncomeDoc() {
        return new LoadMTIncomeDoc();
    }

    /**
     * Create an instance of {@link InvoiceSpecificationRow }
     * 
     */
    public InvoiceSpecificationRow createInvoiceSpecificationRow() {
        return new InvoiceSpecificationRow();
    }

    /**
     * Create an instance of {@link ArrayOfMTBarCodes }
     * 
     */
    public ArrayOfMTBarCodes createArrayOfMTBarCodes() {
        return new ArrayOfMTBarCodes();
    }

    /**
     * Create an instance of {@link GetProductByNameResponse }
     * 
     */
    public GetProductByNameResponse createGetProductByNameResponse() {
        return new GetProductByNameResponse();
    }

    /**
     * Create an instance of {@link GetProductRemsResponse }
     * 
     */
    public GetProductRemsResponse createGetProductRemsResponse() {
        return new GetProductRemsResponse();
    }

    /**
     * Create an instance of {@link ChunkedResultOfCashRemains }
     * 
     */
    public ChunkedResultOfCashRemains createChunkedResultOfCashRemains() {
        return new ChunkedResultOfCashRemains();
    }

    /**
     * Create an instance of {@link UpdatePartnerResponse }
     * 
     */
    public UpdatePartnerResponse createUpdatePartnerResponse() {
        return new UpdatePartnerResponse();
    }

    /**
     * Create an instance of {@link GetPartnersRems }
     * 
     */
    public GetPartnersRems createGetPartnersRems() {
        return new GetPartnersRems();
    }

    /**
     * Create an instance of {@link ChunkedResultOfSalesAnalysisRowGroupedbyGoodsAndServices }
     * 
     */
    public ChunkedResultOfSalesAnalysisRowGroupedbyGoodsAndServices createChunkedResultOfSalesAnalysisRowGroupedbyGoodsAndServices() {
        return new ChunkedResultOfSalesAnalysisRowGroupedbyGoodsAndServices();
    }

    /**
     * Create an instance of {@link MTReturnFromCustomerSpecificationRow }
     * 
     */
    public MTReturnFromCustomerSpecificationRow createMTReturnFromCustomerSpecificationRow() {
        return new MTReturnFromCustomerSpecificationRow();
    }

    /**
     * Create an instance of {@link CreateMTIncomeDocResponse }
     * 
     */
    public CreateMTIncomeDocResponse createCreateMTIncomeDocResponse() {
        return new CreateMTIncomeDocResponse();
    }

    /**
     * Create an instance of {@link ProductListRow }
     * 
     */
    public ProductListRow createProductListRow() {
        return new ProductListRow();
    }

    /**
     * Create an instance of {@link GetProducersListResponse }
     * 
     */
    public GetProducersListResponse createGetProducersListResponse() {
        return new GetProducersListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPartnerBonusRemainsListRow }
     * 
     */
    public ArrayOfPartnerBonusRemainsListRow createArrayOfPartnerBonusRemainsListRow() {
        return new ArrayOfPartnerBonusRemainsListRow();
    }

    /**
     * Create an instance of {@link LoadInvoiceDocResponse }
     * 
     */
    public LoadInvoiceDocResponse createLoadInvoiceDocResponse() {
        return new LoadInvoiceDocResponse();
    }

    /**
     * Create an instance of {@link GetProductsNextChunkResponse }
     * 
     */
    public GetProductsNextChunkResponse createGetProductsNextChunkResponse() {
        return new GetProductsNextChunkResponse();
    }

    /**
     * Create an instance of {@link GetCountriesList }
     * 
     */
    public GetCountriesList createGetCountriesList() {
        return new GetCountriesList();
    }

    /**
     * Create an instance of {@link LoadSaleDoc }
     * 
     */
    public LoadSaleDoc createLoadSaleDoc() {
        return new LoadSaleDoc();
    }

    /**
     * Create an instance of {@link StartSessionResponse }
     * 
     */
    public StartSessionResponse createStartSessionResponse() {
        return new StartSessionResponse();
    }

    /**
     * Create an instance of {@link UpdateDocETLState }
     * 
     */
    public UpdateDocETLState createUpdateDocETLState() {
        return new UpdateDocETLState();
    }

    /**
     * Create an instance of {@link GetPartnerBonusRemainsResponse }
     * 
     */
    public GetPartnerBonusRemainsResponse createGetPartnerBonusRemainsResponse() {
        return new GetPartnerBonusRemainsResponse();
    }

    /**
     * Create an instance of {@link GetProductsForGivenListCodes }
     * 
     */
    public GetProductsForGivenListCodes createGetProductsForGivenListCodes() {
        return new GetProductsForGivenListCodes();
    }

    /**
     * Create an instance of {@link LoadInvoiceDoc }
     * 
     */
    public LoadInvoiceDoc createLoadInvoiceDoc() {
        return new LoadInvoiceDoc();
    }

    /**
     * Create an instance of {@link CreateMTReturnFromCustomerDoc }
     * 
     */
    public CreateMTReturnFromCustomerDoc createCreateMTReturnFromCustomerDoc() {
        return new CreateMTReturnFromCustomerDoc();
    }

    /**
     * Create an instance of {@link MTComplectationDocInfo }
     * 
     */
    public MTComplectationDocInfo createMTComplectationDocInfo() {
        return new MTComplectationDocInfo();
    }

    /**
     * Create an instance of {@link ArrayOfPartCashBankAccRemainsRow }
     * 
     */
    public ArrayOfPartCashBankAccRemainsRow createArrayOfPartCashBankAccRemainsRow() {
        return new ArrayOfPartCashBankAccRemainsRow();
    }

    /**
     * Create an instance of {@link CreateInternalMoveDoc }
     * 
     */
    public CreateInternalMoveDoc createCreateInternalMoveDoc() {
        return new CreateInternalMoveDoc();
    }

    /**
     * Create an instance of {@link GetProductByCodeWithImageResponse }
     * 
     */
    public GetProductByCodeWithImageResponse createGetProductByCodeWithImageResponse() {
        return new GetProductByCodeWithImageResponse();
    }

    /**
     * Create an instance of {@link GetProductByIdWithImage }
     * 
     */
    public GetProductByIdWithImage createGetProductByIdWithImage() {
        return new GetProductByIdWithImage();
    }

    /**
     * Create an instance of {@link ArrayOfProductListRow }
     * 
     */
    public ArrayOfProductListRow createArrayOfProductListRow() {
        return new ArrayOfProductListRow();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BaseISN", scope = CashInDocInfo.class)
    public JAXBElement<String> createCashInDocInfoBaseISN(String value) {
        return new JAXBElement<String>(_CashInDocInfoBaseISN_QNAME, String.class, CashInDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartnerCode", scope = CashInDocInfo.class)
    public JAXBElement<String> createCashInDocInfoPartnerCode(String value) {
        return new JAXBElement<String>(_CashInDocInfoPartnerCode_QNAME, String.class, CashInDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Owner", scope = CashInDocInfo.class)
    public JAXBElement<String> createCashInDocInfoOwner(String value) {
        return new JAXBElement<String>(_CashInDocInfoOwner_QNAME, String.class, CashInDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Base", scope = CashInDocInfo.class)
    public JAXBElement<String> createCashInDocInfoBase(String value) {
        return new JAXBElement<String>(_CashInDocInfoBase_QNAME, String.class, CashInDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BankAcquiringContract", scope = CashInDocInfo.class)
    public JAXBElement<String> createCashInDocInfoBankAcquiringContract(String value) {
        return new JAXBElement<String>(_CashInDocInfoBankAcquiringContract_QNAME, String.class, CashInDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Employee", scope = CashInDocInfo.class)
    public JAXBElement<String> createCashInDocInfoEmployee(String value) {
        return new JAXBElement<String>(_CashInDocInfoEmployee_QNAME, String.class, CashInDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Contract", scope = CashInDocInfo.class)
    public JAXBElement<String> createCashInDocInfoContract(String value) {
        return new JAXBElement<String>(_CashInDocInfoContract_QNAME, String.class, CashInDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BankAcquiringPartner", scope = CashInDocInfo.class)
    public JAXBElement<String> createCashInDocInfoBankAcquiringPartner(String value) {
        return new JAXBElement<String>(_CashInDocInfoBankAcquiringPartner_QNAME, String.class, CashInDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Appendix", scope = CashInDocInfo.class)
    public JAXBElement<String> createCashInDocInfoAppendix(String value) {
        return new JAXBElement<String>(_CashInDocInfoAppendix_QNAME, String.class, CashInDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Comment", scope = CashInDocInfo.class)
    public JAXBElement<String> createCashInDocInfoComment(String value) {
        return new JAXBElement<String>(_CashInDocInfoComment_QNAME, String.class, CashInDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ISN", scope = CashInDocInfo.class)
    public JAXBElement<String> createCashInDocInfoISN(String value) {
        return new JAXBElement<String>(_CashInDocInfoISN_QNAME, String.class, CashInDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ECRCheckNumber", scope = CashInDocInfo.class)
    public JAXBElement<String> createCashInDocInfoECRCheckNumber(String value) {
        return new JAXBElement<String>(_CashInDocInfoECRCheckNumber_QNAME, String.class, CashInDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "CashOutDesk", scope = CashInDocInfo.class)
    public JAXBElement<String> createCashInDocInfoCashOutDesk(String value) {
        return new JAXBElement<String>(_CashInDocInfoCashOutDesk_QNAME, String.class, CashInDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "CashierShiftNumber", scope = CashInDocInfo.class)
    public JAXBElement<String> createCashInDocInfoCashierShiftNumber(String value) {
        return new JAXBElement<String>(_CashInDocInfoCashierShiftNumber_QNAME, String.class, CashInDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ExtBody", scope = CashInDocInfo.class)
    public JAXBElement<String> createCashInDocInfoExtBody(String value) {
        return new JAXBElement<String>(_CashInDocInfoExtBody_QNAME, String.class, CashInDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "AccountCode", scope = CashInDocInfo.class)
    public JAXBElement<String> createCashInDocInfoAccountCode(String value) {
        return new JAXBElement<String>(_CashInDocInfoAccountCode_QNAME, String.class, CashInDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BankAcquiringCardIndex", scope = CashInDocInfo.class)
    public JAXBElement<String> createCashInDocInfoBankAcquiringCardIndex(String value) {
        return new JAXBElement<String>(_CashInDocInfoBankAcquiringCardIndex_QNAME, String.class, CashInDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "NextNumIn", scope = CashListRow.class)
    public JAXBElement<String> createCashListRowNextNumIn(String value) {
        return new JAXBElement<String>(_CashListRowNextNumIn_QNAME, String.class, CashListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "NextMTBillNum", scope = CashListRow.class)
    public JAXBElement<String> createCashListRowNextMTBillNum(String value) {
        return new JAXBElement<String>(_CashListRowNextMTBillNum_QNAME, String.class, CashListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "NextMTBillReturnNum", scope = CashListRow.class)
    public JAXBElement<String> createCashListRowNextMTBillReturnNum(String value) {
        return new JAXBElement<String>(_CashListRowNextMTBillReturnNum_QNAME, String.class, CashListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "NextCashierShiftNum", scope = CashListRow.class)
    public JAXBElement<String> createCashListRowNextCashierShiftNum(String value) {
        return new JAXBElement<String>(_CashListRowNextCashierShiftNum_QNAME, String.class, CashListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "NextNumOut", scope = CashListRow.class)
    public JAXBElement<String> createCashListRowNextNumOut(String value) {
        return new JAXBElement<String>(_CashListRowNextNumOut_QNAME, String.class, CashListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMTReturnFromCustomerSpecificationRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ArrayOfMTReturnFromCustomerSpecificationRow")
    public JAXBElement<ArrayOfMTReturnFromCustomerSpecificationRow> createArrayOfMTReturnFromCustomerSpecificationRow(ArrayOfMTReturnFromCustomerSpecificationRow value) {
        return new JAXBElement<ArrayOfMTReturnFromCustomerSpecificationRow>(_ArrayOfMTReturnFromCustomerSpecificationRow_QNAME, ArrayOfMTReturnFromCustomerSpecificationRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ArrayOfProductListRow")
    public JAXBElement<ArrayOfProductListRow> createArrayOfProductListRow(ArrayOfProductListRow value) {
        return new JAXBElement<ArrayOfProductListRow>(_ArrayOfProductListRow_QNAME, ArrayOfProductListRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfMTBarCodes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ChunkedResultOfMTBarCodes")
    public JAXBElement<ChunkedResultOfMTBarCodes> createChunkedResultOfMTBarCodes(ChunkedResultOfMTBarCodes value) {
        return new JAXBElement<ChunkedResultOfMTBarCodes>(_ChunkedResultOfMTBarCodes_QNAME, ChunkedResultOfMTBarCodes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InternalMoveSpecificationRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "InternalMoveSpecificationRow")
    public JAXBElement<InternalMoveSpecificationRow> createInternalMoveSpecificationRow(InternalMoveSpecificationRow value) {
        return new JAXBElement<InternalMoveSpecificationRow>(_InternalMoveSpecificationRow_QNAME, InternalMoveSpecificationRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCashRemains }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ArrayOfCashRemains")
    public JAXBElement<ArrayOfCashRemains> createArrayOfCashRemains(ArrayOfCashRemains value) {
        return new JAXBElement<ArrayOfCashRemains>(_ArrayOfCashRemains_QNAME, ArrayOfCashRemains.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductGroupListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ArrayOfProductGroupListRow")
    public JAXBElement<ArrayOfProductGroupListRow> createArrayOfProductGroupListRow(ArrayOfProductGroupListRow value) {
        return new JAXBElement<ArrayOfProductGroupListRow>(_ArrayOfProductGroupListRow_QNAME, ArrayOfProductGroupListRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductShortListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ArrayOfProductShortListRow")
    public JAXBElement<ArrayOfProductShortListRow> createArrayOfProductShortListRow(ArrayOfProductShortListRow value) {
        return new JAXBElement<ArrayOfProductShortListRow>(_ArrayOfProductShortListRow_QNAME, ArrayOfProductShortListRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankInDocInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BankInDocInfo")
    public JAXBElement<BankInDocInfo> createBankInDocInfo(BankInDocInfo value) {
        return new JAXBElement<BankInDocInfo>(_BankInDocInfo_QNAME, BankInDocInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MTComplectationDocInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "MTComplectationDocInfo")
    public JAXBElement<MTComplectationDocInfo> createMTComplectationDocInfo(MTComplectationDocInfo value) {
        return new JAXBElement<MTComplectationDocInfo>(_MTComplectationDocInfo_QNAME, MTComplectationDocInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMTComplectationSpecificationRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ArrayOfMTComplectationSpecificationRow")
    public JAXBElement<ArrayOfMTComplectationSpecificationRow> createArrayOfMTComplectationSpecificationRow(ArrayOfMTComplectationSpecificationRow value) {
        return new JAXBElement<ArrayOfMTComplectationSpecificationRow>(_ArrayOfMTComplectationSpecificationRow_QNAME, ArrayOfMTComplectationSpecificationRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfPartCashBankAccRemainsRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ChunkedResultOfPartCashBankAccRemainsRow")
    public JAXBElement<ChunkedResultOfPartCashBankAccRemainsRow> createChunkedResultOfPartCashBankAccRemainsRow(ChunkedResultOfPartCashBankAccRemainsRow value) {
        return new JAXBElement<ChunkedResultOfPartCashBankAccRemainsRow>(_ChunkedResultOfPartCashBankAccRemainsRow_QNAME, ChunkedResultOfPartCashBankAccRemainsRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPartnerSettlementAccountInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ArrayOfPartnerSettlementAccountInfo")
    public JAXBElement<ArrayOfPartnerSettlementAccountInfo> createArrayOfPartnerSettlementAccountInfo(ArrayOfPartnerSettlementAccountInfo value) {
        return new JAXBElement<ArrayOfPartnerSettlementAccountInfo>(_ArrayOfPartnerSettlementAccountInfo_QNAME, ArrayOfPartnerSettlementAccountInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartnerBonusRemainsListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartnerBonusRemainsListRow")
    public JAXBElement<PartnerBonusRemainsListRow> createPartnerBonusRemainsListRow(PartnerBonusRemainsListRow value) {
        return new JAXBElement<PartnerBonusRemainsListRow>(_PartnerBonusRemainsListRow_QNAME, PartnerBonusRemainsListRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPartnerListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ArrayOfPartnerListRow")
    public JAXBElement<ArrayOfPartnerListRow> createArrayOfPartnerListRow(ArrayOfPartnerListRow value) {
        return new JAXBElement<ArrayOfPartnerListRow>(_ArrayOfPartnerListRow_QNAME, ArrayOfPartnerListRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfCreateProductInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ChunkedResultOfCreateProductInfo")
    public JAXBElement<ChunkedResultOfCreateProductInfo> createChunkedResultOfCreateProductInfo(ChunkedResultOfCreateProductInfo value) {
        return new JAXBElement<ChunkedResultOfCreateProductInfo>(_ChunkedResultOfCreateProductInfo_QNAME, ChunkedResultOfCreateProductInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfPartnerListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ChunkedResultOfPartnerListRow")
    public JAXBElement<ChunkedResultOfPartnerListRow> createChunkedResultOfPartnerListRow(ChunkedResultOfPartnerListRow value) {
        return new JAXBElement<ChunkedResultOfPartnerListRow>(_ChunkedResultOfPartnerListRow_QNAME, ChunkedResultOfPartnerListRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentsListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ArrayOfDocumentsListRow")
    public JAXBElement<ArrayOfDocumentsListRow> createArrayOfDocumentsListRow(ArrayOfDocumentsListRow value) {
        return new JAXBElement<ArrayOfDocumentsListRow>(_ArrayOfDocumentsListRow_QNAME, ArrayOfDocumentsListRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfDocumentsListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ChunkedResultOfDocumentsListRow")
    public JAXBElement<ChunkedResultOfDocumentsListRow> createChunkedResultOfDocumentsListRow(ChunkedResultOfDocumentsListRow value) {
        return new JAXBElement<ChunkedResultOfDocumentsListRow>(_ChunkedResultOfDocumentsListRow_QNAME, ChunkedResultOfDocumentsListRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MTStockTakingDocInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "MTStockTakingDocInfo")
    public JAXBElement<MTStockTakingDocInfo> createMTStockTakingDocInfo(MTStockTakingDocInfo value) {
        return new JAXBElement<MTStockTakingDocInfo>(_MTStockTakingDocInfo_QNAME, MTStockTakingDocInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MTIncomeSpecificationRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "MTIncomeSpecificationRow")
    public JAXBElement<MTIncomeSpecificationRow> createMTIncomeSpecificationRow(MTIncomeSpecificationRow value) {
        return new JAXBElement<MTIncomeSpecificationRow>(_MTIncomeSpecificationRow_QNAME, MTIncomeSpecificationRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSalesAnalysisRowGroupedbyGoodsAndServices }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ArrayOfSalesAnalysisRowGroupedbyGoodsAndServices")
    public JAXBElement<ArrayOfSalesAnalysisRowGroupedbyGoodsAndServices> createArrayOfSalesAnalysisRowGroupedbyGoodsAndServices(ArrayOfSalesAnalysisRowGroupedbyGoodsAndServices value) {
        return new JAXBElement<ArrayOfSalesAnalysisRowGroupedbyGoodsAndServices>(_ArrayOfSalesAnalysisRowGroupedbyGoodsAndServices_QNAME, ArrayOfSalesAnalysisRowGroupedbyGoodsAndServices.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSalesAnalysisRowGroupedByPartner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ArrayOfSalesAnalysisRowGroupedByPartner")
    public JAXBElement<ArrayOfSalesAnalysisRowGroupedByPartner> createArrayOfSalesAnalysisRowGroupedByPartner(ArrayOfSalesAnalysisRowGroupedByPartner value) {
        return new JAXBElement<ArrayOfSalesAnalysisRowGroupedByPartner>(_ArrayOfSalesAnalysisRowGroupedByPartner_QNAME, ArrayOfSalesAnalysisRowGroupedByPartner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MTComplectationSpecificationRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "MTComplectationSpecificationRow")
    public JAXBElement<MTComplectationSpecificationRow> createMTComplectationSpecificationRow(MTComplectationSpecificationRow value) {
        return new JAXBElement<MTComplectationSpecificationRow>(_MTComplectationSpecificationRow_QNAME, MTComplectationSpecificationRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInternalMoveSpecificationRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ArrayOfInternalMoveSpecificationRow")
    public JAXBElement<ArrayOfInternalMoveSpecificationRow> createArrayOfInternalMoveSpecificationRow(ArrayOfInternalMoveSpecificationRow value) {
        return new JAXBElement<ArrayOfInternalMoveSpecificationRow>(_ArrayOfInternalMoveSpecificationRow_QNAME, ArrayOfInternalMoveSpecificationRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateProductInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "CreateProductInfo")
    public JAXBElement<CreateProductInfo> createCreateProductInfo(CreateProductInfo value) {
        return new JAXBElement<CreateProductInfo>(_CreateProductInfo_QNAME, CreateProductInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartnerContractInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartnerContractInfo")
    public JAXBElement<PartnerContractInfo> createPartnerContractInfo(PartnerContractInfo value) {
        return new JAXBElement<PartnerContractInfo>(_PartnerContractInfo_QNAME, PartnerContractInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfSalesAnalysisRowGroupedByPartner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ChunkedResultOfSalesAnalysisRowGroupedByPartner")
    public JAXBElement<ChunkedResultOfSalesAnalysisRowGroupedByPartner> createChunkedResultOfSalesAnalysisRowGroupedByPartner(ChunkedResultOfSalesAnalysisRowGroupedByPartner value) {
        return new JAXBElement<ChunkedResultOfSalesAnalysisRowGroupedByPartner>(_ChunkedResultOfSalesAnalysisRowGroupedByPartner_QNAME, ChunkedResultOfSalesAnalysisRowGroupedByPartner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPartnerBusinessAddressInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ArrayOfPartnerBusinessAddressInfo")
    public JAXBElement<ArrayOfPartnerBusinessAddressInfo> createArrayOfPartnerBusinessAddressInfo(ArrayOfPartnerBusinessAddressInfo value) {
        return new JAXBElement<ArrayOfPartnerBusinessAddressInfo>(_ArrayOfPartnerBusinessAddressInfo_QNAME, ArrayOfPartnerBusinessAddressInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VATType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "VATType")
    public JAXBElement<VATType> createVATType(VATType value) {
        return new JAXBElement<VATType>(_VATType_QNAME, VATType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfProductListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ChunkedResultOfProductListRow")
    public JAXBElement<ChunkedResultOfProductListRow> createChunkedResultOfProductListRow(ChunkedResultOfProductListRow value) {
        return new JAXBElement<ChunkedResultOfProductListRow>(_ChunkedResultOfProductListRow_QNAME, ChunkedResultOfProductListRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSaleDocInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "CreateSaleDocInfo")
    public JAXBElement<CreateSaleDocInfo> createCreateSaleDocInfo(CreateSaleDocInfo value) {
        return new JAXBElement<CreateSaleDocInfo>(_CreateSaleDocInfo_QNAME, CreateSaleDocInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPriceTypeListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ArrayOfPriceTypeListRow")
    public JAXBElement<ArrayOfPriceTypeListRow> createArrayOfPriceTypeListRow(ArrayOfPriceTypeListRow value) {
        return new JAXBElement<ArrayOfPriceTypeListRow>(_ArrayOfPriceTypeListRow_QNAME, ArrayOfPriceTypeListRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfCodeCaptionListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ChunkedResultOfCodeCaptionListRow")
    public JAXBElement<ChunkedResultOfCodeCaptionListRow> createChunkedResultOfCodeCaptionListRow(ChunkedResultOfCodeCaptionListRow value) {
        return new JAXBElement<ChunkedResultOfCodeCaptionListRow>(_ChunkedResultOfCodeCaptionListRow_QNAME, ChunkedResultOfCodeCaptionListRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CashRemains }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "CashRemains")
    public JAXBElement<CashRemains> createCashRemains(CashRemains value) {
        return new JAXBElement<CashRemains>(_CashRemains_QNAME, CashRemains.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateInternalMoveDocInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "CreateInternalMoveDocInfo")
    public JAXBElement<CreateInternalMoveDocInfo> createCreateInternalMoveDocInfo(CreateInternalMoveDocInfo value) {
        return new JAXBElement<CreateInternalMoveDocInfo>(_CreateInternalMoveDocInfo_QNAME, CreateInternalMoveDocInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceSpecificationRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "InvoiceSpecificationRow")
    public JAXBElement<InvoiceSpecificationRow> createInvoiceSpecificationRow(InvoiceSpecificationRow value) {
        return new JAXBElement<InvoiceSpecificationRow>(_InvoiceSpecificationRow_QNAME, InvoiceSpecificationRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductQuantityUnitInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ArrayOfProductQuantityUnitInfo")
    public JAXBElement<ArrayOfProductQuantityUnitInfo> createArrayOfProductQuantityUnitInfo(ArrayOfProductQuantityUnitInfo value) {
        return new JAXBElement<ArrayOfProductQuantityUnitInfo>(_ArrayOfProductQuantityUnitInfo_QNAME, ArrayOfProductQuantityUnitInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartCashBankAccRemainsRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartCashBankAccRemainsRow")
    public JAXBElement<PartCashBankAccRemainsRow> createPartCashBankAccRemainsRow(PartCashBankAccRemainsRow value) {
        return new JAXBElement<PartCashBankAccRemainsRow>(_PartCashBankAccRemainsRow_QNAME, PartCashBankAccRemainsRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MTExpenseDocInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "MTExpenseDocInfo")
    public JAXBElement<MTExpenseDocInfo> createMTExpenseDocInfo(MTExpenseDocInfo value) {
        return new JAXBElement<MTExpenseDocInfo>(_MTExpenseDocInfo_QNAME, MTExpenseDocInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfProductShortListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ChunkedResultOfProductShortListRow")
    public JAXBElement<ChunkedResultOfProductShortListRow> createChunkedResultOfProductShortListRow(ChunkedResultOfProductShortListRow value) {
        return new JAXBElement<ChunkedResultOfProductShortListRow>(_ChunkedResultOfProductShortListRow_QNAME, ChunkedResultOfProductShortListRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PriceListRow")
    public JAXBElement<PriceListRow> createPriceListRow(PriceListRow value) {
        return new JAXBElement<PriceListRow>(_PriceListRow_QNAME, PriceListRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CashOutDocInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "CashOutDocInfo")
    public JAXBElement<CashOutDocInfo> createCashOutDocInfo(CashOutDocInfo value) {
        return new JAXBElement<CashOutDocInfo>(_CashOutDocInfo_QNAME, CashOutDocInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SerializationBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "SerializationBase")
    public JAXBElement<SerializationBase> createSerializationBase(SerializationBase value) {
        return new JAXBElement<SerializationBase>(_SerializationBase_QNAME, SerializationBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductBarCodeInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ArrayOfProductBarCodeInfo")
    public JAXBElement<ArrayOfProductBarCodeInfo> createArrayOfProductBarCodeInfo(ArrayOfProductBarCodeInfo value) {
        return new JAXBElement<ArrayOfProductBarCodeInfo>(_ArrayOfProductBarCodeInfo_QNAME, ArrayOfProductBarCodeInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPartnerGroupListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ArrayOfPartnerGroupListRow")
    public JAXBElement<ArrayOfPartnerGroupListRow> createArrayOfPartnerGroupListRow(ArrayOfPartnerGroupListRow value) {
        return new JAXBElement<ArrayOfPartnerGroupListRow>(_ArrayOfPartnerGroupListRow_QNAME, ArrayOfPartnerGroupListRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MTExpenseSpecificationRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "MTExpenseSpecificationRow")
    public JAXBElement<MTExpenseSpecificationRow> createMTExpenseSpecificationRow(MTExpenseSpecificationRow value) {
        return new JAXBElement<MTExpenseSpecificationRow>(_MTExpenseSpecificationRow_QNAME, MTExpenseSpecificationRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MTBarCodes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "MTBarCodes")
    public JAXBElement<MTBarCodes> createMTBarCodes(MTBarCodes value) {
        return new JAXBElement<MTBarCodes>(_MTBarCodes_QNAME, MTBarCodes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePartnerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "CreatePartnerInfo")
    public JAXBElement<CreatePartnerInfo> createCreatePartnerInfo(CreatePartnerInfo value) {
        return new JAXBElement<CreatePartnerInfo>(_CreatePartnerInfo_QNAME, CreatePartnerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodAvailabilityRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GoodAvailabilityRow")
    public JAXBElement<GoodAvailabilityRow> createGoodAvailabilityRow(GoodAvailabilityRow value) {
        return new JAXBElement<GoodAvailabilityRow>(_GoodAvailabilityRow_QNAME, GoodAvailabilityRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductGroupListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ProductGroupListRow")
    public JAXBElement<ProductGroupListRow> createProductGroupListRow(ProductGroupListRow value) {
        return new JAXBElement<ProductGroupListRow>(_ProductGroupListRow_QNAME, ProductGroupListRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStorageListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ArrayOfStorageListRow")
    public JAXBElement<ArrayOfStorageListRow> createArrayOfStorageListRow(ArrayOfStorageListRow value) {
        return new JAXBElement<ArrayOfStorageListRow>(_ArrayOfStorageListRow_QNAME, ArrayOfStorageListRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGoodAvailabilityRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ArrayOfGoodAvailabilityRow")
    public JAXBElement<ArrayOfGoodAvailabilityRow> createArrayOfGoodAvailabilityRow(ArrayOfGoodAvailabilityRow value) {
        return new JAXBElement<ArrayOfGoodAvailabilityRow>(_ArrayOfGoodAvailabilityRow_QNAME, ArrayOfGoodAvailabilityRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateInvoiceDocInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "CreateInvoiceDocInfo")
    public JAXBElement<CreateInvoiceDocInfo> createCreateInvoiceDocInfo(CreateInvoiceDocInfo value) {
        return new JAXBElement<CreateInvoiceDocInfo>(_CreateInvoiceDocInfo_QNAME, CreateInvoiceDocInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfCashRemains }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ChunkedResultOfCashRemains")
    public JAXBElement<ChunkedResultOfCashRemains> createChunkedResultOfCashRemains(ChunkedResultOfCashRemains value) {
        return new JAXBElement<ChunkedResultOfCashRemains>(_ChunkedResultOfCashRemains_QNAME, ChunkedResultOfCashRemains.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportCurrsTypesEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ReportCurrsTypesEnum")
    public JAXBElement<ReportCurrsTypesEnum> createReportCurrsTypesEnum(ReportCurrsTypesEnum value) {
        return new JAXBElement<ReportCurrsTypesEnum>(_ReportCurrsTypesEnum_QNAME, ReportCurrsTypesEnum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductBarCodeInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ProductBarCodeInfo")
    public JAXBElement<ProductBarCodeInfo> createProductBarCodeInfo(ProductBarCodeInfo value) {
        return new JAXBElement<ProductBarCodeInfo>(_ProductBarCodeInfo_QNAME, ProductBarCodeInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StorageListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "StorageListRow")
    public JAXBElement<StorageListRow> createStorageListRow(StorageListRow value) {
        return new JAXBElement<StorageListRow>(_StorageListRow_QNAME, StorageListRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfPriceListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ChunkedResultOfPriceListRow")
    public JAXBElement<ChunkedResultOfPriceListRow> createChunkedResultOfPriceListRow(ChunkedResultOfPriceListRow value) {
        return new JAXBElement<ChunkedResultOfPriceListRow>(_ChunkedResultOfPriceListRow_QNAME, ChunkedResultOfPriceListRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MTStockTakingSpecificationRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "MTStockTakingSpecificationRow")
    public JAXBElement<MTStockTakingSpecificationRow> createMTStockTakingSpecificationRow(MTStockTakingSpecificationRow value) {
        return new JAXBElement<MTStockTakingSpecificationRow>(_MTStockTakingSpecificationRow_QNAME, MTStockTakingSpecificationRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "DocumentState")
    public JAXBElement<DocumentState> createDocumentState(DocumentState value) {
        return new JAXBElement<DocumentState>(_DocumentState_QNAME, DocumentState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMTBarCodes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ArrayOfMTBarCodes")
    public JAXBElement<ArrayOfMTBarCodes> createArrayOfMTBarCodes(ArrayOfMTBarCodes value) {
        return new JAXBElement<ArrayOfMTBarCodes>(_ArrayOfMTBarCodes_QNAME, ArrayOfMTBarCodes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfSalesAnalysisRowGroupedbyGoodsAndServices }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ChunkedResultOfSalesAnalysisRowGroupedbyGoodsAndServices")
    public JAXBElement<ChunkedResultOfSalesAnalysisRowGroupedbyGoodsAndServices> createChunkedResultOfSalesAnalysisRowGroupedbyGoodsAndServices(ChunkedResultOfSalesAnalysisRowGroupedbyGoodsAndServices value) {
        return new JAXBElement<ChunkedResultOfSalesAnalysisRowGroupedbyGoodsAndServices>(_ChunkedResultOfSalesAnalysisRowGroupedbyGoodsAndServices_QNAME, ChunkedResultOfSalesAnalysisRowGroupedbyGoodsAndServices.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesAnalysisRowGroupedbyGoodsAndServices }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "SalesAnalysisRowGroupedbyGoodsAndServices")
    public JAXBElement<SalesAnalysisRowGroupedbyGoodsAndServices> createSalesAnalysisRowGroupedbyGoodsAndServices(SalesAnalysisRowGroupedbyGoodsAndServices value) {
        return new JAXBElement<SalesAnalysisRowGroupedbyGoodsAndServices>(_SalesAnalysisRowGroupedbyGoodsAndServices_QNAME, SalesAnalysisRowGroupedbyGoodsAndServices.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CashListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "CashListRow")
    public JAXBElement<CashListRow> createCashListRow(CashListRow value) {
        return new JAXBElement<CashListRow>(_CashListRow_QNAME, CashListRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMTStockTakingSpecificationRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ArrayOfMTStockTakingSpecificationRow")
    public JAXBElement<ArrayOfMTStockTakingSpecificationRow> createArrayOfMTStockTakingSpecificationRow(ArrayOfMTStockTakingSpecificationRow value) {
        return new JAXBElement<ArrayOfMTStockTakingSpecificationRow>(_ArrayOfMTStockTakingSpecificationRow_QNAME, ArrayOfMTStockTakingSpecificationRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMTIncomeSpecificationRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ArrayOfMTIncomeSpecificationRow")
    public JAXBElement<ArrayOfMTIncomeSpecificationRow> createArrayOfMTIncomeSpecificationRow(ArrayOfMTIncomeSpecificationRow value) {
        return new JAXBElement<ArrayOfMTIncomeSpecificationRow>(_ArrayOfMTIncomeSpecificationRow_QNAME, ArrayOfMTIncomeSpecificationRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesAnalysisRowGroupedByPartner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "SalesAnalysisRowGroupedByPartner")
    public JAXBElement<SalesAnalysisRowGroupedByPartner> createSalesAnalysisRowGroupedByPartner(SalesAnalysisRowGroupedByPartner value) {
        return new JAXBElement<SalesAnalysisRowGroupedByPartner>(_SalesAnalysisRowGroupedByPartner_QNAME, SalesAnalysisRowGroupedByPartner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCreatePartnerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ArrayOfCreatePartnerInfo")
    public JAXBElement<ArrayOfCreatePartnerInfo> createArrayOfCreatePartnerInfo(ArrayOfCreatePartnerInfo value) {
        return new JAXBElement<ArrayOfCreatePartnerInfo>(_ArrayOfCreatePartnerInfo_QNAME, ArrayOfCreatePartnerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ProductListRow")
    public JAXBElement<ProductListRow> createProductListRow(ProductListRow value) {
        return new JAXBElement<ProductListRow>(_ProductListRow_QNAME, ProductListRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMTExpenseSpecificationRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ArrayOfMTExpenseSpecificationRow")
    public JAXBElement<ArrayOfMTExpenseSpecificationRow> createArrayOfMTExpenseSpecificationRow(ArrayOfMTExpenseSpecificationRow value) {
        return new JAXBElement<ArrayOfMTExpenseSpecificationRow>(_ArrayOfMTExpenseSpecificationRow_QNAME, ArrayOfMTExpenseSpecificationRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfCreatePartnerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ChunkedResultOfCreatePartnerInfo")
    public JAXBElement<ChunkedResultOfCreatePartnerInfo> createChunkedResultOfCreatePartnerInfo(ChunkedResultOfCreatePartnerInfo value) {
        return new JAXBElement<ChunkedResultOfCreatePartnerInfo>(_ChunkedResultOfCreatePartnerInfo_QNAME, ChunkedResultOfCreatePartnerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCodeCaptionListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ArrayOfCodeCaptionListRow")
    public JAXBElement<ArrayOfCodeCaptionListRow> createArrayOfCodeCaptionListRow(ArrayOfCodeCaptionListRow value) {
        return new JAXBElement<ArrayOfCodeCaptionListRow>(_ArrayOfCodeCaptionListRow_QNAME, ArrayOfCodeCaptionListRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceTypeListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PriceTypeListRow")
    public JAXBElement<PriceTypeListRow> createPriceTypeListRow(PriceTypeListRow value) {
        return new JAXBElement<PriceTypeListRow>(_PriceTypeListRow_QNAME, PriceTypeListRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesAnalysisDataProviderDataRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "SalesAnalysisDataProvider.DataRow")
    public JAXBElement<SalesAnalysisDataProviderDataRow> createSalesAnalysisDataProviderDataRow(SalesAnalysisDataProviderDataRow value) {
        return new JAXBElement<SalesAnalysisDataProviderDataRow>(_SalesAnalysisDataProviderDataRow_QNAME, SalesAnalysisDataProviderDataRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MTIncomeDocInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "MTIncomeDocInfo")
    public JAXBElement<MTIncomeDocInfo> createMTIncomeDocInfo(MTIncomeDocInfo value) {
        return new JAXBElement<MTIncomeDocInfo>(_MTIncomeDocInfo_QNAME, MTIncomeDocInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditPartnerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "EditPartnerInfo")
    public JAXBElement<EditPartnerInfo> createEditPartnerInfo(EditPartnerInfo value) {
        return new JAXBElement<EditPartnerInfo>(_EditPartnerInfo_QNAME, EditPartnerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductShortListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ProductShortListRow")
    public JAXBElement<ProductShortListRow> createProductShortListRow(ProductShortListRow value) {
        return new JAXBElement<ProductShortListRow>(_ProductShortListRow_QNAME, ProductShortListRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfGoodAvailabilityRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ChunkedResultOfGoodAvailabilityRow")
    public JAXBElement<ChunkedResultOfGoodAvailabilityRow> createChunkedResultOfGoodAvailabilityRow(ChunkedResultOfGoodAvailabilityRow value) {
        return new JAXBElement<ChunkedResultOfGoodAvailabilityRow>(_ChunkedResultOfGoodAvailabilityRow_QNAME, ChunkedResultOfGoodAvailabilityRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfSalesAnalysisDataProviderDataRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ChunkedResultOfSalesAnalysisDataProvider.DataRow")
    public JAXBElement<ChunkedResultOfSalesAnalysisDataProviderDataRow> createChunkedResultOfSalesAnalysisDataProviderDataRow(ChunkedResultOfSalesAnalysisDataProviderDataRow value) {
        return new JAXBElement<ChunkedResultOfSalesAnalysisDataProviderDataRow>(_ChunkedResultOfSalesAnalysisDataProviderDataRow_QNAME, ChunkedResultOfSalesAnalysisDataProviderDataRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MTReturnFromCustomerDocInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "MTReturnFromCustomerDocInfo")
    public JAXBElement<MTReturnFromCustomerDocInfo> createMTReturnFromCustomerDocInfo(MTReturnFromCustomerDocInfo value) {
        return new JAXBElement<MTReturnFromCustomerDocInfo>(_MTReturnFromCustomerDocInfo_QNAME, MTReturnFromCustomerDocInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentsListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "DocumentsListRow")
    public JAXBElement<DocumentsListRow> createDocumentsListRow(DocumentsListRow value) {
        return new JAXBElement<DocumentsListRow>(_DocumentsListRow_QNAME, DocumentsListRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartnerBusinessAddressInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartnerBusinessAddressInfo")
    public JAXBElement<PartnerBusinessAddressInfo> createPartnerBusinessAddressInfo(PartnerBusinessAddressInfo value) {
        return new JAXBElement<PartnerBusinessAddressInfo>(_PartnerBusinessAddressInfo_QNAME, PartnerBusinessAddressInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPartCashBankAccRemainsRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ArrayOfPartCashBankAccRemainsRow")
    public JAXBElement<ArrayOfPartCashBankAccRemainsRow> createArrayOfPartCashBankAccRemainsRow(ArrayOfPartCashBankAccRemainsRow value) {
        return new JAXBElement<ArrayOfPartCashBankAccRemainsRow>(_ArrayOfPartCashBankAccRemainsRow_QNAME, ArrayOfPartCashBankAccRemainsRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendableRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ExtendableRow")
    public JAXBElement<ExtendableRow> createExtendableRow(ExtendableRow value) {
        return new JAXBElement<ExtendableRow>(_ExtendableRow_QNAME, ExtendableRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CashInDocInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "CashInDocInfo")
    public JAXBElement<CashInDocInfo> createCashInDocInfo(CashInDocInfo value) {
        return new JAXBElement<CashInDocInfo>(_CashInDocInfo_QNAME, CashInDocInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartnerGroupListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartnerGroupListRow")
    public JAXBElement<PartnerGroupListRow> createPartnerGroupListRow(PartnerGroupListRow value) {
        return new JAXBElement<PartnerGroupListRow>(_PartnerGroupListRow_QNAME, PartnerGroupListRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartnerListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartnerListRow")
    public JAXBElement<PartnerListRow> createPartnerListRow(PartnerListRow value) {
        return new JAXBElement<PartnerListRow>(_PartnerListRow_QNAME, PartnerListRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCashListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ArrayOfCashListRow")
    public JAXBElement<ArrayOfCashListRow> createArrayOfCashListRow(ArrayOfCashListRow value) {
        return new JAXBElement<ArrayOfCashListRow>(_ArrayOfCashListRow_QNAME, ArrayOfCashListRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInvoiceSpecificationRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ArrayOfInvoiceSpecificationRow")
    public JAXBElement<ArrayOfInvoiceSpecificationRow> createArrayOfInvoiceSpecificationRow(ArrayOfInvoiceSpecificationRow value) {
        return new JAXBElement<>(_ArrayOfInvoiceSpecificationRow_QNAME, ArrayOfInvoiceSpecificationRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPartnerBonusRemainsListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ArrayOfPartnerBonusRemainsListRow")
    public JAXBElement<ArrayOfPartnerBonusRemainsListRow> createArrayOfPartnerBonusRemainsListRow(ArrayOfPartnerBonusRemainsListRow value) {
        return new JAXBElement<ArrayOfPartnerBonusRemainsListRow>(_ArrayOfPartnerBonusRemainsListRow_QNAME, ArrayOfPartnerBonusRemainsListRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MTReturnFromCustomerSpecificationRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "MTReturnFromCustomerSpecificationRow")
    public JAXBElement<MTReturnFromCustomerSpecificationRow> createMTReturnFromCustomerSpecificationRow(MTReturnFromCustomerSpecificationRow value) {
        return new JAXBElement<MTReturnFromCustomerSpecificationRow>(_MTReturnFromCustomerSpecificationRow_QNAME, MTReturnFromCustomerSpecificationRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPriceListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ArrayOfPriceListRow")
    public JAXBElement<ArrayOfPriceListRow> createArrayOfPriceListRow(ArrayOfPriceListRow value) {
        return new JAXBElement<ArrayOfPriceListRow>(_ArrayOfPriceListRow_QNAME, ArrayOfPriceListRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPartnerContractInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ArrayOfPartnerContractInfo")
    public JAXBElement<ArrayOfPartnerContractInfo> createArrayOfPartnerContractInfo(ArrayOfPartnerContractInfo value) {
        return new JAXBElement<ArrayOfPartnerContractInfo>(_ArrayOfPartnerContractInfo_QNAME, ArrayOfPartnerContractInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeCaptionListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "CodeCaptionListRow")
    public JAXBElement<CodeCaptionListRow> createCodeCaptionListRow(CodeCaptionListRow value) {
        return new JAXBElement<CodeCaptionListRow>(_CodeCaptionListRow_QNAME, CodeCaptionListRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartnerSettlementAccountInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartnerSettlementAccountInfo")
    public JAXBElement<PartnerSettlementAccountInfo> createPartnerSettlementAccountInfo(PartnerSettlementAccountInfo value) {
        return new JAXBElement<PartnerSettlementAccountInfo>(_PartnerSettlementAccountInfo_QNAME, PartnerSettlementAccountInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartnerRemCorrectDocInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartnerRemCorrectDocInfo")
    public JAXBElement<PartnerRemCorrectDocInfo> createPartnerRemCorrectDocInfo(PartnerRemCorrectDocInfo value) {
        return new JAXBElement<PartnerRemCorrectDocInfo>(_PartnerRemCorrectDocInfo_QNAME, PartnerRemCorrectDocInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCreateProductInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ArrayOfCreateProductInfo")
    public JAXBElement<ArrayOfCreateProductInfo> createArrayOfCreateProductInfo(ArrayOfCreateProductInfo value) {
        return new JAXBElement<ArrayOfCreateProductInfo>(_ArrayOfCreateProductInfo_QNAME, ArrayOfCreateProductInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductQuantityUnitInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ProductQuantityUnitInfo")
    public JAXBElement<ProductQuantityUnitInfo> createProductQuantityUnitInfo(ProductQuantityUnitInfo value) {
        return new JAXBElement<ProductQuantityUnitInfo>(_ProductQuantityUnitInfo_QNAME, ProductQuantityUnitInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProductInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "UpdateProductInfo")
    public JAXBElement<UpdateProductInfo> createUpdateProductInfo(UpdateProductInfo value) {
        return new JAXBElement<UpdateProductInfo>(_UpdateProductInfo_QNAME, UpdateProductInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfPartnerBonusRemainsListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ChunkedResultOfPartnerBonusRemainsListRow")
    public JAXBElement<ChunkedResultOfPartnerBonusRemainsListRow> createChunkedResultOfPartnerBonusRemainsListRow(ChunkedResultOfPartnerBonusRemainsListRow value) {
        return new JAXBElement<ChunkedResultOfPartnerBonusRemainsListRow>(_ChunkedResultOfPartnerBonusRemainsListRow_QNAME, ChunkedResultOfPartnerBonusRemainsListRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSalesAnalysisDataProviderDataRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ArrayOfSalesAnalysisDataProvider.DataRow")
    public JAXBElement<ArrayOfSalesAnalysisDataProviderDataRow> createArrayOfSalesAnalysisDataProviderDataRow(ArrayOfSalesAnalysisDataProviderDataRow value) {
        return new JAXBElement<ArrayOfSalesAnalysisDataProviderDataRow>(_ArrayOfSalesAnalysisDataProviderDataRow_QNAME, ArrayOfSalesAnalysisDataProviderDataRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetProductByBarCodeWithImageResult", scope = GetProductByBarCodeWithImageResponse.class)
    public JAXBElement<ProductListRow> createGetProductByBarCodeWithImageResponseGetProductByBarCodeWithImageResult(ProductListRow value) {
        return new JAXBElement<ProductListRow>(_GetProductByBarCodeWithImageResponseGetProductByBarCodeWithImageResult_QNAME, ProductListRow.class, GetProductByBarCodeWithImageResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "contract", scope = GetPartnerBonusRemains.class)
    public JAXBElement<String> createGetPartnerBonusRemainsContract(String value) {
        return new JAXBElement<String>(_GetPartnerBonusRemainsContract_QNAME, String.class, GetPartnerBonusRemains.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "partnerCode", scope = GetPartnerBonusRemains.class)
    public JAXBElement<String> createGetPartnerBonusRemainsPartnerCode(String value) {
        return new JAXBElement<String>(_GetPartnerBonusRemainsPartnerCode_QNAME, String.class, GetPartnerBonusRemains.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfCreateProductInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetProductsInfoNextChunkResult", scope = GetProductsInfoNextChunkResponse.class)
    public JAXBElement<ChunkedResultOfCreateProductInfo> createGetProductsInfoNextChunkResponseGetProductsInfoNextChunkResult(ChunkedResultOfCreateProductInfo value) {
        return new JAXBElement<ChunkedResultOfCreateProductInfo>(_GetProductsInfoNextChunkResponseGetProductsInfoNextChunkResult_QNAME, ChunkedResultOfCreateProductInfo.class, GetProductsInfoNextChunkResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfPartnerListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetPartnersListResult", scope = GetPartnersListResponse.class)
    public JAXBElement<ChunkedResultOfPartnerListRow> createGetPartnersListResponseGetPartnersListResult(ChunkedResultOfPartnerListRow value) {
        return new JAXBElement<ChunkedResultOfPartnerListRow>(_GetPartnersListResponseGetPartnersListResult_QNAME, ChunkedResultOfPartnerListRow.class, GetPartnersListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Code", scope = GetPartnerByCode.class)
    public JAXBElement<String> createGetPartnerByCodeCode(String value) {
        return new JAXBElement<String>(_GetPartnerByCodeCode_QNAME, String.class, GetPartnerByCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetProductByNameWithImageResult", scope = GetProductByNameWithImageResponse.class)
    public JAXBElement<ProductListRow> createGetProductByNameWithImageResponseGetProductByNameWithImageResult(ProductListRow value) {
        return new JAXBElement<ProductListRow>(_GetProductByNameWithImageResponseGetProductByNameWithImageResult_QNAME, ProductListRow.class, GetProductByNameWithImageResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "TaxCode", scope = CreatePartnerInfo.class)
    public JAXBElement<String> createCreatePartnerInfoTaxCode(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoTaxCode_QNAME, String.class, CreatePartnerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "MainAim", scope = CreatePartnerInfo.class)
    public JAXBElement<String> createCreatePartnerInfoMainAim(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoMainAim_QNAME, String.class, CreatePartnerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Type", scope = CreatePartnerInfo.class)
    public JAXBElement<String> createCreatePartnerInfoType(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoType_QNAME, String.class, CreatePartnerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "StateRegister", scope = CreatePartnerInfo.class)
    public JAXBElement<String> createCreatePartnerInfoStateRegister(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoStateRegister_QNAME, String.class, CreatePartnerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPartnerBusinessAddressInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BusinessAddresses", scope = CreatePartnerInfo.class)
    public JAXBElement<ArrayOfPartnerBusinessAddressInfo> createCreatePartnerInfoBusinessAddresses(ArrayOfPartnerBusinessAddressInfo value) {
        return new JAXBElement<ArrayOfPartnerBusinessAddressInfo>(_CreatePartnerInfoBusinessAddresses_QNAME, ArrayOfPartnerBusinessAddressInfo.class, CreatePartnerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Phone", scope = CreatePartnerInfo.class)
    public JAXBElement<String> createCreatePartnerInfoPhone(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoPhone_QNAME, String.class, CreatePartnerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "NextContractNumber", scope = CreatePartnerInfo.class)
    public JAXBElement<String> createCreatePartnerInfoNextContractNumber(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoNextContractNumber_QNAME, String.class, CreatePartnerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "LongName", scope = CreatePartnerInfo.class)
    public JAXBElement<String> createCreatePartnerInfoLongName(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoLongName_QNAME, String.class, CreatePartnerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ManagerPosition", scope = CreatePartnerInfo.class)
    public JAXBElement<String> createCreatePartnerInfoManagerPosition(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoManagerPosition_QNAME, String.class, CreatePartnerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPartnerContractInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartnerContracts", scope = CreatePartnerInfo.class)
    public JAXBElement<ArrayOfPartnerContractInfo> createCreatePartnerInfoPartnerContracts(ArrayOfPartnerContractInfo value) {
        return new JAXBElement<ArrayOfPartnerContractInfo>(_CreatePartnerInfoPartnerContracts_QNAME, ArrayOfPartnerContractInfo.class, CreatePartnerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Email", scope = CreatePartnerInfo.class)
    public JAXBElement<String> createCreatePartnerInfoEmail(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoEmail_QNAME, String.class, CreatePartnerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Address", scope = CreatePartnerInfo.class)
    public JAXBElement<String> createCreatePartnerInfoAddress(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoAddress_QNAME, String.class, CreatePartnerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ManagerName", scope = CreatePartnerInfo.class)
    public JAXBElement<String> createCreatePartnerInfoManagerName(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoManagerName_QNAME, String.class, CreatePartnerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPartnerSettlementAccountInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "SettlementAccounts", scope = CreatePartnerInfo.class)
    public JAXBElement<ArrayOfPartnerSettlementAccountInfo> createCreatePartnerInfoSettlementAccounts(ArrayOfPartnerSettlementAccountInfo value) {
        return new JAXBElement<ArrayOfPartnerSettlementAccountInfo>(_CreatePartnerInfoSettlementAccounts_QNAME, ArrayOfPartnerSettlementAccountInfo.class, CreatePartnerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Passport", scope = CreatePartnerInfo.class)
    public JAXBElement<String> createCreatePartnerInfoPassport(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoPassport_QNAME, String.class, CreatePartnerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Birthday", scope = CreatePartnerInfo.class)
    public JAXBElement<XMLGregorianCalendar> createCreatePartnerInfoBirthday(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CreatePartnerInfoBirthday_QNAME, XMLGregorianCalendar.class, CreatePartnerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ChiefAccountantName", scope = CreatePartnerInfo.class)
    public JAXBElement<String> createCreatePartnerInfoChiefAccountantName(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoChiefAccountantName_QNAME, String.class, CreatePartnerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BusinessAddress", scope = CreatePartnerInfo.class)
    public JAXBElement<String> createCreatePartnerInfoBusinessAddress(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoBusinessAddress_QNAME, String.class, CreatePartnerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Sex", scope = CreatePartnerInfo.class)
    public JAXBElement<String> createCreatePartnerInfoSex(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoSex_QNAME, String.class, CreatePartnerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ChiefAccountantPosition", scope = CreatePartnerInfo.class)
    public JAXBElement<String> createCreatePartnerInfoChiefAccountantPosition(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoChiefAccountantPosition_QNAME, String.class, CreatePartnerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfGoodAvailabilityRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetProductRemByCodeResult", scope = GetProductRemByCodeResponse.class)
    public JAXBElement<ChunkedResultOfGoodAvailabilityRow> createGetProductRemByCodeResponseGetProductRemByCodeResult(ChunkedResultOfGoodAvailabilityRow value) {
        return new JAXBElement<ChunkedResultOfGoodAvailabilityRow>(_GetProductRemByCodeResponseGetProductRemByCodeResult_QNAME, ChunkedResultOfGoodAvailabilityRow.class, GetProductRemByCodeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Address", scope = StorageListRow.class)
    public JAXBElement<String> createStorageListRowAddress(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoAddress_QNAME, String.class, StorageListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Response", scope = StorageListRow.class)
    public JAXBElement<String> createStorageListRowResponse(String value) {
        return new JAXBElement<String>(_StorageListRowResponse_QNAME, String.class, StorageListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "LikeName", scope = GetProductsInfoListByModifiedDate.class)
    public JAXBElement<String> createGetProductsInfoListByModifiedDateLikeName(String value) {
        return new JAXBElement<String>(_GetProductsInfoListByModifiedDateLikeName_QNAME, String.class, GetProductsInfoListByModifiedDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Group", scope = GetProductsInfoListByModifiedDate.class)
    public JAXBElement<String> createGetProductsInfoListByModifiedDateGroup(String value) {
        return new JAXBElement<String>(_GetProductsInfoListByModifiedDateGroup_QNAME, String.class, GetProductsInfoListByModifiedDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfGoodAvailabilityRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetProductRemByCodeDetailedResult", scope = GetProductRemByCodeDetailedResponse.class)
    public JAXBElement<ChunkedResultOfGoodAvailabilityRow> createGetProductRemByCodeDetailedResponseGetProductRemByCodeDetailedResult(ChunkedResultOfGoodAvailabilityRow value) {
        return new JAXBElement<ChunkedResultOfGoodAvailabilityRow>(_GetProductRemByCodeDetailedResponseGetProductRemByCodeDetailedResult_QNAME, ChunkedResultOfGoodAvailabilityRow.class, GetProductRemByCodeDetailedResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditPartnerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetPartnerByCodeResult", scope = GetPartnerByCodeResponse.class)
    public JAXBElement<EditPartnerInfo> createGetPartnerByCodeResponseGetPartnerByCodeResult(EditPartnerInfo value) {
        return new JAXBElement<EditPartnerInfo>(_GetPartnerByCodeResponseGetPartnerByCodeResult_QNAME, EditPartnerInfo.class, GetPartnerByCodeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfDocumentsListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetDocumentsNextChunkResult", scope = GetDocumentsNextChunkResponse.class)
    public JAXBElement<ChunkedResultOfDocumentsListRow> createGetDocumentsNextChunkResponseGetDocumentsNextChunkResult(ChunkedResultOfDocumentsListRow value) {
        return new JAXBElement<ChunkedResultOfDocumentsListRow>(_GetDocumentsNextChunkResponseGetDocumentsNextChunkResult_QNAME, ChunkedResultOfDocumentsListRow.class, GetDocumentsNextChunkResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ECRReturnCheckNumber", scope = MTReturnFromCustomerDocInfo.class)
    public JAXBElement<String> createMTReturnFromCustomerDocInfoECRReturnCheckNumber(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoECRReturnCheckNumber_QNAME, String.class, MTReturnFromCustomerDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BaseDocTaxInvoiceDate", scope = MTReturnFromCustomerDocInfo.class)
    public JAXBElement<XMLGregorianCalendar> createMTReturnFromCustomerDocInfoBaseDocTaxInvoiceDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MTReturnFromCustomerDocInfoBaseDocTaxInvoiceDate_QNAME, XMLGregorianCalendar.class, MTReturnFromCustomerDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BaseISN", scope = MTReturnFromCustomerDocInfo.class)
    public JAXBElement<String> createMTReturnFromCustomerDocInfoBaseISN(String value) {
        return new JAXBElement<String>(_CashInDocInfoBaseISN_QNAME, String.class, MTReturnFromCustomerDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ECRBaseCheckNumber", scope = MTReturnFromCustomerDocInfo.class)
    public JAXBElement<String> createMTReturnFromCustomerDocInfoECRBaseCheckNumber(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoECRBaseCheckNumber_QNAME, String.class, MTReturnFromCustomerDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMTReturnFromCustomerSpecificationRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Specification", scope = MTReturnFromCustomerDocInfo.class)
    public JAXBElement<ArrayOfMTReturnFromCustomerSpecificationRow> createMTReturnFromCustomerDocInfoSpecification(ArrayOfMTReturnFromCustomerSpecificationRow value) {
        return new JAXBElement<ArrayOfMTReturnFromCustomerSpecificationRow>(_MTReturnFromCustomerDocInfoSpecification_QNAME, ArrayOfMTReturnFromCustomerSpecificationRow.class, MTReturnFromCustomerDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "TaxExportType", scope = MTReturnFromCustomerDocInfo.class)
    public JAXBElement<String> createMTReturnFromCustomerDocInfoTaxExportType(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoTaxExportType_QNAME, String.class, MTReturnFromCustomerDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Allower", scope = MTReturnFromCustomerDocInfo.class)
    public JAXBElement<String> createMTReturnFromCustomerDocInfoAllower(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoAllower_QNAME, String.class, MTReturnFromCustomerDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ISN", scope = MTReturnFromCustomerDocInfo.class)
    public JAXBElement<String> createMTReturnFromCustomerDocInfoISN(String value) {
        return new JAXBElement<String>(_CashInDocInfoISN_QNAME, String.class, MTReturnFromCustomerDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Trust", scope = MTReturnFromCustomerDocInfo.class)
    public JAXBElement<String> createMTReturnFromCustomerDocInfoTrust(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoTrust_QNAME, String.class, MTReturnFromCustomerDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ECRCheckNumber", scope = MTReturnFromCustomerDocInfo.class)
    public JAXBElement<String> createMTReturnFromCustomerDocInfoECRCheckNumber(String value) {
        return new JAXBElement<String>(_CashInDocInfoECRCheckNumber_QNAME, String.class, MTReturnFromCustomerDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BaseDocTaxInvoiceSeries", scope = MTReturnFromCustomerDocInfo.class)
    public JAXBElement<String> createMTReturnFromCustomerDocInfoBaseDocTaxInvoiceSeries(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoBaseDocTaxInvoiceSeries_QNAME, String.class, MTReturnFromCustomerDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "TaxInvoiceNumber", scope = MTReturnFromCustomerDocInfo.class)
    public JAXBElement<String> createMTReturnFromCustomerDocInfoTaxInvoiceNumber(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoTaxInvoiceNumber_QNAME, String.class, MTReturnFromCustomerDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "CashDesk", scope = MTReturnFromCustomerDocInfo.class)
    public JAXBElement<String> createMTReturnFromCustomerDocInfoCashDesk(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoCashDesk_QNAME, String.class, MTReturnFromCustomerDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Mediator", scope = MTReturnFromCustomerDocInfo.class)
    public JAXBElement<String> createMTReturnFromCustomerDocInfoMediator(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoMediator_QNAME, String.class, MTReturnFromCustomerDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Machine", scope = MTReturnFromCustomerDocInfo.class)
    public JAXBElement<String> createMTReturnFromCustomerDocInfoMachine(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoMachine_QNAME, String.class, MTReturnFromCustomerDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ChiefAccountant", scope = MTReturnFromCustomerDocInfo.class)
    public JAXBElement<String> createMTReturnFromCustomerDocInfoChiefAccountant(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoChiefAccountant_QNAME, String.class, MTReturnFromCustomerDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartnerCode", scope = MTReturnFromCustomerDocInfo.class)
    public JAXBElement<String> createMTReturnFromCustomerDocInfoPartnerCode(String value) {
        return new JAXBElement<String>(_CashInDocInfoPartnerCode_QNAME, String.class, MTReturnFromCustomerDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Owner", scope = MTReturnFromCustomerDocInfo.class)
    public JAXBElement<String> createMTReturnFromCustomerDocInfoOwner(String value) {
        return new JAXBElement<String>(_CashInDocInfoOwner_QNAME, String.class, MTReturnFromCustomerDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Contract", scope = MTReturnFromCustomerDocInfo.class)
    public JAXBElement<String> createMTReturnFromCustomerDocInfoContract(String value) {
        return new JAXBElement<String>(_CashInDocInfoContract_QNAME, String.class, MTReturnFromCustomerDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Response", scope = MTReturnFromCustomerDocInfo.class)
    public JAXBElement<String> createMTReturnFromCustomerDocInfoResponse(String value) {
        return new JAXBElement<String>(_StorageListRowResponse_QNAME, String.class, MTReturnFromCustomerDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Comment", scope = MTReturnFromCustomerDocInfo.class)
    public JAXBElement<String> createMTReturnFromCustomerDocInfoComment(String value) {
        return new JAXBElement<String>(_CashInDocInfoComment_QNAME, String.class, MTReturnFromCustomerDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "TaxInvoiceSeries", scope = MTReturnFromCustomerDocInfo.class)
    public JAXBElement<String> createMTReturnFromCustomerDocInfoTaxInvoiceSeries(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoTaxInvoiceSeries_QNAME, String.class, MTReturnFromCustomerDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PriceType", scope = MTReturnFromCustomerDocInfo.class)
    public JAXBElement<String> createMTReturnFromCustomerDocInfoPriceType(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoPriceType_QNAME, String.class, MTReturnFromCustomerDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Storage", scope = MTReturnFromCustomerDocInfo.class)
    public JAXBElement<String> createMTReturnFromCustomerDocInfoStorage(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoStorage_QNAME, String.class, MTReturnFromCustomerDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "SalesConsultant", scope = MTReturnFromCustomerDocInfo.class)
    public JAXBElement<String> createMTReturnFromCustomerDocInfoSalesConsultant(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoSalesConsultant_QNAME, String.class, MTReturnFromCustomerDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "CashierShiftNumber", scope = MTReturnFromCustomerDocInfo.class)
    public JAXBElement<String> createMTReturnFromCustomerDocInfoCashierShiftNumber(String value) {
        return new JAXBElement<String>(_CashInDocInfoCashierShiftNumber_QNAME, String.class, MTReturnFromCustomerDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "TaxInvoiceDate", scope = MTReturnFromCustomerDocInfo.class)
    public JAXBElement<XMLGregorianCalendar> createMTReturnFromCustomerDocInfoTaxInvoiceDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MTReturnFromCustomerDocInfoTaxInvoiceDate_QNAME, XMLGregorianCalendar.class, MTReturnFromCustomerDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BaseDocTaxInvoiceNumber", scope = MTReturnFromCustomerDocInfo.class)
    public JAXBElement<String> createMTReturnFromCustomerDocInfoBaseDocTaxInvoiceNumber(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoBaseDocTaxInvoiceNumber_QNAME, String.class, MTReturnFromCustomerDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ContractDate", scope = PartCashBankAccRemainsRow.class)
    public JAXBElement<XMLGregorianCalendar> createPartCashBankAccRemainsRowContractDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PartCashBankAccRemainsRowContractDate_QNAME, XMLGregorianCalendar.class, PartCashBankAccRemainsRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ContractName", scope = PartCashBankAccRemainsRow.class)
    public JAXBElement<String> createPartCashBankAccRemainsRowContractName(String value) {
        return new JAXBElement<String>(_PartCashBankAccRemainsRowContractName_QNAME, String.class, PartCashBankAccRemainsRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "CurrCode", scope = PartCashBankAccRemainsRow.class)
    public JAXBElement<String> createPartCashBankAccRemainsRowCurrCode(String value) {
        return new JAXBElement<String>(_PartCashBankAccRemainsRowCurrCode_QNAME, String.class, PartCashBankAccRemainsRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ContractCode", scope = PartCashBankAccRemainsRow.class)
    public JAXBElement<String> createPartCashBankAccRemainsRowContractCode(String value) {
        return new JAXBElement<String>(_PartCashBankAccRemainsRowContractCode_QNAME, String.class, PartCashBankAccRemainsRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartName", scope = PartCashBankAccRemainsRow.class)
    public JAXBElement<String> createPartCashBankAccRemainsRowPartName(String value) {
        return new JAXBElement<String>(_PartCashBankAccRemainsRowPartName_QNAME, String.class, PartCashBankAccRemainsRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartCode", scope = PartCashBankAccRemainsRow.class)
    public JAXBElement<String> createPartCashBankAccRemainsRowPartCode(String value) {
        return new JAXBElement<String>(_PartCashBankAccRemainsRowPartCode_QNAME, String.class, PartCashBankAccRemainsRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Code", scope = GetProductByCode.class)
    public JAXBElement<String> createGetProductByCodeCode(String value) {
        return new JAXBElement<String>(_GetPartnerByCodeCode_QNAME, String.class, GetProductByCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfCodeCaptionListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetCountriesListResult", scope = GetCountriesListResponse.class)
    public JAXBElement<ChunkedResultOfCodeCaptionListRow> createGetCountriesListResponseGetCountriesListResult(ChunkedResultOfCodeCaptionListRow value) {
        return new JAXBElement<ChunkedResultOfCodeCaptionListRow>(_GetCountriesListResponseGetCountriesListResult_QNAME, ChunkedResultOfCodeCaptionListRow.class, GetCountriesListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CashOutDocInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "cashOutDocInfo", scope = CreateCashOutDoc.class)
    public JAXBElement<CashOutDocInfo> createCreateCashOutDocCashOutDocInfo(CashOutDocInfo value) {
        return new JAXBElement<CashOutDocInfo>(_CreateCashOutDocCashOutDocInfo_QNAME, CashOutDocInfo.class, CreateCashOutDoc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Type", scope = GetPartnersList.class)
    public JAXBElement<String> createGetPartnersListType(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoType_QNAME, String.class, GetPartnersList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankInDocInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "bankInDocInfo", scope = CreateBankInDoc.class)
    public JAXBElement<BankInDocInfo> createCreateBankInDocBankInDocInfo(BankInDocInfo value) {
        return new JAXBElement<BankInDocInfo>(_CreateBankInDocBankInDocInfo_QNAME, BankInDocInfo.class, CreateBankInDoc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ECRReturnCheckNumber", scope = CashOutDocInfo.class)
    public JAXBElement<String> createCashOutDocInfoECRReturnCheckNumber(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoECRReturnCheckNumber_QNAME, String.class, CashOutDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BaseISN", scope = CashOutDocInfo.class)
    public JAXBElement<String> createCashOutDocInfoBaseISN(String value) {
        return new JAXBElement<String>(_CashInDocInfoBaseISN_QNAME, String.class, CashOutDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartnerCode", scope = CashOutDocInfo.class)
    public JAXBElement<String> createCashOutDocInfoPartnerCode(String value) {
        return new JAXBElement<String>(_CashInDocInfoPartnerCode_QNAME, String.class, CashOutDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Owner", scope = CashOutDocInfo.class)
    public JAXBElement<String> createCashOutDocInfoOwner(String value) {
        return new JAXBElement<String>(_CashInDocInfoOwner_QNAME, String.class, CashOutDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Base", scope = CashOutDocInfo.class)
    public JAXBElement<String> createCashOutDocInfoBase(String value) {
        return new JAXBElement<String>(_CashInDocInfoBase_QNAME, String.class, CashOutDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BankAcquiringContract", scope = CashOutDocInfo.class)
    public JAXBElement<String> createCashOutDocInfoBankAcquiringContract(String value) {
        return new JAXBElement<String>(_CashInDocInfoBankAcquiringContract_QNAME, String.class, CashOutDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Employee", scope = CashOutDocInfo.class)
    public JAXBElement<String> createCashOutDocInfoEmployee(String value) {
        return new JAXBElement<String>(_CashInDocInfoEmployee_QNAME, String.class, CashOutDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PassportNumber", scope = CashOutDocInfo.class)
    public JAXBElement<String> createCashOutDocInfoPassportNumber(String value) {
        return new JAXBElement<String>(_CashOutDocInfoPassportNumber_QNAME, String.class, CashOutDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Contract", scope = CashOutDocInfo.class)
    public JAXBElement<String> createCashOutDocInfoContract(String value) {
        return new JAXBElement<String>(_CashInDocInfoContract_QNAME, String.class, CashOutDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BankAcquiringPartner", scope = CashOutDocInfo.class)
    public JAXBElement<String> createCashOutDocInfoBankAcquiringPartner(String value) {
        return new JAXBElement<String>(_CashInDocInfoBankAcquiringPartner_QNAME, String.class, CashOutDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Appendix", scope = CashOutDocInfo.class)
    public JAXBElement<String> createCashOutDocInfoAppendix(String value) {
        return new JAXBElement<String>(_CashInDocInfoAppendix_QNAME, String.class, CashOutDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Comment", scope = CashOutDocInfo.class)
    public JAXBElement<String> createCashOutDocInfoComment(String value) {
        return new JAXBElement<String>(_CashInDocInfoComment_QNAME, String.class, CashOutDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ISN", scope = CashOutDocInfo.class)
    public JAXBElement<String> createCashOutDocInfoISN(String value) {
        return new JAXBElement<String>(_CashInDocInfoISN_QNAME, String.class, CashOutDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "CashInDesk", scope = CashOutDocInfo.class)
    public JAXBElement<String> createCashOutDocInfoCashInDesk(String value) {
        return new JAXBElement<String>(_CashOutDocInfoCashInDesk_QNAME, String.class, CashOutDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "CashierShiftNumber", scope = CashOutDocInfo.class)
    public JAXBElement<String> createCashOutDocInfoCashierShiftNumber(String value) {
        return new JAXBElement<String>(_CashInDocInfoCashierShiftNumber_QNAME, String.class, CashOutDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ExtBody", scope = CashOutDocInfo.class)
    public JAXBElement<String> createCashOutDocInfoExtBody(String value) {
        return new JAXBElement<String>(_CashInDocInfoExtBody_QNAME, String.class, CashOutDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BankAcquiringCardIndex", scope = CashOutDocInfo.class)
    public JAXBElement<String> createCashOutDocInfoBankAcquiringCardIndex(String value) {
        return new JAXBElement<String>(_CashInDocInfoBankAcquiringCardIndex_QNAME, String.class, CashOutDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "AccountCode", scope = CashOutDocInfo.class)
    public JAXBElement<String> createCashOutDocInfoAccountCode(String value) {
        return new JAXBElement<String>(_CashInDocInfoAccountCode_QNAME, String.class, CashOutDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfPartnerBonusRemainsListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetPartnersBonusRemainsByPartnerGroupResult", scope = GetPartnersBonusRemainsByPartnerGroupResponse.class)
    public JAXBElement<ChunkedResultOfPartnerBonusRemainsListRow> createGetPartnersBonusRemainsByPartnerGroupResponseGetPartnersBonusRemainsByPartnerGroupResult(ChunkedResultOfPartnerBonusRemainsListRow value) {
        return new JAXBElement<ChunkedResultOfPartnerBonusRemainsListRow>(_GetPartnersBonusRemainsByPartnerGroupResponseGetPartnersBonusRemainsByPartnerGroupResult_QNAME, ChunkedResultOfPartnerBonusRemainsListRow.class, GetPartnersBonusRemainsByPartnerGroupResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCashListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetCashesListResult", scope = GetCashesListResponse.class)
    public JAXBElement<ArrayOfCashListRow> createGetCashesListResponseGetCashesListResult(ArrayOfCashListRow value) {
        return new JAXBElement<ArrayOfCashListRow>(_GetCashesListResponseGetCashesListResult_QNAME, ArrayOfCashListRow.class, GetCashesListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfProductListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetProductsListByCPACodesResult", scope = GetProductsListByCPACodesResponse.class)
    public JAXBElement<ChunkedResultOfProductListRow> createGetProductsListByCPACodesResponseGetProductsListByCPACodesResult(ChunkedResultOfProductListRow value) {
        return new JAXBElement<ChunkedResultOfProductListRow>(_GetProductsListByCPACodesResponseGetProductsListByCPACodesResult_QNAME, ChunkedResultOfProductListRow.class, GetProductsListByCPACodesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Parent", scope = ProductGroupListRow.class)
    public JAXBElement<String> createProductGroupListRowParent(String value) {
        return new JAXBElement<String>(_ProductGroupListRowParent_QNAME, String.class, ProductGroupListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "CaptionRU", scope = ProductGroupListRow.class)
    public JAXBElement<String> createProductGroupListRowCaptionRU(String value) {
        return new JAXBElement<String>(_ProductGroupListRowCaptionRU_QNAME, String.class, ProductGroupListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "CaptionEn", scope = ProductGroupListRow.class)
    public JAXBElement<String> createProductGroupListRowCaptionEn(String value) {
        return new JAXBElement<String>(_ProductGroupListRowCaptionEn_QNAME, String.class, ProductGroupListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "UseFulLife", scope = MTIncomeSpecificationRow.class)
    public JAXBElement<XMLGregorianCalendar> createMTIncomeSpecificationRowUseFulLife(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MTIncomeSpecificationRowUseFulLife_QNAME, XMLGregorianCalendar.class, MTIncomeSpecificationRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Property1", scope = MTIncomeSpecificationRow.class)
    public JAXBElement<String> createMTIncomeSpecificationRowProperty1(String value) {
        return new JAXBElement<String>(_MTIncomeSpecificationRowProperty1_QNAME, String.class, MTIncomeSpecificationRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Property2", scope = MTIncomeSpecificationRow.class)
    public JAXBElement<String> createMTIncomeSpecificationRowProperty2(String value) {
        return new JAXBElement<String>(_MTIncomeSpecificationRowProperty2_QNAME, String.class, MTIncomeSpecificationRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Country", scope = MTIncomeSpecificationRow.class)
    public JAXBElement<String> createMTIncomeSpecificationRowCountry(String value) {
        return new JAXBElement<String>(_MTIncomeSpecificationRowCountry_QNAME, String.class, MTIncomeSpecificationRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Producer", scope = MTIncomeSpecificationRow.class)
    public JAXBElement<String> createMTIncomeSpecificationRowProducer(String value) {
        return new JAXBElement<String>(_MTIncomeSpecificationRowProducer_QNAME, String.class, MTIncomeSpecificationRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfDocumentsListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetForETLDocumentsListResult", scope = GetForETLDocumentsListResponse.class)
    public JAXBElement<ChunkedResultOfDocumentsListRow> createGetForETLDocumentsListResponseGetForETLDocumentsListResult(ChunkedResultOfDocumentsListRow value) {
        return new JAXBElement<ChunkedResultOfDocumentsListRow>(_GetForETLDocumentsListResponseGetForETLDocumentsListResult_QNAME, ChunkedResultOfDocumentsListRow.class, GetForETLDocumentsListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "CaptionEN", scope = CreateProductInfo.class)
    public JAXBElement<String> createCreateProductInfoCaptionEN(String value) {
        return new JAXBElement<String>(_CreateProductInfoCaptionEN_QNAME, String.class, CreateProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductBarCodeInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ProductBarCodes", scope = CreateProductInfo.class)
    public JAXBElement<ArrayOfProductBarCodeInfo> createCreateProductInfoProductBarCodes(ArrayOfProductBarCodeInfo value) {
        return new JAXBElement<ArrayOfProductBarCodeInfo>(_CreateProductInfoProductBarCodes_QNAME, ArrayOfProductBarCodeInfo.class, CreateProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "CaptionRU", scope = CreateProductInfo.class)
    public JAXBElement<String> createCreateProductInfoCaptionRU(String value) {
        return new JAXBElement<String>(_ProductGroupListRowCaptionRU_QNAME, String.class, CreateProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Property1", scope = CreateProductInfo.class)
    public JAXBElement<String> createCreateProductInfoProperty1(String value) {
        return new JAXBElement<String>(_MTIncomeSpecificationRowProperty1_QNAME, String.class, CreateProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BarCode", scope = CreateProductInfo.class)
    public JAXBElement<String> createCreateProductInfoBarCode(String value) {
        return new JAXBElement<String>(_CreateProductInfoBarCode_QNAME, String.class, CreateProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Description", scope = CreateProductInfo.class)
    public JAXBElement<String> createCreateProductInfoDescription(String value) {
        return new JAXBElement<String>(_CreateProductInfoDescription_QNAME, String.class, CreateProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Property2", scope = CreateProductInfo.class)
    public JAXBElement<String> createCreateProductInfoProperty2(String value) {
        return new JAXBElement<String>(_MTIncomeSpecificationRowProperty2_QNAME, String.class, CreateProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "LongName", scope = CreateProductInfo.class)
    public JAXBElement<String> createCreateProductInfoLongName(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoLongName_QNAME, String.class, CreateProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Country", scope = CreateProductInfo.class)
    public JAXBElement<String> createCreateProductInfoCountry(String value) {
        return new JAXBElement<String>(_MTIncomeSpecificationRowCountry_QNAME, String.class, CreateProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PLUCode", scope = CreateProductInfo.class)
    public JAXBElement<Integer> createCreateProductInfoPLUCode(Integer value) {
        return new JAXBElement<Integer>(_CreateProductInfoPLUCode_QNAME, Integer.class, CreateProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "CPACode", scope = CreateProductInfo.class)
    public JAXBElement<String> createCreateProductInfoCPACode(String value) {
        return new JAXBElement<String>(_CreateProductInfoCPACode_QNAME, String.class, CreateProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ExternalCode", scope = CreateProductInfo.class)
    public JAXBElement<String> createCreateProductInfoExternalCode(String value) {
        return new JAXBElement<String>(_CreateProductInfoExternalCode_QNAME, String.class, CreateProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "AdditionalDescription2", scope = CreateProductInfo.class)
    public JAXBElement<String> createCreateProductInfoAdditionalDescription2(String value) {
        return new JAXBElement<String>(_CreateProductInfoAdditionalDescription2_QNAME, String.class, CreateProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductQuantityUnitInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ProductQntUnits", scope = CreateProductInfo.class)
    public JAXBElement<ArrayOfProductQuantityUnitInfo> createCreateProductInfoProductQntUnits(ArrayOfProductQuantityUnitInfo value) {
        return new JAXBElement<ArrayOfProductQuantityUnitInfo>(_CreateProductInfoProductQntUnits_QNAME, ArrayOfProductQuantityUnitInfo.class, CreateProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "AdditionalDescription1", scope = CreateProductInfo.class)
    public JAXBElement<String> createCreateProductInfoAdditionalDescription1(String value) {
        return new JAXBElement<String>(_CreateProductInfoAdditionalDescription1_QNAME, String.class, CreateProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Image", scope = CreateProductInfo.class)
    public JAXBElement<String> createCreateProductInfoImage(String value) {
        return new JAXBElement<String>(_CreateProductInfoImage_QNAME, String.class, CreateProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ExpMethod", scope = CreateProductInfo.class)
    public JAXBElement<String> createCreateProductInfoExpMethod(String value) {
        return new JAXBElement<String>(_CreateProductInfoExpMethod_QNAME, String.class, CreateProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "SubstituteItemsGroup", scope = CreateProductInfo.class)
    public JAXBElement<String> createCreateProductInfoSubstituteItemsGroup(String value) {
        return new JAXBElement<String>(_CreateProductInfoSubstituteItemsGroup_QNAME, String.class, CreateProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Producer", scope = CreateProductInfo.class)
    public JAXBElement<String> createCreateProductInfoProducer(String value) {
        return new JAXBElement<String>(_MTIncomeSpecificationRowProducer_QNAME, String.class, CreateProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartyMethod", scope = MTComplectationSpecificationRow.class)
    public JAXBElement<String> createMTComplectationSpecificationRowPartyMethod(String value) {
        return new JAXBElement<String>(_MTComplectationSpecificationRowPartyMethod_QNAME, String.class, MTComplectationSpecificationRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "LikeName", scope = GetProductsList.class)
    public JAXBElement<String> createGetProductsListLikeName(String value) {
        return new JAXBElement<String>(_GetProductsInfoListByModifiedDateLikeName_QNAME, String.class, GetProductsList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Group", scope = GetProductsList.class)
    public JAXBElement<String> createGetProductsListGroup(String value) {
        return new JAXBElement<String>(_GetProductsInfoListByModifiedDateGroup_QNAME, String.class, GetProductsList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfCreatePartnerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetPartnersListByModifiedDateResult", scope = GetPartnersListByModifiedDateResponse.class)
    public JAXBElement<ChunkedResultOfCreatePartnerInfo> createGetPartnersListByModifiedDateResponseGetPartnersListByModifiedDateResult(ChunkedResultOfCreatePartnerInfo value) {
        return new JAXBElement<ChunkedResultOfCreatePartnerInfo>(_GetPartnersListByModifiedDateResponseGetPartnersListByModifiedDateResult_QNAME, ChunkedResultOfCreatePartnerInfo.class, GetPartnersListByModifiedDateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ExternalCodes", scope = GetProductsListByExternalCodes.class)
    public JAXBElement<ArrayOfstring> createGetProductsListByExternalCodesExternalCodes(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetProductsListByExternalCodesExternalCodes_QNAME, ArrayOfstring.class, GetProductsListByExternalCodes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GoodCode", scope = GetSalesAnalysisGroupedByPartner.class)
    public JAXBElement<String> createGetSalesAnalysisGroupedByPartnerGoodCode(String value) {
        return new JAXBElement<String>(_GetSalesAnalysisGroupedByPartnerGoodCode_QNAME, String.class, GetSalesAnalysisGroupedByPartner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GoodsOrServices", scope = GetSalesAnalysisGroupedByPartner.class)
    public JAXBElement<String> createGetSalesAnalysisGroupedByPartnerGoodsOrServices(String value) {
        return new JAXBElement<String>(_GetSalesAnalysisGroupedByPartnerGoodsOrServices_QNAME, String.class, GetSalesAnalysisGroupedByPartner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartnerCode", scope = GetSalesAnalysisGroupedByPartner.class)
    public JAXBElement<String> createGetSalesAnalysisGroupedByPartnerPartnerCode(String value) {
        return new JAXBElement<String>(_CashInDocInfoPartnerCode_QNAME, String.class, GetSalesAnalysisGroupedByPartner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GoodGroup", scope = GetSalesAnalysisGroupedByPartner.class)
    public JAXBElement<String> createGetSalesAnalysisGroupedByPartnerGoodGroup(String value) {
        return new JAXBElement<String>(_GetSalesAnalysisGroupedByPartnerGoodGroup_QNAME, String.class, GetSalesAnalysisGroupedByPartner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartnerType", scope = GetSalesAnalysisGroupedByPartner.class)
    public JAXBElement<String> createGetSalesAnalysisGroupedByPartnerPartnerType(String value) {
        return new JAXBElement<String>(_GetSalesAnalysisGroupedByPartnerPartnerType_QNAME, String.class, GetSalesAnalysisGroupedByPartner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Storage", scope = GetSalesAnalysisGroupedByPartner.class)
    public JAXBElement<String> createGetSalesAnalysisGroupedByPartnerStorage(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoStorage_QNAME, String.class, GetSalesAnalysisGroupedByPartner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Image", scope = ProductShortListRow.class)
    public JAXBElement<String> createProductShortListRowImage(String value) {
        return new JAXBElement<String>(_CreateProductInfoImage_QNAME, String.class, ProductShortListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "LongName", scope = ProductShortListRow.class)
    public JAXBElement<String> createProductShortListRowLongName(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoLongName_QNAME, String.class, ProductShortListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductGroupListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetProductGroupsListResult", scope = GetProductGroupsListResponse.class)
    public JAXBElement<ArrayOfProductGroupListRow> createGetProductGroupsListResponseGetProductGroupsListResult(ArrayOfProductGroupListRow value) {
        return new JAXBElement<ArrayOfProductGroupListRow>(_GetProductGroupsListResponseGetProductGroupsListResult_QNAME, ArrayOfProductGroupListRow.class, GetProductGroupsListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfMTBarCodes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetMTBarCodesNextChunkResult", scope = GetMTBarCodesNextChunkResponse.class)
    public JAXBElement<ChunkedResultOfMTBarCodes> createGetMTBarCodesNextChunkResponseGetMTBarCodesNextChunkResult(ChunkedResultOfMTBarCodes value) {
        return new JAXBElement<ChunkedResultOfMTBarCodes>(_GetMTBarCodesNextChunkResponseGetMTBarCodesNextChunkResult_QNAME, ChunkedResultOfMTBarCodes.class, GetMTBarCodesNextChunkResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfDocumentsListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetDocumentsListResult", scope = GetDocumentsListResponse.class)
    public JAXBElement<ChunkedResultOfDocumentsListRow> createGetDocumentsListResponseGetDocumentsListResult(ChunkedResultOfDocumentsListRow value) {
        return new JAXBElement<ChunkedResultOfDocumentsListRow>(_GetDocumentsListResponseGetDocumentsListResult_QNAME, ChunkedResultOfDocumentsListRow.class, GetDocumentsListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BarCode", scope = GetProductByBarCode.class)
    public JAXBElement<String> createGetProductByBarCodeBarCode(String value) {
        return new JAXBElement<String>(_CreateProductInfoBarCode_QNAME, String.class, GetProductByBarCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GoodCode", scope = GetSalesAnalysisByParties.class)
    public JAXBElement<String> createGetSalesAnalysisByPartiesGoodCode(String value) {
        return new JAXBElement<String>(_GetSalesAnalysisGroupedByPartnerGoodCode_QNAME, String.class, GetSalesAnalysisByParties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GoodsOrServices", scope = GetSalesAnalysisByParties.class)
    public JAXBElement<String> createGetSalesAnalysisByPartiesGoodsOrServices(String value) {
        return new JAXBElement<String>(_GetSalesAnalysisGroupedByPartnerGoodsOrServices_QNAME, String.class, GetSalesAnalysisByParties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartnerCode", scope = GetSalesAnalysisByParties.class)
    public JAXBElement<String> createGetSalesAnalysisByPartiesPartnerCode(String value) {
        return new JAXBElement<String>(_CashInDocInfoPartnerCode_QNAME, String.class, GetSalesAnalysisByParties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GoodGroup", scope = GetSalesAnalysisByParties.class)
    public JAXBElement<String> createGetSalesAnalysisByPartiesGoodGroup(String value) {
        return new JAXBElement<String>(_GetSalesAnalysisGroupedByPartnerGoodGroup_QNAME, String.class, GetSalesAnalysisByParties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartnerType", scope = GetSalesAnalysisByParties.class)
    public JAXBElement<String> createGetSalesAnalysisByPartiesPartnerType(String value) {
        return new JAXBElement<String>(_GetSalesAnalysisGroupedByPartnerPartnerType_QNAME, String.class, GetSalesAnalysisByParties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Storage", scope = GetSalesAnalysisByParties.class)
    public JAXBElement<String> createGetSalesAnalysisByPartiesStorage(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoStorage_QNAME, String.class, GetSalesAnalysisByParties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PriceType", scope = GetProductRemByBarCode.class)
    public JAXBElement<String> createGetProductRemByBarCodePriceType(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoPriceType_QNAME, String.class, GetProductRemByBarCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Storage", scope = GetProductRemByBarCode.class)
    public JAXBElement<String> createGetProductRemByBarCodeStorage(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoStorage_QNAME, String.class, GetProductRemByBarCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BarCode", scope = GetProductRemByBarCode.class)
    public JAXBElement<String> createGetProductRemByBarCodeBarCode(String value) {
        return new JAXBElement<String>(_CreateProductInfoBarCode_QNAME, String.class, GetProductRemByBarCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PriceRow", scope = UpdatePrices.class)
    public JAXBElement<PriceListRow> createUpdatePricesPriceRow(PriceListRow value) {
        return new JAXBElement<PriceListRow>(_UpdatePricesPriceRow_QNAME, PriceListRow.class, UpdatePrices.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "TaxCode", scope = EditPartnerInfo.class)
    public JAXBElement<String> createEditPartnerInfoTaxCode(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoTaxCode_QNAME, String.class, EditPartnerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "MainAim", scope = EditPartnerInfo.class)
    public JAXBElement<String> createEditPartnerInfoMainAim(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoMainAim_QNAME, String.class, EditPartnerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Type", scope = EditPartnerInfo.class)
    public JAXBElement<String> createEditPartnerInfoType(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoType_QNAME, String.class, EditPartnerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "StateRegister", scope = EditPartnerInfo.class)
    public JAXBElement<String> createEditPartnerInfoStateRegister(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoStateRegister_QNAME, String.class, EditPartnerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPartnerBusinessAddressInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BusinessAddresses", scope = EditPartnerInfo.class)
    public JAXBElement<ArrayOfPartnerBusinessAddressInfo> createEditPartnerInfoBusinessAddresses(ArrayOfPartnerBusinessAddressInfo value) {
        return new JAXBElement<ArrayOfPartnerBusinessAddressInfo>(_CreatePartnerInfoBusinessAddresses_QNAME, ArrayOfPartnerBusinessAddressInfo.class, EditPartnerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Phone", scope = EditPartnerInfo.class)
    public JAXBElement<String> createEditPartnerInfoPhone(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoPhone_QNAME, String.class, EditPartnerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "LongName", scope = EditPartnerInfo.class)
    public JAXBElement<String> createEditPartnerInfoLongName(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoLongName_QNAME, String.class, EditPartnerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ExtensionBody", scope = EditPartnerInfo.class)
    public JAXBElement<String> createEditPartnerInfoExtensionBody(String value) {
        return new JAXBElement<String>(_EditPartnerInfoExtensionBody_QNAME, String.class, EditPartnerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ManagerPosition", scope = EditPartnerInfo.class)
    public JAXBElement<String> createEditPartnerInfoManagerPosition(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoManagerPosition_QNAME, String.class, EditPartnerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Email", scope = EditPartnerInfo.class)
    public JAXBElement<String> createEditPartnerInfoEmail(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoEmail_QNAME, String.class, EditPartnerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPartnerContractInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartnerContracts", scope = EditPartnerInfo.class)
    public JAXBElement<ArrayOfPartnerContractInfo> createEditPartnerInfoPartnerContracts(ArrayOfPartnerContractInfo value) {
        return new JAXBElement<ArrayOfPartnerContractInfo>(_CreatePartnerInfoPartnerContracts_QNAME, ArrayOfPartnerContractInfo.class, EditPartnerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Address", scope = EditPartnerInfo.class)
    public JAXBElement<String> createEditPartnerInfoAddress(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoAddress_QNAME, String.class, EditPartnerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ManagerName", scope = EditPartnerInfo.class)
    public JAXBElement<String> createEditPartnerInfoManagerName(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoManagerName_QNAME, String.class, EditPartnerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPartnerSettlementAccountInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "SettlementAccounts", scope = EditPartnerInfo.class)
    public JAXBElement<ArrayOfPartnerSettlementAccountInfo> createEditPartnerInfoSettlementAccounts(ArrayOfPartnerSettlementAccountInfo value) {
        return new JAXBElement<ArrayOfPartnerSettlementAccountInfo>(_CreatePartnerInfoSettlementAccounts_QNAME, ArrayOfPartnerSettlementAccountInfo.class, EditPartnerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Passport", scope = EditPartnerInfo.class)
    public JAXBElement<String> createEditPartnerInfoPassport(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoPassport_QNAME, String.class, EditPartnerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Birthday", scope = EditPartnerInfo.class)
    public JAXBElement<XMLGregorianCalendar> createEditPartnerInfoBirthday(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CreatePartnerInfoBirthday_QNAME, XMLGregorianCalendar.class, EditPartnerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ChiefAccountantName", scope = EditPartnerInfo.class)
    public JAXBElement<String> createEditPartnerInfoChiefAccountantName(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoChiefAccountantName_QNAME, String.class, EditPartnerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BusinessAddress", scope = EditPartnerInfo.class)
    public JAXBElement<String> createEditPartnerInfoBusinessAddress(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoBusinessAddress_QNAME, String.class, EditPartnerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Sex", scope = EditPartnerInfo.class)
    public JAXBElement<String> createEditPartnerInfoSex(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoSex_QNAME, String.class, EditPartnerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ChiefAccountantPosition", scope = EditPartnerInfo.class)
    public JAXBElement<String> createEditPartnerInfoChiefAccountantPosition(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoChiefAccountantPosition_QNAME, String.class, EditPartnerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfProductShortListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetProductsListShortNextChunkResult", scope = GetProductsListShortNextChunkResponse.class)
    public JAXBElement<ChunkedResultOfProductShortListRow> createGetProductsListShortNextChunkResponseGetProductsListShortNextChunkResult(ChunkedResultOfProductShortListRow value) {
        return new JAXBElement<ChunkedResultOfProductShortListRow>(_GetProductsListShortNextChunkResponseGetProductsListShortNextChunkResult_QNAME, ChunkedResultOfProductShortListRow.class, GetProductsListShortNextChunkResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartnerRemCorrectDocInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "partRemCorrectDocInfo", scope = CreatePartnerRemCorrectDoc.class)
    public JAXBElement<PartnerRemCorrectDocInfo> createCreatePartnerRemCorrectDocPartRemCorrectDocInfo(PartnerRemCorrectDocInfo value) {
        return new JAXBElement<PartnerRemCorrectDocInfo>(_CreatePartnerRemCorrectDocPartRemCorrectDocInfo_QNAME, PartnerRemCorrectDocInfo.class, CreatePartnerRemCorrectDoc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfSalesAnalysisDataProviderDataRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetSalesAnalysisResult", scope = GetSalesAnalysisResponse.class)
    public JAXBElement<ChunkedResultOfSalesAnalysisDataProviderDataRow> createGetSalesAnalysisResponseGetSalesAnalysisResult(ChunkedResultOfSalesAnalysisDataProviderDataRow value) {
        return new JAXBElement<ChunkedResultOfSalesAnalysisDataProviderDataRow>(_GetSalesAnalysisResponseGetSalesAnalysisResult_QNAME, ChunkedResultOfSalesAnalysisDataProviderDataRow.class, GetSalesAnalysisResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Name", scope = GetProductByNameWithImage.class)
    public JAXBElement<String> createGetProductByNameWithImageName(String value) {
        return new JAXBElement<String>(_GetProductByNameWithImageName_QNAME, String.class, GetProductByNameWithImage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfSalesAnalysisRowGroupedByPartner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetSalesAnalysisGroupedByPartnerNextChunkResult", scope = GetSalesAnalysisGroupedByPartnerNextChunkResponse.class)
    public JAXBElement<ChunkedResultOfSalesAnalysisRowGroupedByPartner> createGetSalesAnalysisGroupedByPartnerNextChunkResponseGetSalesAnalysisGroupedByPartnerNextChunkResult(ChunkedResultOfSalesAnalysisRowGroupedByPartner value) {
        return new JAXBElement<ChunkedResultOfSalesAnalysisRowGroupedByPartner>(_GetSalesAnalysisGroupedByPartnerNextChunkResponseGetSalesAnalysisGroupedByPartnerNextChunkResult_QNAME, ChunkedResultOfSalesAnalysisRowGroupedByPartner.class, GetSalesAnalysisGroupedByPartnerNextChunkResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BaseISN", scope = BankInDocInfo.class)
    public JAXBElement<String> createBankInDocInfoBaseISN(String value) {
        return new JAXBElement<String>(_CashInDocInfoBaseISN_QNAME, String.class, BankInDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartnerCode", scope = BankInDocInfo.class)
    public JAXBElement<String> createBankInDocInfoPartnerCode(String value) {
        return new JAXBElement<String>(_CashInDocInfoPartnerCode_QNAME, String.class, BankInDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Owner", scope = BankInDocInfo.class)
    public JAXBElement<String> createBankInDocInfoOwner(String value) {
        return new JAXBElement<String>(_CashInDocInfoOwner_QNAME, String.class, BankInDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Contract", scope = BankInDocInfo.class)
    public JAXBElement<String> createBankInDocInfoContract(String value) {
        return new JAXBElement<String>(_CashInDocInfoContract_QNAME, String.class, BankInDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ExtBody", scope = BankInDocInfo.class)
    public JAXBElement<String> createBankInDocInfoExtBody(String value) {
        return new JAXBElement<String>(_CashInDocInfoExtBody_QNAME, String.class, BankInDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Comment", scope = BankInDocInfo.class)
    public JAXBElement<String> createBankInDocInfoComment(String value) {
        return new JAXBElement<String>(_CashInDocInfoComment_QNAME, String.class, BankInDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ISN", scope = BankInDocInfo.class)
    public JAXBElement<String> createBankInDocInfoISN(String value) {
        return new JAXBElement<String>(_CashInDocInfoISN_QNAME, String.class, BankInDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "CPACodes", scope = GetProductsListByCPACodes.class)
    public JAXBElement<ArrayOfstring> createGetProductsListByCPACodesCPACodes(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetProductsListByCPACodesCPACodes_QNAME, ArrayOfstring.class, GetProductsListByCPACodes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "partnerBarCode", scope = GetPartnerDiscountPercentByBarCode.class)
    public JAXBElement<String> createGetPartnerDiscountPercentByBarCodePartnerBarCode(String value) {
        return new JAXBElement<String>(_GetPartnerDiscountPercentByBarCodePartnerBarCode_QNAME, String.class, GetPartnerDiscountPercentByBarCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "partnerGroup", scope = GetPartnersBonusRemainsByPartnerGroup.class)
    public JAXBElement<String> createGetPartnersBonusRemainsByPartnerGroupPartnerGroup(String value) {
        return new JAXBElement<String>(_GetPartnersBonusRemainsByPartnerGroupPartnerGroup_QNAME, String.class, GetPartnersBonusRemainsByPartnerGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "LikeName", scope = GetPartnersListByModifiedDate.class)
    public JAXBElement<String> createGetPartnersListByModifiedDateLikeName(String value) {
        return new JAXBElement<String>(_GetProductsInfoListByModifiedDateLikeName_QNAME, String.class, GetPartnersListByModifiedDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Group", scope = GetPartnersListByModifiedDate.class)
    public JAXBElement<String> createGetPartnersListByModifiedDateGroup(String value) {
        return new JAXBElement<String>(_GetProductsInfoListByModifiedDateGroup_QNAME, String.class, GetPartnersListByModifiedDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetVersionResult", scope = GetVersionResponse.class)
    public JAXBElement<String> createGetVersionResponseGetVersionResult(String value) {
        return new JAXBElement<String>(_GetVersionResponseGetVersionResult_QNAME, String.class, GetVersionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditPartnerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetPartnerByIdResult", scope = GetPartnerByIdResponse.class)
    public JAXBElement<EditPartnerInfo> createGetPartnerByIdResponseGetPartnerByIdResult(EditPartnerInfo value) {
        return new JAXBElement<EditPartnerInfo>(_GetPartnerByIdResponseGetPartnerByIdResult_QNAME, EditPartnerInfo.class, GetPartnerByIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CashInDocInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "cashInDocInfo", scope = CreateCashInDoc.class)
    public JAXBElement<CashInDocInfo> createCreateCashInDocCashInDocInfo(CashInDocInfo value) {
        return new JAXBElement<CashInDocInfo>(_CreateCashInDocCashInDocInfo_QNAME, CashInDocInfo.class, CreateCashInDoc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PrePaymentPartner", scope = CreateSaleDocInfo.class)
    public JAXBElement<String> createCreateSaleDocInfoPrePaymentPartner(String value) {
        return new JAXBElement<String>(_CreateSaleDocInfoPrePaymentPartner_QNAME, String.class, CreateSaleDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Owner", scope = CreateSaleDocInfo.class)
    public JAXBElement<String> createCreateSaleDocInfoOwner(String value) {
        return new JAXBElement<String>(_CashInDocInfoOwner_QNAME, String.class, CreateSaleDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BankAcquiringContract", scope = CreateSaleDocInfo.class)
    public JAXBElement<String> createCreateSaleDocInfoBankAcquiringContract(String value) {
        return new JAXBElement<String>(_CashInDocInfoBankAcquiringContract_QNAME, String.class, CreateSaleDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BankAcquiringPartner", scope = CreateSaleDocInfo.class)
    public JAXBElement<String> createCreateSaleDocInfoBankAcquiringPartner(String value) {
        return new JAXBElement<String>(_CashInDocInfoBankAcquiringPartner_QNAME, String.class, CreateSaleDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInvoiceSpecificationRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Specification", scope = CreateSaleDocInfo.class)
    public JAXBElement<ArrayOfInvoiceSpecificationRow> createCreateSaleDocInfoSpecification(ArrayOfInvoiceSpecificationRow value) {
        return new JAXBElement<ArrayOfInvoiceSpecificationRow>(_MTReturnFromCustomerDocInfoSpecification_QNAME, ArrayOfInvoiceSpecificationRow.class, CreateSaleDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Comment", scope = CreateSaleDocInfo.class)
    public JAXBElement<String> createCreateSaleDocInfoComment(String value) {
        return new JAXBElement<String>(_CashInDocInfoComment_QNAME, String.class, CreateSaleDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ISN", scope = CreateSaleDocInfo.class)
    public JAXBElement<String> createCreateSaleDocInfoISN(String value) {
        return new JAXBElement<String>(_CashInDocInfoISN_QNAME, String.class, CreateSaleDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ECRCheckNumber", scope = CreateSaleDocInfo.class)
    public JAXBElement<String> createCreateSaleDocInfoECRCheckNumber(String value) {
        return new JAXBElement<String>(_CashInDocInfoECRCheckNumber_QNAME, String.class, CreateSaleDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "VATType", scope = CreateSaleDocInfo.class)
    public JAXBElement<String> createCreateSaleDocInfoVATType(String value) {
        return new JAXBElement<String>(_VATType_QNAME, String.class, CreateSaleDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "SalesConsultant", scope = CreateSaleDocInfo.class)
    public JAXBElement<String> createCreateSaleDocInfoSalesConsultant(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoSalesConsultant_QNAME, String.class, CreateSaleDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PrePaymentContract", scope = CreateSaleDocInfo.class)
    public JAXBElement<String> createCreateSaleDocInfoPrePaymentContract(String value) {
        return new JAXBElement<String>(_CreateSaleDocInfoPrePaymentContract_QNAME, String.class, CreateSaleDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ExtBody", scope = CreateSaleDocInfo.class)
    public JAXBElement<String> createCreateSaleDocInfoExtBody(String value) {
        return new JAXBElement<String>(_CashInDocInfoExtBody_QNAME, String.class, CreateSaleDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BuyerCode", scope = CreateSaleDocInfo.class)
    public JAXBElement<String> createCreateSaleDocInfoBuyerCode(String value) {
        return new JAXBElement<String>(_CreateSaleDocInfoBuyerCode_QNAME, String.class, CreateSaleDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BankAcquiringCardIndex", scope = CreateSaleDocInfo.class)
    public JAXBElement<String> createCreateSaleDocInfoBankAcquiringCardIndex(String value) {
        return new JAXBElement<String>(_CashInDocInfoBankAcquiringCardIndex_QNAME, String.class, CreateSaleDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankInDocInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "LoadBankInDocResult", scope = LoadBankInDocResponse.class)
    public JAXBElement<BankInDocInfo> createLoadBankInDocResponseLoadBankInDocResult(BankInDocInfo value) {
        return new JAXBElement<BankInDocInfo>(_LoadBankInDocResponseLoadBankInDocResult_QNAME, BankInDocInfo.class, LoadBankInDocResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfCreatePartnerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetPartnersInfoNextChunkResult", scope = GetPartnersInfoNextChunkResponse.class)
    public JAXBElement<ChunkedResultOfCreatePartnerInfo> createGetPartnersInfoNextChunkResponseGetPartnersInfoNextChunkResult(ChunkedResultOfCreatePartnerInfo value) {
        return new JAXBElement<ChunkedResultOfCreatePartnerInfo>(_GetPartnersInfoNextChunkResponseGetPartnersInfoNextChunkResult_QNAME, ChunkedResultOfCreatePartnerInfo.class, GetPartnersInfoNextChunkResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartyDocUsableDate", scope = GoodAvailabilityRow.class)
    public JAXBElement<XMLGregorianCalendar> createGoodAvailabilityRowPartyDocUsableDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GoodAvailabilityRowPartyDocUsableDate_QNAME, XMLGregorianCalendar.class, GoodAvailabilityRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartyDocCountry", scope = GoodAvailabilityRow.class)
    public JAXBElement<String> createGoodAvailabilityRowPartyDocCountry(String value) {
        return new JAXBElement<String>(_GoodAvailabilityRowPartyDocCountry_QNAME, String.class, GoodAvailabilityRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartyDocPropertyValue1", scope = GoodAvailabilityRow.class)
    public JAXBElement<String> createGoodAvailabilityRowPartyDocPropertyValue1(String value) {
        return new JAXBElement<String>(_GoodAvailabilityRowPartyDocPropertyValue1_QNAME, String.class, GoodAvailabilityRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartyPartCaption", scope = GoodAvailabilityRow.class)
    public JAXBElement<String> createGoodAvailabilityRowPartyPartCaption(String value) {
        return new JAXBElement<String>(_GoodAvailabilityRowPartyPartCaption_QNAME, String.class, GoodAvailabilityRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartyDocPropertyValue1Code", scope = GoodAvailabilityRow.class)
    public JAXBElement<String> createGoodAvailabilityRowPartyDocPropertyValue1Code(String value) {
        return new JAXBElement<String>(_GoodAvailabilityRowPartyDocPropertyValue1Code_QNAME, String.class, GoodAvailabilityRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartyDocType", scope = GoodAvailabilityRow.class)
    public JAXBElement<String> createGoodAvailabilityRowPartyDocType(String value) {
        return new JAXBElement<String>(_GoodAvailabilityRowPartyDocType_QNAME, String.class, GoodAvailabilityRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartyDocPropertyValue2", scope = GoodAvailabilityRow.class)
    public JAXBElement<String> createGoodAvailabilityRowPartyDocPropertyValue2(String value) {
        return new JAXBElement<String>(_GoodAvailabilityRowPartyDocPropertyValue2_QNAME, String.class, GoodAvailabilityRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartyContractCaption", scope = GoodAvailabilityRow.class)
    public JAXBElement<String> createGoodAvailabilityRowPartyContractCaption(String value) {
        return new JAXBElement<String>(_GoodAvailabilityRowPartyContractCaption_QNAME, String.class, GoodAvailabilityRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartyDocPropertyValue2Code", scope = GoodAvailabilityRow.class)
    public JAXBElement<String> createGoodAvailabilityRowPartyDocPropertyValue2Code(String value) {
        return new JAXBElement<String>(_GoodAvailabilityRowPartyDocPropertyValue2Code_QNAME, String.class, GoodAvailabilityRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartyDocPropertyType1", scope = GoodAvailabilityRow.class)
    public JAXBElement<String> createGoodAvailabilityRowPartyDocPropertyType1(String value) {
        return new JAXBElement<String>(_GoodAvailabilityRowPartyDocPropertyType1_QNAME, String.class, GoodAvailabilityRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartyPartTaxCode", scope = GoodAvailabilityRow.class)
    public JAXBElement<String> createGoodAvailabilityRowPartyPartTaxCode(String value) {
        return new JAXBElement<String>(_GoodAvailabilityRowPartyPartTaxCode_QNAME, String.class, GoodAvailabilityRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartyDocPropertyType2", scope = GoodAvailabilityRow.class)
    public JAXBElement<String> createGoodAvailabilityRowPartyDocPropertyType2(String value) {
        return new JAXBElement<String>(_GoodAvailabilityRowPartyDocPropertyType2_QNAME, String.class, GoodAvailabilityRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartyDocNum", scope = GoodAvailabilityRow.class)
    public JAXBElement<String> createGoodAvailabilityRowPartyDocNum(String value) {
        return new JAXBElement<String>(_GoodAvailabilityRowPartyDocNum_QNAME, String.class, GoodAvailabilityRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartyDocProducer", scope = GoodAvailabilityRow.class)
    public JAXBElement<String> createGoodAvailabilityRowPartyDocProducer(String value) {
        return new JAXBElement<String>(_GoodAvailabilityRowPartyDocProducer_QNAME, String.class, GoodAvailabilityRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartyContractCode", scope = GoodAvailabilityRow.class)
    public JAXBElement<String> createGoodAvailabilityRowPartyContractCode(String value) {
        return new JAXBElement<String>(_GoodAvailabilityRowPartyContractCode_QNAME, String.class, GoodAvailabilityRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "LikeName", scope = GetProductsListByModifiedDate.class)
    public JAXBElement<String> createGetProductsListByModifiedDateLikeName(String value) {
        return new JAXBElement<String>(_GetProductsInfoListByModifiedDateLikeName_QNAME, String.class, GetProductsListByModifiedDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Group", scope = GetProductsListByModifiedDate.class)
    public JAXBElement<String> createGetProductsListByModifiedDateGroup(String value) {
        return new JAXBElement<String>(_GetProductsInfoListByModifiedDateGroup_QNAME, String.class, GetProductsListByModifiedDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetProductByIdWithImageResult", scope = GetProductByIdWithImageResponse.class)
    public JAXBElement<ProductListRow> createGetProductByIdWithImageResponseGetProductByIdWithImageResult(ProductListRow value) {
        return new JAXBElement<ProductListRow>(_GetProductByIdWithImageResponseGetProductByIdWithImageResult_QNAME, ProductListRow.class, GetProductByIdWithImageResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfSalesAnalysisDataProviderDataRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetSalesAnalysisNextChunkResult", scope = GetSalesAnalysisNextChunkResponse.class)
    public JAXBElement<ChunkedResultOfSalesAnalysisDataProviderDataRow> createGetSalesAnalysisNextChunkResponseGetSalesAnalysisNextChunkResult(ChunkedResultOfSalesAnalysisDataProviderDataRow value) {
        return new JAXBElement<ChunkedResultOfSalesAnalysisDataProviderDataRow>(_GetSalesAnalysisNextChunkResponseGetSalesAnalysisNextChunkResult_QNAME, ChunkedResultOfSalesAnalysisDataProviderDataRow.class, GetSalesAnalysisNextChunkResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfGoodAvailabilityRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetProductRemsDetailedResult", scope = GetProductRemsDetailedResponse.class)
    public JAXBElement<ChunkedResultOfGoodAvailabilityRow> createGetProductRemsDetailedResponseGetProductRemsDetailedResult(ChunkedResultOfGoodAvailabilityRow value) {
        return new JAXBElement<ChunkedResultOfGoodAvailabilityRow>(_GetProductRemsDetailedResponseGetProductRemsDetailedResult_QNAME, ChunkedResultOfGoodAvailabilityRow.class, GetProductRemsDetailedResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPartnerGroupListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetPartnerGroupsListResult", scope = GetPartnerGroupsListResponse.class)
    public JAXBElement<ArrayOfPartnerGroupListRow> createGetPartnerGroupsListResponseGetPartnerGroupsListResult(ArrayOfPartnerGroupListRow value) {
        return new JAXBElement<ArrayOfPartnerGroupListRow>(_GetPartnerGroupsListResponseGetPartnerGroupsListResult_QNAME, ArrayOfPartnerGroupListRow.class, GetPartnerGroupsListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Code", scope = DeleteProduct.class)
    public JAXBElement<String> createDeleteProductCode(String value) {
        return new JAXBElement<String>(_GetPartnerByCodeCode_QNAME, String.class, DeleteProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "CaptionEN", scope = UpdateProductInfo.class)
    public JAXBElement<String> createUpdateProductInfoCaptionEN(String value) {
        return new JAXBElement<String>(_CreateProductInfoCaptionEN_QNAME, String.class, UpdateProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductBarCodeInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ProductBarCodes", scope = UpdateProductInfo.class)
    public JAXBElement<ArrayOfProductBarCodeInfo> createUpdateProductInfoProductBarCodes(ArrayOfProductBarCodeInfo value) {
        return new JAXBElement<ArrayOfProductBarCodeInfo>(_CreateProductInfoProductBarCodes_QNAME, ArrayOfProductBarCodeInfo.class, UpdateProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Type", scope = UpdateProductInfo.class)
    public JAXBElement<String> createUpdateProductInfoType(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoType_QNAME, String.class, UpdateProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "CaptionRU", scope = UpdateProductInfo.class)
    public JAXBElement<String> createUpdateProductInfoCaptionRU(String value) {
        return new JAXBElement<String>(_ProductGroupListRowCaptionRU_QNAME, String.class, UpdateProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BarCode", scope = UpdateProductInfo.class)
    public JAXBElement<String> createUpdateProductInfoBarCode(String value) {
        return new JAXBElement<String>(_CreateProductInfoBarCode_QNAME, String.class, UpdateProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Property1", scope = UpdateProductInfo.class)
    public JAXBElement<String> createUpdateProductInfoProperty1(String value) {
        return new JAXBElement<String>(_MTIncomeSpecificationRowProperty1_QNAME, String.class, UpdateProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Property2", scope = UpdateProductInfo.class)
    public JAXBElement<String> createUpdateProductInfoProperty2(String value) {
        return new JAXBElement<String>(_MTIncomeSpecificationRowProperty2_QNAME, String.class, UpdateProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Description", scope = UpdateProductInfo.class)
    public JAXBElement<String> createUpdateProductInfoDescription(String value) {
        return new JAXBElement<String>(_CreateProductInfoDescription_QNAME, String.class, UpdateProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "LongName", scope = UpdateProductInfo.class)
    public JAXBElement<String> createUpdateProductInfoLongName(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoLongName_QNAME, String.class, UpdateProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PLUCode", scope = UpdateProductInfo.class)
    public JAXBElement<Integer> createUpdateProductInfoPLUCode(Integer value) {
        return new JAXBElement<Integer>(_CreateProductInfoPLUCode_QNAME, Integer.class, UpdateProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Country", scope = UpdateProductInfo.class)
    public JAXBElement<String> createUpdateProductInfoCountry(String value) {
        return new JAXBElement<String>(_MTIncomeSpecificationRowCountry_QNAME, String.class, UpdateProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "CPACode", scope = UpdateProductInfo.class)
    public JAXBElement<String> createUpdateProductInfoCPACode(String value) {
        return new JAXBElement<String>(_CreateProductInfoCPACode_QNAME, String.class, UpdateProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Unit", scope = UpdateProductInfo.class)
    public JAXBElement<String> createUpdateProductInfoUnit(String value) {
        return new JAXBElement<String>(_UpdateProductInfoUnit_QNAME, String.class, UpdateProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ExternalCode", scope = UpdateProductInfo.class)
    public JAXBElement<String> createUpdateProductInfoExternalCode(String value) {
        return new JAXBElement<String>(_CreateProductInfoExternalCode_QNAME, String.class, UpdateProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductQuantityUnitInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ProductQntUnits", scope = UpdateProductInfo.class)
    public JAXBElement<ArrayOfProductQuantityUnitInfo> createUpdateProductInfoProductQntUnits(ArrayOfProductQuantityUnitInfo value) {
        return new JAXBElement<ArrayOfProductQuantityUnitInfo>(_CreateProductInfoProductQntUnits_QNAME, ArrayOfProductQuantityUnitInfo.class, UpdateProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "AltUnit", scope = UpdateProductInfo.class)
    public JAXBElement<String> createUpdateProductInfoAltUnit(String value) {
        return new JAXBElement<String>(_UpdateProductInfoAltUnit_QNAME, String.class, UpdateProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "AdditionalDescr2", scope = UpdateProductInfo.class)
    public JAXBElement<String> createUpdateProductInfoAdditionalDescr2(String value) {
        return new JAXBElement<String>(_UpdateProductInfoAdditionalDescr2_QNAME, String.class, UpdateProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Image", scope = UpdateProductInfo.class)
    public JAXBElement<String> createUpdateProductInfoImage(String value) {
        return new JAXBElement<String>(_CreateProductInfoImage_QNAME, String.class, UpdateProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ExpMethod", scope = UpdateProductInfo.class)
    public JAXBElement<String> createUpdateProductInfoExpMethod(String value) {
        return new JAXBElement<String>(_CreateProductInfoExpMethod_QNAME, String.class, UpdateProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "SubstituteItemsGroup", scope = UpdateProductInfo.class)
    public JAXBElement<String> createUpdateProductInfoSubstituteItemsGroup(String value) {
        return new JAXBElement<String>(_CreateProductInfoSubstituteItemsGroup_QNAME, String.class, UpdateProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "AdditionalDescr1", scope = UpdateProductInfo.class)
    public JAXBElement<String> createUpdateProductInfoAdditionalDescr1(String value) {
        return new JAXBElement<String>(_UpdateProductInfoAdditionalDescr1_QNAME, String.class, UpdateProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Producer", scope = UpdateProductInfo.class)
    public JAXBElement<String> createUpdateProductInfoProducer(String value) {
        return new JAXBElement<String>(_MTIncomeSpecificationRowProducer_QNAME, String.class, UpdateProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PriceType", scope = GetProductRems.class)
    public JAXBElement<String> createGetProductRemsPriceType(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoPriceType_QNAME, String.class, GetProductRems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Storage", scope = GetProductRems.class)
    public JAXBElement<String> createGetProductRemsStorage(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoStorage_QNAME, String.class, GetProductRems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Group", scope = GetProductRems.class)
    public JAXBElement<String> createGetProductRemsGroup(String value) {
        return new JAXBElement<String>(_GetProductsInfoListByModifiedDateGroup_QNAME, String.class, GetProductRems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Type", scope = GetPartnersInfoList.class)
    public JAXBElement<String> createGetPartnersInfoListType(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoType_QNAME, String.class, GetPartnersInfoList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateInternalMoveDocInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "LoadInternalMoveDocResult", scope = LoadInternalMoveDocResponse.class)
    public JAXBElement<CreateInternalMoveDocInfo> createLoadInternalMoveDocResponseLoadInternalMoveDocResult(CreateInternalMoveDocInfo value) {
        return new JAXBElement<CreateInternalMoveDocInfo>(_LoadInternalMoveDocResponseLoadInternalMoveDocResult_QNAME, CreateInternalMoveDocInfo.class, LoadInternalMoveDocResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GoodCode", scope = GetSalesAnalysisGroupedByGoodsAndServices.class)
    public JAXBElement<String> createGetSalesAnalysisGroupedByGoodsAndServicesGoodCode(String value) {
        return new JAXBElement<String>(_GetSalesAnalysisGroupedByPartnerGoodCode_QNAME, String.class, GetSalesAnalysisGroupedByGoodsAndServices.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GoodsOrServices", scope = GetSalesAnalysisGroupedByGoodsAndServices.class)
    public JAXBElement<String> createGetSalesAnalysisGroupedByGoodsAndServicesGoodsOrServices(String value) {
        return new JAXBElement<String>(_GetSalesAnalysisGroupedByPartnerGoodsOrServices_QNAME, String.class, GetSalesAnalysisGroupedByGoodsAndServices.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartnerCode", scope = GetSalesAnalysisGroupedByGoodsAndServices.class)
    public JAXBElement<String> createGetSalesAnalysisGroupedByGoodsAndServicesPartnerCode(String value) {
        return new JAXBElement<String>(_CashInDocInfoPartnerCode_QNAME, String.class, GetSalesAnalysisGroupedByGoodsAndServices.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GoodGroup", scope = GetSalesAnalysisGroupedByGoodsAndServices.class)
    public JAXBElement<String> createGetSalesAnalysisGroupedByGoodsAndServicesGoodGroup(String value) {
        return new JAXBElement<String>(_GetSalesAnalysisGroupedByPartnerGoodGroup_QNAME, String.class, GetSalesAnalysisGroupedByGoodsAndServices.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartnerType", scope = GetSalesAnalysisGroupedByGoodsAndServices.class)
    public JAXBElement<String> createGetSalesAnalysisGroupedByGoodsAndServicesPartnerType(String value) {
        return new JAXBElement<String>(_GetSalesAnalysisGroupedByPartnerPartnerType_QNAME, String.class, GetSalesAnalysisGroupedByGoodsAndServices.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Storage", scope = GetSalesAnalysisGroupedByGoodsAndServices.class)
    public JAXBElement<String> createGetSalesAnalysisGroupedByGoodsAndServicesStorage(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoStorage_QNAME, String.class, GetSalesAnalysisGroupedByGoodsAndServices.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfProductListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetProductsForGivenListCodesResult", scope = GetProductsForGivenListCodesResponse.class)
    public JAXBElement<ChunkedResultOfProductListRow> createGetProductsForGivenListCodesResponseGetProductsForGivenListCodesResult(ChunkedResultOfProductListRow value) {
        return new JAXBElement<ChunkedResultOfProductListRow>(_GetProductsForGivenListCodesResponseGetProductsForGivenListCodesResult_QNAME, ChunkedResultOfProductListRow.class, GetProductsForGivenListCodesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfPartnerListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetPartnersNextChunkResult", scope = GetPartnersNextChunkResponse.class)
    public JAXBElement<ChunkedResultOfPartnerListRow> createGetPartnersNextChunkResponseGetPartnersNextChunkResult(ChunkedResultOfPartnerListRow value) {
        return new JAXBElement<ChunkedResultOfPartnerListRow>(_GetPartnersNextChunkResponseGetPartnersNextChunkResult_QNAME, ChunkedResultOfPartnerListRow.class, GetPartnersNextChunkResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PriceType", scope = GetProductRemsDetailed.class)
    public JAXBElement<String> createGetProductRemsDetailedPriceType(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoPriceType_QNAME, String.class, GetProductRemsDetailed.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Storage", scope = GetProductRemsDetailed.class)
    public JAXBElement<String> createGetProductRemsDetailedStorage(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoStorage_QNAME, String.class, GetProductRemsDetailed.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Group", scope = GetProductRemsDetailed.class)
    public JAXBElement<String> createGetProductRemsDetailedGroup(String value) {
        return new JAXBElement<String>(_GetProductsInfoListByModifiedDateGroup_QNAME, String.class, GetProductRemsDetailed.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Code", scope = DeletePartner.class)
    public JAXBElement<String> createDeletePartnerCode(String value) {
        return new JAXBElement<String>(_GetPartnerByCodeCode_QNAME, String.class, DeletePartner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfPriceListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetProductPricesWithImagesResult", scope = GetProductPricesWithImagesResponse.class)
    public JAXBElement<ChunkedResultOfPriceListRow> createGetProductPricesWithImagesResponseGetProductPricesWithImagesResult(ChunkedResultOfPriceListRow value) {
        return new JAXBElement<ChunkedResultOfPriceListRow>(_GetProductPricesWithImagesResponseGetProductPricesWithImagesResult_QNAME, ChunkedResultOfPriceListRow.class, GetProductPricesWithImagesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Image", scope = ProductQuantityUnitInfo.class)
    public JAXBElement<String> createProductQuantityUnitInfoImage(String value) {
        return new JAXBElement<String>(_CreateProductInfoImage_QNAME, String.class, ProductQuantityUnitInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CashInDocInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "LoadCashInDocResult", scope = LoadCashInDocResponse.class)
    public JAXBElement<CashInDocInfo> createLoadCashInDocResponseLoadCashInDocResult(CashInDocInfo value) {
        return new JAXBElement<CashInDocInfo>(_LoadCashInDocResponseLoadCashInDocResult_QNAME, CashInDocInfo.class, LoadCashInDocResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProductInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ProductInfo", scope = UpdateProduct.class)
    public JAXBElement<UpdateProductInfo> createUpdateProductProductInfo(UpdateProductInfo value) {
        return new JAXBElement<UpdateProductInfo>(_UpdateProductProductInfo_QNAME, UpdateProductInfo.class, UpdateProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Machine", scope = MTIncomeDocInfo.class)
    public JAXBElement<String> createMTIncomeDocInfoMachine(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoMachine_QNAME, String.class, MTIncomeDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BaseISN", scope = MTIncomeDocInfo.class)
    public JAXBElement<String> createMTIncomeDocInfoBaseISN(String value) {
        return new JAXBElement<String>(_CashInDocInfoBaseISN_QNAME, String.class, MTIncomeDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartnerCode", scope = MTIncomeDocInfo.class)
    public JAXBElement<String> createMTIncomeDocInfoPartnerCode(String value) {
        return new JAXBElement<String>(_CashInDocInfoPartnerCode_QNAME, String.class, MTIncomeDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ChiefAccountant", scope = MTIncomeDocInfo.class)
    public JAXBElement<String> createMTIncomeDocInfoChiefAccountant(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoChiefAccountant_QNAME, String.class, MTIncomeDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Owner", scope = MTIncomeDocInfo.class)
    public JAXBElement<String> createMTIncomeDocInfoOwner(String value) {
        return new JAXBElement<String>(_CashInDocInfoOwner_QNAME, String.class, MTIncomeDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "InvoiceNumber", scope = MTIncomeDocInfo.class)
    public JAXBElement<String> createMTIncomeDocInfoInvoiceNumber(String value) {
        return new JAXBElement<String>(_MTIncomeDocInfoInvoiceNumber_QNAME, String.class, MTIncomeDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMTIncomeSpecificationRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Specification", scope = MTIncomeDocInfo.class)
    public JAXBElement<ArrayOfMTIncomeSpecificationRow> createMTIncomeDocInfoSpecification(ArrayOfMTIncomeSpecificationRow value) {
        return new JAXBElement<ArrayOfMTIncomeSpecificationRow>(_MTReturnFromCustomerDocInfoSpecification_QNAME, ArrayOfMTIncomeSpecificationRow.class, MTIncomeDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Comment", scope = MTIncomeDocInfo.class)
    public JAXBElement<String> createMTIncomeDocInfoComment(String value) {
        return new JAXBElement<String>(_CashInDocInfoComment_QNAME, String.class, MTIncomeDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Allower", scope = MTIncomeDocInfo.class)
    public JAXBElement<String> createMTIncomeDocInfoAllower(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoAllower_QNAME, String.class, MTIncomeDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Response", scope = MTIncomeDocInfo.class)
    public JAXBElement<String> createMTIncomeDocInfoResponse(String value) {
        return new JAXBElement<String>(_StorageListRowResponse_QNAME, String.class, MTIncomeDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ISN", scope = MTIncomeDocInfo.class)
    public JAXBElement<String> createMTIncomeDocInfoISN(String value) {
        return new JAXBElement<String>(_CashInDocInfoISN_QNAME, String.class, MTIncomeDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Trust", scope = MTIncomeDocInfo.class)
    public JAXBElement<String> createMTIncomeDocInfoTrust(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoTrust_QNAME, String.class, MTIncomeDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PriceType", scope = MTIncomeDocInfo.class)
    public JAXBElement<String> createMTIncomeDocInfoPriceType(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoPriceType_QNAME, String.class, MTIncomeDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ContractCode", scope = MTIncomeDocInfo.class)
    public JAXBElement<String> createMTIncomeDocInfoContractCode(String value) {
        return new JAXBElement<String>(_PartCashBankAccRemainsRowContractCode_QNAME, String.class, MTIncomeDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Mediator", scope = MTIncomeDocInfo.class)
    public JAXBElement<String> createMTIncomeDocInfoMediator(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoMediator_QNAME, String.class, MTIncomeDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ExtBody", scope = MTIncomeDocInfo.class)
    public JAXBElement<String> createMTIncomeDocInfoExtBody(String value) {
        return new JAXBElement<String>(_CashInDocInfoExtBody_QNAME, String.class, MTIncomeDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartnerRemCorrectDocInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "LoadPartnerRemCorrectDocResult", scope = LoadPartnerRemCorrectDocResponse.class)
    public JAXBElement<PartnerRemCorrectDocInfo> createLoadPartnerRemCorrectDocResponseLoadPartnerRemCorrectDocResult(PartnerRemCorrectDocInfo value) {
        return new JAXBElement<PartnerRemCorrectDocInfo>(_LoadPartnerRemCorrectDocResponseLoadPartnerRemCorrectDocResult_QNAME, PartnerRemCorrectDocInfo.class, LoadPartnerRemCorrectDocResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfCodeCaptionListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetCodeCaptionListNextChunkResult", scope = GetCodeCaptionListNextChunkResponse.class)
    public JAXBElement<ChunkedResultOfCodeCaptionListRow> createGetCodeCaptionListNextChunkResponseGetCodeCaptionListNextChunkResult(ChunkedResultOfCodeCaptionListRow value) {
        return new JAXBElement<ChunkedResultOfCodeCaptionListRow>(_GetCodeCaptionListNextChunkResponseGetCodeCaptionListNextChunkResult_QNAME, ChunkedResultOfCodeCaptionListRow.class, GetCodeCaptionListNextChunkResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPriceTypeListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetPriceTypesListResult", scope = GetPriceTypesListResponse.class)
    public JAXBElement<ArrayOfPriceTypeListRow> createGetPriceTypesListResponseGetPriceTypesListResult(ArrayOfPriceTypeListRow value) {
        return new JAXBElement<ArrayOfPriceTypeListRow>(_GetPriceTypesListResponseGetPriceTypesListResult_QNAME, ArrayOfPriceTypeListRow.class, GetPriceTypesListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartnerCode", scope = GetForETLDocumentsList.class)
    public JAXBElement<String> createGetForETLDocumentsListPartnerCode(String value) {
        return new JAXBElement<String>(_CashInDocInfoPartnerCode_QNAME, String.class, GetForETLDocumentsList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "DocTypesList", scope = GetForETLDocumentsList.class)
    public JAXBElement<String> createGetForETLDocumentsListDocTypesList(String value) {
        return new JAXBElement<String>(_GetForETLDocumentsListDocTypesList_QNAME, String.class, GetForETLDocumentsList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Code", scope = GetStorageByCode.class)
    public JAXBElement<String> createGetStorageByCodeCode(String value) {
        return new JAXBElement<String>(_GetPartnerByCodeCode_QNAME, String.class, GetStorageByCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfDocumentsListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetECRChecksListResult", scope = GetECRChecksListResponse.class)
    public JAXBElement<ChunkedResultOfDocumentsListRow> createGetECRChecksListResponseGetECRChecksListResult(ChunkedResultOfDocumentsListRow value) {
        return new JAXBElement<ChunkedResultOfDocumentsListRow>(_GetECRChecksListResponseGetECRChecksListResult_QNAME, ChunkedResultOfDocumentsListRow.class, GetECRChecksListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSaleDocInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "LoadSaleDocResult", scope = LoadSaleDocResponse.class)
    public JAXBElement<CreateSaleDocInfo> createLoadSaleDocResponseLoadSaleDocResult(CreateSaleDocInfo value) {
        return new JAXBElement<CreateSaleDocInfo>(_LoadSaleDocResponseLoadSaleDocResult_QNAME, CreateSaleDocInfo.class, LoadSaleDocResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfPartCashBankAccRemainsRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetPartnersRemsResult", scope = GetPartnersRemsResponse.class)
    public JAXBElement<ChunkedResultOfPartCashBankAccRemainsRow> createGetPartnersRemsResponseGetPartnersRemsResult(ChunkedResultOfPartCashBankAccRemainsRow value) {
        return new JAXBElement<ChunkedResultOfPartCashBankAccRemainsRow>(_GetPartnersRemsResponseGetPartnersRemsResult_QNAME, ChunkedResultOfPartCashBankAccRemainsRow.class, GetPartnersRemsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Password", scope = StartSession.class)
    public JAXBElement<String> createStartSessionPassword(String value) {
        return new JAXBElement<String>(_StartSessionPassword_QNAME, String.class, StartSession.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "DBName", scope = StartSession.class)
    public JAXBElement<String> createStartSessionDBName(String value) {
        return new JAXBElement<String>(_StartSessionDBName_QNAME, String.class, StartSession.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "CultureName", scope = StartSession.class)
    public JAXBElement<String> createStartSessionCultureName(String value) {
        return new JAXBElement<String>(_StartSessionCultureName_QNAME, String.class, StartSession.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "UserName", scope = StartSession.class)
    public JAXBElement<String> createStartSessionUserName(String value) {
        return new JAXBElement<String>(_StartSessionUserName_QNAME, String.class, StartSession.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ParentGroup", scope = GetPartnerGroupsList.class)
    public JAXBElement<String> createGetPartnerGroupsListParentGroup(String value) {
        return new JAXBElement<String>(_GetPartnerGroupsListParentGroup_QNAME, String.class, GetPartnerGroupsList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartnerCode", scope = GetDocumentsList.class)
    public JAXBElement<String> createGetDocumentsListPartnerCode(String value) {
        return new JAXBElement<String>(_CashInDocInfoPartnerCode_QNAME, String.class, GetDocumentsList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "CurrencyCode", scope = GetDocumentsList.class)
    public JAXBElement<String> createGetDocumentsListCurrencyCode(String value) {
        return new JAXBElement<String>(_GetDocumentsListCurrencyCode_QNAME, String.class, GetDocumentsList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "DocTypesList", scope = GetDocumentsList.class)
    public JAXBElement<String> createGetDocumentsListDocTypesList(String value) {
        return new JAXBElement<String>(_GetForETLDocumentsListDocTypesList_QNAME, String.class, GetDocumentsList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfCreateProductInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetProductsInfoListByModifiedDateResult", scope = GetProductsInfoListByModifiedDateResponse.class)
    public JAXBElement<ChunkedResultOfCreateProductInfo> createGetProductsInfoListByModifiedDateResponseGetProductsInfoListByModifiedDateResult(ChunkedResultOfCreateProductInfo value) {
        return new JAXBElement<ChunkedResultOfCreateProductInfo>(_GetProductsInfoListByModifiedDateResponseGetProductsInfoListByModifiedDateResult_QNAME, ChunkedResultOfCreateProductInfo.class, GetProductsInfoListByModifiedDateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStorageListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetStoragesListResult", scope = GetStoragesListResponse.class)
    public JAXBElement<ArrayOfStorageListRow> createGetStoragesListResponseGetStoragesListResult(ArrayOfStorageListRow value) {
        return new JAXBElement<ArrayOfStorageListRow>(_GetStoragesListResponseGetStoragesListResult_QNAME, ArrayOfStorageListRow.class, GetStoragesListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Currency", scope = CashRemains.class)
    public JAXBElement<String> createCashRemainsCurrency(String value) {
        return new JAXBElement<String>(_CashRemainsCurrency_QNAME, String.class, CashRemains.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "TaxCode", scope = PartnerListRow.class)
    public JAXBElement<String> createPartnerListRowTaxCode(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoTaxCode_QNAME, String.class, PartnerListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "MainAim", scope = PartnerListRow.class)
    public JAXBElement<String> createPartnerListRowMainAim(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoMainAim_QNAME, String.class, PartnerListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Type", scope = PartnerListRow.class)
    public JAXBElement<String> createPartnerListRowType(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoType_QNAME, String.class, PartnerListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "StateRegister", scope = PartnerListRow.class)
    public JAXBElement<String> createPartnerListRowStateRegister(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoStateRegister_QNAME, String.class, PartnerListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Phone", scope = PartnerListRow.class)
    public JAXBElement<String> createPartnerListRowPhone(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoPhone_QNAME, String.class, PartnerListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "LongName", scope = PartnerListRow.class)
    public JAXBElement<String> createPartnerListRowLongName(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoLongName_QNAME, String.class, PartnerListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ManagerPosition", scope = PartnerListRow.class)
    public JAXBElement<String> createPartnerListRowManagerPosition(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoManagerPosition_QNAME, String.class, PartnerListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Address", scope = PartnerListRow.class)
    public JAXBElement<String> createPartnerListRowAddress(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoAddress_QNAME, String.class, PartnerListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ManagerName", scope = PartnerListRow.class)
    public JAXBElement<String> createPartnerListRowManagerName(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoManagerName_QNAME, String.class, PartnerListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Passport", scope = PartnerListRow.class)
    public JAXBElement<String> createPartnerListRowPassport(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoPassport_QNAME, String.class, PartnerListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ChiefAccountantName", scope = PartnerListRow.class)
    public JAXBElement<String> createPartnerListRowChiefAccountantName(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoChiefAccountantName_QNAME, String.class, PartnerListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BusinessAddress", scope = PartnerListRow.class)
    public JAXBElement<String> createPartnerListRowBusinessAddress(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoBusinessAddress_QNAME, String.class, PartnerListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "SettlementAccount", scope = PartnerListRow.class)
    public JAXBElement<String> createPartnerListRowSettlementAccount(String value) {
        return new JAXBElement<String>(_PartnerListRowSettlementAccount_QNAME, String.class, PartnerListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ChiefAccountantPosition", scope = PartnerListRow.class)
    public JAXBElement<String> createPartnerListRowChiefAccountantPosition(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoChiefAccountantPosition_QNAME, String.class, PartnerListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfGoodAvailabilityRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetProductRemsNextChunkResult", scope = GetProductRemsNextChunkResponse.class)
    public JAXBElement<ChunkedResultOfGoodAvailabilityRow> createGetProductRemsNextChunkResponseGetProductRemsNextChunkResult(ChunkedResultOfGoodAvailabilityRow value) {
        return new JAXBElement<ChunkedResultOfGoodAvailabilityRow>(_GetProductRemsNextChunkResponseGetProductRemsNextChunkResult_QNAME, ChunkedResultOfGoodAvailabilityRow.class, GetProductRemsNextChunkResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateInvoiceDocInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "InvoiceDocInfo", scope = CreateInvoiceDoc.class)
    public JAXBElement<CreateInvoiceDocInfo> createCreateInvoiceDocInvoiceDocInfo(CreateInvoiceDocInfo value) {
        return new JAXBElement<CreateInvoiceDocInfo>(_CreateInvoiceDocInvoiceDocInfo_QNAME, CreateInvoiceDocInfo.class, CreateInvoiceDoc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MTStockTakingDocInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "MTStockTaking", scope = CreateMTStockTakingDoc.class)
    public JAXBElement<MTStockTakingDocInfo> createCreateMTStockTakingDocMTStockTaking(MTStockTakingDocInfo value) {
        return new JAXBElement<MTStockTakingDocInfo>(_CreateMTStockTakingDocMTStockTaking_QNAME, MTStockTakingDocInfo.class, CreateMTStockTakingDoc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MTIncomeDocInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "LoadMTIncomeDocResult", scope = LoadMTIncomeDocResponse.class)
    public JAXBElement<MTIncomeDocInfo> createLoadMTIncomeDocResponseLoadMTIncomeDocResult(MTIncomeDocInfo value) {
        return new JAXBElement<MTIncomeDocInfo>(_LoadMTIncomeDocResponseLoadMTIncomeDocResult_QNAME, MTIncomeDocInfo.class, LoadMTIncomeDocResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfSalesAnalysisRowGroupedbyGoodsAndServices }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetSalesAnalysisGroupedByGoodsAndServicesNextChunkResult", scope = GetSalesAnalysisGroupedByGoodsAndServicesNextChunkResponse.class)
    public JAXBElement<ChunkedResultOfSalesAnalysisRowGroupedbyGoodsAndServices> createGetSalesAnalysisGroupedByGoodsAndServicesNextChunkResponseGetSalesAnalysisGroupedByGoodsAndServicesNextChunkResult(ChunkedResultOfSalesAnalysisRowGroupedbyGoodsAndServices value) {
        return new JAXBElement<ChunkedResultOfSalesAnalysisRowGroupedbyGoodsAndServices>(_GetSalesAnalysisGroupedByGoodsAndServicesNextChunkResponseGetSalesAnalysisGroupedByGoodsAndServicesNextChunkResult_QNAME, ChunkedResultOfSalesAnalysisRowGroupedbyGoodsAndServices.class, GetSalesAnalysisGroupedByGoodsAndServicesNextChunkResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfProductListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetProductsListResult", scope = GetProductsListResponse.class)
    public JAXBElement<ChunkedResultOfProductListRow> createGetProductsListResponseGetProductsListResult(ChunkedResultOfProductListRow value) {
        return new JAXBElement<ChunkedResultOfProductListRow>(_GetProductsListResponseGetProductsListResult_QNAME, ChunkedResultOfProductListRow.class, GetProductsListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GoodDescription", scope = SalesAnalysisRowGroupedbyGoodsAndServices.class)
    public JAXBElement<String> createSalesAnalysisRowGroupedbyGoodsAndServicesGoodDescription(String value) {
        return new JAXBElement<String>(_SalesAnalysisRowGroupedbyGoodsAndServicesGoodDescription_QNAME, String.class, SalesAnalysisRowGroupedbyGoodsAndServices.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Group", scope = SalesAnalysisRowGroupedbyGoodsAndServices.class)
    public JAXBElement<String> createSalesAnalysisRowGroupedbyGoodsAndServicesGroup(String value) {
        return new JAXBElement<String>(_GetProductsInfoListByModifiedDateGroup_QNAME, String.class, SalesAnalysisRowGroupedbyGoodsAndServices.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetProductByIdResult", scope = GetProductByIdResponse.class)
    public JAXBElement<ProductListRow> createGetProductByIdResponseGetProductByIdResult(ProductListRow value) {
        return new JAXBElement<ProductListRow>(_GetProductByIdResponseGetProductByIdResult_QNAME, ProductListRow.class, GetProductByIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Owner", scope = PartnerRemCorrectDocInfo.class)
    public JAXBElement<String> createPartnerRemCorrectDocInfoOwner(String value) {
        return new JAXBElement<String>(_CashInDocInfoOwner_QNAME, String.class, PartnerRemCorrectDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ExtBody", scope = PartnerRemCorrectDocInfo.class)
    public JAXBElement<String> createPartnerRemCorrectDocInfoExtBody(String value) {
        return new JAXBElement<String>(_CashInDocInfoExtBody_QNAME, String.class, PartnerRemCorrectDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Comment", scope = PartnerRemCorrectDocInfo.class)
    public JAXBElement<String> createPartnerRemCorrectDocInfoComment(String value) {
        return new JAXBElement<String>(_CashInDocInfoComment_QNAME, String.class, PartnerRemCorrectDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ISN", scope = PartnerRemCorrectDocInfo.class)
    public JAXBElement<String> createPartnerRemCorrectDocInfoISN(String value) {
        return new JAXBElement<String>(_CashInDocInfoISN_QNAME, String.class, PartnerRemCorrectDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "SupplierAdditionalData", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<String> createCreateInvoiceDocInfoSupplierAdditionalData(String value) {
        return new JAXBElement<String>(_CreateInvoiceDocInfoSupplierAdditionalData_QNAME, String.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BaseISN", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<String> createCreateInvoiceDocInfoBaseISN(String value) {
        return new JAXBElement<String>(_CashInDocInfoBaseISN_QNAME, String.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BuyerShippingMethod", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<String> createCreateInvoiceDocInfoBuyerShippingMethod(String value) {
        return new JAXBElement<String>(_CreateInvoiceDocInfoBuyerShippingMethod_QNAME, String.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "SupplierTaxCode", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<String> createCreateInvoiceDocInfoSupplierTaxCode(String value) {
        return new JAXBElement<String>(_CreateInvoiceDocInfoSupplierTaxCode_QNAME, String.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BuyerTaxCode", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<String> createCreateInvoiceDocInfoBuyerTaxCode(String value) {
        return new JAXBElement<String>(_CreateInvoiceDocInfoBuyerTaxCode_QNAME, String.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "SupplierManagerPost", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<String> createCreateInvoiceDocInfoSupplierManagerPost(String value) {
        return new JAXBElement<String>(_CreateInvoiceDocInfoSupplierManagerPost_QNAME, String.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "CredentialNumber", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<String> createCreateInvoiceDocInfoCredentialNumber(String value) {
        return new JAXBElement<String>(_CreateInvoiceDocInfoCredentialNumber_QNAME, String.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInvoiceSpecificationRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Specification", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<ArrayOfInvoiceSpecificationRow> createCreateInvoiceDocInfoSpecification(ArrayOfInvoiceSpecificationRow value) {
        return new JAXBElement<ArrayOfInvoiceSpecificationRow>(_MTReturnFromCustomerDocInfoSpecification_QNAME, ArrayOfInvoiceSpecificationRow.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "SupplierBusinessAddress", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<String> createCreateInvoiceDocInfoSupplierBusinessAddress(String value) {
        return new JAXBElement<String>(_CreateInvoiceDocInfoSupplierBusinessAddress_QNAME, String.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "TaxExportType", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<String> createCreateInvoiceDocInfoTaxExportType(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoTaxExportType_QNAME, String.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BuyerSettlementAccount", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<String> createCreateInvoiceDocInfoBuyerSettlementAccount(String value) {
        return new JAXBElement<String>(_CreateInvoiceDocInfoBuyerSettlementAccount_QNAME, String.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BuyerAdditionalData", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<String> createCreateInvoiceDocInfoBuyerAdditionalData(String value) {
        return new JAXBElement<String>(_CreateInvoiceDocInfoBuyerAdditionalData_QNAME, String.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ISN", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<String> createCreateInvoiceDocInfoISN(String value) {
        return new JAXBElement<String>(_CashInDocInfoISN_QNAME, String.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "TaxInvoiceNumber", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<String> createCreateInvoiceDocInfoTaxInvoiceNumber(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoTaxInvoiceNumber_QNAME, String.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BuyerChiefAccountantPost", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<String> createCreateInvoiceDocInfoBuyerChiefAccountantPost(String value) {
        return new JAXBElement<String>(_CreateInvoiceDocInfoBuyerChiefAccountantPost_QNAME, String.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "SupplierManagerName", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<String> createCreateInvoiceDocInfoSupplierManagerName(String value) {
        return new JAXBElement<String>(_CreateInvoiceDocInfoSupplierManagerName_QNAME, String.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BuyerManagerName", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<String> createCreateInvoiceDocInfoBuyerManagerName(String value) {
        return new JAXBElement<String>(_CreateInvoiceDocInfoBuyerManagerName_QNAME, String.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "SupplierLegalAddress", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<String> createCreateInvoiceDocInfoSupplierLegalAddress(String value) {
        return new JAXBElement<String>(_CreateInvoiceDocInfoSupplierLegalAddress_QNAME, String.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BuyerChiefAccountantName", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<String> createCreateInvoiceDocInfoBuyerChiefAccountantName(String value) {
        return new JAXBElement<String>(_CreateInvoiceDocInfoBuyerChiefAccountantName_QNAME, String.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Owner", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<String> createCreateInvoiceDocInfoOwner(String value) {
        return new JAXBElement<String>(_CashInDocInfoOwner_QNAME, String.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PricesTypes", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<String> createCreateInvoiceDocInfoPricesTypes(String value) {
        return new JAXBElement<String>(_CreateInvoiceDocInfoPricesTypes_QNAME, String.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BuyerBusinessAddress", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<String> createCreateInvoiceDocInfoBuyerBusinessAddress(String value) {
        return new JAXBElement<String>(_CreateInvoiceDocInfoBuyerBusinessAddress_QNAME, String.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Contract", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<String> createCreateInvoiceDocInfoContract(String value) {
        return new JAXBElement<String>(_CashInDocInfoContract_QNAME, String.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Comment", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<String> createCreateInvoiceDocInfoComment(String value) {
        return new JAXBElement<String>(_CashInDocInfoComment_QNAME, String.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "SupplierChiefAccountantName", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<String> createCreateInvoiceDocInfoSupplierChiefAccountantName(String value) {
        return new JAXBElement<String>(_CreateInvoiceDocInfoSupplierChiefAccountantName_QNAME, String.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "TaxInvoiceSeries", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<String> createCreateInvoiceDocInfoTaxInvoiceSeries(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoTaxInvoiceSeries_QNAME, String.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BuyerStateRegisterNumber", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<String> createCreateInvoiceDocInfoBuyerStateRegisterNumber(String value) {
        return new JAXBElement<String>(_CreateInvoiceDocInfoBuyerStateRegisterNumber_QNAME, String.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PriceType", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<String> createCreateInvoiceDocInfoPriceType(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoPriceType_QNAME, String.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "CredentialDate", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<XMLGregorianCalendar> createCreateInvoiceDocInfoCredentialDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CreateInvoiceDocInfoCredentialDate_QNAME, XMLGregorianCalendar.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "SupplierBookNumber", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<String> createCreateInvoiceDocInfoSupplierBookNumber(String value) {
        return new JAXBElement<String>(_CreateInvoiceDocInfoSupplierBookNumber_QNAME, String.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Storage", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<String> createCreateInvoiceDocInfoStorage(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoStorage_QNAME, String.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "SalesConsultant", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<String> createCreateInvoiceDocInfoSalesConsultant(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoSalesConsultant_QNAME, String.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BuyerLegalAddress", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<String> createCreateInvoiceDocInfoBuyerLegalAddress(String value) {
        return new JAXBElement<String>(_CreateInvoiceDocInfoBuyerLegalAddress_QNAME, String.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BuyerPassportNumber", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<String> createCreateInvoiceDocInfoBuyerPassportNumber(String value) {
        return new JAXBElement<String>(_CreateInvoiceDocInfoBuyerPassportNumber_QNAME, String.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "SupplierName", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<String> createCreateInvoiceDocInfoSupplierName(String value) {
        return new JAXBElement<String>(_CreateInvoiceDocInfoSupplierName_QNAME, String.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "SupplierSettlementAccount", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<String> createCreateInvoiceDocInfoSupplierSettlementAccount(String value) {
        return new JAXBElement<String>(_CreateInvoiceDocInfoSupplierSettlementAccount_QNAME, String.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BuyerName", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<String> createCreateInvoiceDocInfoBuyerName(String value) {
        return new JAXBElement<String>(_CreateInvoiceDocInfoBuyerName_QNAME, String.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ExtBody", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<String> createCreateInvoiceDocInfoExtBody(String value) {
        return new JAXBElement<String>(_CashInDocInfoExtBody_QNAME, String.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "TaxInvoiceDate", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<XMLGregorianCalendar> createCreateInvoiceDocInfoTaxInvoiceDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MTReturnFromCustomerDocInfoTaxInvoiceDate_QNAME, XMLGregorianCalendar.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BuyerManagerPost", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<String> createCreateInvoiceDocInfoBuyerManagerPost(String value) {
        return new JAXBElement<String>(_CreateInvoiceDocInfoBuyerManagerPost_QNAME, String.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ByWhomFIO", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<String> createCreateInvoiceDocInfoByWhomFIO(String value) {
        return new JAXBElement<String>(_CreateInvoiceDocInfoByWhomFIO_QNAME, String.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BuyerCode", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<String> createCreateInvoiceDocInfoBuyerCode(String value) {
        return new JAXBElement<String>(_CreateSaleDocInfoBuyerCode_QNAME, String.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "SupplierChiefAccountantPost", scope = CreateInvoiceDocInfo.class)
    public JAXBElement<String> createCreateInvoiceDocInfoSupplierChiefAccountantPost(String value) {
        return new JAXBElement<String>(_CreateInvoiceDocInfoSupplierChiefAccountantPost_QNAME, String.class, CreateInvoiceDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ChiefAccountantFIO", scope = CreateInternalMoveDocInfo.class)
    public JAXBElement<String> createCreateInternalMoveDocInfoChiefAccountantFIO(String value) {
        return new JAXBElement<String>(_CreateInternalMoveDocInfoChiefAccountantFIO_QNAME, String.class, CreateInternalMoveDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BaseISN", scope = CreateInternalMoveDocInfo.class)
    public JAXBElement<String> createCreateInternalMoveDocInfoBaseISN(String value) {
        return new JAXBElement<String>(_CashInDocInfoBaseISN_QNAME, String.class, CreateInternalMoveDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Owner", scope = CreateInternalMoveDocInfo.class)
    public JAXBElement<String> createCreateInternalMoveDocInfoOwner(String value) {
        return new JAXBElement<String>(_CashInDocInfoOwner_QNAME, String.class, CreateInternalMoveDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "TaxExportType", scope = CreateInternalMoveDocInfo.class)
    public JAXBElement<String> createCreateInternalMoveDocInfoTaxExportType(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoTaxExportType_QNAME, String.class, CreateInternalMoveDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInternalMoveSpecificationRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Specification", scope = CreateInternalMoveDocInfo.class)
    public JAXBElement<ArrayOfInternalMoveSpecificationRow> createCreateInternalMoveDocInfoSpecification(ArrayOfInternalMoveSpecificationRow value) {
        return new JAXBElement<ArrayOfInternalMoveSpecificationRow>(_MTReturnFromCustomerDocInfoSpecification_QNAME, ArrayOfInternalMoveSpecificationRow.class, CreateInternalMoveDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Comment", scope = CreateInternalMoveDocInfo.class)
    public JAXBElement<String> createCreateInternalMoveDocInfoComment(String value) {
        return new JAXBElement<String>(_CashInDocInfoComment_QNAME, String.class, CreateInternalMoveDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Allower", scope = CreateInternalMoveDocInfo.class)
    public JAXBElement<String> createCreateInternalMoveDocInfoAllower(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoAllower_QNAME, String.class, CreateInternalMoveDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ISN", scope = CreateInternalMoveDocInfo.class)
    public JAXBElement<String> createCreateInternalMoveDocInfoISN(String value) {
        return new JAXBElement<String>(_CashInDocInfoISN_QNAME, String.class, CreateInternalMoveDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "TaxInvoiceSeries", scope = CreateInternalMoveDocInfo.class)
    public JAXBElement<String> createCreateInternalMoveDocInfoTaxInvoiceSeries(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoTaxInvoiceSeries_QNAME, String.class, CreateInternalMoveDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "TransportationMethod", scope = CreateInternalMoveDocInfo.class)
    public JAXBElement<String> createCreateInternalMoveDocInfoTransportationMethod(String value) {
        return new JAXBElement<String>(_CreateInternalMoveDocInfoTransportationMethod_QNAME, String.class, CreateInternalMoveDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "TaxInvoiceNumber", scope = CreateInternalMoveDocInfo.class)
    public JAXBElement<String> createCreateInternalMoveDocInfoTaxInvoiceNumber(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoTaxInvoiceNumber_QNAME, String.class, CreateInternalMoveDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PriceType", scope = CreateInternalMoveDocInfo.class)
    public JAXBElement<String> createCreateInternalMoveDocInfoPriceType(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoPriceType_QNAME, String.class, CreateInternalMoveDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BookNumber", scope = CreateInternalMoveDocInfo.class)
    public JAXBElement<String> createCreateInternalMoveDocInfoBookNumber(String value) {
        return new JAXBElement<String>(_CreateInternalMoveDocInfoBookNumber_QNAME, String.class, CreateInternalMoveDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Mediator", scope = CreateInternalMoveDocInfo.class)
    public JAXBElement<String> createCreateInternalMoveDocInfoMediator(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoMediator_QNAME, String.class, CreateInternalMoveDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ExtBody", scope = CreateInternalMoveDocInfo.class)
    public JAXBElement<String> createCreateInternalMoveDocInfoExtBody(String value) {
        return new JAXBElement<String>(_CashInDocInfoExtBody_QNAME, String.class, CreateInternalMoveDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "TaxInvoiceDate", scope = CreateInternalMoveDocInfo.class)
    public JAXBElement<XMLGregorianCalendar> createCreateInternalMoveDocInfoTaxInvoiceDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MTReturnFromCustomerDocInfoTaxInvoiceDate_QNAME, XMLGregorianCalendar.class, CreateInternalMoveDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StorageListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetStorageByCodeResult", scope = GetStorageByCodeResponse.class)
    public JAXBElement<StorageListRow> createGetStorageByCodeResponseGetStorageByCodeResult(StorageListRow value) {
        return new JAXBElement<StorageListRow>(_GetStorageByCodeResponseGetStorageByCodeResult_QNAME, StorageListRow.class, GetStorageByCodeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "CurrCode", scope = PriceListRow.class)
    public JAXBElement<String> createPriceListRowCurrCode(String value) {
        return new JAXBElement<String>(_PartCashBankAccRemainsRowCurrCode_QNAME, String.class, PriceListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PriceType", scope = PriceListRow.class)
    public JAXBElement<String> createPriceListRowPriceType(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoPriceType_QNAME, String.class, PriceListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Comment", scope = PriceListRow.class)
    public JAXBElement<String> createPriceListRowComment(String value) {
        return new JAXBElement<String>(_CashInDocInfoComment_QNAME, String.class, PriceListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ExternalCode", scope = PriceListRow.class)
    public JAXBElement<String> createPriceListRowExternalCode(String value) {
        return new JAXBElement<String>(_CreateProductInfoExternalCode_QNAME, String.class, PriceListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfProductListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetProductsListByExternalCodesResult", scope = GetProductsListByExternalCodesResponse.class)
    public JAXBElement<ChunkedResultOfProductListRow> createGetProductsListByExternalCodesResponseGetProductsListByExternalCodesResult(ChunkedResultOfProductListRow value) {
        return new JAXBElement<ChunkedResultOfProductListRow>(_GetProductsListByExternalCodesResponseGetProductsListByExternalCodesResult_QNAME, ChunkedResultOfProductListRow.class, GetProductsListByExternalCodesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfSalesAnalysisRowGroupedbyGoodsAndServices }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetSalesAnalysisGroupedByGoodsAndServicesResult", scope = GetSalesAnalysisGroupedByGoodsAndServicesResponse.class)
    public JAXBElement<ChunkedResultOfSalesAnalysisRowGroupedbyGoodsAndServices> createGetSalesAnalysisGroupedByGoodsAndServicesResponseGetSalesAnalysisGroupedByGoodsAndServicesResult(ChunkedResultOfSalesAnalysisRowGroupedbyGoodsAndServices value) {
        return new JAXBElement<ChunkedResultOfSalesAnalysisRowGroupedbyGoodsAndServices>(_GetSalesAnalysisGroupedByGoodsAndServicesResponseGetSalesAnalysisGroupedByGoodsAndServicesResult_QNAME, ChunkedResultOfSalesAnalysisRowGroupedbyGoodsAndServices.class, GetSalesAnalysisGroupedByGoodsAndServicesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MTStockTakingDocInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "LoadMTStockTakingDocResult", scope = LoadMTStockTakingDocResponse.class)
    public JAXBElement<MTStockTakingDocInfo> createLoadMTStockTakingDocResponseLoadMTStockTakingDocResult(MTStockTakingDocInfo value) {
        return new JAXBElement<MTStockTakingDocInfo>(_LoadMTStockTakingDocResponseLoadMTStockTakingDocResult_QNAME, MTStockTakingDocInfo.class, LoadMTStockTakingDocResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfMTBarCodes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetMTBarCodesResult", scope = GetMTBarCodesResponse.class)
    public JAXBElement<ChunkedResultOfMTBarCodes> createGetMTBarCodesResponseGetMTBarCodesResult(ChunkedResultOfMTBarCodes value) {
        return new JAXBElement<ChunkedResultOfMTBarCodes>(_GetMTBarCodesResponseGetMTBarCodesResult_QNAME, ChunkedResultOfMTBarCodes.class, GetMTBarCodesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfCashRemains }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetCashesRemainsResult", scope = GetCashesRemainsResponse.class)
    public JAXBElement<ChunkedResultOfCashRemains> createGetCashesRemainsResponseGetCashesRemainsResult(ChunkedResultOfCashRemains value) {
        return new JAXBElement<ChunkedResultOfCashRemains>(_GetCashesRemainsResponseGetCashesRemainsResult_QNAME, ChunkedResultOfCashRemains.class, GetCashesRemainsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfPriceListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetProductPricesResult", scope = GetProductPricesResponse.class)
    public JAXBElement<ChunkedResultOfPriceListRow> createGetProductPricesResponseGetProductPricesResult(ChunkedResultOfPriceListRow value) {
        return new JAXBElement<ChunkedResultOfPriceListRow>(_GetProductPricesResponseGetProductPricesResult_QNAME, ChunkedResultOfPriceListRow.class, GetProductPricesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartnerCode", scope = GetECRChecksList.class)
    public JAXBElement<String> createGetECRChecksListPartnerCode(String value) {
        return new JAXBElement<String>(_CashInDocInfoPartnerCode_QNAME, String.class, GetECRChecksList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "CurrencyCode", scope = GetECRChecksList.class)
    public JAXBElement<String> createGetECRChecksListCurrencyCode(String value) {
        return new JAXBElement<String>(_GetDocumentsListCurrencyCode_QNAME, String.class, GetECRChecksList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "DocTypesList", scope = GetECRChecksList.class)
    public JAXBElement<String> createGetECRChecksListDocTypesList(String value) {
        return new JAXBElement<String>(_GetForETLDocumentsListDocTypesList_QNAME, String.class, GetECRChecksList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GoodCode", scope = GetSalesAnalysis.class)
    public JAXBElement<String> createGetSalesAnalysisGoodCode(String value) {
        return new JAXBElement<String>(_GetSalesAnalysisGroupedByPartnerGoodCode_QNAME, String.class, GetSalesAnalysis.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GoodsOrServices", scope = GetSalesAnalysis.class)
    public JAXBElement<String> createGetSalesAnalysisGoodsOrServices(String value) {
        return new JAXBElement<String>(_GetSalesAnalysisGroupedByPartnerGoodsOrServices_QNAME, String.class, GetSalesAnalysis.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartnerCode", scope = GetSalesAnalysis.class)
    public JAXBElement<String> createGetSalesAnalysisPartnerCode(String value) {
        return new JAXBElement<String>(_CashInDocInfoPartnerCode_QNAME, String.class, GetSalesAnalysis.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GoodGroup", scope = GetSalesAnalysis.class)
    public JAXBElement<String> createGetSalesAnalysisGoodGroup(String value) {
        return new JAXBElement<String>(_GetSalesAnalysisGroupedByPartnerGoodGroup_QNAME, String.class, GetSalesAnalysis.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartnerType", scope = GetSalesAnalysis.class)
    public JAXBElement<String> createGetSalesAnalysisPartnerType(String value) {
        return new JAXBElement<String>(_GetSalesAnalysisGroupedByPartnerPartnerType_QNAME, String.class, GetSalesAnalysis.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Storage", scope = GetSalesAnalysis.class)
    public JAXBElement<String> createGetSalesAnalysisStorage(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoStorage_QNAME, String.class, GetSalesAnalysis.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MTStockTakingDocInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "doc", scope = UpdateMTStockTakingDoc.class)
    public JAXBElement<MTStockTakingDocInfo> createUpdateMTStockTakingDocDoc(MTStockTakingDocInfo value) {
        return new JAXBElement<MTStockTakingDocInfo>(_UpdateMTStockTakingDocDoc_QNAME, MTStockTakingDocInfo.class, UpdateMTStockTakingDoc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Name", scope = GetProductByName.class)
    public JAXBElement<String> createGetProductByNameName(String value) {
        return new JAXBElement<String>(_GetProductByNameWithImageName_QNAME, String.class, GetProductByName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "QntUnitBrief", scope = MTBarCodes.class)
    public JAXBElement<String> createMTBarCodesQntUnitBrief(String value) {
        return new JAXBElement<String>(_MTBarCodesQntUnitBrief_QNAME, String.class, MTBarCodes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BarCode", scope = MTBarCodes.class)
    public JAXBElement<String> createMTBarCodesBarCode(String value) {
        return new JAXBElement<String>(_CreateProductInfoBarCode_QNAME, String.class, MTBarCodes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "QntUnit", scope = MTBarCodes.class)
    public JAXBElement<String> createMTBarCodesQntUnit(String value) {
        return new JAXBElement<String>(_MTBarCodesQntUnit_QNAME, String.class, MTBarCodes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "MTCode", scope = MTBarCodes.class)
    public JAXBElement<String> createMTBarCodesMTCode(String value) {
        return new JAXBElement<String>(_MTBarCodesMTCode_QNAME, String.class, MTBarCodes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "MTCaption", scope = MTBarCodes.class)
    public JAXBElement<String> createMTBarCodesMTCaption(String value) {
        return new JAXBElement<String>(_MTBarCodesMTCaption_QNAME, String.class, MTBarCodes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MTIncomeDocInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "MTIncomeDocInfo", scope = CreateMTIncomeDoc.class)
    public JAXBElement<MTIncomeDocInfo> createCreateMTIncomeDocMTIncomeDocInfo(MTIncomeDocInfo value) {
        return new JAXBElement<MTIncomeDocInfo>(_MTIncomeDocInfo_QNAME, MTIncomeDocInfo.class, CreateMTIncomeDoc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BarCode", scope = GetProductByBarCodeWithImage.class)
    public JAXBElement<String> createGetProductByBarCodeWithImageBarCode(String value) {
        return new JAXBElement<String>(_CreateProductInfoBarCode_QNAME, String.class, GetProductByBarCodeWithImage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfProductListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetProductsListByModifiedDateResult", scope = GetProductsListByModifiedDateResponse.class)
    public JAXBElement<ChunkedResultOfProductListRow> createGetProductsListByModifiedDateResponseGetProductsListByModifiedDateResult(ChunkedResultOfProductListRow value) {
        return new JAXBElement<ChunkedResultOfProductListRow>(_GetProductsListByModifiedDateResponseGetProductsListByModifiedDateResult_QNAME, ChunkedResultOfProductListRow.class, GetProductsListByModifiedDateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ProductCode", scope = GetPricesByPeriod.class)
    public JAXBElement<String> createGetPricesByPeriodProductCode(String value) {
        return new JAXBElement<String>(_GetPricesByPeriodProductCode_QNAME, String.class, GetPricesByPeriod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Type", scope = GetPricesByPeriod.class)
    public JAXBElement<String> createGetPricesByPeriodType(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoType_QNAME, String.class, GetPricesByPeriod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PriceType", scope = GetPricesByPeriod.class)
    public JAXBElement<String> createGetPricesByPeriodPriceType(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoPriceType_QNAME, String.class, GetPricesByPeriod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ProductGroup", scope = GetPricesByPeriod.class)
    public JAXBElement<String> createGetPricesByPeriodProductGroup(String value) {
        return new JAXBElement<String>(_GetPricesByPeriodProductGroup_QNAME, String.class, GetPricesByPeriod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateProductInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ProductInfo", scope = CreateProduct.class)
    public JAXBElement<CreateProductInfo> createCreateProductProductInfo(CreateProductInfo value) {
        return new JAXBElement<CreateProductInfo>(_UpdateProductProductInfo_QNAME, CreateProductInfo.class, CreateProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ContractName", scope = PartnerBonusRemainsListRow.class)
    public JAXBElement<String> createPartnerBonusRemainsListRowContractName(String value) {
        return new JAXBElement<String>(_PartCashBankAccRemainsRowContractName_QNAME, String.class, PartnerBonusRemainsListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartnerGroup", scope = PartnerBonusRemainsListRow.class)
    public JAXBElement<String> createPartnerBonusRemainsListRowPartnerGroup(String value) {
        return new JAXBElement<String>(_PartnerBonusRemainsListRowPartnerGroup_QNAME, String.class, PartnerBonusRemainsListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartnerCode", scope = PartnerBonusRemainsListRow.class)
    public JAXBElement<String> createPartnerBonusRemainsListRowPartnerCode(String value) {
        return new JAXBElement<String>(_CashInDocInfoPartnerCode_QNAME, String.class, PartnerBonusRemainsListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ContractCode", scope = PartnerBonusRemainsListRow.class)
    public JAXBElement<String> createPartnerBonusRemainsListRowContractCode(String value) {
        return new JAXBElement<String>(_PartCashBankAccRemainsRowContractCode_QNAME, String.class, PartnerBonusRemainsListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Code", scope = GetProductByCodeWithImage.class)
    public JAXBElement<String> createGetProductByCodeWithImageCode(String value) {
        return new JAXBElement<String>(_GetPartnerByCodeCode_QNAME, String.class, GetProductByCodeWithImage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "SalesConsultantCode", scope = SalesAnalysisDataProviderDataRow.class)
    public JAXBElement<String> createSalesAnalysisDataProviderDataRowSalesConsultantCode(String value) {
        return new JAXBElement<String>(_SalesAnalysisDataProviderDataRowSalesConsultantCode_QNAME, String.class, SalesAnalysisDataProviderDataRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "CashDeskCaption", scope = SalesAnalysisDataProviderDataRow.class)
    public JAXBElement<String> createSalesAnalysisDataProviderDataRowCashDeskCaption(String value) {
        return new JAXBElement<String>(_SalesAnalysisDataProviderDataRowCashDeskCaption_QNAME, String.class, SalesAnalysisDataProviderDataRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartyDocPropertyValue1", scope = SalesAnalysisDataProviderDataRow.class)
    public JAXBElement<String> createSalesAnalysisDataProviderDataRowPartyDocPropertyValue1(String value) {
        return new JAXBElement<String>(_GoodAvailabilityRowPartyDocPropertyValue1_QNAME, String.class, SalesAnalysisDataProviderDataRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartyDocCountry", scope = SalesAnalysisDataProviderDataRow.class)
    public JAXBElement<String> createSalesAnalysisDataProviderDataRowPartyDocCountry(String value) {
        return new JAXBElement<String>(_GoodAvailabilityRowPartyDocCountry_QNAME, String.class, SalesAnalysisDataProviderDataRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartyDocType", scope = SalesAnalysisDataProviderDataRow.class)
    public JAXBElement<String> createSalesAnalysisDataProviderDataRowPartyDocType(String value) {
        return new JAXBElement<String>(_GoodAvailabilityRowPartyDocType_QNAME, String.class, SalesAnalysisDataProviderDataRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Group", scope = SalesAnalysisDataProviderDataRow.class)
    public JAXBElement<String> createSalesAnalysisDataProviderDataRowGroup(String value) {
        return new JAXBElement<String>(_GetProductsInfoListByModifiedDateGroup_QNAME, String.class, SalesAnalysisDataProviderDataRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartyDocPropertyValue2", scope = SalesAnalysisDataProviderDataRow.class)
    public JAXBElement<String> createSalesAnalysisDataProviderDataRowPartyDocPropertyValue2(String value) {
        return new JAXBElement<String>(_GoodAvailabilityRowPartyDocPropertyValue2_QNAME, String.class, SalesAnalysisDataProviderDataRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartyContractCaption", scope = SalesAnalysisDataProviderDataRow.class)
    public JAXBElement<String> createSalesAnalysisDataProviderDataRowPartyContractCaption(String value) {
        return new JAXBElement<String>(_GoodAvailabilityRowPartyContractCaption_QNAME, String.class, SalesAnalysisDataProviderDataRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GoodDescription", scope = SalesAnalysisDataProviderDataRow.class)
    public JAXBElement<String> createSalesAnalysisDataProviderDataRowGoodDescription(String value) {
        return new JAXBElement<String>(_SalesAnalysisRowGroupedbyGoodsAndServicesGoodDescription_QNAME, String.class, SalesAnalysisDataProviderDataRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "CashDesk", scope = SalesAnalysisDataProviderDataRow.class)
    public JAXBElement<String> createSalesAnalysisDataProviderDataRowCashDesk(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoCashDesk_QNAME, String.class, SalesAnalysisDataProviderDataRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ECRCheckNum", scope = SalesAnalysisDataProviderDataRow.class)
    public JAXBElement<String> createSalesAnalysisDataProviderDataRowECRCheckNum(String value) {
        return new JAXBElement<String>(_SalesAnalysisDataProviderDataRowECRCheckNum_QNAME, String.class, SalesAnalysisDataProviderDataRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartyPartTaxCode", scope = SalesAnalysisDataProviderDataRow.class)
    public JAXBElement<String> createSalesAnalysisDataProviderDataRowPartyPartTaxCode(String value) {
        return new JAXBElement<String>(_GoodAvailabilityRowPartyPartTaxCode_QNAME, String.class, SalesAnalysisDataProviderDataRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartyDocNum", scope = SalesAnalysisDataProviderDataRow.class)
    public JAXBElement<String> createSalesAnalysisDataProviderDataRowPartyDocNum(String value) {
        return new JAXBElement<String>(_GoodAvailabilityRowPartyDocNum_QNAME, String.class, SalesAnalysisDataProviderDataRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartyDocProducer", scope = SalesAnalysisDataProviderDataRow.class)
    public JAXBElement<String> createSalesAnalysisDataProviderDataRowPartyDocProducer(String value) {
        return new JAXBElement<String>(_GoodAvailabilityRowPartyDocProducer_QNAME, String.class, SalesAnalysisDataProviderDataRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "SalesConsultantCaption", scope = SalesAnalysisDataProviderDataRow.class)
    public JAXBElement<String> createSalesAnalysisDataProviderDataRowSalesConsultantCaption(String value) {
        return new JAXBElement<String>(_SalesAnalysisDataProviderDataRowSalesConsultantCaption_QNAME, String.class, SalesAnalysisDataProviderDataRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartyDocUsableDate", scope = SalesAnalysisDataProviderDataRow.class)
    public JAXBElement<XMLGregorianCalendar> createSalesAnalysisDataProviderDataRowPartyDocUsableDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GoodAvailabilityRowPartyDocUsableDate_QNAME, XMLGregorianCalendar.class, SalesAnalysisDataProviderDataRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartnerCode", scope = SalesAnalysisDataProviderDataRow.class)
    public JAXBElement<String> createSalesAnalysisDataProviderDataRowPartnerCode(String value) {
        return new JAXBElement<String>(_CashInDocInfoPartnerCode_QNAME, String.class, SalesAnalysisDataProviderDataRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartyPartCaption", scope = SalesAnalysisDataProviderDataRow.class)
    public JAXBElement<String> createSalesAnalysisDataProviderDataRowPartyPartCaption(String value) {
        return new JAXBElement<String>(_GoodAvailabilityRowPartyPartCaption_QNAME, String.class, SalesAnalysisDataProviderDataRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartnerCaption", scope = SalesAnalysisDataProviderDataRow.class)
    public JAXBElement<String> createSalesAnalysisDataProviderDataRowPartnerCaption(String value) {
        return new JAXBElement<String>(_SalesAnalysisDataProviderDataRowPartnerCaption_QNAME, String.class, SalesAnalysisDataProviderDataRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "IncomeDate", scope = SalesAnalysisDataProviderDataRow.class)
    public JAXBElement<XMLGregorianCalendar> createSalesAnalysisDataProviderDataRowIncomeDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SalesAnalysisDataProviderDataRowIncomeDate_QNAME, XMLGregorianCalendar.class, SalesAnalysisDataProviderDataRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Contract", scope = SalesAnalysisDataProviderDataRow.class)
    public JAXBElement<String> createSalesAnalysisDataProviderDataRowContract(String value) {
        return new JAXBElement<String>(_CashInDocInfoContract_QNAME, String.class, SalesAnalysisDataProviderDataRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "StorageCaption", scope = SalesAnalysisDataProviderDataRow.class)
    public JAXBElement<String> createSalesAnalysisDataProviderDataRowStorageCaption(String value) {
        return new JAXBElement<String>(_SalesAnalysisDataProviderDataRowStorageCaption_QNAME, String.class, SalesAnalysisDataProviderDataRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Comment", scope = SalesAnalysisDataProviderDataRow.class)
    public JAXBElement<String> createSalesAnalysisDataProviderDataRowComment(String value) {
        return new JAXBElement<String>(_CashInDocInfoComment_QNAME, String.class, SalesAnalysisDataProviderDataRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "DocVATType", scope = SalesAnalysisDataProviderDataRow.class)
    public JAXBElement<String> createSalesAnalysisDataProviderDataRowDocVATType(String value) {
        return new JAXBElement<String>(_SalesAnalysisDataProviderDataRowDocVATType_QNAME, String.class, SalesAnalysisDataProviderDataRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Storage", scope = SalesAnalysisDataProviderDataRow.class)
    public JAXBElement<String> createSalesAnalysisDataProviderDataRowStorage(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoStorage_QNAME, String.class, SalesAnalysisDataProviderDataRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "DocVATTypeCaption", scope = SalesAnalysisDataProviderDataRow.class)
    public JAXBElement<String> createSalesAnalysisDataProviderDataRowDocVATTypeCaption(String value) {
        return new JAXBElement<String>(_SalesAnalysisDataProviderDataRowDocVATTypeCaption_QNAME, String.class, SalesAnalysisDataProviderDataRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartyDocPropertyType1", scope = SalesAnalysisDataProviderDataRow.class)
    public JAXBElement<String> createSalesAnalysisDataProviderDataRowPartyDocPropertyType1(String value) {
        return new JAXBElement<String>(_GoodAvailabilityRowPartyDocPropertyType1_QNAME, String.class, SalesAnalysisDataProviderDataRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartyDocPropertyType2", scope = SalesAnalysisDataProviderDataRow.class)
    public JAXBElement<String> createSalesAnalysisDataProviderDataRowPartyDocPropertyType2(String value) {
        return new JAXBElement<String>(_GoodAvailabilityRowPartyDocPropertyType2_QNAME, String.class, SalesAnalysisDataProviderDataRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfProductShortListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetProductsListShortResult", scope = GetProductsListShortResponse.class)
    public JAXBElement<ChunkedResultOfProductShortListRow> createGetProductsListShortResponseGetProductsListShortResult(ChunkedResultOfProductShortListRow value) {
        return new JAXBElement<ChunkedResultOfProductShortListRow>(_GetProductsListShortResponseGetProductsListShortResult_QNAME, ChunkedResultOfProductShortListRow.class, GetProductsListShortResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PriceType", scope = MTStockTakingDocInfo.class)
    public JAXBElement<String> createMTStockTakingDocInfoPriceType(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoPriceType_QNAME, String.class, MTStockTakingDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Owner", scope = MTStockTakingDocInfo.class)
    public JAXBElement<String> createMTStockTakingDocInfoOwner(String value) {
        return new JAXBElement<String>(_CashInDocInfoOwner_QNAME, String.class, MTStockTakingDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GoodGroup", scope = MTStockTakingDocInfo.class)
    public JAXBElement<String> createMTStockTakingDocInfoGoodGroup(String value) {
        return new JAXBElement<String>(_GetSalesAnalysisGroupedByPartnerGoodGroup_QNAME, String.class, MTStockTakingDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "CurrencyCode", scope = MTStockTakingDocInfo.class)
    public JAXBElement<String> createMTStockTakingDocInfoCurrencyCode(String value) {
        return new JAXBElement<String>(_GetDocumentsListCurrencyCode_QNAME, String.class, MTStockTakingDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMTStockTakingSpecificationRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Specification", scope = MTStockTakingDocInfo.class)
    public JAXBElement<ArrayOfMTStockTakingSpecificationRow> createMTStockTakingDocInfoSpecification(ArrayOfMTStockTakingSpecificationRow value) {
        return new JAXBElement<ArrayOfMTStockTakingSpecificationRow>(_MTReturnFromCustomerDocInfoSpecification_QNAME, ArrayOfMTStockTakingSpecificationRow.class, MTStockTakingDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ExtBody", scope = MTStockTakingDocInfo.class)
    public JAXBElement<String> createMTStockTakingDocInfoExtBody(String value) {
        return new JAXBElement<String>(_CashInDocInfoExtBody_QNAME, String.class, MTStockTakingDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Comment", scope = MTStockTakingDocInfo.class)
    public JAXBElement<String> createMTStockTakingDocInfoComment(String value) {
        return new JAXBElement<String>(_CashInDocInfoComment_QNAME, String.class, MTStockTakingDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ISN", scope = MTStockTakingDocInfo.class)
    public JAXBElement<String> createMTStockTakingDocInfoISN(String value) {
        return new JAXBElement<String>(_CashInDocInfoISN_QNAME, String.class, MTStockTakingDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CashOutDocInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "LoadCashOutDocResult", scope = LoadCashOutDocResponse.class)
    public JAXBElement<CashOutDocInfo> createLoadCashOutDocResponseLoadCashOutDocResult(CashOutDocInfo value) {
        return new JAXBElement<CashOutDocInfo>(_LoadCashOutDocResponseLoadCashOutDocResult_QNAME, CashOutDocInfo.class, LoadCashOutDocResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSaleDocInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "SaleDocInfo", scope = CreateSaleDoc.class)
    public JAXBElement<CreateSaleDocInfo> createCreateSaleDocSaleDocInfo(CreateSaleDocInfo value) {
        return new JAXBElement<CreateSaleDocInfo>(_CreateSaleDocSaleDocInfo_QNAME, CreateSaleDocInfo.class, CreateSaleDoc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditPartnerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartnerInfo", scope = UpdatePartner.class)
    public JAXBElement<EditPartnerInfo> createUpdatePartnerPartnerInfo(EditPartnerInfo value) {
        return new JAXBElement<EditPartnerInfo>(_UpdatePartnerPartnerInfo_QNAME, EditPartnerInfo.class, UpdatePartner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ProductCode", scope = GetProductPricesWithImages.class)
    public JAXBElement<String> createGetProductPricesWithImagesProductCode(String value) {
        return new JAXBElement<String>(_GetPricesByPeriodProductCode_QNAME, String.class, GetProductPricesWithImages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ProductBarCode", scope = GetProductPricesWithImages.class)
    public JAXBElement<String> createGetProductPricesWithImagesProductBarCode(String value) {
        return new JAXBElement<String>(_GetProductPricesWithImagesProductBarCode_QNAME, String.class, GetProductPricesWithImages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Type", scope = GetProductPricesWithImages.class)
    public JAXBElement<String> createGetProductPricesWithImagesType(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoType_QNAME, String.class, GetProductPricesWithImages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PriceType", scope = GetProductPricesWithImages.class)
    public JAXBElement<String> createGetProductPricesWithImagesPriceType(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoPriceType_QNAME, String.class, GetProductPricesWithImages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "LikeName", scope = GetProductPricesWithImages.class)
    public JAXBElement<String> createGetProductPricesWithImagesLikeName(String value) {
        return new JAXBElement<String>(_GetProductsInfoListByModifiedDateLikeName_QNAME, String.class, GetProductPricesWithImages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ProductShowMode", scope = GetProductPricesWithImages.class)
    public JAXBElement<String> createGetProductPricesWithImagesProductShowMode(String value) {
        return new JAXBElement<String>(_GetProductPricesWithImagesProductShowMode_QNAME, String.class, GetProductPricesWithImages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ProductGroup", scope = GetProductPricesWithImages.class)
    public JAXBElement<String> createGetProductPricesWithImagesProductGroup(String value) {
        return new JAXBElement<String>(_GetPricesByPeriodProductGroup_QNAME, String.class, GetProductPricesWithImages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfGoodAvailabilityRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetProductRemByBarCodeResult", scope = GetProductRemByBarCodeResponse.class)
    public JAXBElement<ChunkedResultOfGoodAvailabilityRow> createGetProductRemByBarCodeResponseGetProductRemByBarCodeResult(ChunkedResultOfGoodAvailabilityRow value) {
        return new JAXBElement<ChunkedResultOfGoodAvailabilityRow>(_GetProductRemByBarCodeResponseGetProductRemByBarCodeResult_QNAME, ChunkedResultOfGoodAvailabilityRow.class, GetProductRemByBarCodeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Parent", scope = PartnerGroupListRow.class)
    public JAXBElement<String> createPartnerGroupListRowParent(String value) {
        return new JAXBElement<String>(_ProductGroupListRowParent_QNAME, String.class, PartnerGroupListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfCreatePartnerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetPartnersInfoListResult", scope = GetPartnersInfoListResponse.class)
    public JAXBElement<ChunkedResultOfCreatePartnerInfo> createGetPartnersInfoListResponseGetPartnersInfoListResult(ChunkedResultOfCreatePartnerInfo value) {
        return new JAXBElement<ChunkedResultOfCreatePartnerInfo>(_GetPartnersInfoListResponseGetPartnersInfoListResult_QNAME, ChunkedResultOfCreatePartnerInfo.class, GetPartnersInfoListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetProductByCodeResult", scope = GetProductByCodeResponse.class)
    public JAXBElement<ProductListRow> createGetProductByCodeResponseGetProductByCodeResult(ProductListRow value) {
        return new JAXBElement<ProductListRow>(_GetProductByCodeResponseGetProductByCodeResult_QNAME, ProductListRow.class, GetProductByCodeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MTComplectationDocInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "docInfo", scope = CreateMTComplectationDoc.class)
    public JAXBElement<MTComplectationDocInfo> createCreateMTComplectationDocDocInfo(MTComplectationDocInfo value) {
        return new JAXBElement<MTComplectationDocInfo>(_CreateMTComplectationDocDocInfo_QNAME, MTComplectationDocInfo.class, CreateMTComplectationDoc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MTComplectationDocInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "docInfo", scope = CreateMTComplectationDocAndFillSpecificationRows.class)
    public JAXBElement<MTComplectationDocInfo> createCreateMTComplectationDocAndFillSpecificationRowsDocInfo(MTComplectationDocInfo value) {
        return new JAXBElement<MTComplectationDocInfo>(_CreateMTComplectationDocDocInfo_QNAME, MTComplectationDocInfo.class, CreateMTComplectationDocAndFillSpecificationRows.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetProductByBarCodeResult", scope = GetProductByBarCodeResponse.class)
    public JAXBElement<ProductListRow> createGetProductByBarCodeResponseGetProductByBarCodeResult(ProductListRow value) {
        return new JAXBElement<ProductListRow>(_GetProductByBarCodeResponseGetProductByBarCodeResult_QNAME, ProductListRow.class, GetProductByBarCodeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfPartCashBankAccRemainsRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetPartnersRemsNextChunkResult", scope = GetPartnersRemsNextChunkResponse.class)
    public JAXBElement<ChunkedResultOfPartCashBankAccRemainsRow> createGetPartnersRemsNextChunkResponseGetPartnersRemsNextChunkResult(ChunkedResultOfPartCashBankAccRemainsRow value) {
        return new JAXBElement<ChunkedResultOfPartCashBankAccRemainsRow>(_GetPartnersRemsNextChunkResponseGetPartnersRemsNextChunkResult_QNAME, ChunkedResultOfPartCashBankAccRemainsRow.class, GetPartnersRemsNextChunkResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Trust", scope = MTExpenseDocInfo.class)
    public JAXBElement<String> createMTExpenseDocInfoTrust(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoTrust_QNAME, String.class, MTExpenseDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Demand", scope = MTExpenseDocInfo.class)
    public JAXBElement<String> createMTExpenseDocInfoDemand(String value) {
        return new JAXBElement<String>(_MTExpenseDocInfoDemand_QNAME, String.class, MTExpenseDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Machine", scope = MTExpenseDocInfo.class)
    public JAXBElement<String> createMTExpenseDocInfoMachine(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoMachine_QNAME, String.class, MTExpenseDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BaseISN", scope = MTExpenseDocInfo.class)
    public JAXBElement<String> createMTExpenseDocInfoBaseISN(String value) {
        return new JAXBElement<String>(_CashInDocInfoBaseISN_QNAME, String.class, MTExpenseDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ChiefAccountant", scope = MTExpenseDocInfo.class)
    public JAXBElement<String> createMTExpenseDocInfoChiefAccountant(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoChiefAccountant_QNAME, String.class, MTExpenseDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Owner", scope = MTExpenseDocInfo.class)
    public JAXBElement<String> createMTExpenseDocInfoOwner(String value) {
        return new JAXBElement<String>(_CashInDocInfoOwner_QNAME, String.class, MTExpenseDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Mediator", scope = MTExpenseDocInfo.class)
    public JAXBElement<String> createMTExpenseDocInfoMediator(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoMediator_QNAME, String.class, MTExpenseDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMTExpenseSpecificationRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Specification", scope = MTExpenseDocInfo.class)
    public JAXBElement<ArrayOfMTExpenseSpecificationRow> createMTExpenseDocInfoSpecification(ArrayOfMTExpenseSpecificationRow value) {
        return new JAXBElement<ArrayOfMTExpenseSpecificationRow>(_MTReturnFromCustomerDocInfoSpecification_QNAME, ArrayOfMTExpenseSpecificationRow.class, MTExpenseDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Allower", scope = MTExpenseDocInfo.class)
    public JAXBElement<String> createMTExpenseDocInfoAllower(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoAllower_QNAME, String.class, MTExpenseDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Comment", scope = MTExpenseDocInfo.class)
    public JAXBElement<String> createMTExpenseDocInfoComment(String value) {
        return new JAXBElement<String>(_CashInDocInfoComment_QNAME, String.class, MTExpenseDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ISN", scope = MTExpenseDocInfo.class)
    public JAXBElement<String> createMTExpenseDocInfoISN(String value) {
        return new JAXBElement<String>(_CashInDocInfoISN_QNAME, String.class, MTExpenseDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfPriceListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetProductPricesNextChunkResult", scope = GetProductPricesNextChunkResponse.class)
    public JAXBElement<ChunkedResultOfPriceListRow> createGetProductPricesNextChunkResponseGetProductPricesNextChunkResult(ChunkedResultOfPriceListRow value) {
        return new JAXBElement<ChunkedResultOfPriceListRow>(_GetProductPricesNextChunkResponseGetProductPricesNextChunkResult_QNAME, ChunkedResultOfPriceListRow.class, GetProductPricesNextChunkResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PriceType", scope = GetProductRemByCodeDetailed.class)
    public JAXBElement<String> createGetProductRemByCodeDetailedPriceType(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoPriceType_QNAME, String.class, GetProductRemByCodeDetailed.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Storage", scope = GetProductRemByCodeDetailed.class)
    public JAXBElement<String> createGetProductRemByCodeDetailedStorage(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoStorage_QNAME, String.class, GetProductRemByCodeDetailed.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Code", scope = GetProductRemByCodeDetailed.class)
    public JAXBElement<String> createGetProductRemByCodeDetailedCode(String value) {
        return new JAXBElement<String>(_GetPartnerByCodeCode_QNAME, String.class, GetProductRemByCodeDetailed.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartyMethod", scope = InvoiceSpecificationRow.class)
    public JAXBElement<String> createInvoiceSpecificationRowPartyMethod(String value) {
        return new JAXBElement<String>(_MTComplectationSpecificationRowPartyMethod_QNAME, String.class, InvoiceSpecificationRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ItemName", scope = InvoiceSpecificationRow.class)
    public JAXBElement<String> createInvoiceSpecificationRowItemName(String value) {
        return new JAXBElement<String>(_InvoiceSpecificationRowItemName_QNAME, String.class, InvoiceSpecificationRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BarCode", scope = InvoiceSpecificationRow.class)
    public JAXBElement<String> createInvoiceSpecificationRowBarCode(String value) {
        return new JAXBElement<String>(_CreateProductInfoBarCode_QNAME, String.class, InvoiceSpecificationRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "StorageCode", scope = InvoiceSpecificationRow.class)
    public JAXBElement<String> createInvoiceSpecificationRowStorageCode(String value) {
        return new JAXBElement<String>(_InvoiceSpecificationRowStorageCode_QNAME, String.class, InvoiceSpecificationRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ExternalCode", scope = InvoiceSpecificationRow.class)
    public JAXBElement<String> createInvoiceSpecificationRowExternalCode(String value) {
        return new JAXBElement<String>(_CreateProductInfoExternalCode_QNAME, String.class, InvoiceSpecificationRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductQuantityUnitInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GoodsQntUnitsList", scope = InvoiceSpecificationRow.class)
    public JAXBElement<ArrayOfProductQuantityUnitInfo> createInvoiceSpecificationRowGoodsQntUnitsList(ArrayOfProductQuantityUnitInfo value) {
        return new JAXBElement<ArrayOfProductQuantityUnitInfo>(_InvoiceSpecificationRowGoodsQntUnitsList_QNAME, ArrayOfProductQuantityUnitInfo.class, InvoiceSpecificationRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "RowDescription", scope = InvoiceSpecificationRow.class)
    public JAXBElement<String> createInvoiceSpecificationRowRowDescription(String value) {
        return new JAXBElement<String>(_InvoiceSpecificationRowRowDescription_QNAME, String.class, InvoiceSpecificationRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetProductByNameResult", scope = GetProductByNameResponse.class)
    public JAXBElement<ProductListRow> createGetProductByNameResponseGetProductByNameResult(ProductListRow value) {
        return new JAXBElement<ProductListRow>(_GetProductByNameResponseGetProductByNameResult_QNAME, ProductListRow.class, GetProductByNameResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PriceType", scope = GetProductRemByCode.class)
    public JAXBElement<String> createGetProductRemByCodePriceType(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoPriceType_QNAME, String.class, GetProductRemByCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Storage", scope = GetProductRemByCode.class)
    public JAXBElement<String> createGetProductRemByCodeStorage(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoStorage_QNAME, String.class, GetProductRemByCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Code", scope = GetProductRemByCode.class)
    public JAXBElement<String> createGetProductRemByCodeCode(String value) {
        return new JAXBElement<String>(_GetPartnerByCodeCode_QNAME, String.class, GetProductRemByCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfGoodAvailabilityRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetProductRemsResult", scope = GetProductRemsResponse.class)
    public JAXBElement<ChunkedResultOfGoodAvailabilityRow> createGetProductRemsResponseGetProductRemsResult(ChunkedResultOfGoodAvailabilityRow value) {
        return new JAXBElement<ChunkedResultOfGoodAvailabilityRow>(_GetProductRemsResponseGetProductRemsResult_QNAME, ChunkedResultOfGoodAvailabilityRow.class, GetProductRemsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Currency", scope = GetCashesRemains.class)
    public JAXBElement<String> createGetCashesRemainsCurrency(String value) {
        return new JAXBElement<String>(_CashRemainsCurrency_QNAME, String.class, GetCashesRemains.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "CashCode", scope = GetCashesRemains.class)
    public JAXBElement<String> createGetCashesRemainsCashCode(String value) {
        return new JAXBElement<String>(_GetCashesRemainsCashCode_QNAME, String.class, GetCashesRemains.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "CurrCode", scope = GetPartnersRems.class)
    public JAXBElement<String> createGetPartnersRemsCurrCode(String value) {
        return new JAXBElement<String>(_PartCashBankAccRemainsRowCurrCode_QNAME, String.class, GetPartnersRems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartnerGroup", scope = GetPartnersRems.class)
    public JAXBElement<String> createGetPartnersRemsPartnerGroup(String value) {
        return new JAXBElement<String>(_PartnerBonusRemainsListRowPartnerGroup_QNAME, String.class, GetPartnersRems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartnerCode", scope = GetPartnersRems.class)
    public JAXBElement<String> createGetPartnersRemsPartnerCode(String value) {
        return new JAXBElement<String>(_CashInDocInfoPartnerCode_QNAME, String.class, GetPartnersRems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ContractCode", scope = GetPartnersRems.class)
    public JAXBElement<String> createGetPartnersRemsContractCode(String value) {
        return new JAXBElement<String>(_PartCashBankAccRemainsRowContractCode_QNAME, String.class, GetPartnersRems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfCreateProductInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetProductsInfoListResult", scope = GetProductsInfoListResponse.class)
    public JAXBElement<ChunkedResultOfCreateProductInfo> createGetProductsInfoListResponseGetProductsInfoListResult(ChunkedResultOfCreateProductInfo value) {
        return new JAXBElement<ChunkedResultOfCreateProductInfo>(_GetProductsInfoListResponseGetProductsInfoListResult_QNAME, ChunkedResultOfCreateProductInfo.class, GetProductsInfoListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "UseFulLife", scope = MTReturnFromCustomerSpecificationRow.class)
    public JAXBElement<XMLGregorianCalendar> createMTReturnFromCustomerSpecificationRowUseFulLife(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MTIncomeSpecificationRowUseFulLife_QNAME, XMLGregorianCalendar.class, MTReturnFromCustomerSpecificationRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Property1", scope = MTReturnFromCustomerSpecificationRow.class)
    public JAXBElement<String> createMTReturnFromCustomerSpecificationRowProperty1(String value) {
        return new JAXBElement<String>(_MTIncomeSpecificationRowProperty1_QNAME, String.class, MTReturnFromCustomerSpecificationRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Property2", scope = MTReturnFromCustomerSpecificationRow.class)
    public JAXBElement<String> createMTReturnFromCustomerSpecificationRowProperty2(String value) {
        return new JAXBElement<String>(_MTIncomeSpecificationRowProperty2_QNAME, String.class, MTReturnFromCustomerSpecificationRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Country", scope = MTReturnFromCustomerSpecificationRow.class)
    public JAXBElement<String> createMTReturnFromCustomerSpecificationRowCountry(String value) {
        return new JAXBElement<String>(_MTIncomeSpecificationRowCountry_QNAME, String.class, MTReturnFromCustomerSpecificationRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "RowDescription", scope = MTReturnFromCustomerSpecificationRow.class)
    public JAXBElement<String> createMTReturnFromCustomerSpecificationRowRowDescription(String value) {
        return new JAXBElement<String>(_InvoiceSpecificationRowRowDescription_QNAME, String.class, MTReturnFromCustomerSpecificationRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Producer", scope = MTReturnFromCustomerSpecificationRow.class)
    public JAXBElement<String> createMTReturnFromCustomerSpecificationRowProducer(String value) {
        return new JAXBElement<String>(_MTIncomeSpecificationRowProducer_QNAME, String.class, MTReturnFromCustomerSpecificationRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "CaptionEN", scope = ProductListRow.class)
    public JAXBElement<String> createProductListRowCaptionEN(String value) {
        return new JAXBElement<String>(_CreateProductInfoCaptionEN_QNAME, String.class, ProductListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "CaptionRU", scope = ProductListRow.class)
    public JAXBElement<String> createProductListRowCaptionRU(String value) {
        return new JAXBElement<String>(_ProductGroupListRowCaptionRU_QNAME, String.class, ProductListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "BarCode", scope = ProductListRow.class)
    public JAXBElement<String> createProductListRowBarCode(String value) {
        return new JAXBElement<String>(_CreateProductInfoBarCode_QNAME, String.class, ProductListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Property1", scope = ProductListRow.class)
    public JAXBElement<String> createProductListRowProperty1(String value) {
        return new JAXBElement<String>(_MTIncomeSpecificationRowProperty1_QNAME, String.class, ProductListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductQuantityUnitInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GoodQuantityUnits", scope = ProductListRow.class)
    public JAXBElement<ArrayOfProductQuantityUnitInfo> createProductListRowGoodQuantityUnits(ArrayOfProductQuantityUnitInfo value) {
        return new JAXBElement<ArrayOfProductQuantityUnitInfo>(_ProductListRowGoodQuantityUnits_QNAME, ArrayOfProductQuantityUnitInfo.class, ProductListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Body", scope = ProductListRow.class)
    public JAXBElement<String> createProductListRowBody(String value) {
        return new JAXBElement<String>(_ProductListRowBody_QNAME, String.class, ProductListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Description", scope = ProductListRow.class)
    public JAXBElement<String> createProductListRowDescription(String value) {
        return new JAXBElement<String>(_CreateProductInfoDescription_QNAME, String.class, ProductListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Property2", scope = ProductListRow.class)
    public JAXBElement<String> createProductListRowProperty2(String value) {
        return new JAXBElement<String>(_MTIncomeSpecificationRowProperty2_QNAME, String.class, ProductListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "LongName", scope = ProductListRow.class)
    public JAXBElement<String> createProductListRowLongName(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoLongName_QNAME, String.class, ProductListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Country", scope = ProductListRow.class)
    public JAXBElement<String> createProductListRowCountry(String value) {
        return new JAXBElement<String>(_MTIncomeSpecificationRowCountry_QNAME, String.class, ProductListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PLUCode", scope = ProductListRow.class)
    public JAXBElement<Integer> createProductListRowPLUCode(Integer value) {
        return new JAXBElement<Integer>(_CreateProductInfoPLUCode_QNAME, Integer.class, ProductListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "CPACode", scope = ProductListRow.class)
    public JAXBElement<String> createProductListRowCPACode(String value) {
        return new JAXBElement<String>(_CreateProductInfoCPACode_QNAME, String.class, ProductListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ExpMethodName", scope = ProductListRow.class)
    public JAXBElement<String> createProductListRowExpMethodName(String value) {
        return new JAXBElement<String>(_ProductListRowExpMethodName_QNAME, String.class, ProductListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ExternalCode", scope = ProductListRow.class)
    public JAXBElement<String> createProductListRowExternalCode(String value) {
        return new JAXBElement<String>(_CreateProductInfoExternalCode_QNAME, String.class, ProductListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "AdditionalDescription2", scope = ProductListRow.class)
    public JAXBElement<String> createProductListRowAdditionalDescription2(String value) {
        return new JAXBElement<String>(_CreateProductInfoAdditionalDescription2_QNAME, String.class, ProductListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "AdditionalDescription1", scope = ProductListRow.class)
    public JAXBElement<String> createProductListRowAdditionalDescription1(String value) {
        return new JAXBElement<String>(_CreateProductInfoAdditionalDescription1_QNAME, String.class, ProductListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Image", scope = ProductListRow.class)
    public JAXBElement<String> createProductListRowImage(String value) {
        return new JAXBElement<String>(_CreateProductInfoImage_QNAME, String.class, ProductListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ExpMethod", scope = ProductListRow.class)
    public JAXBElement<String> createProductListRowExpMethod(String value) {
        return new JAXBElement<String>(_CreateProductInfoExpMethod_QNAME, String.class, ProductListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductBarCodeInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GoodBarCodes", scope = ProductListRow.class)
    public JAXBElement<ArrayOfProductBarCodeInfo> createProductListRowGoodBarCodes(ArrayOfProductBarCodeInfo value) {
        return new JAXBElement<ArrayOfProductBarCodeInfo>(_ProductListRowGoodBarCodes_QNAME, ArrayOfProductBarCodeInfo.class, ProductListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "SubstituteItemsGroup", scope = ProductListRow.class)
    public JAXBElement<String> createProductListRowSubstituteItemsGroup(String value) {
        return new JAXBElement<String>(_CreateProductInfoSubstituteItemsGroup_QNAME, String.class, ProductListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Producer", scope = ProductListRow.class)
    public JAXBElement<String> createProductListRowProducer(String value) {
        return new JAXBElement<String>(_MTIncomeSpecificationRowProducer_QNAME, String.class, ProductListRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfCodeCaptionListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetProducersListResult", scope = GetProducersListResponse.class)
    public JAXBElement<ChunkedResultOfCodeCaptionListRow> createGetProducersListResponseGetProducersListResult(ChunkedResultOfCodeCaptionListRow value) {
        return new JAXBElement<ChunkedResultOfCodeCaptionListRow>(_GetProducersListResponseGetProducersListResult_QNAME, ChunkedResultOfCodeCaptionListRow.class, GetProducersListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartnerCode", scope = SalesAnalysisRowGroupedByPartner.class)
    public JAXBElement<String> createSalesAnalysisRowGroupedByPartnerPartnerCode(String value) {
        return new JAXBElement<String>(_CashInDocInfoPartnerCode_QNAME, String.class, SalesAnalysisRowGroupedByPartner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartnerCaption", scope = SalesAnalysisRowGroupedByPartner.class)
    public JAXBElement<String> createSalesAnalysisRowGroupedByPartnerPartnerCaption(String value) {
        return new JAXBElement<String>(_SalesAnalysisDataProviderDataRowPartnerCaption_QNAME, String.class, SalesAnalysisRowGroupedByPartner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateInvoiceDocInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "LoadInvoiceDocResult", scope = LoadInvoiceDocResponse.class)
    public JAXBElement<CreateInvoiceDocInfo> createLoadInvoiceDocResponseLoadInvoiceDocResult(CreateInvoiceDocInfo value) {
        return new JAXBElement<CreateInvoiceDocInfo>(_LoadInvoiceDocResponseLoadInvoiceDocResult_QNAME, CreateInvoiceDocInfo.class, LoadInvoiceDocResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfProductListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetProductsNextChunkResult", scope = GetProductsNextChunkResponse.class)
    public JAXBElement<ChunkedResultOfProductListRow> createGetProductsNextChunkResponseGetProductsNextChunkResult(ChunkedResultOfProductListRow value) {
        return new JAXBElement<ChunkedResultOfProductListRow>(_GetProductsNextChunkResponseGetProductsNextChunkResult_QNAME, ChunkedResultOfProductListRow.class, GetProductsNextChunkResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfSalesAnalysisRowGroupedByPartner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetSalesAnalysisGroupedByPartnerResult", scope = GetSalesAnalysisGroupedByPartnerResponse.class)
    public JAXBElement<ChunkedResultOfSalesAnalysisRowGroupedByPartner> createGetSalesAnalysisGroupedByPartnerResponseGetSalesAnalysisGroupedByPartnerResult(ChunkedResultOfSalesAnalysisRowGroupedByPartner value) {
        return new JAXBElement<ChunkedResultOfSalesAnalysisRowGroupedByPartner>(_GetSalesAnalysisGroupedByPartnerResponseGetSalesAnalysisGroupedByPartnerResult_QNAME, ChunkedResultOfSalesAnalysisRowGroupedByPartner.class, GetSalesAnalysisGroupedByPartnerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfSalesAnalysisDataProviderDataRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetSalesAnalysisByPartiesResult", scope = GetSalesAnalysisByPartiesResponse.class)
    public JAXBElement<ChunkedResultOfSalesAnalysisDataProviderDataRow> createGetSalesAnalysisByPartiesResponseGetSalesAnalysisByPartiesResult(ChunkedResultOfSalesAnalysisDataProviderDataRow value) {
        return new JAXBElement<ChunkedResultOfSalesAnalysisDataProviderDataRow>(_GetSalesAnalysisByPartiesResponseGetSalesAnalysisByPartiesResult_QNAME, ChunkedResultOfSalesAnalysisDataProviderDataRow.class, GetSalesAnalysisByPartiesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ProductCode", scope = GetProductPrices.class)
    public JAXBElement<String> createGetProductPricesProductCode(String value) {
        return new JAXBElement<String>(_GetPricesByPeriodProductCode_QNAME, String.class, GetProductPrices.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ProductBarCode", scope = GetProductPrices.class)
    public JAXBElement<String> createGetProductPricesProductBarCode(String value) {
        return new JAXBElement<String>(_GetProductPricesWithImagesProductBarCode_QNAME, String.class, GetProductPrices.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Type", scope = GetProductPrices.class)
    public JAXBElement<String> createGetProductPricesType(String value) {
        return new JAXBElement<String>(_CreatePartnerInfoType_QNAME, String.class, GetProductPrices.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PriceType", scope = GetProductPrices.class)
    public JAXBElement<String> createGetProductPricesPriceType(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoPriceType_QNAME, String.class, GetProductPrices.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ProductShowMode", scope = GetProductPrices.class)
    public JAXBElement<String> createGetProductPricesProductShowMode(String value) {
        return new JAXBElement<String>(_GetProductPricesWithImagesProductShowMode_QNAME, String.class, GetProductPrices.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ProductGroup", scope = GetProductPrices.class)
    public JAXBElement<String> createGetProductPricesProductGroup(String value) {
        return new JAXBElement<String>(_GetPricesByPeriodProductGroup_QNAME, String.class, GetProductPrices.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfPriceListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetPricesByPeriodResult", scope = GetPricesByPeriodResponse.class)
    public JAXBElement<ChunkedResultOfPriceListRow> createGetPricesByPeriodResponseGetPricesByPeriodResult(ChunkedResultOfPriceListRow value) {
        return new JAXBElement<ChunkedResultOfPriceListRow>(_GetPricesByPeriodResponseGetPricesByPeriodResult_QNAME, ChunkedResultOfPriceListRow.class, GetPricesByPeriodResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "LikeName", scope = GetProductsInfoList.class)
    public JAXBElement<String> createGetProductsInfoListLikeName(String value) {
        return new JAXBElement<String>(_GetProductsInfoListByModifiedDateLikeName_QNAME, String.class, GetProductsInfoList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Group", scope = GetProductsInfoList.class)
    public JAXBElement<String> createGetProductsInfoListGroup(String value) {
        return new JAXBElement<String>(_GetProductsInfoListByModifiedDateGroup_QNAME, String.class, GetProductsInfoList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkedResultOfPartnerBonusRemainsListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetPartnerBonusRemainsResult", scope = GetPartnerBonusRemainsResponse.class)
    public JAXBElement<ChunkedResultOfPartnerBonusRemainsListRow> createGetPartnerBonusRemainsResponseGetPartnerBonusRemainsResult(ChunkedResultOfPartnerBonusRemainsListRow value) {
        return new JAXBElement<ChunkedResultOfPartnerBonusRemainsListRow>(_GetPartnerBonusRemainsResponseGetPartnerBonusRemainsResult_QNAME, ChunkedResultOfPartnerBonusRemainsListRow.class, GetPartnerBonusRemainsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ProductesCodeList", scope = GetProductsForGivenListCodes.class)
    public JAXBElement<ArrayOfstring> createGetProductsForGivenListCodesProductesCodeList(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetProductsForGivenListCodesProductesCodeList_QNAME, ArrayOfstring.class, GetProductsForGivenListCodes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ParentGroup", scope = GetProductGroupsList.class)
    public JAXBElement<String> createGetProductGroupsListParentGroup(String value) {
        return new JAXBElement<String>(_GetPartnerGroupsListParentGroup_QNAME, String.class, GetProductGroupsList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "LikeName", scope = GetProductsListShort.class)
    public JAXBElement<String> createGetProductsListShortLikeName(String value) {
        return new JAXBElement<String>(_GetProductsInfoListByModifiedDateLikeName_QNAME, String.class, GetProductsListShort.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Group", scope = GetProductsListShort.class)
    public JAXBElement<String> createGetProductsListShortGroup(String value) {
        return new JAXBElement<String>(_GetProductsInfoListByModifiedDateGroup_QNAME, String.class, GetProductsListShort.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MTExpenseDocInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "MTExpenseDocInfo", scope = CreateMTExpenseDoc.class)
    public JAXBElement<MTExpenseDocInfo> createCreateMTExpenseDocMTExpenseDocInfo(MTExpenseDocInfo value) {
        return new JAXBElement<MTExpenseDocInfo>(_MTExpenseDocInfo_QNAME, MTExpenseDocInfo.class, CreateMTExpenseDoc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MTReturnFromCustomerDocInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "mtReturnFromCustomerDocInfo", scope = CreateMTReturnFromCustomerDoc.class)
    public JAXBElement<MTReturnFromCustomerDocInfo> createCreateMTReturnFromCustomerDocMtReturnFromCustomerDocInfo(MTReturnFromCustomerDocInfo value) {
        return new JAXBElement<MTReturnFromCustomerDocInfo>(_CreateMTReturnFromCustomerDocMtReturnFromCustomerDocInfo_QNAME, MTReturnFromCustomerDocInfo.class, CreateMTReturnFromCustomerDoc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Owner", scope = MTComplectationDocInfo.class)
    public JAXBElement<String> createMTComplectationDocInfoOwner(String value) {
        return new JAXBElement<String>(_CashInDocInfoOwner_QNAME, String.class, MTComplectationDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMTComplectationSpecificationRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Specification", scope = MTComplectationDocInfo.class)
    public JAXBElement<ArrayOfMTComplectationSpecificationRow> createMTComplectationDocInfoSpecification(ArrayOfMTComplectationSpecificationRow value) {
        return new JAXBElement<ArrayOfMTComplectationSpecificationRow>(_MTReturnFromCustomerDocInfoSpecification_QNAME, ArrayOfMTComplectationSpecificationRow.class, MTComplectationDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Comment", scope = MTComplectationDocInfo.class)
    public JAXBElement<String> createMTComplectationDocInfoComment(String value) {
        return new JAXBElement<String>(_CashInDocInfoComment_QNAME, String.class, MTComplectationDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "StorageExpense", scope = MTComplectationDocInfo.class)
    public JAXBElement<String> createMTComplectationDocInfoStorageExpense(String value) {
        return new JAXBElement<String>(_MTComplectationDocInfoStorageExpense_QNAME, String.class, MTComplectationDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ISN", scope = MTComplectationDocInfo.class)
    public JAXBElement<String> createMTComplectationDocInfoISN(String value) {
        return new JAXBElement<String>(_CashInDocInfoISN_QNAME, String.class, MTComplectationDocInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePartnerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PartnerInfo", scope = CreatePartner.class)
    public JAXBElement<CreatePartnerInfo> createCreatePartnerPartnerInfo(CreatePartnerInfo value) {
        return new JAXBElement<CreatePartnerInfo>(_UpdatePartnerPartnerInfo_QNAME, CreatePartnerInfo.class, CreatePartner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateInternalMoveDocInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "InternalMoveDocInfo", scope = CreateInternalMoveDoc.class)
    public JAXBElement<CreateInternalMoveDocInfo> createCreateInternalMoveDocInternalMoveDocInfo(CreateInternalMoveDocInfo value) {
        return new JAXBElement<CreateInternalMoveDocInfo>(_CreateInternalMoveDocInternalMoveDocInfo_QNAME, CreateInternalMoveDocInfo.class, CreateInternalMoveDoc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "ContractDate", scope = PartnerContractInfo.class)
    public JAXBElement<XMLGregorianCalendar> createPartnerContractInfoContractDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PartCashBankAccRemainsRowContractDate_QNAME, XMLGregorianCalendar.class, PartnerContractInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "PriceType", scope = PartnerContractInfo.class)
    public JAXBElement<String> createPartnerContractInfoPriceType(String value) {
        return new JAXBElement<String>(_MTReturnFromCustomerDocInfoPriceType_QNAME, String.class, PartnerContractInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "DiscountCard", scope = PartnerContractInfo.class)
    public JAXBElement<String> createPartnerContractInfoDiscountCard(String value) {
        return new JAXBElement<String>(_PartnerContractInfoDiscountCard_QNAME, String.class, PartnerContractInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "Description", scope = PartnerContractInfo.class)
    public JAXBElement<String> createPartnerContractInfoDescription(String value) {
        return new JAXBElement<String>(_CreateProductInfoDescription_QNAME, String.class, PartnerContractInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductListRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.armsoft.am/Accountant/6.0", name = "GetProductByCodeWithImageResult", scope = GetProductByCodeWithImageResponse.class)
    public JAXBElement<ProductListRow> createGetProductByCodeWithImageResponseGetProductByCodeWithImageResult(ProductListRow value) {
        return new JAXBElement<ProductListRow>(_GetProductByCodeWithImageResponseGetProductByCodeWithImageResult_QNAME, ProductListRow.class, GetProductByCodeWithImageResponse.class, value);
    }

}
