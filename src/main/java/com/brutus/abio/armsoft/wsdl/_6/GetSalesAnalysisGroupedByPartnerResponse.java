
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
 *         &lt;element name="GetSalesAnalysisGroupedByPartnerResult" type="{http://www.armsoft.am/Accountant/6.0}ChunkedResultOfSalesAnalysisRowGroupedByPartner" minOccurs="0"/>
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
    "getSalesAnalysisGroupedByPartnerResult"
})
@XmlRootElement(name = "GetSalesAnalysisGroupedByPartnerResponse")
public class GetSalesAnalysisGroupedByPartnerResponse {

    @XmlElementRef(name = "GetSalesAnalysisGroupedByPartnerResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ChunkedResultOfSalesAnalysisRowGroupedByPartner> getSalesAnalysisGroupedByPartnerResult;

    /**
     * Gets the value of the getSalesAnalysisGroupedByPartnerResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfSalesAnalysisRowGroupedByPartner }{@code >}
     *     
     */
    public JAXBElement<ChunkedResultOfSalesAnalysisRowGroupedByPartner> getGetSalesAnalysisGroupedByPartnerResult() {
        return getSalesAnalysisGroupedByPartnerResult;
    }

    /**
     * Sets the value of the getSalesAnalysisGroupedByPartnerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfSalesAnalysisRowGroupedByPartner }{@code >}
     *     
     */
    public void setGetSalesAnalysisGroupedByPartnerResult(JAXBElement<ChunkedResultOfSalesAnalysisRowGroupedByPartner> value) {
        this.getSalesAnalysisGroupedByPartnerResult = ((JAXBElement<ChunkedResultOfSalesAnalysisRowGroupedByPartner> ) value);
    }

}
