
package com.brutus.abio.armsoft.wsdl._6;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>Java class for MTStockTakingSpecificationRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MTStockTakingSpecificationRow">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.armsoft.am/Accountant/6.0}SerializationBase">
 *       &lt;sequence>
 *         &lt;element name="MTCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Unit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EstimatedQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ActualQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VarianceQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EstimatedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SalePrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ActualAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SaleSumma" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MTStockTakingSpecificationRow", propOrder = {
    "mtCode",
    "unit",
    "estimatedQuantity",
    "actualQuantity",
    "varianceQuantity",
    "estimatedAmount",
    "price",
    "salePrice",
    "actualAmount",
    "saleSumma"
})
public class MTStockTakingSpecificationRow
    extends SerializationBase
{

    @XmlElement(name = "MTCode", required = true, nillable = true)
    protected String mtCode;
    @XmlElement(name = "Unit", required = true, nillable = true)
    protected String unit;
    @XmlElement(name = "EstimatedQuantity")
    protected BigDecimal estimatedQuantity;
    @XmlElement(name = "ActualQuantity")
    protected BigDecimal actualQuantity;
    @XmlElement(name = "VarianceQuantity")
    protected BigDecimal varianceQuantity;
    @XmlElement(name = "EstimatedAmount")
    protected BigDecimal estimatedAmount;
    @XmlElement(name = "Price")
    protected BigDecimal price;
    @XmlElement(name = "SalePrice")
    protected BigDecimal salePrice;
    @XmlElement(name = "ActualAmount")
    protected BigDecimal actualAmount;
    @XmlElement(name = "SaleSumma")
    protected BigDecimal saleSumma;

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
     * Gets the value of the estimatedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEstimatedQuantity() {
        return estimatedQuantity;
    }

    /**
     * Sets the value of the estimatedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEstimatedQuantity(BigDecimal value) {
        this.estimatedQuantity = value;
    }

    /**
     * Gets the value of the actualQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActualQuantity() {
        return actualQuantity;
    }

    /**
     * Sets the value of the actualQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActualQuantity(BigDecimal value) {
        this.actualQuantity = value;
    }

    /**
     * Gets the value of the varianceQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVarianceQuantity() {
        return varianceQuantity;
    }

    /**
     * Sets the value of the varianceQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVarianceQuantity(BigDecimal value) {
        this.varianceQuantity = value;
    }

    /**
     * Gets the value of the estimatedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEstimatedAmount() {
        return estimatedAmount;
    }

    /**
     * Sets the value of the estimatedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEstimatedAmount(BigDecimal value) {
        this.estimatedAmount = value;
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
     * Gets the value of the actualAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActualAmount() {
        return actualAmount;
    }

    /**
     * Sets the value of the actualAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActualAmount(BigDecimal value) {
        this.actualAmount = value;
    }

    /**
     * Gets the value of the saleSumma property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaleSumma() {
        return saleSumma;
    }

    /**
     * Sets the value of the saleSumma property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaleSumma(BigDecimal value) {
        this.saleSumma = value;
    }

}
