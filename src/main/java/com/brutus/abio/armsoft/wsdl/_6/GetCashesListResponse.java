
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
 *         &lt;element name="GetCashesListResult" type="{http://www.armsoft.am/Accountant/6.0}ArrayOfCashListRow" minOccurs="0"/>
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
    "getCashesListResult"
})
@XmlRootElement(name = "GetCashesListResponse")
public class GetCashesListResponse {

    @XmlElementRef(name = "GetCashesListResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCashListRow> getCashesListResult;

    /**
     * Gets the value of the getCashesListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCashListRow }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCashListRow> getGetCashesListResult() {
        return getCashesListResult;
    }

    /**
     * Sets the value of the getCashesListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCashListRow }{@code >}
     *     
     */
    public void setGetCashesListResult(JAXBElement<ArrayOfCashListRow> value) {
        this.getCashesListResult = ((JAXBElement<ArrayOfCashListRow> ) value);
    }

}
