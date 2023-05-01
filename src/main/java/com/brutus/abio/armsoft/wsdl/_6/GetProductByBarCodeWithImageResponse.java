
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
 *         &lt;element name="GetProductByBarCodeWithImageResult" type="{http://www.armsoft.am/Accountant/6.0}ProductListRow" minOccurs="0"/>
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
    "getProductByBarCodeWithImageResult"
})
@XmlRootElement(name = "GetProductByBarCodeWithImageResponse")
public class GetProductByBarCodeWithImageResponse {

    @XmlElementRef(name = "GetProductByBarCodeWithImageResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ProductListRow> getProductByBarCodeWithImageResult;

    /**
     * Gets the value of the getProductByBarCodeWithImageResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProductListRow }{@code >}
     *     
     */
    public JAXBElement<ProductListRow> getGetProductByBarCodeWithImageResult() {
        return getProductByBarCodeWithImageResult;
    }

    /**
     * Sets the value of the getProductByBarCodeWithImageResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProductListRow }{@code >}
     *     
     */
    public void setGetProductByBarCodeWithImageResult(JAXBElement<ProductListRow> value) {
        this.getProductByBarCodeWithImageResult = ((JAXBElement<ProductListRow> ) value);
    }

}
