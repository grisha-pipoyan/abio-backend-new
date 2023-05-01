
package com.brutus.abio.armsoft.wsdl._6;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for CashListRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CashListRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Caption" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NextNumIn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NextNumOut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NextMTBillNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NextMTBillReturnNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NextCashierShiftNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsECR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashListRow", propOrder = {
    "code",
    "caption",
    "isDefault",
    "nextNumIn",
    "nextNumOut",
    "nextMTBillNum",
    "nextMTBillReturnNum",
    "nextCashierShiftNum",
    "isECR"
})
public class CashListRow {

    @XmlElement(name = "Code", required = true, nillable = true)
    protected String code;
    @XmlElement(name = "Caption", required = true, nillable = true)
    protected String caption;
    @XmlElement(name = "IsDefault")
    protected Boolean isDefault;
    @XmlElementRef(name = "NextNumIn", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> nextNumIn;
    @XmlElementRef(name = "NextNumOut", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> nextNumOut;
    @XmlElementRef(name = "NextMTBillNum", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> nextMTBillNum;
    @XmlElementRef(name = "NextMTBillReturnNum", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> nextMTBillReturnNum;
    @XmlElementRef(name = "NextCashierShiftNum", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> nextCashierShiftNum;
    @XmlElement(name = "IsECR")
    protected Boolean isECR;

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
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaption(String value) {
        this.caption = value;
    }

    /**
     * Gets the value of the isDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDefault() {
        return isDefault;
    }

    /**
     * Sets the value of the isDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDefault(Boolean value) {
        this.isDefault = value;
    }

    /**
     * Gets the value of the nextNumIn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNextNumIn() {
        return nextNumIn;
    }

    /**
     * Sets the value of the nextNumIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNextNumIn(JAXBElement<String> value) {
        this.nextNumIn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nextNumOut property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNextNumOut() {
        return nextNumOut;
    }

    /**
     * Sets the value of the nextNumOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNextNumOut(JAXBElement<String> value) {
        this.nextNumOut = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nextMTBillNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNextMTBillNum() {
        return nextMTBillNum;
    }

    /**
     * Sets the value of the nextMTBillNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNextMTBillNum(JAXBElement<String> value) {
        this.nextMTBillNum = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nextMTBillReturnNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNextMTBillReturnNum() {
        return nextMTBillReturnNum;
    }

    /**
     * Sets the value of the nextMTBillReturnNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNextMTBillReturnNum(JAXBElement<String> value) {
        this.nextMTBillReturnNum = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nextCashierShiftNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNextCashierShiftNum() {
        return nextCashierShiftNum;
    }

    /**
     * Sets the value of the nextCashierShiftNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNextCashierShiftNum(JAXBElement<String> value) {
        this.nextCashierShiftNum = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the isECR property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsECR() {
        return isECR;
    }

    /**
     * Sets the value of the isECR property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsECR(Boolean value) {
        this.isECR = value;
    }

}
