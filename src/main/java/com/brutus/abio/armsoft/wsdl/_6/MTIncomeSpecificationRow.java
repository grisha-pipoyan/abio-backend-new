
package com.brutus.abio.armsoft.wsdl._6;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;


/**
 * <p>Java class for MTIncomeSpecificationRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MTIncomeSpecificationRow">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.armsoft.am/Accountant/6.0}SerializationBase">
 *       &lt;sequence>
 *         &lt;element name="MTCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UnitCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VAT" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UseFulLife" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Producer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Property1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Property2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RowID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MTIncomeSpecificationRow", propOrder = {
    "mtCode",
    "unitCode",
    "quantity",
    "discount",
    "amount",
    "vat",
    "useFulLife",
    "country",
    "producer",
    "property1",
    "property2",
    "rowID"
})
public class MTIncomeSpecificationRow
    extends SerializationBase
{

    @XmlElement(name = "MTCode", required = true, nillable = true)
    protected String mtCode;
    @XmlElement(name = "UnitCode", required = true, nillable = true)
    protected String unitCode;
    @XmlElement(name = "Quantity", required = true)
    protected BigDecimal quantity;
    @XmlElement(name = "Discount")
    protected BigDecimal discount;
    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElement(name = "VAT")
    protected boolean vat;
    @XmlElementRef(name = "UseFulLife", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> useFulLife;
    @XmlElementRef(name = "Country", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> country;
    @XmlElementRef(name = "Producer", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> producer;
    @XmlElementRef(name = "Property1", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> property1;
    @XmlElementRef(name = "Property2", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> property2;
    @XmlElement(name = "RowID")
    protected Integer rowID;

    /**
     * Gets the value of the mtCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMTCode() {
        return mtCode;
    }

    /**
     * Sets the value of the mtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMTCode(String value) {
        this.mtCode = value;
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
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscount(BigDecimal value) {
        this.discount = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the vat property.
     * 
     */
    public boolean isVAT() {
        return vat;
    }

    /**
     * Sets the value of the vat property.
     * 
     */
    public void setVAT(boolean value) {
        this.vat = value;
    }

    /**
     * Gets the value of the useFulLife property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getUseFulLife() {
        return useFulLife;
    }

    /**
     * Sets the value of the useFulLife property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setUseFulLife(JAXBElement<XMLGregorianCalendar> value) {
        this.useFulLife = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountry(JAXBElement<String> value) {
        this.country = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the producer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProducer() {
        return producer;
    }

    /**
     * Sets the value of the producer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProducer(JAXBElement<String> value) {
        this.producer = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the property1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProperty1() {
        return property1;
    }

    /**
     * Sets the value of the property1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProperty1(JAXBElement<String> value) {
        this.property1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the property2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProperty2() {
        return property2;
    }

    /**
     * Sets the value of the property2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProperty2(JAXBElement<String> value) {
        this.property2 = ((JAXBElement<String> ) value);
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

}
