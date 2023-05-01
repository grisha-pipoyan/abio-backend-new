
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
 *         &lt;element name="GetProducersListResult" type="{http://www.armsoft.am/Accountant/6.0}ChunkedResultOfCodeCaptionListRow" minOccurs="0"/>
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
    "getProducersListResult"
})
@XmlRootElement(name = "GetProducersListResponse")
public class GetProducersListResponse {

    @XmlElementRef(name = "GetProducersListResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ChunkedResultOfCodeCaptionListRow> getProducersListResult;

    /**
     * Gets the value of the getProducersListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfCodeCaptionListRow }{@code >}
     *     
     */
    public JAXBElement<ChunkedResultOfCodeCaptionListRow> getGetProducersListResult() {
        return getProducersListResult;
    }

    /**
     * Sets the value of the getProducersListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfCodeCaptionListRow }{@code >}
     *     
     */
    public void setGetProducersListResult(JAXBElement<ChunkedResultOfCodeCaptionListRow> value) {
        this.getProducersListResult = ((JAXBElement<ChunkedResultOfCodeCaptionListRow> ) value);
    }

}
