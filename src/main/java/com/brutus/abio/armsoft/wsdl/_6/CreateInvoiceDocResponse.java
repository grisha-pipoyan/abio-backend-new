
package com.brutus.abio.armsoft.wsdl._6;

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
 *         &lt;element name="CreateInvoiceDocResult" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
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
    "createInvoiceDocResult"
})
@XmlRootElement(name = "CreateInvoiceDocResponse")
public class CreateInvoiceDocResponse {

    @XmlElement(name = "CreateInvoiceDocResult")
    protected String createInvoiceDocResult;

    /**
     * Gets the value of the createInvoiceDocResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateInvoiceDocResult() {
        return createInvoiceDocResult;
    }

    /**
     * Sets the value of the createInvoiceDocResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateInvoiceDocResult(String value) {
        this.createInvoiceDocResult = value;
    }

}
