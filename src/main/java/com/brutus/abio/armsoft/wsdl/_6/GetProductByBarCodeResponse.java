
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
 *         &lt;element name="GetProductByBarCodeResult" type="{http://www.armsoft.am/Accountant/6.0}ProductListRow" minOccurs="0"/>
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
    "getProductByBarCodeResult"
})
@XmlRootElement(name = "GetProductByBarCodeResponse")
public class GetProductByBarCodeResponse {

    @XmlElementRef(name = "GetProductByBarCodeResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ProductListRow> getProductByBarCodeResult;

    /**
     * Gets the value of the getProductByBarCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProductListRow }{@code >}
     *     
     */
    public JAXBElement<ProductListRow> getGetProductByBarCodeResult() {
        return getProductByBarCodeResult;
    }

    /**
     * Sets the value of the getProductByBarCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProductListRow }{@code >}
     *     
     */
    public void setGetProductByBarCodeResult(JAXBElement<ProductListRow> value) {
        this.getProductByBarCodeResult = ((JAXBElement<ProductListRow> ) value);
    }

}
