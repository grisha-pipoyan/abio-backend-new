
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
 *         &lt;element name="CreateMTExpenseDocResult" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
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
    "createMTExpenseDocResult"
})
@XmlRootElement(name = "CreateMTExpenseDocResponse")
public class CreateMTExpenseDocResponse {

    @XmlElement(name = "CreateMTExpenseDocResult")
    protected String createMTExpenseDocResult;

    /**
     * Gets the value of the createMTExpenseDocResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateMTExpenseDocResult() {
        return createMTExpenseDocResult;
    }

    /**
     * Sets the value of the createMTExpenseDocResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateMTExpenseDocResult(String value) {
        this.createMTExpenseDocResult = value;
    }

}
