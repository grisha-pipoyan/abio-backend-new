
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
 *         &lt;element name="GetPartnersNextChunkResult" type="{http://www.armsoft.am/Accountant/6.0}ChunkedResultOfPartnerListRow" minOccurs="0"/>
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
    "getPartnersNextChunkResult"
})
@XmlRootElement(name = "GetPartnersNextChunkResponse")
public class GetPartnersNextChunkResponse {

    @XmlElementRef(name = "GetPartnersNextChunkResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ChunkedResultOfPartnerListRow> getPartnersNextChunkResult;

    /**
     * Gets the value of the getPartnersNextChunkResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfPartnerListRow }{@code >}
     *     
     */
    public JAXBElement<ChunkedResultOfPartnerListRow> getGetPartnersNextChunkResult() {
        return getPartnersNextChunkResult;
    }

    /**
     * Sets the value of the getPartnersNextChunkResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfPartnerListRow }{@code >}
     *     
     */
    public void setGetPartnersNextChunkResult(JAXBElement<ChunkedResultOfPartnerListRow> value) {
        this.getPartnersNextChunkResult = ((JAXBElement<ChunkedResultOfPartnerListRow> ) value);
    }

}
