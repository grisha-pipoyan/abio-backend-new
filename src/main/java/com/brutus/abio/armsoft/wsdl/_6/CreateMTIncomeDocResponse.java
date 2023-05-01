
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
 *         &lt;element name="CreateMTIncomeDocResult" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
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
    "createMTIncomeDocResult"
})
@XmlRootElement(name = "CreateMTIncomeDocResponse")
public class CreateMTIncomeDocResponse {

    @XmlElement(name = "CreateMTIncomeDocResult")
    protected String createMTIncomeDocResult;

    /**
     * Gets the value of the createMTIncomeDocResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateMTIncomeDocResult() {
        return createMTIncomeDocResult;
    }

    /**
     * Sets the value of the createMTIncomeDocResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateMTIncomeDocResult(String value) {
        this.createMTIncomeDocResult = value;
    }

}
