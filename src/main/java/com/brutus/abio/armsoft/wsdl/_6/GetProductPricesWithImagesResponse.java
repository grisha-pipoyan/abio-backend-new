
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
 *         &lt;element name="GetProductPricesWithImagesResult" type="{http://www.armsoft.am/Accountant/6.0}ChunkedResultOfPriceListRow" minOccurs="0"/>
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
    "getProductPricesWithImagesResult"
})
@XmlRootElement(name = "GetProductPricesWithImagesResponse")
public class GetProductPricesWithImagesResponse {

    @XmlElementRef(name = "GetProductPricesWithImagesResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ChunkedResultOfPriceListRow> getProductPricesWithImagesResult;

    /**
     * Gets the value of the getProductPricesWithImagesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfPriceListRow }{@code >}
     *     
     */
    public JAXBElement<ChunkedResultOfPriceListRow> getGetProductPricesWithImagesResult() {
        return getProductPricesWithImagesResult;
    }

    /**
     * Sets the value of the getProductPricesWithImagesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfPriceListRow }{@code >}
     *     
     */
    public void setGetProductPricesWithImagesResult(JAXBElement<ChunkedResultOfPriceListRow> value) {
        this.getProductPricesWithImagesResult = ((JAXBElement<ChunkedResultOfPriceListRow> ) value);
    }

}
