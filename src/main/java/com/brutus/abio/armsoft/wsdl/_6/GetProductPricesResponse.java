
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
 *         &lt;element name="GetProductPricesResult" type="{http://www.armsoft.am/Accountant/6.0}ChunkedResultOfPriceListRow" minOccurs="0"/>
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
    "getProductPricesResult"
})
@XmlRootElement(name = "GetProductPricesResponse")
public class GetProductPricesResponse {

    @XmlElementRef(name = "GetProductPricesResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ChunkedResultOfPriceListRow> getProductPricesResult;

    /**
     * Gets the value of the getProductPricesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfPriceListRow }{@code >}
     *     
     */
    public JAXBElement<ChunkedResultOfPriceListRow> getGetProductPricesResult() {
        return getProductPricesResult;
    }

    /**
     * Sets the value of the getProductPricesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfPriceListRow }{@code >}
     *     
     */
    public void setGetProductPricesResult(JAXBElement<ChunkedResultOfPriceListRow> value) {
        this.getProductPricesResult = ((JAXBElement<ChunkedResultOfPriceListRow> ) value);
    }

}
