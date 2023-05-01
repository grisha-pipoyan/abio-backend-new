
package com.brutus.abio.armsoft.wsdl._6;

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
 *         &lt;element name="GetPartnersBonusRemainsByPartnerGroupResult" type="{http://www.armsoft.am/Accountant/6.0}ChunkedResultOfPartnerBonusRemainsListRow" minOccurs="0"/>
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
    "getPartnersBonusRemainsByPartnerGroupResult"
})
@XmlRootElement(name = "GetPartnersBonusRemainsByPartnerGroupResponse")
public class GetPartnersBonusRemainsByPartnerGroupResponse {

    @XmlElementRef(name = "GetPartnersBonusRemainsByPartnerGroupResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ChunkedResultOfPartnerBonusRemainsListRow> getPartnersBonusRemainsByPartnerGroupResult;

    /**
     * Gets the value of the getPartnersBonusRemainsByPartnerGroupResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfPartnerBonusRemainsListRow }{@code >}
     *     
     */
    public JAXBElement<ChunkedResultOfPartnerBonusRemainsListRow> getGetPartnersBonusRemainsByPartnerGroupResult() {
        return getPartnersBonusRemainsByPartnerGroupResult;
    }

    /**
     * Sets the value of the getPartnersBonusRemainsByPartnerGroupResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfPartnerBonusRemainsListRow }{@code >}
     *     
     */
    public void setGetPartnersBonusRemainsByPartnerGroupResult(JAXBElement<ChunkedResultOfPartnerBonusRemainsListRow> value) {
        this.getPartnersBonusRemainsByPartnerGroupResult = ((JAXBElement<ChunkedResultOfPartnerBonusRemainsListRow> ) value);
    }

}
