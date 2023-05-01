
package com.brutus.abio.armsoft.wsdl._6;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * <p>Java class for UpdateProductInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateProductInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.armsoft.am/Accountant/6.0}SerializationBase">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LongName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CPACode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShowInPriceList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExternalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MinQTY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MaxQTY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Extra" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Bonus" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Point" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Coeff" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="VAT" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="BarCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PLUCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EnvironmentalFeePercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AltUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Producer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Property1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Property2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubstituteItemsGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsWeight" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProductQntUnits" type="{http://www.armsoft.am/Accountant/6.0}ArrayOfProductQuantityUnitInfo" minOccurs="0"/>
 *         &lt;element name="ProductBarCodes" type="{http://www.armsoft.am/Accountant/6.0}ArrayOfProductBarCodeInfo" minOccurs="0"/>
 *         &lt;element name="Image" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CaptionEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CaptionRU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalDescr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalDescr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateProductInfo", propOrder = {
    "code",
    "name",
    "longName",
    "group",
    "cpaCode",
    "showInPriceList",
    "description",
    "externalCode",
    "minQTY",
    "maxQTY",
    "extra",
    "bonus",
    "point",
    "coeff",
    "vat",
    "barCode",
    "discount",
    "pluCode",
    "environmentalFeePercent",
    "type",
    "unit",
    "altUnit",
    "expMethod",
    "country",
    "producer",
    "property1",
    "property2",
    "substituteItemsGroup",
    "isWeight",
    "productQntUnits",
    "productBarCodes",
    "image",
    "captionEN",
    "captionRU",
    "additionalDescr1",
    "additionalDescr2"
})
public class UpdateProductInfo
    extends SerializationBase
{

    @XmlElement(name = "Code", required = true, nillable = true)
    protected String code;
    @XmlElement(name = "Name", required = true, nillable = true)
    protected String name;
    @XmlElementRef(name = "LongName", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> longName;
    @XmlElement(name = "Group", required = true, nillable = true)
    protected String group;
    @XmlElementRef(name = "CPACode", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> cpaCode;
    @XmlElement(name = "ShowInPriceList")
    protected Boolean showInPriceList;
    @XmlElementRef(name = "Description", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "ExternalCode", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> externalCode;
    @XmlElement(name = "MinQTY")
    protected BigDecimal minQTY;
    @XmlElement(name = "MaxQTY")
    protected BigDecimal maxQTY;
    @XmlElement(name = "Extra")
    protected BigDecimal extra;
    @XmlElement(name = "Bonus")
    protected BigDecimal bonus;
    @XmlElement(name = "Point")
    protected BigDecimal point;
    @XmlElement(name = "Coeff", required = true)
    protected BigDecimal coeff;
    @XmlElement(name = "VAT")
    protected boolean vat;
    @XmlElementRef(name = "BarCode", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> barCode;
    @XmlElement(name = "Discount")
    protected BigDecimal discount;
    @XmlElementRef(name = "PLUCode", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<Integer> pluCode;
    @XmlElement(name = "EnvironmentalFeePercent")
    protected BigDecimal environmentalFeePercent;
    @XmlElementRef(name = "Type", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> type;
    @XmlElementRef(name = "Unit", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> unit;
    @XmlElementRef(name = "AltUnit", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> altUnit;
    @XmlElementRef(name = "ExpMethod", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> expMethod;
    @XmlElementRef(name = "Country", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> country;
    @XmlElementRef(name = "Producer", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> producer;
    @XmlElementRef(name = "Property1", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> property1;
    @XmlElementRef(name = "Property2", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> property2;
    @XmlElementRef(name = "SubstituteItemsGroup", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> substituteItemsGroup;
    @XmlElement(name = "IsWeight")
    protected Boolean isWeight;
    @XmlElementRef(name = "ProductQntUnits", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ArrayOfProductQuantityUnitInfo> productQntUnits;
    @XmlElementRef(name = "ProductBarCodes", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ArrayOfProductBarCodeInfo> productBarCodes;
    @XmlElementRef(name = "Image", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> image;
    @XmlElementRef(name = "CaptionEN", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> captionEN;
    @XmlElementRef(name = "CaptionRU", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> captionRU;
    @XmlElementRef(name = "AdditionalDescr1", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> additionalDescr1;
    @XmlElementRef(name = "AdditionalDescr2", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> additionalDescr2;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the longName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLongName() {
        return longName;
    }

    /**
     * Sets the value of the longName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLongName(JAXBElement<String> value) {
        this.longName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroup(String value) {
        this.group = value;
    }

    /**
     * Gets the value of the cpaCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCPACode() {
        return cpaCode;
    }

    /**
     * Sets the value of the cpaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCPACode(JAXBElement<String> value) {
        this.cpaCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the showInPriceList property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowInPriceList() {
        return showInPriceList;
    }

    /**
     * Sets the value of the showInPriceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowInPriceList(Boolean value) {
        this.showInPriceList = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = ((JAXBElement<String> ) value);
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
     * Gets the value of the minQTY property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinQTY() {
        return minQTY;
    }

    /**
     * Sets the value of the minQTY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinQTY(BigDecimal value) {
        this.minQTY = value;
    }

    /**
     * Gets the value of the maxQTY property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxQTY() {
        return maxQTY;
    }

    /**
     * Sets the value of the maxQTY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxQTY(BigDecimal value) {
        this.maxQTY = value;
    }

    /**
     * Gets the value of the extra property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExtra() {
        return extra;
    }

    /**
     * Sets the value of the extra property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExtra(BigDecimal value) {
        this.extra = value;
    }

    /**
     * Gets the value of the bonus property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBonus() {
        return bonus;
    }

    /**
     * Sets the value of the bonus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBonus(BigDecimal value) {
        this.bonus = value;
    }

    /**
     * Gets the value of the point property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPoint() {
        return point;
    }

    /**
     * Sets the value of the point property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPoint(BigDecimal value) {
        this.point = value;
    }

    /**
     * Gets the value of the coeff property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoeff() {
        return coeff;
    }

    /**
     * Sets the value of the coeff property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoeff(BigDecimal value) {
        this.coeff = value;
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
     * Gets the value of the pluCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPLUCode() {
        return pluCode;
    }

    /**
     * Sets the value of the pluCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPLUCode(JAXBElement<Integer> value) {
        this.pluCode = ((JAXBElement<Integer> ) value);
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setType(JAXBElement<String> value) {
        this.type = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnit(JAXBElement<String> value) {
        this.unit = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the altUnit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAltUnit() {
        return altUnit;
    }

    /**
     * Sets the value of the altUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAltUnit(JAXBElement<String> value) {
        this.altUnit = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the expMethod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExpMethod() {
        return expMethod;
    }

    /**
     * Sets the value of the expMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExpMethod(JAXBElement<String> value) {
        this.expMethod = ((JAXBElement<String> ) value);
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
     * Gets the value of the substituteItemsGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubstituteItemsGroup() {
        return substituteItemsGroup;
    }

    /**
     * Sets the value of the substituteItemsGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubstituteItemsGroup(JAXBElement<String> value) {
        this.substituteItemsGroup = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the isWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsWeight() {
        return isWeight;
    }

    /**
     * Sets the value of the isWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsWeight(Boolean value) {
        this.isWeight = value;
    }

    /**
     * Gets the value of the productQntUnits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProductQuantityUnitInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfProductQuantityUnitInfo> getProductQntUnits() {
        return productQntUnits;
    }

    /**
     * Sets the value of the productQntUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProductQuantityUnitInfo }{@code >}
     *     
     */
    public void setProductQntUnits(JAXBElement<ArrayOfProductQuantityUnitInfo> value) {
        this.productQntUnits = ((JAXBElement<ArrayOfProductQuantityUnitInfo> ) value);
    }

    /**
     * Gets the value of the productBarCodes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProductBarCodeInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfProductBarCodeInfo> getProductBarCodes() {
        return productBarCodes;
    }

    /**
     * Sets the value of the productBarCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProductBarCodeInfo }{@code >}
     *     
     */
    public void setProductBarCodes(JAXBElement<ArrayOfProductBarCodeInfo> value) {
        this.productBarCodes = ((JAXBElement<ArrayOfProductBarCodeInfo> ) value);
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImage(JAXBElement<String> value) {
        this.image = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the captionEN property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCaptionEN() {
        return captionEN;
    }

    /**
     * Sets the value of the captionEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCaptionEN(JAXBElement<String> value) {
        this.captionEN = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the captionRU property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCaptionRU() {
        return captionRU;
    }

    /**
     * Sets the value of the captionRU property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCaptionRU(JAXBElement<String> value) {
        this.captionRU = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the additionalDescr1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalDescr1() {
        return additionalDescr1;
    }

    /**
     * Sets the value of the additionalDescr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalDescr1(JAXBElement<String> value) {
        this.additionalDescr1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the additionalDescr2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalDescr2() {
        return additionalDescr2;
    }

    /**
     * Sets the value of the additionalDescr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalDescr2(JAXBElement<String> value) {
        this.additionalDescr2 = ((JAXBElement<String> ) value);
    }

}
