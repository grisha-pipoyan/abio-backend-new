
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
 *         &lt;element name="GetForETLDocumentsListResult" type="{http://www.armsoft.am/Accountant/6.0}ChunkedResultOfDocumentsListRow" minOccurs="0"/>
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
    "getForETLDocumentsListResult"
})
@XmlRootElement(name = "GetForETLDocumentsListResponse")
public class GetForETLDocumentsListResponse {

    @XmlElementRef(name = "GetForETLDocumentsListResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ChunkedResultOfDocumentsListRow> getForETLDocumentsListResult;

    /**
     * Gets the value of the getForETLDocumentsListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfDocumentsListRow }{@code >}
     *     
     */
    public JAXBElement<ChunkedResultOfDocumentsListRow> getGetForETLDocumentsListResult() {
        return getForETLDocumentsListResult;
    }

    /**
     * Sets the value of the getForETLDocumentsListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfDocumentsListRow }{@code >}
     *     
     */
    public void setGetForETLDocumentsListResult(JAXBElement<ChunkedResultOfDocumentsListRow> value) {
        this.getForETLDocumentsListResult = ((JAXBElement<ChunkedResultOfDocumentsListRow> ) value);
    }

}
