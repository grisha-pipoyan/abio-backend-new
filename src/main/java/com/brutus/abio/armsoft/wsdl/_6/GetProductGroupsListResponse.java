
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
 *         &lt;element name="GetProductGroupsListResult" type="{http://www.armsoft.am/Accountant/6.0}ArrayOfProductGroupListRow" minOccurs="0"/>
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
    "getProductGroupsListResult"
})
@XmlRootElement(name = "GetProductGroupsListResponse")
public class GetProductGroupsListResponse {

    @XmlElementRef(name = "GetProductGroupsListResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ArrayOfProductGroupListRow> getProductGroupsListResult;

    /**
     * Gets the value of the getProductGroupsListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProductGroupListRow }{@code >}
     *     
     */
    public JAXBElement<ArrayOfProductGroupListRow> getGetProductGroupsListResult() {
        return getProductGroupsListResult;
    }

    /**
     * Sets the value of the getProductGroupsListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProductGroupListRow }{@code >}
     *     
     */
    public void setGetProductGroupsListResult(JAXBElement<ArrayOfProductGroupListRow> value) {
        this.getProductGroupsListResult = ((JAXBElement<ArrayOfProductGroupListRow> ) value);
    }

}
