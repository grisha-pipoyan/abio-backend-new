
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
 *         &lt;element name="GetStorageByCodeResult" type="{http://www.armsoft.am/Accountant/6.0}StorageListRow" minOccurs="0"/>
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
    "getStorageByCodeResult"
})
@XmlRootElement(name = "GetStorageByCodeResponse")
public class GetStorageByCodeResponse {

    @XmlElementRef(name = "GetStorageByCodeResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<StorageListRow> getStorageByCodeResult;

    /**
     * Gets the value of the getStorageByCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StorageListRow }{@code >}
     *     
     */
    public JAXBElement<StorageListRow> getGetStorageByCodeResult() {
        return getStorageByCodeResult;
    }

    /**
     * Sets the value of the getStorageByCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StorageListRow }{@code >}
     *     
     */
    public void setGetStorageByCodeResult(JAXBElement<StorageListRow> value) {
        this.getStorageByCodeResult = ((JAXBElement<StorageListRow> ) value);
    }

}
