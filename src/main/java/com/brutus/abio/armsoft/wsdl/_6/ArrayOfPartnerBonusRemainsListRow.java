
package com.brutus.abio.armsoft.wsdl._6;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfPartnerBonusRemainsListRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPartnerBonusRemainsListRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PartnerBonusRemainsListRow" type="{http://www.armsoft.am/Accountant/6.0}PartnerBonusRemainsListRow" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPartnerBonusRemainsListRow", propOrder = {
    "partnerBonusRemainsListRow"
})
public class ArrayOfPartnerBonusRemainsListRow {

    @XmlElement(name = "PartnerBonusRemainsListRow", nillable = true)
    protected List<PartnerBonusRemainsListRow> partnerBonusRemainsListRow;

    /**
     * Gets the value of the partnerBonusRemainsListRow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerBonusRemainsListRow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerBonusRemainsListRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartnerBonusRemainsListRow }
     * 
     * 
     */
    public List<PartnerBonusRemainsListRow> getPartnerBonusRemainsListRow() {
        if (partnerBonusRemainsListRow == null) {
            partnerBonusRemainsListRow = new ArrayList<PartnerBonusRemainsListRow>();
        }
        return this.partnerBonusRemainsListRow;
    }

}
