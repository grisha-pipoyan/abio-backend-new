
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
 *         &lt;element name="GetProductRemsResult" type="{http://www.armsoft.am/Accountant/6.0}ChunkedResultOfGoodAvailabilityRow" minOccurs="0"/>
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
    "getProductRemsResult"
})
@XmlRootElement(name = "GetProductRemsResponse")
public class GetProductRemsResponse {

    @XmlElementRef(name = "GetProductRemsResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ChunkedResultOfGoodAvailabilityRow> getProductRemsResult;

    /**
     * Gets the value of the getProductRemsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfGoodAvailabilityRow }{@code >}
     *     
     */
    public JAXBElement<ChunkedResultOfGoodAvailabilityRow> getGetProductRemsResult() {
        return getProductRemsResult;
    }

    /**
     * Sets the value of the getProductRemsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfGoodAvailabilityRow }{@code >}
     *     
     */
    public void setGetProductRemsResult(JAXBElement<ChunkedResultOfGoodAvailabilityRow> value) {
        this.getProductRemsResult = ((JAXBElement<ChunkedResultOfGoodAvailabilityRow> ) value);
    }

}
