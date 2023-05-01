
package com.brutus.abio.armsoft.wsdl._6;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * <p>Java class for InvoiceSpecificationRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceSpecificationRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StorageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ItemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnitCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscountPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AmountWithoutVAT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BeginAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EnvironmentalFeePercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EnvironmentalFeeAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VAT" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="BarCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UsedBonus" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AccumulatedBonus" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PartyMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RowDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExternalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GoodsQntUnitsList" type="{http://www.armsoft.am/Accountant/6.0}ArrayOfProductQuantityUnitInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceSpecificationRow", propOrder = {
    "itemType",
    "storageCode",
    "itemCode",
    "itemName",
    "unitCode",
    "quantity",
    "price",
    "discount",
    "discountPrice",
    "amount",
    "discountAmount",
    "amountWithoutVAT",
    "beginAmount",
    "environmentalFeePercent",
    "environmentalFeeAmount",
    "vat",
    "barCode",
    "usedBonus",
    "accumulatedBonus",
    "partyMethod",
    "rowDescription",
    "externalCode",
    "goodsQntUnitsList"
})
public class InvoiceSpecificationRow {

    @XmlElement(name = "ItemType", required = true, nillable = true)
    protected String itemType;
    @XmlElementRef(name = "StorageCode", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> storageCode;
    @XmlElement(name = "ItemCode", required = true, nillable = true)
    protected String itemCode;
    @XmlElementRef(name = "ItemName", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> itemName;
    @XmlElement(name = "UnitCode", required = true, nillable = true)
    protected String unitCode;
    @XmlElement(name = "Quantity", required = true)
    protected BigDecimal quantity;
    @XmlElement(name = "Price")
    protected BigDecimal price;
    @XmlElement(name = "Discount")
    protected BigDecimal discount;
    @XmlElement(name = "DiscountPrice")
    protected BigDecimal discountPrice;
    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElement(name = "DiscountAmount")
    protected BigDecimal discountAmount;
    @XmlElement(name = "AmountWithoutVAT")
    protected BigDecimal amountWithoutVAT;
    @XmlElement(name = "BeginAmount")
    protected BigDecimal beginAmount;
    @XmlElement(name = "EnvironmentalFeePercent")
    protected BigDecimal environmentalFeePercent;
    @XmlElement(name = "EnvironmentalFeeAmount")
    protected BigDecimal environmentalFeeAmount;
    @XmlElement(name = "VAT")
    protected boolean vat;
    @XmlElementRef(name = "BarCode", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> barCode;
    @XmlElement(name = "UsedBonus")
    protected BigDecimal usedBonus;
    @XmlElement(name = "AccumulatedBonus")
    protected BigDecimal accumulatedBonus;
    @XmlElementRef(name = "PartyMethod", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> partyMethod;
    @XmlElementRef(name = "RowDescription", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> rowDescription;
    @XmlElementRef(name = "ExternalCode", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> externalCode;
    @XmlElementRef(name = "GoodsQntUnitsList", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ArrayOfProductQuantityUnitInfo> goodsQntUnitsList;

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
     * Gets the value of the storageCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStorageCode() {
        return storageCode;
    }

    /**
     * Sets the value of the storageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStorageCode(JAXBElement<String> value) {
        this.storageCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the itemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * Sets the value of the itemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCode(String value) {
        this.itemCode = value;
    }

    /**
     * Gets the value of the itemName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setItemName(JAXBElement<String> value) {
        this.itemName = ((JAXBElement<String> ) value);
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
     * Gets the value of the discountPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountPrice() {
        return discountPrice;
    }

    /**
     * Sets the value of the discountPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountPrice(BigDecimal value) {
        this.discountPrice = value;
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
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountAmount(BigDecimal value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the amountWithoutVAT property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountWithoutVAT() {
        return amountWithoutVAT;
    }

    /**
     * Sets the value of the amountWithoutVAT property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountWithoutVAT(BigDecimal value) {
        this.amountWithoutVAT = value;
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
     * Gets the value of the environmentalFeePercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEnvironmentalFeePercent() {
        return environmentalFeePercent;
    }

    /**
     * Sets the value of the environmentalFeePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEnvironmentalFeePercent(BigDecimal value) {
        this.environmentalFeePercent = value;
    }

    /**
     * Gets the value of the environmentalFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEnvironmentalFeeAmount() {
        return environmentalFeeAmount;
    }

    /**
     * Sets the value of the environmentalFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEnvironmentalFeeAmount(BigDecimal value) {
        this.environmentalFeeAmount = value;
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
     * Gets the value of the barCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBarCode() {
        return barCode;
    }

    /**
     * Sets the value of the barCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBarCode(JAXBElement<String> value) {
        this.barCode = ((JAXBElement<String> ) value);
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
     * Gets the value of the partyMethod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyMethod() {
        return partyMethod;
    }

    /**
     * Sets the value of the partyMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyMethod(JAXBElement<String> value) {
        this.partyMethod = ((JAXBElement<String> ) value);
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
     * Gets the value of the externalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExternalCode() {
        return externalCode;
    }

    /**
     * Sets the value of the externalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExternalCode(JAXBElement<String> value) {
        this.externalCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the goodsQntUnitsList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProductQuantityUnitInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfProductQuantityUnitInfo> getGoodsQntUnitsList() {
        return goodsQntUnitsList;
    }

    /**
     * Sets the value of the goodsQntUnitsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProductQuantityUnitInfo }{@code >}
     *     
     */
    public void setGoodsQntUnitsList(JAXBElement<ArrayOfProductQuantityUnitInfo> value) {
        this.goodsQntUnitsList = ((JAXBElement<ArrayOfProductQuantityUnitInfo> ) value);
    }

}
