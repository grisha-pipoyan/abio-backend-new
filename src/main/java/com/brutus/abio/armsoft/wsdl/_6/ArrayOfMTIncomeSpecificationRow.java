
package com.brutus.abio.armsoft.wsdl._6;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfMTIncomeSpecificationRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMTIncomeSpecificationRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MTIncomeSpecificationRow" type="{http://www.armsoft.am/Accountant/6.0}MTIncomeSpecificationRow" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMTIncomeSpecificationRow", propOrder = {
    "mtIncomeSpecificationRow"
})
public class ArrayOfMTIncomeSpecificationRow {

    @XmlElement(name = "MTIncomeSpecificationRow", nillable = true)
    protected List<MTIncomeSpecificationRow> mtIncomeSpecificationRow;

    /**
     * Gets the value of the mtIncomeSpecificationRow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mtIncomeSpecificationRow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMTIncomeSpecificationRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MTIncomeSpecificationRow }
     * 
     * 
     */
    public List<MTIncomeSpecificationRow> getMTIncomeSpecificationRow() {
        if (mtIncomeSpecificationRow == null) {
            mtIncomeSpecificationRow = new ArrayList<MTIncomeSpecificationRow>();
        }
        return this.mtIncomeSpecificationRow;
    }

}
