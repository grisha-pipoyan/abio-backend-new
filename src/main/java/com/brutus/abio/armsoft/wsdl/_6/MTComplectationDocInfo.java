
package com.brutus.abio.armsoft.wsdl._6;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;


/**
 * <p>Java class for MTComplectationDocInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MTComplectationDocInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DocumentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="MTComplectCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="QuantityUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StorageExpense" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StorageIncome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Specification" type="{http://www.armsoft.am/Accountant/6.0}ArrayOfMTComplectationSpecificationRow" minOccurs="0"/>
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
@XmlType(name = "MTComplectationDocInfo", propOrder = {
    "documentNumber",
    "documentDate",
    "mtComplectCode",
    "quantityUnit",
    "storageExpense",
    "storageIncome",
    "comment",
    "quantity",
    "specification",
    "owner",
    "isn"
})
public class MTComplectationDocInfo {

    @XmlElement(name = "DocumentNumber", required = true, nillable = true)
    protected String documentNumber;
    @XmlElement(name = "DocumentDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar documentDate;
    @XmlElement(name = "MTComplectCode", required = true, nillable = true)
    protected String mtComplectCode;
    @XmlElement(name = "QuantityUnit", required = true, nillable = true)
    protected String quantityUnit;
    @XmlElementRef(name = "StorageExpense", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> storageExpense;
    @XmlElement(name = "StorageIncome", required = true, nillable = true)
    protected String storageIncome;
    @XmlElementRef(name = "Comment", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> comment;
    @XmlElement(name = "Quantity", required = true)
    protected BigDecimal quantity;
    @XmlElementRef(name = "Specification", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ArrayOfMTComplectationSpecificationRow> specification;
    @XmlElementRef(name = "Owner", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> owner;
    @XmlElementRef(name = "ISN", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> isn;

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
     * Gets the value of the mtComplectCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMTComplectCode() {
        return mtComplectCode;
    }

    /**
     * Sets the value of the mtComplectCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMTComplectCode(String value) {
        this.mtComplectCode = value;
    }

    /**
     * Gets the value of the quantityUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityUnit() {
        return quantityUnit;
    }

    /**
     * Sets the value of the quantityUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityUnit(String value) {
        this.quantityUnit = value;
    }

    /**
     * Gets the value of the storageExpense property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStorageExpense() {
        return storageExpense;
    }

    /**
     * Sets the value of the storageExpense property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStorageExpense(JAXBElement<String> value) {
        this.storageExpense = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the storageIncome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorageIncome() {
        return storageIncome;
    }

    /**
     * Sets the value of the storageIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorageIncome(String value) {
        this.storageIncome = value;
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
     * Gets the value of the specification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMTComplectationSpecificationRow }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMTComplectationSpecificationRow> getSpecification() {
        return specification;
    }

    /**
     * Sets the value of the specification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMTComplectationSpecificationRow }{@code >}
     *     
     */
    public void setSpecification(JAXBElement<ArrayOfMTComplectationSpecificationRow> value) {
        this.specification = ((JAXBElement<ArrayOfMTComplectationSpecificationRow> ) value);
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
