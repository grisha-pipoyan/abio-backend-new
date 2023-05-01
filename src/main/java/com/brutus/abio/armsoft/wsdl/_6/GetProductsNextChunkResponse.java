
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
 *         &lt;element name="GetProductsNextChunkResult" type="{http://www.armsoft.am/Accountant/6.0}ChunkedResultOfProductListRow" minOccurs="0"/>
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
    "getProductsNextChunkResult"
})
@XmlRootElement(name = "GetProductsNextChunkResponse")
public class GetProductsNextChunkResponse {

    @XmlElementRef(name = "GetProductsNextChunkResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ChunkedResultOfProductListRow> getProductsNextChunkResult;

    /**
     * Gets the value of the getProductsNextChunkResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfProductListRow }{@code >}
     *     
     */
    public JAXBElement<ChunkedResultOfProductListRow> getGetProductsNextChunkResult() {
        return getProductsNextChunkResult;
    }

    /**
     * Sets the value of the getProductsNextChunkResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfProductListRow }{@code >}
     *     
     */
    public void setGetProductsNextChunkResult(JAXBElement<ChunkedResultOfProductListRow> value) {
        this.getProductsNextChunkResult = ((JAXBElement<ChunkedResultOfProductListRow> ) value);
    }

}
