
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
 *         &lt;element name="LoadInternalMoveDocResult" type="{http://www.armsoft.am/Accountant/6.0}CreateInternalMoveDocInfo" minOccurs="0"/>
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
    "loadInternalMoveDocResult"
})
@XmlRootElement(name = "LoadInternalMoveDocResponse")
public class LoadInternalMoveDocResponse {

    @XmlElementRef(name = "LoadInternalMoveDocResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<CreateInternalMoveDocInfo> loadInternalMoveDocResult;

    /**
     * Gets the value of the loadInternalMoveDocResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreateInternalMoveDocInfo }{@code >}
     *     
     */
    public JAXBElement<CreateInternalMoveDocInfo> getLoadInternalMoveDocResult() {
        return loadInternalMoveDocResult;
    }

    /**
     * Sets the value of the loadInternalMoveDocResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreateInternalMoveDocInfo }{@code >}
     *     
     */
    public void setLoadInternalMoveDocResult(JAXBElement<CreateInternalMoveDocInfo> value) {
        this.loadInternalMoveDocResult = ((JAXBElement<CreateInternalMoveDocInfo> ) value);
    }

}
