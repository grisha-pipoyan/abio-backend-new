
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
 *         &lt;element name="LoadBankInDocResult" type="{http://www.armsoft.am/Accountant/6.0}BankInDocInfo" minOccurs="0"/>
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
    "loadBankInDocResult"
})
@XmlRootElement(name = "LoadBankInDocResponse")
public class LoadBankInDocResponse {

    @XmlElementRef(name = "LoadBankInDocResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<BankInDocInfo> loadBankInDocResult;

    /**
     * Gets the value of the loadBankInDocResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BankInDocInfo }{@code >}
     *     
     */
    public JAXBElement<BankInDocInfo> getLoadBankInDocResult() {
        return loadBankInDocResult;
    }

    /**
     * Sets the value of the loadBankInDocResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BankInDocInfo }{@code >}
     *     
     */
    public void setLoadBankInDocResult(JAXBElement<BankInDocInfo> value) {
        this.loadBankInDocResult = ((JAXBElement<BankInDocInfo> ) value);
    }

}
