
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
 *         &lt;element name="GetProductRemByCodeResult" type="{http://www.armsoft.am/Accountant/6.0}ChunkedResultOfGoodAvailabilityRow" minOccurs="0"/>
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
    "getProductRemByCodeResult"
})
@XmlRootElement(name = "GetProductRemByCodeResponse")
public class GetProductRemByCodeResponse {

    @XmlElementRef(name = "GetProductRemByCodeResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ChunkedResultOfGoodAvailabilityRow> getProductRemByCodeResult;

    /**
     * Gets the value of the getProductRemByCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfGoodAvailabilityRow }{@code >}
     *     
     */
    public JAXBElement<ChunkedResultOfGoodAvailabilityRow> getGetProductRemByCodeResult() {
        return getProductRemByCodeResult;
    }

    /**
     * Sets the value of the getProductRemByCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfGoodAvailabilityRow }{@code >}
     *     
     */
    public void setGetProductRemByCodeResult(JAXBElement<ChunkedResultOfGoodAvailabilityRow> value) {
        this.getProductRemByCodeResult = ((JAXBElement<ChunkedResultOfGoodAvailabilityRow> ) value);
    }

}
