
package com.brutus.abio.armsoft.wsdl._6;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfStorageListRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStorageListRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StorageListRow" type="{http://www.armsoft.am/Accountant/6.0}StorageListRow" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStorageListRow", propOrder = {
    "storageListRow"
})
public class ArrayOfStorageListRow {

    @XmlElement(name = "StorageListRow", nillable = true)
    protected List<StorageListRow> storageListRow;

    /**
     * Gets the value of the storageListRow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storageListRow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStorageListRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StorageListRow }
     * 
     * 
     */
    public List<StorageListRow> getStorageListRow() {
        if (storageListRow == null) {
            storageListRow = new ArrayList<StorageListRow>();
        }
        return this.storageListRow;
    }

}
