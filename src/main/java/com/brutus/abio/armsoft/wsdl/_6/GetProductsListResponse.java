
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
 *         &lt;element name="GetProductsListResult" type="{http://www.armsoft.am/Accountant/6.0}ChunkedResultOfProductListRow" minOccurs="0"/>
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
    "getProductsListResult"
})
@XmlRootElement(name = "GetProductsListResponse")
public class GetProductsListResponse {

    @XmlElementRef(name = "GetProductsListResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ChunkedResultOfProductListRow> getProductsListResult;

    /**
     * Gets the value of the getProductsListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfProductListRow }{@code >}
     *     
     */
    public JAXBElement<ChunkedResultOfProductListRow> getGetProductsListResult() {
        return getProductsListResult;
    }

    /**
     * Sets the value of the getProductsListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfProductListRow }{@code >}
     *     
     */
    public void setGetProductsListResult(JAXBElement<ChunkedResultOfProductListRow> value) {
        this.getProductsListResult = ((JAXBElement<ChunkedResultOfProductListRow> ) value);
    }

}
