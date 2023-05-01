
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
 *         &lt;element name="LoadMTStockTakingDocResult" type="{http://www.armsoft.am/Accountant/6.0}MTStockTakingDocInfo" minOccurs="0"/>
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
    "loadMTStockTakingDocResult"
})
@XmlRootElement(name = "LoadMTStockTakingDocResponse")
public class LoadMTStockTakingDocResponse {

    @XmlElementRef(name = "LoadMTStockTakingDocResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<MTStockTakingDocInfo> loadMTStockTakingDocResult;

    /**
     * Gets the value of the loadMTStockTakingDocResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MTStockTakingDocInfo }{@code >}
     *     
     */
    public JAXBElement<MTStockTakingDocInfo> getLoadMTStockTakingDocResult() {
        return loadMTStockTakingDocResult;
    }

    /**
     * Sets the value of the loadMTStockTakingDocResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MTStockTakingDocInfo }{@code >}
     *     
     */
    public void setLoadMTStockTakingDocResult(JAXBElement<MTStockTakingDocInfo> value) {
        this.loadMTStockTakingDocResult = ((JAXBElement<MTStockTakingDocInfo> ) value);
    }

}
