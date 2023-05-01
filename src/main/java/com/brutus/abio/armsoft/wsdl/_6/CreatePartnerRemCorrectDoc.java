
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
 *         &lt;element name="sessionId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="seqNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="partRemCorrectDocInfo" type="{http://www.armsoft.am/Accountant/6.0}PartnerRemCorrectDocInfo" minOccurs="0"/>
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
    "sessionId",
    "seqNumber",
    "partRemCorrectDocInfo"
})
@XmlRootElement(name = "CreatePartnerRemCorrectDoc")
public class CreatePartnerRemCorrectDoc {

    protected String sessionId;
    protected Integer seqNumber;
    @XmlElementRef(name = "partRemCorrectDocInfo", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<PartnerRemCorrectDocInfo> partRemCorrectDocInfo;

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the seqNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSeqNumber() {
        return seqNumber;
    }

    /**
     * Sets the value of the seqNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSeqNumber(Integer value) {
        this.seqNumber = value;
    }

    /**
     * Gets the value of the partRemCorrectDocInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PartnerRemCorrectDocInfo }{@code >}
     *     
     */
    public JAXBElement<PartnerRemCorrectDocInfo> getPartRemCorrectDocInfo() {
        return partRemCorrectDocInfo;
    }

    /**
     * Sets the value of the partRemCorrectDocInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PartnerRemCorrectDocInfo }{@code >}
     *     
     */
    public void setPartRemCorrectDocInfo(JAXBElement<PartnerRemCorrectDocInfo> value) {
        this.partRemCorrectDocInfo = ((JAXBElement<PartnerRemCorrectDocInfo> ) value);
    }

}
