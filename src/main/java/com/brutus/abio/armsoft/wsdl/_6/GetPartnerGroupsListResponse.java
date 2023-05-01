
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
 *         &lt;element name="GetPartnerGroupsListResult" type="{http://www.armsoft.am/Accountant/6.0}ArrayOfPartnerGroupListRow" minOccurs="0"/>
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
    "getPartnerGroupsListResult"
})
@XmlRootElement(name = "GetPartnerGroupsListResponse")
public class GetPartnerGroupsListResponse {

    @XmlElementRef(name = "GetPartnerGroupsListResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPartnerGroupListRow> getPartnerGroupsListResult;

    /**
     * Gets the value of the getPartnerGroupsListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPartnerGroupListRow }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPartnerGroupListRow> getGetPartnerGroupsListResult() {
        return getPartnerGroupsListResult;
    }

    /**
     * Sets the value of the getPartnerGroupsListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPartnerGroupListRow }{@code >}
     *     
     */
    public void setGetPartnerGroupsListResult(JAXBElement<ArrayOfPartnerGroupListRow> value) {
        this.getPartnerGroupsListResult = ((JAXBElement<ArrayOfPartnerGroupListRow> ) value);
    }

}
