
package com.brutus.abio.armsoft.wsdl._6;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;


/**
 * <p>Java class for MTReturnFromCustomerDocInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MTReturnFromCustomerDocInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CurrencyExchangeRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CurrencyExchangeBase" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="VATType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PriceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Storage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartnerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartnerAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SalesConsultant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaseISN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Trust" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mediator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Machine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChiefAccountant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Allower" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Response" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Specification" type="{http://www.armsoft.am/Accountant/6.0}ArrayOfMTReturnFromCustomerSpecificationRow" minOccurs="0"/>
 *         &lt;element name="ECRBaseCheckNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ECRReturnCheckNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ECRCheckNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ECRReturnByCardSum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ECRReturnByCashSum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TaxExportType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxInvoiceSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxInvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxInvoiceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BaseDocTaxInvoiceSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaseDocTaxInvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaseDocTaxInvoiceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CashDesk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CashierShiftNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MTReturnFromCustomerDocInfo", propOrder = {
    "documentDate",
    "documentNumber",
    "currencyCode",
    "currencyExchangeRate",
    "currencyExchangeBase",
    "vatType",
    "priceType",
    "storage",
    "partnerCode",
    "contract",
    "partnerAmount",
    "salesConsultant",
    "comment",
    "baseISN",
    "trust",
    "mediator",
    "machine",
    "chiefAccountant",
    "allower",
    "response",
    "specification",
    "ecrBaseCheckNumber",
    "ecrReturnCheckNumber",
    "ecrCheckNumber",
    "ecrReturnByCardSum",
    "ecrReturnByCashSum",
    "taxExportType",
    "taxInvoiceSeries",
    "taxInvoiceNumber",
    "taxInvoiceDate",
    "baseDocTaxInvoiceSeries",
    "baseDocTaxInvoiceNumber",
    "baseDocTaxInvoiceDate",
    "cashDesk",
    "cashierShiftNumber",
    "owner",
    "isn"
})
public class MTReturnFromCustomerDocInfo {

    @XmlElement(name = "DocumentDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar documentDate;
    @XmlElement(name = "DocumentNumber", required = true, nillable = true)
    protected String documentNumber;
    @XmlElement(name = "CurrencyCode", required = true, nillable = true)
    protected String currencyCode;
    @XmlElement(name = "CurrencyExchangeRate", required = true)
    protected BigDecimal currencyExchangeRate;
    @XmlElement(name = "CurrencyExchangeBase", required = true)
    protected BigDecimal currencyExchangeBase;
    @XmlElement(name = "VATType", required = true, nillable = true)
    protected String vatType;
    @XmlElementRef(name = "PriceType", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> priceType;
    @XmlElementRef(name = "Storage", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> storage;
    @XmlElementRef(name = "PartnerCode", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> partnerCode;
    @XmlElementRef(name = "Contract", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> contract;
    @XmlElement(name = "PartnerAmount")
    protected BigDecimal partnerAmount;
    @XmlElementRef(name = "SalesConsultant", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> salesConsultant;
    @XmlElementRef(name = "Comment", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> comment;
    @XmlElementRef(name = "BaseISN", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> baseISN;
    @XmlElementRef(name = "Trust", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> trust;
    @XmlElementRef(name = "Mediator", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> mediator;
    @XmlElementRef(name = "Machine", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> machine;
    @XmlElementRef(name = "ChiefAccountant", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> chiefAccountant;
    @XmlElementRef(name = "Allower", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> allower;
    @XmlElementRef(name = "Response", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> response;
    @XmlElementRef(name = "Specification", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ArrayOfMTReturnFromCustomerSpecificationRow> specification;
    @XmlElementRef(name = "ECRBaseCheckNumber", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> ecrBaseCheckNumber;
    @XmlElementRef(name = "ECRReturnCheckNumber", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> ecrReturnCheckNumber;
    @XmlElementRef(name = "ECRCheckNumber", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> ecrCheckNumber;
    @XmlElement(name = "ECRReturnByCardSum")
    protected BigDecimal ecrReturnByCardSum;
    @XmlElement(name = "ECRReturnByCashSum")
    protected BigDecimal ecrReturnByCashSum;
    @XmlElementRef(name = "TaxExportType", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> taxExportType;
    @XmlElementRef(name = "TaxInvoiceSeries", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> taxInvoiceSeries;
    @XmlElementRef(name = "TaxInvoiceNumber", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> taxInvoiceNumber;
    @XmlElementRef(name = "TaxInvoiceDate", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> taxInvoiceDate;
    @XmlElementRef(name = "BaseDocTaxInvoiceSeries", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> baseDocTaxInvoiceSeries;
    @XmlElementRef(name = "BaseDocTaxInvoiceNumber", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> baseDocTaxInvoiceNumber;
    @XmlElementRef(name = "BaseDocTaxInvoiceDate", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> baseDocTaxInvoiceDate;
    @XmlElementRef(name = "CashDesk", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> cashDesk;
    @XmlElementRef(name = "CashierShiftNumber", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> cashierShiftNumber;
    @XmlElementRef(name = "Owner", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> owner;
    @XmlElementRef(name = "ISN", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> isn;

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
     * Gets the value of the trust property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrust() {
        return trust;
    }

    /**
     * Sets the value of the trust property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrust(JAXBElement<String> value) {
        this.trust = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mediator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMediator() {
        return mediator;
    }

    /**
     * Sets the value of the mediator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMediator(JAXBElement<String> value) {
        this.mediator = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the machine property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMachine() {
        return machine;
    }

    /**
     * Sets the value of the machine property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMachine(JAXBElement<String> value) {
        this.machine = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the chiefAccountant property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChiefAccountant() {
        return chiefAccountant;
    }

    /**
     * Sets the value of the chiefAccountant property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChiefAccountant(JAXBElement<String> value) {
        this.chiefAccountant = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the allower property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAllower() {
        return allower;
    }

    /**
     * Sets the value of the allower property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAllower(JAXBElement<String> value) {
        this.allower = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResponse(JAXBElement<String> value) {
        this.response = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the specification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMTReturnFromCustomerSpecificationRow }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMTReturnFromCustomerSpecificationRow> getSpecification() {
        return specification;
    }

    /**
     * Sets the value of the specification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMTReturnFromCustomerSpecificationRow }{@code >}
     *     
     */
    public void setSpecification(JAXBElement<ArrayOfMTReturnFromCustomerSpecificationRow> value) {
        this.specification = ((JAXBElement<ArrayOfMTReturnFromCustomerSpecificationRow> ) value);
    }

    /**
     * Gets the value of the ecrBaseCheckNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getECRBaseCheckNumber() {
        return ecrBaseCheckNumber;
    }

    /**
     * Sets the value of the ecrBaseCheckNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setECRBaseCheckNumber(JAXBElement<String> value) {
        this.ecrBaseCheckNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ecrReturnCheckNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getECRReturnCheckNumber() {
        return ecrReturnCheckNumber;
    }

    /**
     * Sets the value of the ecrReturnCheckNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setECRReturnCheckNumber(JAXBElement<String> value) {
        this.ecrReturnCheckNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ecrCheckNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getECRCheckNumber() {
        return ecrCheckNumber;
    }

    /**
     * Sets the value of the ecrCheckNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setECRCheckNumber(JAXBElement<String> value) {
        this.ecrCheckNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ecrReturnByCardSum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getECRReturnByCardSum() {
        return ecrReturnByCardSum;
    }

    /**
     * Sets the value of the ecrReturnByCardSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setECRReturnByCardSum(BigDecimal value) {
        this.ecrReturnByCardSum = value;
    }

    /**
     * Gets the value of the ecrReturnByCashSum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getECRReturnByCashSum() {
        return ecrReturnByCashSum;
    }

    /**
     * Sets the value of the ecrReturnByCashSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setECRReturnByCashSum(BigDecimal value) {
        this.ecrReturnByCashSum = value;
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
     * Gets the value of the baseDocTaxInvoiceSeries property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBaseDocTaxInvoiceSeries() {
        return baseDocTaxInvoiceSeries;
    }

    /**
     * Sets the value of the baseDocTaxInvoiceSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBaseDocTaxInvoiceSeries(JAXBElement<String> value) {
        this.baseDocTaxInvoiceSeries = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the baseDocTaxInvoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBaseDocTaxInvoiceNumber() {
        return baseDocTaxInvoiceNumber;
    }

    /**
     * Sets the value of the baseDocTaxInvoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBaseDocTaxInvoiceNumber(JAXBElement<String> value) {
        this.baseDocTaxInvoiceNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the baseDocTaxInvoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBaseDocTaxInvoiceDate() {
        return baseDocTaxInvoiceDate;
    }

    /**
     * Sets the value of the baseDocTaxInvoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBaseDocTaxInvoiceDate(JAXBElement<XMLGregorianCalendar> value) {
        this.baseDocTaxInvoiceDate = ((JAXBElement<XMLGregorianCalendar> ) value);
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
     * Gets the value of the cashierShiftNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCashierShiftNumber() {
        return cashierShiftNumber;
    }

    /**
     * Sets the value of the cashierShiftNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCashierShiftNumber(JAXBElement<String> value) {
        this.cashierShiftNumber = ((JAXBElement<String> ) value);
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

}
