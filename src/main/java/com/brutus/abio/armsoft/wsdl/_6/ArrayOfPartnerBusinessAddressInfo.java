
package com.brutus.abio.armsoft.wsdl._6;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfPartnerBusinessAddressInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPartnerBusinessAddressInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PartnerBusinessAddressInfo" type="{http://www.armsoft.am/Accountant/6.0}PartnerBusinessAddressInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPartnerBusinessAddressInfo", propOrder = {
    "partnerBusinessAddressInfo"
})
public class ArrayOfPartnerBusinessAddressInfo {

    @XmlElement(name = "PartnerBusinessAddressInfo", nillable = true)
    protected List<PartnerBusinessAddressInfo> partnerBusinessAddressInfo;

    /**
     * Gets the value of the partnerBusinessAddressInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerBusinessAddressInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerBusinessAddressInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartnerBusinessAddressInfo }
     * 
     * 
     */
    public List<PartnerBusinessAddressInfo> getPartnerBusinessAddressInfo() {
        if (partnerBusinessAddressInfo == null) {
            partnerBusinessAddressInfo = new ArrayList<PartnerBusinessAddressInfo>();
        }
        return this.partnerBusinessAddressInfo;
    }

}
