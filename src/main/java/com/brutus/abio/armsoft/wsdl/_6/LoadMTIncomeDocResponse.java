
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
 *         &lt;element name="LoadMTIncomeDocResult" type="{http://www.armsoft.am/Accountant/6.0}MTIncomeDocInfo" minOccurs="0"/>
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
    "loadMTIncomeDocResult"
})
@XmlRootElement(name = "LoadMTIncomeDocResponse")
public class LoadMTIncomeDocResponse {

    @XmlElementRef(name = "LoadMTIncomeDocResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<MTIncomeDocInfo> loadMTIncomeDocResult;

    /**
     * Gets the value of the loadMTIncomeDocResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MTIncomeDocInfo }{@code >}
     *     
     */
    public JAXBElement<MTIncomeDocInfo> getLoadMTIncomeDocResult() {
        return loadMTIncomeDocResult;
    }

    /**
     * Sets the value of the loadMTIncomeDocResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MTIncomeDocInfo }{@code >}
     *     
     */
    public void setLoadMTIncomeDocResult(JAXBElement<MTIncomeDocInfo> value) {
        this.loadMTIncomeDocResult = ((JAXBElement<MTIncomeDocInfo> ) value);
    }

}
