
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
 *         &lt;element name="GetProductByNameWithImageResult" type="{http://www.armsoft.am/Accountant/6.0}ProductListRow" minOccurs="0"/>
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
    "getProductByNameWithImageResult"
})
@XmlRootElement(name = "GetProductByNameWithImageResponse")
public class GetProductByNameWithImageResponse {

    @XmlElementRef(name = "GetProductByNameWithImageResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ProductListRow> getProductByNameWithImageResult;

    /**
     * Gets the value of the getProductByNameWithImageResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProductListRow }{@code >}
     *     
     */
    public JAXBElement<ProductListRow> getGetProductByNameWithImageResult() {
        return getProductByNameWithImageResult;
    }

    /**
     * Sets the value of the getProductByNameWithImageResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProductListRow }{@code >}
     *     
     */
    public void setGetProductByNameWithImageResult(JAXBElement<ProductListRow> value) {
        this.getProductByNameWithImageResult = ((JAXBElement<ProductListRow> ) value);
    }

}
