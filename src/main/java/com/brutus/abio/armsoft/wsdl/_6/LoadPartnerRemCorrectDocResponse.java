
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
 *         &lt;element name="LoadPartnerRemCorrectDocResult" type="{http://www.armsoft.am/Accountant/6.0}PartnerRemCorrectDocInfo" minOccurs="0"/>
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
    "loadPartnerRemCorrectDocResult"
})
@XmlRootElement(name = "LoadPartnerRemCorrectDocResponse")
public class LoadPartnerRemCorrectDocResponse {

    @XmlElementRef(name = "LoadPartnerRemCorrectDocResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<PartnerRemCorrectDocInfo> loadPartnerRemCorrectDocResult;

    /**
     * Gets the value of the loadPartnerRemCorrectDocResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PartnerRemCorrectDocInfo }{@code >}
     *     
     */
    public JAXBElement<PartnerRemCorrectDocInfo> getLoadPartnerRemCorrectDocResult() {
        return loadPartnerRemCorrectDocResult;
    }

    /**
     * Sets the value of the loadPartnerRemCorrectDocResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PartnerRemCorrectDocInfo }{@code >}
     *     
     */
    public void setLoadPartnerRemCorrectDocResult(JAXBElement<PartnerRemCorrectDocInfo> value) {
        this.loadPartnerRemCorrectDocResult = ((JAXBElement<PartnerRemCorrectDocInfo> ) value);
    }

}
