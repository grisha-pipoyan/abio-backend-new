
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
 *         &lt;element name="LoadCashOutDocResult" type="{http://www.armsoft.am/Accountant/6.0}CashOutDocInfo" minOccurs="0"/>
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
    "loadCashOutDocResult"
})
@XmlRootElement(name = "LoadCashOutDocResponse")
public class LoadCashOutDocResponse {

    @XmlElementRef(name = "LoadCashOutDocResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<CashOutDocInfo> loadCashOutDocResult;

    /**
     * Gets the value of the loadCashOutDocResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CashOutDocInfo }{@code >}
     *     
     */
    public JAXBElement<CashOutDocInfo> getLoadCashOutDocResult() {
        return loadCashOutDocResult;
    }

    /**
     * Sets the value of the loadCashOutDocResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CashOutDocInfo }{@code >}
     *     
     */
    public void setLoadCashOutDocResult(JAXBElement<CashOutDocInfo> value) {
        this.loadCashOutDocResult = ((JAXBElement<CashOutDocInfo> ) value);
    }

}
