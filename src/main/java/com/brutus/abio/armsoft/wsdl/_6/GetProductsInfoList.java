
package com.brutus.abio.armsoft.wsdl._6;

import com.brutus.abio.armsoft.wsdl._07.armsoft_trade_businessobjects.CommonConstGoodsTypes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sessionId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="seqNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://schemas.datacontract.org/2004/07/ArmSoft.Trade.BusinessObjects.Common}CommonConst.GoodsTypes" minOccurs="0"/>
 *         &lt;element name="Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShowOnlyInPriceList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LikeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessionId",
    "seqNumber",
    "type",
    "group",
    "showOnlyInPriceList",
    "likeName"
})
@XmlRootElement(name = "GetProductsInfoList")
public class GetProductsInfoList {

    protected String sessionId;
    protected Integer seqNumber;
    @XmlElement(name = "Type")
    protected CommonConstGoodsTypes type;
    @XmlElementRef(name = "Group", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> group;
    @XmlElement(name = "ShowOnlyInPriceList")
    protected Boolean showOnlyInPriceList;
    @XmlElementRef(name = "LikeName", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> likeName;

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the seqNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSeqNumber() {
        return seqNumber;
    }

    /**
     * Sets the value of the seqNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSeqNumber(Integer value) {
        this.seqNumber = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CommonConstGoodsTypes }
     *     
     */
    public CommonConstGoodsTypes getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonConstGoodsTypes }
     *     
     */
    public void setType(CommonConstGoodsTypes value) {
        this.type = value;
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

    /**
     * Gets the value of the showOnlyInPriceList property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowOnlyInPriceList() {
        return showOnlyInPriceList;
    }

    /**
     * Sets the value of the showOnlyInPriceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowOnlyInPriceList(Boolean value) {
        this.showOnlyInPriceList = value;
    }

    /**
     * Gets the value of the likeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLikeName() {
        return likeName;
    }

    /**
     * Sets the value of the likeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLikeName(JAXBElement<String> value) {
        this.likeName = ((JAXBElement<String> ) value);
    }

}
