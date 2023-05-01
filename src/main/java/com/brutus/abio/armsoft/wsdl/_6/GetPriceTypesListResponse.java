
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
 *         &lt;element name="GetPriceTypesListResult" type="{http://www.armsoft.am/Accountant/6.0}ArrayOfPriceTypeListRow" minOccurs="0"/>
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
    "getPriceTypesListResult"
})
@XmlRootElement(name = "GetPriceTypesListResponse")
public class GetPriceTypesListResponse {

    @XmlElementRef(name = "GetPriceTypesListResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPriceTypeListRow> getPriceTypesListResult;

    /**
     * Gets the value of the getPriceTypesListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPriceTypeListRow }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPriceTypeListRow> getGetPriceTypesListResult() {
        return getPriceTypesListResult;
    }

    /**
     * Sets the value of the getPriceTypesListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPriceTypeListRow }{@code >}
     *     
     */
    public void setGetPriceTypesListResult(JAXBElement<ArrayOfPriceTypeListRow> value) {
        this.getPriceTypesListResult = ((JAXBElement<ArrayOfPriceTypeListRow> ) value);
    }

}
