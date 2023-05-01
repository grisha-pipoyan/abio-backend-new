
package com.brutus.abio.armsoft.wsdl._6;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CreateInternalMoveDocInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateInternalMoveDocInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DocumentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StorageExpenseCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StorageIncomeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ChiefAccountantFIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mediator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Allower" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BookNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BookPage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BookRow" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TaxExportType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxInvoiceSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxInvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxInvoiceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TransportationMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaseISN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Specification" type="{http://www.armsoft.am/Accountant/6.0}ArrayOfInternalMoveSpecificationRow" minOccurs="0"/>
 *         &lt;element name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsDraft" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExtBody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateInternalMoveDocInfo", propOrder = {
    "documentNumber",
    "documentDate",
    "comment",
    "storageExpenseCode",
    "storageIncomeCode",
    "chiefAccountantFIO",
    "mediator",
    "allower",
    "bookNumber",
    "bookPage",
    "bookRow",
    "taxExportType",
    "taxInvoiceSeries",
    "taxInvoiceNumber",
    "taxInvoiceDate",
    "transportationMethod",
    "priceType",
    "baseISN",
    "specification",
    "owner",
    "isn",
    "isDraft",
    "isDeleted",
    "extBody"
})
public class CreateInternalMoveDocInfo {

    @XmlElement(name = "DocumentNumber", required = true, nillable = true)
    protected String documentNumber;
    @XmlElement(name = "DocumentDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar documentDate;
    @XmlElementRef(name = "Comment", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> comment;
    @XmlElement(name = "StorageExpenseCode", required = true, nillable = true)
    protected String storageExpenseCode;
    @XmlElement(name = "StorageIncomeCode", required = true, nillable = true)
    protected String storageIncomeCode;
    @XmlElementRef(name = "ChiefAccountantFIO", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> chiefAccountantFIO;
    @XmlElementRef(name = "Mediator", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> mediator;
    @XmlElementRef(name = "Allower", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> allower;
    @XmlElementRef(name = "BookNumber", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> bookNumber;
    @XmlElement(name = "BookPage")
    protected Integer bookPage;
    @XmlElement(name = "BookRow")
    protected Integer bookRow;
    @XmlElementRef(name = "TaxExportType", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> taxExportType;
    @XmlElementRef(name = "TaxInvoiceSeries", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> taxInvoiceSeries;
    @XmlElementRef(name = "TaxInvoiceNumber", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> taxInvoiceNumber;
    @XmlElementRef(name = "TaxInvoiceDate", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> taxInvoiceDate;
    @XmlElementRef(name = "TransportationMethod", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> transportationMethod;
    @XmlElementRef(name = "PriceType", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> priceType;
    @XmlElementRef(name = "BaseISN", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> baseISN;
    @XmlElementRef(name = "Specification", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ArrayOfInternalMoveSpecificationRow> specification;
    @XmlElementRef(name = "Owner", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> owner;
    @XmlElementRef(name = "ISN", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> isn;
    @XmlElement(name = "IsDraft")
    protected Boolean isDraft;
    @XmlElement(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlElementRef(name = "ExtBody", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> extBody;

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
     * Gets the value of the storageExpenseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorageExpenseCode() {
        return storageExpenseCode;
    }

    /**
     * Sets the value of the storageExpenseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorageExpenseCode(String value) {
        this.storageExpenseCode = value;
    }

    /**
     * Gets the value of the storageIncomeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorageIncomeCode() {
        return storageIncomeCode;
    }

    /**
     * Sets the value of the storageIncomeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorageIncomeCode(String value) {
        this.storageIncomeCode = value;
    }

    /**
     * Gets the value of the chiefAccountantFIO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChiefAccountantFIO() {
        return chiefAccountantFIO;
    }

    /**
     * Sets the value of the chiefAccountantFIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChiefAccountantFIO(JAXBElement<String> value) {
        this.chiefAccountantFIO = ((JAXBElement<String> ) value);
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
     * Gets the value of the bookNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBookNumber() {
        return bookNumber;
    }

    /**
     * Sets the value of the bookNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBookNumber(JAXBElement<String> value) {
        this.bookNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bookPage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBookPage() {
        return bookPage;
    }

    /**
     * Sets the value of the bookPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBookPage(Integer value) {
        this.bookPage = value;
    }

    /**
     * Gets the value of the bookRow property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBookRow() {
        return bookRow;
    }

    /**
     * Sets the value of the bookRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBookRow(Integer value) {
        this.bookRow = value;
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
     * Gets the value of the transportationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransportationMethod() {
        return transportationMethod;
    }

    /**
     * Sets the value of the transportationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransportationMethod(JAXBElement<String> value) {
        this.transportationMethod = ((JAXBElement<String> ) value);
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
     *     {@link JAXBElement }{@code <}{@link ArrayOfInternalMoveSpecificationRow }{@code >}
     *     
     */
    public JAXBElement<ArrayOfInternalMoveSpecificationRow> getSpecification() {
        return specification;
    }

    /**
     * Sets the value of the specification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInternalMoveSpecificationRow }{@code >}
     *     
     */
    public void setSpecification(JAXBElement<ArrayOfInternalMoveSpecificationRow> value) {
        this.specification = ((JAXBElement<ArrayOfInternalMoveSpecificationRow> ) value);
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

}
