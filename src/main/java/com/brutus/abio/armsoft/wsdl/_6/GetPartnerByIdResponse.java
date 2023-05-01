
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
 *         &lt;element name="GetPartnerByIdResult" type="{http://www.armsoft.am/Accountant/6.0}EditPartnerInfo" minOccurs="0"/>
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
    "getPartnerByIdResult"
})
@XmlRootElement(name = "GetPartnerByIdResponse")
public class GetPartnerByIdResponse {

    @XmlElementRef(name = "GetPartnerByIdResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<EditPartnerInfo> getPartnerByIdResult;

    /**
     * Gets the value of the getPartnerByIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EditPartnerInfo }{@code >}
     *     
     */
    public JAXBElement<EditPartnerInfo> getGetPartnerByIdResult() {
        return getPartnerByIdResult;
    }

    /**
     * Sets the value of the getPartnerByIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EditPartnerInfo }{@code >}
     *     
     */
    public void setGetPartnerByIdResult(JAXBElement<EditPartnerInfo> value) {
        this.getPartnerByIdResult = ((JAXBElement<EditPartnerInfo> ) value);
    }

}
