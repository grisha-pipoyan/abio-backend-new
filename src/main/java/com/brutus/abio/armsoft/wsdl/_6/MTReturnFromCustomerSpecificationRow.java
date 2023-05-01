
package com.brutus.abio.armsoft.wsdl._6;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;


/**
 * <p>Java class for MTReturnFromCustomerSpecificationRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MTReturnFromCustomerSpecificationRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Storage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Unit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="BeginPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BeginAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CostPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CostPriceVAT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CurrCostPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VAT" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="BaseRowID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UseFulLife" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Producer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Property1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Property2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RowDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UsedBonus" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AccumulatedBonus" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MTReturnFromCustomerSpecificationRow", propOrder = {
    "itemType",
    "storage",
    "code",
    "unit",
    "quantity",
    "price",
    "amount",
    "beginPrice",
    "beginAmount",
    "costPrice",
    "costPriceVAT",
    "currCostPrice",
    "vat",
    "baseRowID",
    "useFulLife",
    "country",
    "producer",
    "property1",
    "property2",
    "rowDescription",
    "usedBonus",
    "accumulatedBonus"
})
public class MTReturnFromCustomerSpecificationRow {

    @XmlElement(name = "ItemType", required = true, nillable = true)
    protected String itemType;
    @XmlElement(name = "Storage", required = true, nillable = true)
    protected String storage;
    @XmlElement(name = "Code", required = true, nillable = true)
    protected String code;
    @XmlElement(name = "Unit", required = true, nillable = true)
    protected String unit;
    @XmlElement(name = "Quantity", required = true)
    protected BigDecimal quantity;
    @XmlElement(name = "Price")
    protected BigDecimal price;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "BeginPrice")
    protected BigDecimal beginPrice;
    @XmlElement(name = "BeginAmount")
    protected BigDecimal beginAmount;
    @XmlElement(name = "CostPrice")
    protected BigDecimal costPrice;
    @XmlElement(name = "CostPriceVAT")
    protected BigDecimal costPriceVAT;
    @XmlElement(name = "CurrCostPrice")
    protected BigDecimal currCostPrice;
    @XmlElement(name = "VAT")
    protected boolean vat;
    @XmlElement(name = "BaseRowID")
    protected Integer baseRowID;
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
    @XmlElementRef(name = "RowDescription", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> rowDescription;
    @XmlElement(name = "UsedBonus")
    protected BigDecimal usedBonus;
    @XmlElement(name = "AccumulatedBonus")
    protected BigDecimal accumulatedBonus;

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
     * Gets the value of the storage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorage() {
        return storage;
    }

    /**
     * Sets the value of the storage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorage(String value) {
        this.storage = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
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
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
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
     * Gets the value of the beginPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBeginPrice() {
        return beginPrice;
    }

    /**
     * Sets the value of the beginPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBeginPrice(BigDecimal value) {
        this.beginPrice = value;
    }

    /**
     * Gets the value of the beginAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBeginAmount() {
        return beginAmount;
    }

    /**
     * Sets the value of the beginAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBeginAmount(BigDecimal value) {
        this.beginAmount = value;
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
     * Gets the value of the costPriceVAT property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCostPriceVAT() {
        return costPriceVAT;
    }

    /**
     * Sets the value of the costPriceVAT property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCostPriceVAT(BigDecimal value) {
        this.costPriceVAT = value;
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
     * Gets the value of the baseRowID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBaseRowID() {
        return baseRowID;
    }

    /**
     * Sets the value of the baseRowID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBaseRowID(Integer value) {
        this.baseRowID = value;
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
     * Gets the value of the rowDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRowDescription() {
        return rowDescription;
    }

    /**
     * Sets the value of the rowDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRowDescription(JAXBElement<String> value) {
        this.rowDescription = ((JAXBElement<String> ) value);
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

}
