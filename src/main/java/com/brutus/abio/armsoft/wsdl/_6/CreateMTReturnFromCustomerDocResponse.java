
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
 *         &lt;element name="CreateMTReturnFromCustomerDocResult" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
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
    "createMTReturnFromCustomerDocResult"
})
@XmlRootElement(name = "CreateMTReturnFromCustomerDocResponse")
public class CreateMTReturnFromCustomerDocResponse {

    @XmlElement(name = "CreateMTReturnFromCustomerDocResult")
    protected String createMTReturnFromCustomerDocResult;

    /**
     * Gets the value of the createMTReturnFromCustomerDocResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateMTReturnFromCustomerDocResult() {
        return createMTReturnFromCustomerDocResult;
    }

    /**
     * Sets the value of the createMTReturnFromCustomerDocResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateMTReturnFromCustomerDocResult(String value) {
        this.createMTReturnFromCustomerDocResult = value;
    }

}
