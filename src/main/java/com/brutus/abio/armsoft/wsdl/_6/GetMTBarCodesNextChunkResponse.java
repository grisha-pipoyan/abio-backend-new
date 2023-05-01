
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
 *         &lt;element name="GetMTBarCodesNextChunkResult" type="{http://www.armsoft.am/Accountant/6.0}ChunkedResultOfMTBarCodes" minOccurs="0"/>
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
    "getMTBarCodesNextChunkResult"
})
@XmlRootElement(name = "GetMTBarCodesNextChunkResponse")
public class GetMTBarCodesNextChunkResponse {

    @XmlElementRef(name = "GetMTBarCodesNextChunkResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ChunkedResultOfMTBarCodes> getMTBarCodesNextChunkResult;

    /**
     * Gets the value of the getMTBarCodesNextChunkResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfMTBarCodes }{@code >}
     *     
     */
    public JAXBElement<ChunkedResultOfMTBarCodes> getGetMTBarCodesNextChunkResult() {
        return getMTBarCodesNextChunkResult;
    }

    /**
     * Sets the value of the getMTBarCodesNextChunkResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfMTBarCodes }{@code >}
     *     
     */
    public void setGetMTBarCodesNextChunkResult(JAXBElement<ChunkedResultOfMTBarCodes> value) {
        this.getMTBarCodesNextChunkResult = ((JAXBElement<ChunkedResultOfMTBarCodes> ) value);
    }

}
