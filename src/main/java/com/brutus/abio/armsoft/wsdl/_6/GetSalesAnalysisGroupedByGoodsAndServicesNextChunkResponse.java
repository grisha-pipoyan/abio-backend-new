
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
 *         &lt;element name="GetSalesAnalysisGroupedByGoodsAndServicesNextChunkResult" type="{http://www.armsoft.am/Accountant/6.0}ChunkedResultOfSalesAnalysisRowGroupedbyGoodsAndServices" minOccurs="0"/>
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
    "getSalesAnalysisGroupedByGoodsAndServicesNextChunkResult"
})
@XmlRootElement(name = "GetSalesAnalysisGroupedByGoodsAndServicesNextChunkResponse")
public class GetSalesAnalysisGroupedByGoodsAndServicesNextChunkResponse {

    @XmlElementRef(name = "GetSalesAnalysisGroupedByGoodsAndServicesNextChunkResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ChunkedResultOfSalesAnalysisRowGroupedbyGoodsAndServices> getSalesAnalysisGroupedByGoodsAndServicesNextChunkResult;

    /**
     * Gets the value of the getSalesAnalysisGroupedByGoodsAndServicesNextChunkResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfSalesAnalysisRowGroupedbyGoodsAndServices }{@code >}
     *     
     */
    public JAXBElement<ChunkedResultOfSalesAnalysisRowGroupedbyGoodsAndServices> getGetSalesAnalysisGroupedByGoodsAndServicesNextChunkResult() {
        return getSalesAnalysisGroupedByGoodsAndServicesNextChunkResult;
    }

    /**
     * Sets the value of the getSalesAnalysisGroupedByGoodsAndServicesNextChunkResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfSalesAnalysisRowGroupedbyGoodsAndServices }{@code >}
     *     
     */
    public void setGetSalesAnalysisGroupedByGoodsAndServicesNextChunkResult(JAXBElement<ChunkedResultOfSalesAnalysisRowGroupedbyGoodsAndServices> value) {
        this.getSalesAnalysisGroupedByGoodsAndServicesNextChunkResult = ((JAXBElement<ChunkedResultOfSalesAnalysisRowGroupedbyGoodsAndServices> ) value);
    }

}
