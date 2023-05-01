
package com.brutus.abio.armsoft.wsdl._6;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;


/**
 * <p>Java class for SalesAnalysisDataProvider.DataRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesAnalysisDataProvider.DataRow">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.armsoft.am/Accountant/6.0}ExtendableRow">
 *       &lt;sequence>
 *         &lt;element name="DocDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DocISN" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid"/>
 *         &lt;element name="DocNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DocType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="DocCurrCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Contract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RowID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DocVATType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocVATTypeCaption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ECRCheckNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OpName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ItemTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ItemType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GoodID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GoodCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GoodCaption" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GoodDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnitCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UnitBrief" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Storage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StorageCaption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CashDesk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CashDeskCaption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartnerID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PartnerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartnerCaption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Summ" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CostPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SalePrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SaleSumm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Profit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProfitPercentBySale" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProfitPercentByCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscountSum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VATSumm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VATCostPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VATSalePrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VATSaleSumm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VATProfit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VATProfitPercentBySale" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VATProfitPercentByCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VATDiscountSumm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VATDiscountPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CostVATSumm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CostVATPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SaleVATSumm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscountVATSumm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CurSumm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CurrCostPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SaleCurPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SaleCurSumm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CurProfit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CurProfitPercentBySale" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CurProfitPercentByCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscountCurSum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscountCurPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UsedBonus" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AccumulatedBonus" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesConsultantCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesConsultantCaption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncomeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PartyPartID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PartyPartCaption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyPartTaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyContractCaption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyDocNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyDocType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyDocUsableDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PartyDocCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyDocProducer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyDocPropertyType1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyDocPropertyValue1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyDocPropertyType2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyDocPropertyValue2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesAnalysisDataProvider.DataRow", propOrder = {
    "docDate",
    "docISN",
    "docNum",
    "docType",
    "docCurrCode",
    "contract",
    "rowID",
    "docVATType",
    "docVATTypeCaption",
    "ecrCheckNum",
    "opName",
    "itemTypeCode",
    "itemType",
    "goodID",
    "goodCode",
    "goodCaption",
    "goodDescription",
    "unitCode",
    "unitBrief",
    "storage",
    "storageCaption",
    "cashDesk",
    "cashDeskCaption",
    "partnerID",
    "partnerCode",
    "partnerCaption",
    "quantity",
    "summ",
    "costPrice",
    "salePrice",
    "saleSumm",
    "profit",
    "profitPercentBySale",
    "profitPercentByCost",
    "discountSum",
    "discountPercent",
    "vatSumm",
    "vatCostPrice",
    "vatSalePrice",
    "vatSaleSumm",
    "vatProfit",
    "vatProfitPercentBySale",
    "vatProfitPercentByCost",
    "vatDiscountSumm",
    "vatDiscountPercent",
    "costVATSumm",
    "costVATPrice",
    "saleVATSumm",
    "discountVATSumm",
    "curSumm",
    "currCostPrice",
    "saleCurPrice",
    "saleCurSumm",
    "curProfit",
    "curProfitPercentBySale",
    "curProfitPercentByCost",
    "discountCurSum",
    "discountCurPercent",
    "usedBonus",
    "accumulatedBonus",
    "group",
    "salesConsultantCode",
    "salesConsultantCaption",
    "comment",
    "incomeDate",
    "partyPartID",
    "partyPartCaption",
    "partyPartTaxCode",
    "partyContractCaption",
    "partyDocNum",
    "partyDocType",
    "partyDocUsableDate",
    "partyDocCountry",
    "partyDocProducer",
    "partyDocPropertyType1",
    "partyDocPropertyValue1",
    "partyDocPropertyType2",
    "partyDocPropertyValue2"
})
public class SalesAnalysisDataProviderDataRow
    extends ExtendableRow
{

    @XmlElement(name = "DocDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docDate;
    @XmlElement(name = "DocISN", required = true)
    protected String docISN;
    @XmlElement(name = "DocNum", required = true, nillable = true)
    protected String docNum;
    @XmlElement(name = "DocType")
    @XmlSchemaType(name = "unsignedByte")
    protected short docType;
    @XmlElement(name = "DocCurrCode", required = true, nillable = true)
    protected String docCurrCode;
    @XmlElementRef(name = "Contract", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> contract;
    @XmlElement(name = "RowID")
    protected Integer rowID;
    @XmlElementRef(name = "DocVATType", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> docVATType;
    @XmlElementRef(name = "DocVATTypeCaption", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> docVATTypeCaption;
    @XmlElementRef(name = "ECRCheckNum", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> ecrCheckNum;
    @XmlElement(name = "OpName", required = true, nillable = true)
    protected String opName;
    @XmlElement(name = "ItemTypeCode", required = true, nillable = true)
    protected String itemTypeCode;
    @XmlElement(name = "ItemType", required = true, nillable = true)
    protected String itemType;
    @XmlElement(name = "GoodID")
    protected int goodID;
    @XmlElement(name = "GoodCode", required = true, nillable = true)
    protected String goodCode;
    @XmlElement(name = "GoodCaption", required = true, nillable = true)
    protected String goodCaption;
    @XmlElementRef(name = "GoodDescription", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> goodDescription;
    @XmlElement(name = "UnitCode", required = true, nillable = true)
    protected String unitCode;
    @XmlElement(name = "UnitBrief", required = true, nillable = true)
    protected String unitBrief;
    @XmlElementRef(name = "Storage", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> storage;
    @XmlElementRef(name = "StorageCaption", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> storageCaption;
    @XmlElementRef(name = "CashDesk", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> cashDesk;
    @XmlElementRef(name = "CashDeskCaption", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> cashDeskCaption;
    @XmlElement(name = "PartnerID")
    protected Integer partnerID;
    @XmlElementRef(name = "PartnerCode", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> partnerCode;
    @XmlElementRef(name = "PartnerCaption", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> partnerCaption;
    @XmlElement(name = "Quantity", required = true)
    protected BigDecimal quantity;
    @XmlElement(name = "Summ")
    protected BigDecimal summ;
    @XmlElement(name = "CostPrice")
    protected BigDecimal costPrice;
    @XmlElement(name = "SalePrice")
    protected BigDecimal salePrice;
    @XmlElement(name = "SaleSumm")
    protected BigDecimal saleSumm;
    @XmlElement(name = "Profit")
    protected BigDecimal profit;
    @XmlElement(name = "ProfitPercentBySale")
    protected BigDecimal profitPercentBySale;
    @XmlElement(name = "ProfitPercentByCost")
    protected BigDecimal profitPercentByCost;
    @XmlElement(name = "DiscountSum")
    protected BigDecimal discountSum;
    @XmlElement(name = "DiscountPercent")
    protected BigDecimal discountPercent;
    @XmlElement(name = "VATSumm")
    protected BigDecimal vatSumm;
    @XmlElement(name = "VATCostPrice")
    protected BigDecimal vatCostPrice;
    @XmlElement(name = "VATSalePrice")
    protected BigDecimal vatSalePrice;
    @XmlElement(name = "VATSaleSumm")
    protected BigDecimal vatSaleSumm;
    @XmlElement(name = "VATProfit")
    protected BigDecimal vatProfit;
    @XmlElement(name = "VATProfitPercentBySale")
    protected BigDecimal vatProfitPercentBySale;
    @XmlElement(name = "VATProfitPercentByCost")
    protected BigDecimal vatProfitPercentByCost;
    @XmlElement(name = "VATDiscountSumm")
    protected BigDecimal vatDiscountSumm;
    @XmlElement(name = "VATDiscountPercent")
    protected BigDecimal vatDiscountPercent;
    @XmlElement(name = "CostVATSumm")
    protected BigDecimal costVATSumm;
    @XmlElement(name = "CostVATPrice")
    protected BigDecimal costVATPrice;
    @XmlElement(name = "SaleVATSumm")
    protected BigDecimal saleVATSumm;
    @XmlElement(name = "DiscountVATSumm")
    protected BigDecimal discountVATSumm;
    @XmlElement(name = "CurSumm")
    protected BigDecimal curSumm;
    @XmlElement(name = "CurrCostPrice")
    protected BigDecimal currCostPrice;
    @XmlElement(name = "SaleCurPrice")
    protected BigDecimal saleCurPrice;
    @XmlElement(name = "SaleCurSumm")
    protected BigDecimal saleCurSumm;
    @XmlElement(name = "CurProfit")
    protected BigDecimal curProfit;
    @XmlElement(name = "CurProfitPercentBySale")
    protected BigDecimal curProfitPercentBySale;
    @XmlElement(name = "CurProfitPercentByCost")
    protected BigDecimal curProfitPercentByCost;
    @XmlElement(name = "DiscountCurSum")
    protected BigDecimal discountCurSum;
    @XmlElement(name = "DiscountCurPercent")
    protected BigDecimal discountCurPercent;
    @XmlElement(name = "UsedBonus")
    protected BigDecimal usedBonus;
    @XmlElement(name = "AccumulatedBonus")
    protected BigDecimal accumulatedBonus;
    @XmlElementRef(name = "Group", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> group;
    @XmlElementRef(name = "SalesConsultantCode", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> salesConsultantCode;
    @XmlElementRef(name = "SalesConsultantCaption", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> salesConsultantCaption;
    @XmlElementRef(name = "Comment", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> comment;
    @XmlElementRef(name = "IncomeDate", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> incomeDate;
    @XmlElement(name = "PartyPartID")
    protected Integer partyPartID;
    @XmlElementRef(name = "PartyPartCaption", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> partyPartCaption;
    @XmlElementRef(name = "PartyPartTaxCode", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> partyPartTaxCode;
    @XmlElementRef(name = "PartyContractCaption", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> partyContractCaption;
    @XmlElementRef(name = "PartyDocNum", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> partyDocNum;
    @XmlElementRef(name = "PartyDocType", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> partyDocType;
    @XmlElementRef(name = "PartyDocUsableDate", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> partyDocUsableDate;
    @XmlElementRef(name = "PartyDocCountry", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> partyDocCountry;
    @XmlElementRef(name = "PartyDocProducer", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> partyDocProducer;
    @XmlElementRef(name = "PartyDocPropertyType1", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> partyDocPropertyType1;
    @XmlElementRef(name = "PartyDocPropertyValue1", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> partyDocPropertyValue1;
    @XmlElementRef(name = "PartyDocPropertyType2", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> partyDocPropertyType2;
    @XmlElementRef(name = "PartyDocPropertyValue2", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> partyDocPropertyValue2;

    /**
     * Gets the value of the docDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocDate() {
        return docDate;
    }

    /**
     * Sets the value of the docDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocDate(XMLGregorianCalendar value) {
        this.docDate = value;
    }

    /**
     * Gets the value of the docISN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocISN() {
        return docISN;
    }

    /**
     * Sets the value of the docISN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocISN(String value) {
        this.docISN = value;
    }

    /**
     * Gets the value of the docNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNum() {
        return docNum;
    }

    /**
     * Sets the value of the docNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNum(String value) {
        this.docNum = value;
    }

    /**
     * Gets the value of the docType property.
     * 
     */
    public short getDocType() {
        return docType;
    }

    /**
     * Sets the value of the docType property.
     * 
     */
    public void setDocType(short value) {
        this.docType = value;
    }

    /**
     * Gets the value of the docCurrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocCurrCode() {
        return docCurrCode;
    }

    /**
     * Sets the value of the docCurrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocCurrCode(String value) {
        this.docCurrCode = value;
    }

    /**
     * Gets the value of the contract property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContract() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContract(JAXBElement<String> value) {
        this.contract = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rowID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRowID() {
        return rowID;
    }

    /**
     * Sets the value of the rowID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRowID(Integer value) {
        this.rowID = value;
    }

    /**
     * Gets the value of the docVATType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocVATType() {
        return docVATType;
    }

    /**
     * Sets the value of the docVATType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocVATType(JAXBElement<String> value) {
        this.docVATType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the docVATTypeCaption property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocVATTypeCaption() {
        return docVATTypeCaption;
    }

    /**
     * Sets the value of the docVATTypeCaption property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocVATTypeCaption(JAXBElement<String> value) {
        this.docVATTypeCaption = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ecrCheckNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getECRCheckNum() {
        return ecrCheckNum;
    }

    /**
     * Sets the value of the ecrCheckNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setECRCheckNum(JAXBElement<String> value) {
        this.ecrCheckNum = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the opName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpName() {
        return opName;
    }

    /**
     * Sets the value of the opName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpName(String value) {
        this.opName = value;
    }

    /**
     * Gets the value of the itemTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemTypeCode() {
        return itemTypeCode;
    }

    /**
     * Sets the value of the itemTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemTypeCode(String value) {
        this.itemTypeCode = value;
    }

    /**
     * Gets the value of the itemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemType() {
        return itemType;
    }

    /**
     * Sets the value of the itemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemType(String value) {
        this.itemType = value;
    }

    /**
     * Gets the value of the goodID property.
     * 
     */
    public int getGoodID() {
        return goodID;
    }

    /**
     * Sets the value of the goodID property.
     * 
     */
    public void setGoodID(int value) {
        this.goodID = value;
    }

    /**
     * Gets the value of the goodCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodCode() {
        return goodCode;
    }

    /**
     * Sets the value of the goodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodCode(String value) {
        this.goodCode = value;
    }

    /**
     * Gets the value of the goodCaption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodCaption() {
        return goodCaption;
    }

    /**
     * Sets the value of the goodCaption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodCaption(String value) {
        this.goodCaption = value;
    }

    /**
     * Gets the value of the goodDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGoodDescription() {
        return goodDescription;
    }

    /**
     * Sets the value of the goodDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGoodDescription(JAXBElement<String> value) {
        this.goodDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the unitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCode() {
        return unitCode;
    }

    /**
     * Sets the value of the unitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitCode(String value) {
        this.unitCode = value;
    }

    /**
     * Gets the value of the unitBrief property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitBrief() {
        return unitBrief;
    }

    /**
     * Sets the value of the unitBrief property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitBrief(String value) {
        this.unitBrief = value;
    }

    /**
     * Gets the value of the storage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStorage() {
        return storage;
    }

    /**
     * Sets the value of the storage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStorage(JAXBElement<String> value) {
        this.storage = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the storageCaption property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStorageCaption() {
        return storageCaption;
    }

    /**
     * Sets the value of the storageCaption property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStorageCaption(JAXBElement<String> value) {
        this.storageCaption = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cashDesk property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCashDesk() {
        return cashDesk;
    }

    /**
     * Sets the value of the cashDesk property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCashDesk(JAXBElement<String> value) {
        this.cashDesk = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cashDeskCaption property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCashDeskCaption() {
        return cashDeskCaption;
    }

    /**
     * Sets the value of the cashDeskCaption property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCashDeskCaption(JAXBElement<String> value) {
        this.cashDeskCaption = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partnerID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPartnerID() {
        return partnerID;
    }

    /**
     * Sets the value of the partnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPartnerID(Integer value) {
        this.partnerID = value;
    }

    /**
     * Gets the value of the partnerCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartnerCode() {
        return partnerCode;
    }

    /**
     * Sets the value of the partnerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartnerCode(JAXBElement<String> value) {
        this.partnerCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partnerCaption property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartnerCaption() {
        return partnerCaption;
    }

    /**
     * Sets the value of the partnerCaption property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartnerCaption(JAXBElement<String> value) {
        this.partnerCaption = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantity(BigDecimal value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the summ property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSumm() {
        return summ;
    }

    /**
     * Sets the value of the summ property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSumm(BigDecimal value) {
        this.summ = value;
    }

    /**
     * Gets the value of the costPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCostPrice() {
        return costPrice;
    }

    /**
     * Sets the value of the costPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCostPrice(BigDecimal value) {
        this.costPrice = value;
    }

    /**
     * Gets the value of the salePrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalePrice() {
        return salePrice;
    }

    /**
     * Sets the value of the salePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalePrice(BigDecimal value) {
        this.salePrice = value;
    }

    /**
     * Gets the value of the saleSumm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaleSumm() {
        return saleSumm;
    }

    /**
     * Sets the value of the saleSumm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaleSumm(BigDecimal value) {
        this.saleSumm = value;
    }

    /**
     * Gets the value of the profit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProfit() {
        return profit;
    }

    /**
     * Sets the value of the profit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProfit(BigDecimal value) {
        this.profit = value;
    }

    /**
     * Gets the value of the profitPercentBySale property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProfitPercentBySale() {
        return profitPercentBySale;
    }

    /**
     * Sets the value of the profitPercentBySale property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProfitPercentBySale(BigDecimal value) {
        this.profitPercentBySale = value;
    }

    /**
     * Gets the value of the profitPercentByCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProfitPercentByCost() {
        return profitPercentByCost;
    }

    /**
     * Sets the value of the profitPercentByCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProfitPercentByCost(BigDecimal value) {
        this.profitPercentByCost = value;
    }

    /**
     * Gets the value of the discountSum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountSum() {
        return discountSum;
    }

    /**
     * Sets the value of the discountSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountSum(BigDecimal value) {
        this.discountSum = value;
    }

    /**
     * Gets the value of the discountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Sets the value of the discountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountPercent(BigDecimal value) {
        this.discountPercent = value;
    }

    /**
     * Gets the value of the vatSumm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVATSumm() {
        return vatSumm;
    }

    /**
     * Sets the value of the vatSumm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVATSumm(BigDecimal value) {
        this.vatSumm = value;
    }

    /**
     * Gets the value of the vatCostPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVATCostPrice() {
        return vatCostPrice;
    }

    /**
     * Sets the value of the vatCostPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVATCostPrice(BigDecimal value) {
        this.vatCostPrice = value;
    }

    /**
     * Gets the value of the vatSalePrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVATSalePrice() {
        return vatSalePrice;
    }

    /**
     * Sets the value of the vatSalePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVATSalePrice(BigDecimal value) {
        this.vatSalePrice = value;
    }

    /**
     * Gets the value of the vatSaleSumm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVATSaleSumm() {
        return vatSaleSumm;
    }

    /**
     * Sets the value of the vatSaleSumm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVATSaleSumm(BigDecimal value) {
        this.vatSaleSumm = value;
    }

    /**
     * Gets the value of the vatProfit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVATProfit() {
        return vatProfit;
    }

    /**
     * Sets the value of the vatProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVATProfit(BigDecimal value) {
        this.vatProfit = value;
    }

    /**
     * Gets the value of the vatProfitPercentBySale property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVATProfitPercentBySale() {
        return vatProfitPercentBySale;
    }

    /**
     * Sets the value of the vatProfitPercentBySale property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVATProfitPercentBySale(BigDecimal value) {
        this.vatProfitPercentBySale = value;
    }

    /**
     * Gets the value of the vatProfitPercentByCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVATProfitPercentByCost() {
        return vatProfitPercentByCost;
    }

    /**
     * Sets the value of the vatProfitPercentByCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVATProfitPercentByCost(BigDecimal value) {
        this.vatProfitPercentByCost = value;
    }

    /**
     * Gets the value of the vatDiscountSumm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVATDiscountSumm() {
        return vatDiscountSumm;
    }

    /**
     * Sets the value of the vatDiscountSumm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVATDiscountSumm(BigDecimal value) {
        this.vatDiscountSumm = value;
    }

    /**
     * Gets the value of the vatDiscountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVATDiscountPercent() {
        return vatDiscountPercent;
    }

    /**
     * Sets the value of the vatDiscountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVATDiscountPercent(BigDecimal value) {
        this.vatDiscountPercent = value;
    }

    /**
     * Gets the value of the costVATSumm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCostVATSumm() {
        return costVATSumm;
    }

    /**
     * Sets the value of the costVATSumm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCostVATSumm(BigDecimal value) {
        this.costVATSumm = value;
    }

    /**
     * Gets the value of the costVATPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCostVATPrice() {
        return costVATPrice;
    }

    /**
     * Sets the value of the costVATPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCostVATPrice(BigDecimal value) {
        this.costVATPrice = value;
    }

    /**
     * Gets the value of the saleVATSumm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaleVATSumm() {
        return saleVATSumm;
    }

    /**
     * Sets the value of the saleVATSumm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaleVATSumm(BigDecimal value) {
        this.saleVATSumm = value;
    }

    /**
     * Gets the value of the discountVATSumm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountVATSumm() {
        return discountVATSumm;
    }

    /**
     * Sets the value of the discountVATSumm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountVATSumm(BigDecimal value) {
        this.discountVATSumm = value;
    }

    /**
     * Gets the value of the curSumm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurSumm() {
        return curSumm;
    }

    /**
     * Sets the value of the curSumm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurSumm(BigDecimal value) {
        this.curSumm = value;
    }

    /**
     * Gets the value of the currCostPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrCostPrice() {
        return currCostPrice;
    }

    /**
     * Sets the value of the currCostPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrCostPrice(BigDecimal value) {
        this.currCostPrice = value;
    }

    /**
     * Gets the value of the saleCurPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaleCurPrice() {
        return saleCurPrice;
    }

    /**
     * Sets the value of the saleCurPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaleCurPrice(BigDecimal value) {
        this.saleCurPrice = value;
    }

    /**
     * Gets the value of the saleCurSumm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaleCurSumm() {
        return saleCurSumm;
    }

    /**
     * Sets the value of the saleCurSumm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaleCurSumm(BigDecimal value) {
        this.saleCurSumm = value;
    }

    /**
     * Gets the value of the curProfit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurProfit() {
        return curProfit;
    }

    /**
     * Sets the value of the curProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurProfit(BigDecimal value) {
        this.curProfit = value;
    }

    /**
     * Gets the value of the curProfitPercentBySale property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurProfitPercentBySale() {
        return curProfitPercentBySale;
    }

    /**
     * Sets the value of the curProfitPercentBySale property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurProfitPercentBySale(BigDecimal value) {
        this.curProfitPercentBySale = value;
    }

    /**
     * Gets the value of the curProfitPercentByCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurProfitPercentByCost() {
        return curProfitPercentByCost;
    }

    /**
     * Sets the value of the curProfitPercentByCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurProfitPercentByCost(BigDecimal value) {
        this.curProfitPercentByCost = value;
    }

    /**
     * Gets the value of the discountCurSum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountCurSum() {
        return discountCurSum;
    }

    /**
     * Sets the value of the discountCurSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountCurSum(BigDecimal value) {
        this.discountCurSum = value;
    }

    /**
     * Gets the value of the discountCurPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountCurPercent() {
        return discountCurPercent;
    }

    /**
     * Sets the value of the discountCurPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountCurPercent(BigDecimal value) {
        this.discountCurPercent = value;
    }

    /**
     * Gets the value of the usedBonus property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUsedBonus() {
        return usedBonus;
    }

    /**
     * Sets the value of the usedBonus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUsedBonus(BigDecimal value) {
        this.usedBonus = value;
    }

    /**
     * Gets the value of the accumulatedBonus property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAccumulatedBonus() {
        return accumulatedBonus;
    }

    /**
     * Sets the value of the accumulatedBonus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAccumulatedBonus(BigDecimal value) {
        this.accumulatedBonus = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGroup(JAXBElement<String> value) {
        this.group = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the salesConsultantCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesConsultantCode() {
        return salesConsultantCode;
    }

    /**
     * Sets the value of the salesConsultantCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesConsultantCode(JAXBElement<String> value) {
        this.salesConsultantCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the salesConsultantCaption property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesConsultantCaption() {
        return salesConsultantCaption;
    }

    /**
     * Sets the value of the salesConsultantCaption property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesConsultantCaption(JAXBElement<String> value) {
        this.salesConsultantCaption = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComment(JAXBElement<String> value) {
        this.comment = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the incomeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getIncomeDate() {
        return incomeDate;
    }

    /**
     * Sets the value of the incomeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setIncomeDate(JAXBElement<XMLGregorianCalendar> value) {
        this.incomeDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the partyPartID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPartyPartID() {
        return partyPartID;
    }

    /**
     * Sets the value of the partyPartID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPartyPartID(Integer value) {
        this.partyPartID = value;
    }

    /**
     * Gets the value of the partyPartCaption property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyPartCaption() {
        return partyPartCaption;
    }

    /**
     * Sets the value of the partyPartCaption property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyPartCaption(JAXBElement<String> value) {
        this.partyPartCaption = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partyPartTaxCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyPartTaxCode() {
        return partyPartTaxCode;
    }

    /**
     * Sets the value of the partyPartTaxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyPartTaxCode(JAXBElement<String> value) {
        this.partyPartTaxCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partyContractCaption property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyContractCaption() {
        return partyContractCaption;
    }

    /**
     * Sets the value of the partyContractCaption property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyContractCaption(JAXBElement<String> value) {
        this.partyContractCaption = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partyDocNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyDocNum() {
        return partyDocNum;
    }

    /**
     * Sets the value of the partyDocNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyDocNum(JAXBElement<String> value) {
        this.partyDocNum = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partyDocType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyDocType() {
        return partyDocType;
    }

    /**
     * Sets the value of the partyDocType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyDocType(JAXBElement<String> value) {
        this.partyDocType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partyDocUsableDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPartyDocUsableDate() {
        return partyDocUsableDate;
    }

    /**
     * Sets the value of the partyDocUsableDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPartyDocUsableDate(JAXBElement<XMLGregorianCalendar> value) {
        this.partyDocUsableDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the partyDocCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyDocCountry() {
        return partyDocCountry;
    }

    /**
     * Sets the value of the partyDocCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyDocCountry(JAXBElement<String> value) {
        this.partyDocCountry = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partyDocProducer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyDocProducer() {
        return partyDocProducer;
    }

    /**
     * Sets the value of the partyDocProducer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyDocProducer(JAXBElement<String> value) {
        this.partyDocProducer = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partyDocPropertyType1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyDocPropertyType1() {
        return partyDocPropertyType1;
    }

    /**
     * Sets the value of the partyDocPropertyType1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyDocPropertyType1(JAXBElement<String> value) {
        this.partyDocPropertyType1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partyDocPropertyValue1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyDocPropertyValue1() {
        return partyDocPropertyValue1;
    }

    /**
     * Sets the value of the partyDocPropertyValue1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyDocPropertyValue1(JAXBElement<String> value) {
        this.partyDocPropertyValue1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partyDocPropertyType2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyDocPropertyType2() {
        return partyDocPropertyType2;
    }

    /**
     * Sets the value of the partyDocPropertyType2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyDocPropertyType2(JAXBElement<String> value) {
        this.partyDocPropertyType2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partyDocPropertyValue2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyDocPropertyValue2() {
        return partyDocPropertyValue2;
    }

    /**
     * Sets the value of the partyDocPropertyValue2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyDocPropertyValue2(JAXBElement<String> value) {
        this.partyDocPropertyValue2 = ((JAXBElement<String> ) value);
    }

}
