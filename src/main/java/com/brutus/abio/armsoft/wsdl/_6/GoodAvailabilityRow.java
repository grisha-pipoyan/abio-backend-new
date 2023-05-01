
package com.brutus.abio.armsoft.wsdl._6;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;


/**
 * <p>Java class for GoodAvailabilityRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GoodAvailabilityRow">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.armsoft.am/Accountant/6.0}ExtendableRow">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Unit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UnitBrief" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StorageCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StorageName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GroupCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Cost" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CostSumm" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CostWithVAT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CostSummWithVAT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CurrCost" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CurrCostSumm" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PriceTypePrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PriceTypeSumm" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="IncomeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PartyPartID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PartyPartCaption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyPartTaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyContractCaption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyDocNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyDocType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyDocUsableDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PartyDocCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyDocProducer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyDocPropertyType1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyDocPropertyValue1Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyDocPropertyValue1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyDocPropertyType2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LongName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PartyDocPropertyValue2Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyDocPropertyValue2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyContractCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyBase" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="PartyRow" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GoodAvailabilityRow", propOrder = {
    "id",
    "code",
    "name",
    "unit",
    "unitBrief",
    "storageCode",
    "storageName",
    "groupCode",
    "groupName",
    "description",
    "quantity",
    "cost",
    "costSumm",
    "costWithVAT",
    "costSummWithVAT",
    "currCost",
    "currCostSumm",
    "priceTypePrice",
    "priceTypeSumm",
    "incomeDate",
    "partyPartID",
    "partyPartCaption",
    "partyPartTaxCode",
    "partyContractCaption",
    "partyDocNum",
    "partyDocType",
    "partyDocUsableDate",
    "partyDocCountry",
    "partyDocProducer",
    "partyDocPropertyType1",
    "partyDocPropertyValue1Code",
    "partyDocPropertyValue1",
    "partyDocPropertyType2",
    "longName",
    "partyDocPropertyValue2Code",
    "partyDocPropertyValue2",
    "partyContractCode",
    "partyBase",
    "partyRow"
})
public class GoodAvailabilityRow
    extends ExtendableRow
{

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "Code", required = true, nillable = true)
    protected String code;
    @XmlElement(name = "Name", required = true, nillable = true)
    protected String name;
    @XmlElement(name = "Unit", required = true, nillable = true)
    protected String unit;
    @XmlElement(name = "UnitBrief", required = true, nillable = true)
    protected String unitBrief;
    @XmlElement(name = "StorageCode", required = true, nillable = true)
    protected String storageCode;
    @XmlElement(name = "StorageName", required = true, nillable = true)
    protected String storageName;
    @XmlElement(name = "GroupCode", required = true, nillable = true)
    protected String groupCode;
    @XmlElement(name = "GroupName", required = true, nillable = true)
    protected String groupName;
    @XmlElement(name = "Description", required = true, nillable = true)
    protected String description;
    @XmlElement(name = "Quantity", required = true)
    protected BigDecimal quantity;
    @XmlElement(name = "Cost", required = true, nillable = true)
    protected BigDecimal cost;
    @XmlElement(name = "CostSumm", required = true)
    protected BigDecimal costSumm;
    @XmlElement(name = "CostWithVAT", required = true, nillable = true)
    protected BigDecimal costWithVAT;
    @XmlElement(name = "CostSummWithVAT", required = true)
    protected BigDecimal costSummWithVAT;
    @XmlElement(name = "CurrCost", required = true, nillable = true)
    protected BigDecimal currCost;
    @XmlElement(name = "CurrCostSumm", required = true)
    protected BigDecimal currCostSumm;
    @XmlElement(name = "PriceTypePrice", required = true)
    protected BigDecimal priceTypePrice;
    @XmlElement(name = "PriceTypeSumm", required = true)
    protected BigDecimal priceTypeSumm;
    @XmlElement(name = "IncomeDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar incomeDate;
    @XmlElement(name = "PartyPartID")
    protected Integer partyPartID;
    @XmlElementRef(name = "PartyPartCaption", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> partyPartCaption;
    @XmlElementRef(name = "PartyPartTaxCode", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> partyPartTaxCode;
    @XmlElementRef(name = "PartyContractCaption", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> partyContractCaption;
    @XmlElementRef(name = "PartyDocNum", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> partyDocNum;
    @XmlElementRef(name = "PartyDocType", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> partyDocType;
    @XmlElementRef(name = "PartyDocUsableDate", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> partyDocUsableDate;
    @XmlElementRef(name = "PartyDocCountry", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> partyDocCountry;
    @XmlElementRef(name = "PartyDocProducer", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> partyDocProducer;
    @XmlElementRef(name = "PartyDocPropertyType1", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> partyDocPropertyType1;
    @XmlElementRef(name = "PartyDocPropertyValue1Code", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> partyDocPropertyValue1Code;
    @XmlElementRef(name = "PartyDocPropertyValue1", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> partyDocPropertyValue1;
    @XmlElementRef(name = "PartyDocPropertyType2", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> partyDocPropertyType2;
    @XmlElement(name = "LongName", required = true, nillable = true)
    protected String longName;
    @XmlElementRef(name = "PartyDocPropertyValue2Code", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> partyDocPropertyValue2Code;
    @XmlElementRef(name = "PartyDocPropertyValue2", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> partyDocPropertyValue2;
    @XmlElementRef(name = "PartyContractCode", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> partyContractCode;
    @XmlElement(name = "PartyBase")
    protected String partyBase;
    @XmlElement(name = "PartyRow")
    protected Integer partyRow;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the unitBrief property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitBrief() {
        return unitBrief;
    }

    /**
     * Sets the value of the unitBrief property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitBrief(String value) {
        this.unitBrief = value;
    }

    /**
     * Gets the value of the storageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorageCode() {
        return storageCode;
    }

    /**
     * Sets the value of the storageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorageCode(String value) {
        this.storageCode = value;
    }

    /**
     * Gets the value of the storageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorageName() {
        return storageName;
    }

    /**
     * Sets the value of the storageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorageName(String value) {
        this.storageName = value;
    }

    /**
     * Gets the value of the groupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupCode() {
        return groupCode;
    }

    /**
     * Sets the value of the groupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupCode(String value) {
        this.groupCode = value;
    }

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantity(BigDecimal value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCost(BigDecimal value) {
        this.cost = value;
    }

    /**
     * Gets the value of the costSumm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCostSumm() {
        return costSumm;
    }

    /**
     * Sets the value of the costSumm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCostSumm(BigDecimal value) {
        this.costSumm = value;
    }

    /**
     * Gets the value of the costWithVAT property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCostWithVAT() {
        return costWithVAT;
    }

    /**
     * Sets the value of the costWithVAT property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCostWithVAT(BigDecimal value) {
        this.costWithVAT = value;
    }

    /**
     * Gets the value of the costSummWithVAT property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCostSummWithVAT() {
        return costSummWithVAT;
    }

    /**
     * Sets the value of the costSummWithVAT property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCostSummWithVAT(BigDecimal value) {
        this.costSummWithVAT = value;
    }

    /**
     * Gets the value of the currCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrCost() {
        return currCost;
    }

    /**
     * Sets the value of the currCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrCost(BigDecimal value) {
        this.currCost = value;
    }

    /**
     * Gets the value of the currCostSumm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrCostSumm() {
        return currCostSumm;
    }

    /**
     * Sets the value of the currCostSumm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrCostSumm(BigDecimal value) {
        this.currCostSumm = value;
    }

    /**
     * Gets the value of the priceTypePrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceTypePrice() {
        return priceTypePrice;
    }

    /**
     * Sets the value of the priceTypePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceTypePrice(BigDecimal value) {
        this.priceTypePrice = value;
    }

    /**
     * Gets the value of the priceTypeSumm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceTypeSumm() {
        return priceTypeSumm;
    }

    /**
     * Sets the value of the priceTypeSumm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceTypeSumm(BigDecimal value) {
        this.priceTypeSumm = value;
    }

    /**
     * Gets the value of the incomeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIncomeDate() {
        return incomeDate;
    }

    /**
     * Sets the value of the incomeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIncomeDate(XMLGregorianCalendar value) {
        this.incomeDate = value;
    }

    /**
     * Gets the value of the partyPartID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPartyPartID() {
        return partyPartID;
    }

    /**
     * Sets the value of the partyPartID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPartyPartID(Integer value) {
        this.partyPartID = value;
    }

    /**
     * Gets the value of the partyPartCaption property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyPartCaption() {
        return partyPartCaption;
    }

    /**
     * Sets the value of the partyPartCaption property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyPartCaption(JAXBElement<String> value) {
        this.partyPartCaption = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partyPartTaxCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyPartTaxCode() {
        return partyPartTaxCode;
    }

    /**
     * Sets the value of the partyPartTaxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyPartTaxCode(JAXBElement<String> value) {
        this.partyPartTaxCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partyContractCaption property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyContractCaption() {
        return partyContractCaption;
    }

    /**
     * Sets the value of the partyContractCaption property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyContractCaption(JAXBElement<String> value) {
        this.partyContractCaption = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partyDocNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyDocNum() {
        return partyDocNum;
    }

    /**
     * Sets the value of the partyDocNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyDocNum(JAXBElement<String> value) {
        this.partyDocNum = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partyDocType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyDocType() {
        return partyDocType;
    }

    /**
     * Sets the value of the partyDocType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyDocType(JAXBElement<String> value) {
        this.partyDocType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partyDocUsableDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPartyDocUsableDate() {
        return partyDocUsableDate;
    }

    /**
     * Sets the value of the partyDocUsableDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPartyDocUsableDate(JAXBElement<XMLGregorianCalendar> value) {
        this.partyDocUsableDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the partyDocCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyDocCountry() {
        return partyDocCountry;
    }

    /**
     * Sets the value of the partyDocCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyDocCountry(JAXBElement<String> value) {
        this.partyDocCountry = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partyDocProducer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyDocProducer() {
        return partyDocProducer;
    }

    /**
     * Sets the value of the partyDocProducer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyDocProducer(JAXBElement<String> value) {
        this.partyDocProducer = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partyDocPropertyType1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyDocPropertyType1() {
        return partyDocPropertyType1;
    }

    /**
     * Sets the value of the partyDocPropertyType1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyDocPropertyType1(JAXBElement<String> value) {
        this.partyDocPropertyType1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partyDocPropertyValue1Code property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyDocPropertyValue1Code() {
        return partyDocPropertyValue1Code;
    }

    /**
     * Sets the value of the partyDocPropertyValue1Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyDocPropertyValue1Code(JAXBElement<String> value) {
        this.partyDocPropertyValue1Code = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partyDocPropertyValue1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyDocPropertyValue1() {
        return partyDocPropertyValue1;
    }

    /**
     * Sets the value of the partyDocPropertyValue1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyDocPropertyValue1(JAXBElement<String> value) {
        this.partyDocPropertyValue1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partyDocPropertyType2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyDocPropertyType2() {
        return partyDocPropertyType2;
    }

    /**
     * Sets the value of the partyDocPropertyType2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyDocPropertyType2(JAXBElement<String> value) {
        this.partyDocPropertyType2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the longName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongName() {
        return longName;
    }

    /**
     * Sets the value of the longName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongName(String value) {
        this.longName = value;
    }

    /**
     * Gets the value of the partyDocPropertyValue2Code property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyDocPropertyValue2Code() {
        return partyDocPropertyValue2Code;
    }

    /**
     * Sets the value of the partyDocPropertyValue2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyDocPropertyValue2Code(JAXBElement<String> value) {
        this.partyDocPropertyValue2Code = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partyDocPropertyValue2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyDocPropertyValue2() {
        return partyDocPropertyValue2;
    }

    /**
     * Sets the value of the partyDocPropertyValue2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyDocPropertyValue2(JAXBElement<String> value) {
        this.partyDocPropertyValue2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partyContractCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyContractCode() {
        return partyContractCode;
    }

    /**
     * Sets the value of the partyContractCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyContractCode(JAXBElement<String> value) {
        this.partyContractCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partyBase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyBase() {
        return partyBase;
    }

    /**
     * Sets the value of the partyBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyBase(String value) {
        this.partyBase = value;
    }

    /**
     * Gets the value of the partyRow property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPartyRow() {
        return partyRow;
    }

    /**
     * Sets the value of the partyRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPartyRow(Integer value) {
        this.partyRow = value;
    }

}
