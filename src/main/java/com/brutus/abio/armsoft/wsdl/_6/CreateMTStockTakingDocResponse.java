
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
 *         &lt;element name="CreateMTStockTakingDocResult" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
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
    "createMTStockTakingDocResult"
})
@XmlRootElement(name = "CreateMTStockTakingDocResponse")
public class CreateMTStockTakingDocResponse {

    @XmlElement(name = "CreateMTStockTakingDocResult")
    protected String createMTStockTakingDocResult;

    /**
     * Gets the value of the createMTStockTakingDocResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateMTStockTakingDocResult() {
        return createMTStockTakingDocResult;
    }

    /**
     * Sets the value of the createMTStockTakingDocResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateMTStockTakingDocResult(String value) {
        this.createMTStockTakingDocResult = value;
    }

}
