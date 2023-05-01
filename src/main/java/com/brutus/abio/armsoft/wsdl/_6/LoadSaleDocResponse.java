
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
 *         &lt;element name="LoadSaleDocResult" type="{http://www.armsoft.am/Accountant/6.0}CreateSaleDocInfo" minOccurs="0"/>
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
    "loadSaleDocResult"
})
@XmlRootElement(name = "LoadSaleDocResponse")
public class LoadSaleDocResponse {

    @XmlElementRef(name = "LoadSaleDocResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<CreateSaleDocInfo> loadSaleDocResult;

    /**
     * Gets the value of the loadSaleDocResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreateSaleDocInfo }{@code >}
     *     
     */
    public JAXBElement<CreateSaleDocInfo> getLoadSaleDocResult() {
        return loadSaleDocResult;
    }

    /**
     * Sets the value of the loadSaleDocResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreateSaleDocInfo }{@code >}
     *     
     */
    public void setLoadSaleDocResult(JAXBElement<CreateSaleDocInfo> value) {
        this.loadSaleDocResult = ((JAXBElement<CreateSaleDocInfo> ) value);
    }

}
