
package com.brutus.abio.armsoft.wsdl._6;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfMTStockTakingSpecificationRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMTStockTakingSpecificationRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MTStockTakingSpecificationRow" type="{http://www.armsoft.am/Accountant/6.0}MTStockTakingSpecificationRow" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMTStockTakingSpecificationRow", propOrder = {
    "mtStockTakingSpecificationRow"
})
public class ArrayOfMTStockTakingSpecificationRow {

    @XmlElement(name = "MTStockTakingSpecificationRow", nillable = true)
    protected List<MTStockTakingSpecificationRow> mtStockTakingSpecificationRow;

    /**
     * Gets the value of the mtStockTakingSpecificationRow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mtStockTakingSpecificationRow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMTStockTakingSpecificationRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MTStockTakingSpecificationRow }
     * 
     * 
     */
    public List<MTStockTakingSpecificationRow> getMTStockTakingSpecificationRow() {
        if (mtStockTakingSpecificationRow == null) {
            mtStockTakingSpecificationRow = new ArrayList<MTStockTakingSpecificationRow>();
        }
        return this.mtStockTakingSpecificationRow;
    }

}
