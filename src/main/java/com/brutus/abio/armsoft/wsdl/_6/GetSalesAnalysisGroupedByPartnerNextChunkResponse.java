
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
 *         &lt;element name="GetSalesAnalysisGroupedByPartnerNextChunkResult" type="{http://www.armsoft.am/Accountant/6.0}ChunkedResultOfSalesAnalysisRowGroupedByPartner" minOccurs="0"/>
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
    "getSalesAnalysisGroupedByPartnerNextChunkResult"
})
@XmlRootElement(name = "GetSalesAnalysisGroupedByPartnerNextChunkResponse")
public class GetSalesAnalysisGroupedByPartnerNextChunkResponse {

    @XmlElementRef(name = "GetSalesAnalysisGroupedByPartnerNextChunkResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ChunkedResultOfSalesAnalysisRowGroupedByPartner> getSalesAnalysisGroupedByPartnerNextChunkResult;

    /**
     * Gets the value of the getSalesAnalysisGroupedByPartnerNextChunkResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfSalesAnalysisRowGroupedByPartner }{@code >}
     *     
     */
    public JAXBElement<ChunkedResultOfSalesAnalysisRowGroupedByPartner> getGetSalesAnalysisGroupedByPartnerNextChunkResult() {
        return getSalesAnalysisGroupedByPartnerNextChunkResult;
    }

    /**
     * Sets the value of the getSalesAnalysisGroupedByPartnerNextChunkResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfSalesAnalysisRowGroupedByPartner }{@code >}
     *     
     */
    public void setGetSalesAnalysisGroupedByPartnerNextChunkResult(JAXBElement<ChunkedResultOfSalesAnalysisRowGroupedByPartner> value) {
        this.getSalesAnalysisGroupedByPartnerNextChunkResult = ((JAXBElement<ChunkedResultOfSalesAnalysisRowGroupedByPartner> ) value);
    }

}
