
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
 *         &lt;element name="GetPartnersInfoNextChunkResult" type="{http://www.armsoft.am/Accountant/6.0}ChunkedResultOfCreatePartnerInfo" minOccurs="0"/>
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
    "getPartnersInfoNextChunkResult"
})
@XmlRootElement(name = "GetPartnersInfoNextChunkResponse")
public class GetPartnersInfoNextChunkResponse {

    @XmlElementRef(name = "GetPartnersInfoNextChunkResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ChunkedResultOfCreatePartnerInfo> getPartnersInfoNextChunkResult;

    /**
     * Gets the value of the getPartnersInfoNextChunkResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfCreatePartnerInfo }{@code >}
     *     
     */
    public JAXBElement<ChunkedResultOfCreatePartnerInfo> getGetPartnersInfoNextChunkResult() {
        return getPartnersInfoNextChunkResult;
    }

    /**
     * Sets the value of the getPartnersInfoNextChunkResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfCreatePartnerInfo }{@code >}
     *     
     */
    public void setGetPartnersInfoNextChunkResult(JAXBElement<ChunkedResultOfCreatePartnerInfo> value) {
        this.getPartnersInfoNextChunkResult = ((JAXBElement<ChunkedResultOfCreatePartnerInfo> ) value);
    }

}
