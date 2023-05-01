
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
 *         &lt;element name="GetCashesRemainsResult" type="{http://www.armsoft.am/Accountant/6.0}ChunkedResultOfCashRemains" minOccurs="0"/>
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
    "getCashesRemainsResult"
})
@XmlRootElement(name = "GetCashesRemainsResponse")
public class GetCashesRemainsResponse {

    @XmlElementRef(name = "GetCashesRemainsResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ChunkedResultOfCashRemains> getCashesRemainsResult;

    /**
     * Gets the value of the getCashesRemainsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfCashRemains }{@code >}
     *     
     */
    public JAXBElement<ChunkedResultOfCashRemains> getGetCashesRemainsResult() {
        return getCashesRemainsResult;
    }

    /**
     * Sets the value of the getCashesRemainsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfCashRemains }{@code >}
     *     
     */
    public void setGetCashesRemainsResult(JAXBElement<ChunkedResultOfCashRemains> value) {
        this.getCashesRemainsResult = ((JAXBElement<ChunkedResultOfCashRemains> ) value);
    }

}
