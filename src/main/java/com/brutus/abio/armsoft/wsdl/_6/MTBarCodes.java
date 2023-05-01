
package com.brutus.abio.armsoft.wsdl._6;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for MTBarCodes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MTBarCodes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MTID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MTCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MTCaption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QntUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QntUnitBrief" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsWeight" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BarCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MTBarCodes", propOrder = {
    "mtid",
    "mtCode",
    "mtCaption",
    "qntUnit",
    "qntUnitBrief",
    "isWeight",
    "barCode"
})
public class MTBarCodes {

    @XmlElement(name = "MTID")
    protected Integer mtid;
    @XmlElementRef(name = "MTCode", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> mtCode;
    @XmlElementRef(name = "MTCaption", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> mtCaption;
    @XmlElementRef(name = "QntUnit", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> qntUnit;
    @XmlElementRef(name = "QntUnitBrief", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> qntUnitBrief;
    @XmlElement(name = "IsWeight")
    protected Boolean isWeight;
    @XmlElementRef(name = "BarCode", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> barCode;

    /**
     * Gets the value of the mtid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMTID() {
        return mtid;
    }

    /**
     * Sets the value of the mtid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMTID(Integer value) {
        this.mtid = value;
    }

    /**
     * Gets the value of the mtCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMTCode() {
        return mtCode;
    }

    /**
     * Sets the value of the mtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMTCode(JAXBElement<String> value) {
        this.mtCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mtCaption property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMTCaption() {
        return mtCaption;
    }

    /**
     * Sets the value of the mtCaption property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMTCaption(JAXBElement<String> value) {
        this.mtCaption = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the qntUnit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQntUnit() {
        return qntUnit;
    }

    /**
     * Sets the value of the qntUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQntUnit(JAXBElement<String> value) {
        this.qntUnit = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the qntUnitBrief property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQntUnitBrief() {
        return qntUnitBrief;
    }

    /**
     * Sets the value of the qntUnitBrief property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQntUnitBrief(JAXBElement<String> value) {
        this.qntUnitBrief = ((JAXBElement<String> ) value);
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

}
