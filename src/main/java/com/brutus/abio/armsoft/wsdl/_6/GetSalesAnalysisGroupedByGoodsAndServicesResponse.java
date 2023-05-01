
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
 *         &lt;element name="GetSalesAnalysisGroupedByGoodsAndServicesResult" type="{http://www.armsoft.am/Accountant/6.0}ChunkedResultOfSalesAnalysisRowGroupedbyGoodsAndServices" minOccurs="0"/>
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
    "getSalesAnalysisGroupedByGoodsAndServicesResult"
})
@XmlRootElement(name = "GetSalesAnalysisGroupedByGoodsAndServicesResponse")
public class GetSalesAnalysisGroupedByGoodsAndServicesResponse {

    @XmlElementRef(name = "GetSalesAnalysisGroupedByGoodsAndServicesResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ChunkedResultOfSalesAnalysisRowGroupedbyGoodsAndServices> getSalesAnalysisGroupedByGoodsAndServicesResult;

    /**
     * Gets the value of the getSalesAnalysisGroupedByGoodsAndServicesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfSalesAnalysisRowGroupedbyGoodsAndServices }{@code >}
     *     
     */
    public JAXBElement<ChunkedResultOfSalesAnalysisRowGroupedbyGoodsAndServices> getGetSalesAnalysisGroupedByGoodsAndServicesResult() {
        return getSalesAnalysisGroupedByGoodsAndServicesResult;
    }

    /**
     * Sets the value of the getSalesAnalysisGroupedByGoodsAndServicesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfSalesAnalysisRowGroupedbyGoodsAndServices }{@code >}
     *     
     */
    public void setGetSalesAnalysisGroupedByGoodsAndServicesResult(JAXBElement<ChunkedResultOfSalesAnalysisRowGroupedbyGoodsAndServices> value) {
        this.getSalesAnalysisGroupedByGoodsAndServicesResult = ((JAXBElement<ChunkedResultOfSalesAnalysisRowGroupedbyGoodsAndServices> ) value);
    }

}
