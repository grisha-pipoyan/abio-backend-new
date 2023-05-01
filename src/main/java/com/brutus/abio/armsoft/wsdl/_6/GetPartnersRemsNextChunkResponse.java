
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
 *         &lt;element name="GetPartnersRemsNextChunkResult" type="{http://www.armsoft.am/Accountant/6.0}ChunkedResultOfPartCashBankAccRemainsRow" minOccurs="0"/>
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
    "getPartnersRemsNextChunkResult"
})
@XmlRootElement(name = "GetPartnersRemsNextChunkResponse")
public class GetPartnersRemsNextChunkResponse {

    @XmlElementRef(name = "GetPartnersRemsNextChunkResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ChunkedResultOfPartCashBankAccRemainsRow> getPartnersRemsNextChunkResult;

    /**
     * Gets the value of the getPartnersRemsNextChunkResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfPartCashBankAccRemainsRow }{@code >}
     *     
     */
    public JAXBElement<ChunkedResultOfPartCashBankAccRemainsRow> getGetPartnersRemsNextChunkResult() {
        return getPartnersRemsNextChunkResult;
    }

    /**
     * Sets the value of the getPartnersRemsNextChunkResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfPartCashBankAccRemainsRow }{@code >}
     *     
     */
    public void setGetPartnersRemsNextChunkResult(JAXBElement<ChunkedResultOfPartCashBankAccRemainsRow> value) {
        this.getPartnersRemsNextChunkResult = ((JAXBElement<ChunkedResultOfPartCashBankAccRemainsRow> ) value);
    }

}
