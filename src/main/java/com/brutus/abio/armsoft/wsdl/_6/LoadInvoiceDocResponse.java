
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
 *         &lt;element name="LoadInvoiceDocResult" type="{http://www.armsoft.am/Accountant/6.0}CreateInvoiceDocInfo" minOccurs="0"/>
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
    "loadInvoiceDocResult"
})
@XmlRootElement(name = "LoadInvoiceDocResponse")
public class LoadInvoiceDocResponse {

    @XmlElementRef(name = "LoadInvoiceDocResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<CreateInvoiceDocInfo> loadInvoiceDocResult;

    /**
     * Gets the value of the loadInvoiceDocResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreateInvoiceDocInfo }{@code >}
     *     
     */
    public JAXBElement<CreateInvoiceDocInfo> getLoadInvoiceDocResult() {
        return loadInvoiceDocResult;
    }

    /**
     * Sets the value of the loadInvoiceDocResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreateInvoiceDocInfo }{@code >}
     *     
     */
    public void setLoadInvoiceDocResult(JAXBElement<CreateInvoiceDocInfo> value) {
        this.loadInvoiceDocResult = ((JAXBElement<CreateInvoiceDocInfo> ) value);
    }

}
