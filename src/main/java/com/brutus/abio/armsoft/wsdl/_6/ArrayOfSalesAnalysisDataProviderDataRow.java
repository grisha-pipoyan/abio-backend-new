
package com.brutus.abio.armsoft.wsdl._6;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfSalesAnalysisDataProvider.DataRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSalesAnalysisDataProvider.DataRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SalesAnalysisDataProvider.DataRow" type="{http://www.armsoft.am/Accountant/6.0}SalesAnalysisDataProvider.DataRow" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSalesAnalysisDataProvider.DataRow", propOrder = {
    "salesAnalysisDataProviderDataRow"
})
public class ArrayOfSalesAnalysisDataProviderDataRow {

    @XmlElement(name = "SalesAnalysisDataProvider.DataRow", nillable = true)
    protected List<SalesAnalysisDataProviderDataRow> salesAnalysisDataProviderDataRow;

    /**
     * Gets the value of the salesAnalysisDataProviderDataRow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesAnalysisDataProviderDataRow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesAnalysisDataProviderDataRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesAnalysisDataProviderDataRow }
     * 
     * 
     */
    public List<SalesAnalysisDataProviderDataRow> getSalesAnalysisDataProviderDataRow() {
        if (salesAnalysisDataProviderDataRow == null) {
            salesAnalysisDataProviderDataRow = new ArrayList<SalesAnalysisDataProviderDataRow>();
        }
        return this.salesAnalysisDataProviderDataRow;
    }

}
