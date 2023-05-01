
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
 *         &lt;element name="GetPartnersListResult" type="{http://www.armsoft.am/Accountant/6.0}ChunkedResultOfPartnerListRow" minOccurs="0"/>
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
    "getPartnersListResult"
})
@XmlRootElement(name = "GetPartnersListResponse")
public class GetPartnersListResponse {

    @XmlElementRef(name = "GetPartnersListResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ChunkedResultOfPartnerListRow> getPartnersListResult;

    /**
     * Gets the value of the getPartnersListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfPartnerListRow }{@code >}
     *     
     */
    public JAXBElement<ChunkedResultOfPartnerListRow> getGetPartnersListResult() {
        return getPartnersListResult;
    }

    /**
     * Sets the value of the getPartnersListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfPartnerListRow }{@code >}
     *     
     */
    public void setGetPartnersListResult(JAXBElement<ChunkedResultOfPartnerListRow> value) {
        this.getPartnersListResult = ((JAXBElement<ChunkedResultOfPartnerListRow> ) value);
    }

}
