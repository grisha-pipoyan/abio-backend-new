
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
 *         &lt;element name="GetProductsInfoNextChunkResult" type="{http://www.armsoft.am/Accountant/6.0}ChunkedResultOfCreateProductInfo" minOccurs="0"/>
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
    "getProductsInfoNextChunkResult"
})
@XmlRootElement(name = "GetProductsInfoNextChunkResponse")
public class GetProductsInfoNextChunkResponse {

    @XmlElementRef(name = "GetProductsInfoNextChunkResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ChunkedResultOfCreateProductInfo> getProductsInfoNextChunkResult;

    /**
     * Gets the value of the getProductsInfoNextChunkResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfCreateProductInfo }{@code >}
     *     
     */
    public JAXBElement<ChunkedResultOfCreateProductInfo> getGetProductsInfoNextChunkResult() {
        return getProductsInfoNextChunkResult;
    }

    /**
     * Sets the value of the getProductsInfoNextChunkResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfCreateProductInfo }{@code >}
     *     
     */
    public void setGetProductsInfoNextChunkResult(JAXBElement<ChunkedResultOfCreateProductInfo> value) {
        this.getProductsInfoNextChunkResult = ((JAXBElement<ChunkedResultOfCreateProductInfo> ) value);
    }

}
