
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
 *         &lt;element name="GetProductsInfoListByModifiedDateResult" type="{http://www.armsoft.am/Accountant/6.0}ChunkedResultOfCreateProductInfo" minOccurs="0"/>
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
    "getProductsInfoListByModifiedDateResult"
})
@XmlRootElement(name = "GetProductsInfoListByModifiedDateResponse")
public class GetProductsInfoListByModifiedDateResponse {

    @XmlElementRef(name = "GetProductsInfoListByModifiedDateResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ChunkedResultOfCreateProductInfo> getProductsInfoListByModifiedDateResult;

    /**
     * Gets the value of the getProductsInfoListByModifiedDateResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfCreateProductInfo }{@code >}
     *     
     */
    public JAXBElement<ChunkedResultOfCreateProductInfo> getGetProductsInfoListByModifiedDateResult() {
        return getProductsInfoListByModifiedDateResult;
    }

    /**
     * Sets the value of the getProductsInfoListByModifiedDateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfCreateProductInfo }{@code >}
     *     
     */
    public void setGetProductsInfoListByModifiedDateResult(JAXBElement<ChunkedResultOfCreateProductInfo> value) {
        this.getProductsInfoListByModifiedDateResult = ((JAXBElement<ChunkedResultOfCreateProductInfo> ) value);
    }

}
