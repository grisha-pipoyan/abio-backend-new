
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
 *         &lt;element name="GetProductsInfoListResult" type="{http://www.armsoft.am/Accountant/6.0}ChunkedResultOfCreateProductInfo" minOccurs="0"/>
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
    "getProductsInfoListResult"
})
@XmlRootElement(name = "GetProductsInfoListResponse")
public class GetProductsInfoListResponse {

    @XmlElementRef(name = "GetProductsInfoListResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ChunkedResultOfCreateProductInfo> getProductsInfoListResult;

    /**
     * Gets the value of the getProductsInfoListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfCreateProductInfo }{@code >}
     *     
     */
    public JAXBElement<ChunkedResultOfCreateProductInfo> getGetProductsInfoListResult() {
        return getProductsInfoListResult;
    }

    /**
     * Sets the value of the getProductsInfoListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfCreateProductInfo }{@code >}
     *     
     */
    public void setGetProductsInfoListResult(JAXBElement<ChunkedResultOfCreateProductInfo> value) {
        this.getProductsInfoListResult = ((JAXBElement<ChunkedResultOfCreateProductInfo> ) value);
    }

}
