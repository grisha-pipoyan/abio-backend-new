
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
 *         &lt;element name="GetStoragesListResult" type="{http://www.armsoft.am/Accountant/6.0}ArrayOfStorageListRow" minOccurs="0"/>
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
    "getStoragesListResult"
})
@XmlRootElement(name = "GetStoragesListResponse")
public class GetStoragesListResponse {

    @XmlElementRef(name = "GetStoragesListResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ArrayOfStorageListRow> getStoragesListResult;

    /**
     * Gets the value of the getStoragesListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStorageListRow }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStorageListRow> getGetStoragesListResult() {
        return getStoragesListResult;
    }

    /**
     * Sets the value of the getStoragesListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStorageListRow }{@code >}
     *     
     */
    public void setGetStoragesListResult(JAXBElement<ArrayOfStorageListRow> value) {
        this.getStoragesListResult = ((JAXBElement<ArrayOfStorageListRow> ) value);
    }

}
