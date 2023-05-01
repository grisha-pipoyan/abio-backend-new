
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
 *         &lt;element name="GetSalesAnalysisResult" type="{http://www.armsoft.am/Accountant/6.0}ChunkedResultOfSalesAnalysisDataProvider.DataRow" minOccurs="0"/>
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
    "getSalesAnalysisResult"
})
@XmlRootElement(name = "GetSalesAnalysisResponse")
public class GetSalesAnalysisResponse {

    @XmlElementRef(name = "GetSalesAnalysisResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ChunkedResultOfSalesAnalysisDataProviderDataRow> getSalesAnalysisResult;

    /**
     * Gets the value of the getSalesAnalysisResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfSalesAnalysisDataProviderDataRow }{@code >}
     *     
     */
    public JAXBElement<ChunkedResultOfSalesAnalysisDataProviderDataRow> getGetSalesAnalysisResult() {
        return getSalesAnalysisResult;
    }

    /**
     * Sets the value of the getSalesAnalysisResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfSalesAnalysisDataProviderDataRow }{@code >}
     *     
     */
    public void setGetSalesAnalysisResult(JAXBElement<ChunkedResultOfSalesAnalysisDataProviderDataRow> value) {
        this.getSalesAnalysisResult = ((JAXBElement<ChunkedResultOfSalesAnalysisDataProviderDataRow> ) value);
    }

}
