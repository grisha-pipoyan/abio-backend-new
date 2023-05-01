
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
 *         &lt;element name="LoadCashInDocResult" type="{http://www.armsoft.am/Accountant/6.0}CashInDocInfo" minOccurs="0"/>
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
    "loadCashInDocResult"
})
@XmlRootElement(name = "LoadCashInDocResponse")
public class LoadCashInDocResponse {

    @XmlElementRef(name = "LoadCashInDocResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<CashInDocInfo> loadCashInDocResult;

    /**
     * Gets the value of the loadCashInDocResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CashInDocInfo }{@code >}
     *     
     */
    public JAXBElement<CashInDocInfo> getLoadCashInDocResult() {
        return loadCashInDocResult;
    }

    /**
     * Sets the value of the loadCashInDocResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CashInDocInfo }{@code >}
     *     
     */
    public void setLoadCashInDocResult(JAXBElement<CashInDocInfo> value) {
        this.loadCashInDocResult = ((JAXBElement<CashInDocInfo> ) value);
    }

}
