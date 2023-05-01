
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
 *         &lt;element name="GetCountriesListResult" type="{http://www.armsoft.am/Accountant/6.0}ChunkedResultOfCodeCaptionListRow" minOccurs="0"/>
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
    "getCountriesListResult"
})
@XmlRootElement(name = "GetCountriesListResponse")
public class GetCountriesListResponse {

    @XmlElementRef(name = "GetCountriesListResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ChunkedResultOfCodeCaptionListRow> getCountriesListResult;

    /**
     * Gets the value of the getCountriesListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfCodeCaptionListRow }{@code >}
     *     
     */
    public JAXBElement<ChunkedResultOfCodeCaptionListRow> getGetCountriesListResult() {
        return getCountriesListResult;
    }

    /**
     * Sets the value of the getCountriesListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfCodeCaptionListRow }{@code >}
     *     
     */
    public void setGetCountriesListResult(JAXBElement<ChunkedResultOfCodeCaptionListRow> value) {
        this.getCountriesListResult = ((JAXBElement<ChunkedResultOfCodeCaptionListRow> ) value);
    }

}
