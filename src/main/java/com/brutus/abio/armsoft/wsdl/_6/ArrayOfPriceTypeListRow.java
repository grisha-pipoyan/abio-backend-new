
package com.brutus.abio.armsoft.wsdl._6;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfPriceTypeListRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPriceTypeListRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PriceTypeListRow" type="{http://www.armsoft.am/Accountant/6.0}PriceTypeListRow" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPriceTypeListRow", propOrder = {
    "priceTypeListRow"
})
public class ArrayOfPriceTypeListRow {

    @XmlElement(name = "PriceTypeListRow", nillable = true)
    protected List<PriceTypeListRow> priceTypeListRow;

    /**
     * Gets the value of the priceTypeListRow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceTypeListRow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceTypeListRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceTypeListRow }
     * 
     * 
     */
    public List<PriceTypeListRow> getPriceTypeListRow() {
        if (priceTypeListRow == null) {
            priceTypeListRow = new ArrayList<PriceTypeListRow>();
        }
        return this.priceTypeListRow;
    }

}
