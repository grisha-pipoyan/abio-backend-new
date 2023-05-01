
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
 *         &lt;element name="UpdateDocETLStateResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "updateDocETLStateResult"
})
@XmlRootElement(name = "UpdateDocETLStateResponse")
public class UpdateDocETLStateResponse {

    @XmlElement(name = "UpdateDocETLStateResult")
    protected Boolean updateDocETLStateResult;

    /**
     * Gets the value of the updateDocETLStateResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpdateDocETLStateResult() {
        return updateDocETLStateResult;
    }

    /**
     * Sets the value of the updateDocETLStateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateDocETLStateResult(Boolean value) {
        this.updateDocETLStateResult = value;
    }

}
