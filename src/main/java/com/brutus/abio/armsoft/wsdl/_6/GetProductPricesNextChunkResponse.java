
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
 *         &lt;element name="GetProductPricesNextChunkResult" type="{http://www.armsoft.am/Accountant/6.0}ChunkedResultOfPriceListRow" minOccurs="0"/>
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
    "getProductPricesNextChunkResult"
})
@XmlRootElement(name = "GetProductPricesNextChunkResponse")
public class GetProductPricesNextChunkResponse {

    @XmlElementRef(name = "GetProductPricesNextChunkResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ChunkedResultOfPriceListRow> getProductPricesNextChunkResult;

    /**
     * Gets the value of the getProductPricesNextChunkResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfPriceListRow }{@code >}
     *     
     */
    public JAXBElement<ChunkedResultOfPriceListRow> getGetProductPricesNextChunkResult() {
        return getProductPricesNextChunkResult;
    }

    /**
     * Sets the value of the getProductPricesNextChunkResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfPriceListRow }{@code >}
     *     
     */
    public void setGetProductPricesNextChunkResult(JAXBElement<ChunkedResultOfPriceListRow> value) {
        this.getProductPricesNextChunkResult = ((JAXBElement<ChunkedResultOfPriceListRow> ) value);
    }

}
