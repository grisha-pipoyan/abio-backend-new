
package com.brutus.abio.armsoft.wsdl._6;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;


/**
 * <p>Java class for CreateInvoiceDocInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateInvoiceDocInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DocumentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="BuyerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartnerAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SupplierBookNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupplierBookPage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SupplierBookRow" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TaxExportType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxInvoiceSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxInvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxInvoiceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SalesConsultant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupplierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupplierLegalAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupplierBusinessAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupplierSettlementAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupplierTaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupplierManagerPost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupplierManagerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupplierChiefAccountantPost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupplierChiefAccountantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuyerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuyerLegalAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuyerBusinessAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuyerSettlementAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuyerTaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuyerManagerPost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuyerManagerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuyerChiefAccountantPost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuyerChiefAccountantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuyerStateRegisterNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuyerPassportNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CurrencyExchangeRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CurrencyExchangeBase" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="VATType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PricesTypes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Storage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="AmountVAT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaseISN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Specification" type="{http://www.armsoft.am/Accountant/6.0}ArrayOfInvoiceSpecificationRow" minOccurs="0"/>
 *         &lt;element name="IsDraft" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExtBody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupplierAdditionalData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuyerAdditionalData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuyerShippingMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ByWhomFIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CredentialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CredentialDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateInvoiceDocInfo", propOrder = {
    "documentNumber",
    "documentDate",
    "buyerCode",
    "contract",
    "partnerAmount",
    "supplierBookNumber",
    "supplierBookPage",
    "supplierBookRow",
    "taxExportType",
    "taxInvoiceSeries",
    "taxInvoiceNumber",
    "taxInvoiceDate",
    "salesConsultant",
    "comment",
    "priceType",
    "supplierName",
    "supplierLegalAddress",
    "supplierBusinessAddress",
    "supplierSettlementAccount",
    "supplierTaxCode",
    "supplierManagerPost",
    "supplierManagerName",
    "supplierChiefAccountantPost",
    "supplierChiefAccountantName",
    "buyerName",
    "buyerLegalAddress",
    "buyerBusinessAddress",
    "buyerSettlementAccount",
    "buyerTaxCode",
    "buyerManagerPost",
    "buyerManagerName",
    "buyerChiefAccountantPost",
    "buyerChiefAccountantName",
    "buyerStateRegisterNumber",
    "buyerPassportNumber",
    "currencyCode",
    "currencyExchangeRate",
    "currencyExchangeBase",
    "vatType",
    "pricesTypes",
    "storage",
    "discountPercent",
    "totalAmount",
    "amountVAT",
    "owner",
    "isn",
    "baseISN",
    "specification",
    "isDraft",
    "isDeleted",
    "extBody",
    "supplierAdditionalData",
    "buyerAdditionalData",
    "buyerShippingMethod",
    "byWhomFIO",
    "credentialNumber",
    "credentialDate"
})
public class CreateInvoiceDocInfo {

    @XmlElement(name = "DocumentNumber", required = true, nillable = true)
    protected String documentNumber;
    @XmlElement(name = "DocumentDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar documentDate;
    @XmlElementRef(name = "BuyerCode", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> buyerCode;
    @XmlElementRef(name = "Contract", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> contract;
    @XmlElement(name = "PartnerAmount")
    protected BigDecimal partnerAmount;
    @XmlElementRef(name = "SupplierBookNumber", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> supplierBookNumber;
    @XmlElement(name = "SupplierBookPage")
    protected Integer supplierBookPage;
    @XmlElement(name = "SupplierBookRow")
    protected Integer supplierBookRow;
    @XmlElementRef(name = "TaxExportType", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> taxExportType;
    @XmlElementRef(name = "TaxInvoiceSeries", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> taxInvoiceSeries;
    @XmlElementRef(name = "TaxInvoiceNumber", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> taxInvoiceNumber;
    @XmlElementRef(name = "TaxInvoiceDate", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> taxInvoiceDate;
    @XmlElementRef(name = "SalesConsultant", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> salesConsultant;
    @XmlElementRef(name = "Comment", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> comment;
    @XmlElementRef(name = "PriceType", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> priceType;
    @XmlElementRef(name = "SupplierName", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> supplierName;
    @XmlElementRef(name = "SupplierLegalAddress", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> supplierLegalAddress;
    @XmlElementRef(name = "SupplierBusinessAddress", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> supplierBusinessAddress;
    @XmlElementRef(name = "SupplierSettlementAccount", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> supplierSettlementAccount;
    @XmlElementRef(name = "SupplierTaxCode", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> supplierTaxCode;
    @XmlElementRef(name = "SupplierManagerPost", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> supplierManagerPost;
    @XmlElementRef(name = "SupplierManagerName", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> supplierManagerName;
    @XmlElementRef(name = "SupplierChiefAccountantPost", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> supplierChiefAccountantPost;
    @XmlElementRef(name = "SupplierChiefAccountantName", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> supplierChiefAccountantName;
    @XmlElementRef(name = "BuyerName", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> buyerName;
    @XmlElementRef(name = "BuyerLegalAddress", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> buyerLegalAddress;
    @XmlElementRef(name = "BuyerBusinessAddress", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> buyerBusinessAddress;
    @XmlElementRef(name = "BuyerSettlementAccount", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> buyerSettlementAccount;
    @XmlElementRef(name = "BuyerTaxCode", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> buyerTaxCode;
    @XmlElementRef(name = "BuyerManagerPost", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> buyerManagerPost;
    @XmlElementRef(name = "BuyerManagerName", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> buyerManagerName;
    @XmlElementRef(name = "BuyerChiefAccountantPost", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> buyerChiefAccountantPost;
    @XmlElementRef(name = "BuyerChiefAccountantName", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> buyerChiefAccountantName;
    @XmlElementRef(name = "BuyerStateRegisterNumber", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> buyerStateRegisterNumber;
    @XmlElementRef(name = "BuyerPassportNumber", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> buyerPassportNumber;
    @XmlElement(name = "CurrencyCode", required = true, nillable = true)
    protected String currencyCode;
    @XmlElement(name = "CurrencyExchangeRate", required = true)
    protected BigDecimal currencyExchangeRate;
    @XmlElement(name = "CurrencyExchangeBase", required = true)
    protected BigDecimal currencyExchangeBase;
    @XmlElement(name = "VATType", required = true, nillable = true)
    protected String vatType;
    @XmlElementRef(name = "PricesTypes", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> pricesTypes;
    @XmlElementRef(name = "Storage", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> storage;
    @XmlElement(name = "DiscountPercent")
    protected BigDecimal discountPercent;
    @XmlElement(name = "TotalAmount", required = true)
    protected BigDecimal totalAmount;
    @XmlElement(name = "AmountVAT")
    protected BigDecimal amountVAT;
    @XmlElementRef(name = "Owner", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> owner;
    @XmlElementRef(name = "ISN", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> isn;
    @XmlElementRef(name = "BaseISN", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> baseISN;
    @XmlElementRef(name = "Specification", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ArrayOfInvoiceSpecificationRow> specification;
    @XmlElement(name = "IsDraft")
    protected Boolean isDraft;
    @XmlElement(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlElementRef(name = "ExtBody", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> extBody;
    @XmlElementRef(name = "SupplierAdditionalData", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> supplierAdditionalData;
    @XmlElementRef(name = "BuyerAdditionalData", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> buyerAdditionalData;
    @XmlElementRef(name = "BuyerShippingMethod", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> buyerShippingMethod;
    @XmlElementRef(name = "ByWhomFIO", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> byWhomFIO;
    @XmlElementRef(name = "CredentialNumber", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> credentialNumber;
    @XmlElementRef(name = "CredentialDate", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> credentialDate;

    /**
     * Gets the value of the documentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Sets the value of the documentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumber(String value) {
        this.documentNumber = value;
    }

    /**
     * Gets the value of the documentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentDate() {
        return documentDate;
    }

    /**
     * Sets the value of the documentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocumentDate(XMLGregorianCalendar value) {
        this.documentDate = value;
    }

    /**
     * Gets the value of the buyerCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuyerCode() {
        return buyerCode;
    }

    /**
     * Sets the value of the buyerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuyerCode(JAXBElement<String> value) {
        this.buyerCode = ((JAXBElement<String> ) value);
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
     * Gets the value of the partnerAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPartnerAmount() {
        return partnerAmount;
    }

    /**
     * Sets the value of the partnerAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartnerAmount(BigDecimal value) {
        this.partnerAmount = value;
    }

    /**
     * Gets the value of the supplierBookNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSupplierBookNumber() {
        return supplierBookNumber;
    }

    /**
     * Sets the value of the supplierBookNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSupplierBookNumber(JAXBElement<String> value) {
        this.supplierBookNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the supplierBookPage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSupplierBookPage() {
        return supplierBookPage;
    }

    /**
     * Sets the value of the supplierBookPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSupplierBookPage(Integer value) {
        this.supplierBookPage = value;
    }

    /**
     * Gets the value of the supplierBookRow property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSupplierBookRow() {
        return supplierBookRow;
    }

    /**
     * Sets the value of the supplierBookRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSupplierBookRow(Integer value) {
        this.supplierBookRow = value;
    }

    /**
     * Gets the value of the taxExportType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxExportType() {
        return taxExportType;
    }

    /**
     * Sets the value of the taxExportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxExportType(JAXBElement<String> value) {
        this.taxExportType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the taxInvoiceSeries property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxInvoiceSeries() {
        return taxInvoiceSeries;
    }

    /**
     * Sets the value of the taxInvoiceSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxInvoiceSeries(JAXBElement<String> value) {
        this.taxInvoiceSeries = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the taxInvoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxInvoiceNumber() {
        return taxInvoiceNumber;
    }

    /**
     * Sets the value of the taxInvoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxInvoiceNumber(JAXBElement<String> value) {
        this.taxInvoiceNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the taxInvoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTaxInvoiceDate() {
        return taxInvoiceDate;
    }

    /**
     * Sets the value of the taxInvoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTaxInvoiceDate(JAXBElement<XMLGregorianCalendar> value) {
        this.taxInvoiceDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the salesConsultant property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesConsultant() {
        return salesConsultant;
    }

    /**
     * Sets the value of the salesConsultant property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesConsultant(JAXBElement<String> value) {
        this.salesConsultant = ((JAXBElement<String> ) value);
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
     * Gets the value of the priceType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPriceType() {
        return priceType;
    }

    /**
     * Sets the value of the priceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPriceType(JAXBElement<String> value) {
        this.priceType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the supplierName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSupplierName() {
        return supplierName;
    }

    /**
     * Sets the value of the supplierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSupplierName(JAXBElement<String> value) {
        this.supplierName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the supplierLegalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSupplierLegalAddress() {
        return supplierLegalAddress;
    }

    /**
     * Sets the value of the supplierLegalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSupplierLegalAddress(JAXBElement<String> value) {
        this.supplierLegalAddress = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the supplierBusinessAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSupplierBusinessAddress() {
        return supplierBusinessAddress;
    }

    /**
     * Sets the value of the supplierBusinessAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSupplierBusinessAddress(JAXBElement<String> value) {
        this.supplierBusinessAddress = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the supplierSettlementAccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSupplierSettlementAccount() {
        return supplierSettlementAccount;
    }

    /**
     * Sets the value of the supplierSettlementAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSupplierSettlementAccount(JAXBElement<String> value) {
        this.supplierSettlementAccount = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the supplierTaxCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSupplierTaxCode() {
        return supplierTaxCode;
    }

    /**
     * Sets the value of the supplierTaxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSupplierTaxCode(JAXBElement<String> value) {
        this.supplierTaxCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the supplierManagerPost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSupplierManagerPost() {
        return supplierManagerPost;
    }

    /**
     * Sets the value of the supplierManagerPost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSupplierManagerPost(JAXBElement<String> value) {
        this.supplierManagerPost = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the supplierManagerName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSupplierManagerName() {
        return supplierManagerName;
    }

    /**
     * Sets the value of the supplierManagerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSupplierManagerName(JAXBElement<String> value) {
        this.supplierManagerName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the supplierChiefAccountantPost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSupplierChiefAccountantPost() {
        return supplierChiefAccountantPost;
    }

    /**
     * Sets the value of the supplierChiefAccountantPost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSupplierChiefAccountantPost(JAXBElement<String> value) {
        this.supplierChiefAccountantPost = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the supplierChiefAccountantName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSupplierChiefAccountantName() {
        return supplierChiefAccountantName;
    }

    /**
     * Sets the value of the supplierChiefAccountantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSupplierChiefAccountantName(JAXBElement<String> value) {
        this.supplierChiefAccountantName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the buyerName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuyerName() {
        return buyerName;
    }

    /**
     * Sets the value of the buyerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuyerName(JAXBElement<String> value) {
        this.buyerName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the buyerLegalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuyerLegalAddress() {
        return buyerLegalAddress;
    }

    /**
     * Sets the value of the buyerLegalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuyerLegalAddress(JAXBElement<String> value) {
        this.buyerLegalAddress = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the buyerBusinessAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuyerBusinessAddress() {
        return buyerBusinessAddress;
    }

    /**
     * Sets the value of the buyerBusinessAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuyerBusinessAddress(JAXBElement<String> value) {
        this.buyerBusinessAddress = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the buyerSettlementAccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuyerSettlementAccount() {
        return buyerSettlementAccount;
    }

    /**
     * Sets the value of the buyerSettlementAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuyerSettlementAccount(JAXBElement<String> value) {
        this.buyerSettlementAccount = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the buyerTaxCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuyerTaxCode() {
        return buyerTaxCode;
    }

    /**
     * Sets the value of the buyerTaxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuyerTaxCode(JAXBElement<String> value) {
        this.buyerTaxCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the buyerManagerPost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuyerManagerPost() {
        return buyerManagerPost;
    }

    /**
     * Sets the value of the buyerManagerPost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuyerManagerPost(JAXBElement<String> value) {
        this.buyerManagerPost = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the buyerManagerName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuyerManagerName() {
        return buyerManagerName;
    }

    /**
     * Sets the value of the buyerManagerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuyerManagerName(JAXBElement<String> value) {
        this.buyerManagerName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the buyerChiefAccountantPost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuyerChiefAccountantPost() {
        return buyerChiefAccountantPost;
    }

    /**
     * Sets the value of the buyerChiefAccountantPost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuyerChiefAccountantPost(JAXBElement<String> value) {
        this.buyerChiefAccountantPost = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the buyerChiefAccountantName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuyerChiefAccountantName() {
        return buyerChiefAccountantName;
    }

    /**
     * Sets the value of the buyerChiefAccountantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuyerChiefAccountantName(JAXBElement<String> value) {
        this.buyerChiefAccountantName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the buyerStateRegisterNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuyerStateRegisterNumber() {
        return buyerStateRegisterNumber;
    }

    /**
     * Sets the value of the buyerStateRegisterNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuyerStateRegisterNumber(JAXBElement<String> value) {
        this.buyerStateRegisterNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the buyerPassportNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuyerPassportNumber() {
        return buyerPassportNumber;
    }

    /**
     * Sets the value of the buyerPassportNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuyerPassportNumber(JAXBElement<String> value) {
        this.buyerPassportNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the currencyExchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrencyExchangeRate() {
        return currencyExchangeRate;
    }

    /**
     * Sets the value of the currencyExchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrencyExchangeRate(BigDecimal value) {
        this.currencyExchangeRate = value;
    }

    /**
     * Gets the value of the currencyExchangeBase property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrencyExchangeBase() {
        return currencyExchangeBase;
    }

    /**
     * Sets the value of the currencyExchangeBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrencyExchangeBase(BigDecimal value) {
        this.currencyExchangeBase = value;
    }

    /**
     * Gets the value of the vatType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVATType() {
        return vatType;
    }

    /**
     * Sets the value of the vatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVATType(String value) {
        this.vatType = value;
    }

    /**
     * Gets the value of the pricesTypes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPricesTypes() {
        return pricesTypes;
    }

    /**
     * Sets the value of the pricesTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPricesTypes(JAXBElement<String> value) {
        this.pricesTypes = ((JAXBElement<String> ) value);
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
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmount(BigDecimal value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the amountVAT property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountVAT() {
        return amountVAT;
    }

    /**
     * Sets the value of the amountVAT property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountVAT(BigDecimal value) {
        this.amountVAT = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwner(JAXBElement<String> value) {
        this.owner = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the isn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getISN() {
        return isn;
    }

    /**
     * Sets the value of the isn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setISN(JAXBElement<String> value) {
        this.isn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the baseISN property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBaseISN() {
        return baseISN;
    }

    /**
     * Sets the value of the baseISN property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBaseISN(JAXBElement<String> value) {
        this.baseISN = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the specification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInvoiceSpecificationRow }{@code >}
     *     
     */
    public JAXBElement<ArrayOfInvoiceSpecificationRow> getSpecification() {
        return specification;
    }

    /**
     * Sets the value of the specification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInvoiceSpecificationRow }{@code >}
     *     
     */
    public void setSpecification(JAXBElement<ArrayOfInvoiceSpecificationRow> value) {
        this.specification = ((JAXBElement<ArrayOfInvoiceSpecificationRow> ) value);
    }

    /**
     * Gets the value of the isDraft property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDraft() {
        return isDraft;
    }

    /**
     * Sets the value of the isDraft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDraft(Boolean value) {
        this.isDraft = value;
    }

    /**
     * Gets the value of the isDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeleted() {
        return isDeleted;
    }

    /**
     * Sets the value of the isDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeleted(Boolean value) {
        this.isDeleted = value;
    }

    /**
     * Gets the value of the extBody property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExtBody() {
        return extBody;
    }

    /**
     * Sets the value of the extBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExtBody(JAXBElement<String> value) {
        this.extBody = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the supplierAdditionalData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSupplierAdditionalData() {
        return supplierAdditionalData;
    }

    /**
     * Sets the value of the supplierAdditionalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSupplierAdditionalData(JAXBElement<String> value) {
        this.supplierAdditionalData = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the buyerAdditionalData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuyerAdditionalData() {
        return buyerAdditionalData;
    }

    /**
     * Sets the value of the buyerAdditionalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuyerAdditionalData(JAXBElement<String> value) {
        this.buyerAdditionalData = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the buyerShippingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuyerShippingMethod() {
        return buyerShippingMethod;
    }

    /**
     * Sets the value of the buyerShippingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuyerShippingMethod(JAXBElement<String> value) {
        this.buyerShippingMethod = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the byWhomFIO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getByWhomFIO() {
        return byWhomFIO;
    }

    /**
     * Sets the value of the byWhomFIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setByWhomFIO(JAXBElement<String> value) {
        this.byWhomFIO = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the credentialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCredentialNumber() {
        return credentialNumber;
    }

    /**
     * Sets the value of the credentialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCredentialNumber(JAXBElement<String> value) {
        this.credentialNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the credentialDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCredentialDate() {
        return credentialDate;
    }

    /**
     * Sets the value of the credentialDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCredentialDate(JAXBElement<XMLGregorianCalendar> value) {
        this.credentialDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

}
