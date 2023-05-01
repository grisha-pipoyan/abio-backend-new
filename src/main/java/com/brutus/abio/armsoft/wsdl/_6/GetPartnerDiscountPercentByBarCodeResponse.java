
package com.brutus.abio.armsoft.wsdl._6;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


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
 *         &lt;element name="GetPartnerDiscountPercentByBarCodeResult" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
    "getPartnerDiscountPercentByBarCodeResult"
})
@XmlRootElement(name = "GetPartnerDiscountPercentByBarCodeResponse")
public class GetPartnerDiscountPercentByBarCodeResponse {

    @XmlElement(name = "GetPartnerDiscountPercentByBarCodeResult")
    protected BigDecimal getPartnerDiscountPercentByBarCodeResult;

    /**
     * Gets the value of the getPartnerDiscountPercentByBarCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGetPartnerDiscountPercentByBarCodeResult() {
        return getPartnerDiscountPercentByBarCodeResult;
    }

    /**
     * Sets the value of the getPartnerDiscountPercentByBarCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGetPartnerDiscountPercentByBarCodeResult(BigDecimal value) {
        this.getPartnerDiscountPercentByBarCodeResult = value;
    }

}
