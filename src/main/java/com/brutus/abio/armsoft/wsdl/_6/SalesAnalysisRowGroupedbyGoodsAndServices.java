
package com.brutus.abio.armsoft.wsdl._6;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * <p>Java class for SalesAnalysisRowGroupedbyGoodsAndServices complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesAnalysisRowGroupedbyGoodsAndServices">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ItemType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GoodID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GoodCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GoodCaption" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GoodDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnitCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UnitBrief" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Summ" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SalePrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SaleSumm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Profit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProfitPercentBySale" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProfitPercentByCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscountSum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VATSumm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VATSalePrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VATSaleSumm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VATProfit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VATProfitPercentBySale" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VATProfitPercentByCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VATDiscountSumm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VATDiscountPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CostVATSumm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SaleVATSumm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscountVATSumm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CurSumm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesAnalysisRowGroupedbyGoodsAndServices", propOrder = {
    "itemTypeCode",
    "itemType",
    "goodID",
    "goodCode",
    "goodCaption",
    "goodDescription",
    "unitCode",
    "unitBrief",
    "quantity",
    "summ",
    "salePrice",
    "saleSumm",
    "profit",
    "profitPercentBySale",
    "profitPercentByCost",
    "discountSum",
    "discountPercent",
    "vatSumm",
    "vatSalePrice",
    "vatSaleSumm",
    "vatProfit",
    "vatProfitPercentBySale",
    "vatProfitPercentByCost",
    "vatDiscountSumm",
    "vatDiscountPercent",
    "costVATSumm",
    "saleVATSumm",
    "discountVATSumm",
    "curSumm",
    "saleCurPrice",
    "saleCurSumm",
    "curProfit",
    "curProfitPercentBySale",
    "curProfitPercentByCost",
    "discountCurSum",
    "discountCurPercent",
    "usedBonus",
    "accumulatedBonus",
    "group"
})
public class SalesAnalysisRowGroupedbyGoodsAndServices {

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
    @XmlElement(name = "Quantity", required = true)
    protected BigDecimal quantity;
    @XmlElement(name = "Summ")
    protected BigDecimal summ;
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
    @XmlElement(name = "SaleVATSumm")
    protected BigDecimal saleVATSumm;
    @XmlElement(name = "DiscountVATSumm")
    protected BigDecimal discountVATSumm;
    @XmlElement(name = "CurSumm")
    protected BigDecimal curSumm;
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

}
