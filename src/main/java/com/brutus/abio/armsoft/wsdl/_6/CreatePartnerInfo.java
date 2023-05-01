
package com.brutus.abio.armsoft.wsdl._6;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CreatePartnerInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreatePartnerInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.armsoft.am/Accountant/6.0}SerializationBase">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LongName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManagerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManagerPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChiefAccountantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChiefAccountantPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MainAim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateRegister" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Passport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Birthday" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NextContractNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Supplier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Customer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Foreign" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActorID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PartnerID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PartnerContracts" type="{http://www.armsoft.am/Accountant/6.0}ArrayOfPartnerContractInfo" minOccurs="0"/>
 *         &lt;element name="SettlementAccounts" type="{http://www.armsoft.am/Accountant/6.0}ArrayOfPartnerSettlementAccountInfo" minOccurs="0"/>
 *         &lt;element name="BusinessAddresses" type="{http://www.armsoft.am/Accountant/6.0}ArrayOfPartnerBusinessAddressInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreatePartnerInfo", propOrder = {
    "code",
    "name",
    "longName",
    "type",
    "taxCode",
    "address",
    "businessAddress",
    "managerName",
    "managerPosition",
    "chiefAccountantName",
    "chiefAccountantPosition",
    "mainAim",
    "phone",
    "stateRegister",
    "passport",
    "birthday",
    "sex",
    "nextContractNumber",
    "supplier",
    "customer",
    "foreign",
    "email",
    "actorID",
    "partnerID",
    "partnerContracts",
    "settlementAccounts",
    "businessAddresses"
})
public class CreatePartnerInfo
    extends SerializationBase
{

    @XmlElement(name = "Code", required = true, nillable = true)
    protected String code;
    @XmlElement(name = "Name", required = true, nillable = true)
    protected String name;
    @XmlElementRef(name = "LongName", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> longName;
    @XmlElementRef(name = "Type", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> type;
    @XmlElementRef(name = "TaxCode", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> taxCode;
    @XmlElementRef(name = "Address", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> address;
    @XmlElementRef(name = "BusinessAddress", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> businessAddress;
    @XmlElementRef(name = "ManagerName", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> managerName;
    @XmlElementRef(name = "ManagerPosition", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> managerPosition;
    @XmlElementRef(name = "ChiefAccountantName", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> chiefAccountantName;
    @XmlElementRef(name = "ChiefAccountantPosition", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> chiefAccountantPosition;
    @XmlElementRef(name = "MainAim", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> mainAim;
    @XmlElementRef(name = "Phone", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> phone;
    @XmlElementRef(name = "StateRegister", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> stateRegister;
    @XmlElementRef(name = "Passport", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> passport;
    @XmlElementRef(name = "Birthday", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> birthday;
    @XmlElementRef(name = "Sex", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> sex;
    @XmlElementRef(name = "NextContractNumber", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> nextContractNumber;
    @XmlElement(name = "Supplier")
    protected Boolean supplier;
    @XmlElement(name = "Customer")
    protected Boolean customer;
    @XmlElement(name = "Foreign")
    protected Boolean foreign;
    @XmlElementRef(name = "Email", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> email;
    @XmlElement(name = "ActorID")
    protected Integer actorID;
    @XmlElement(name = "PartnerID")
    protected Integer partnerID;
    @XmlElementRef(name = "PartnerContracts", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPartnerContractInfo> partnerContracts;
    @XmlElementRef(name = "SettlementAccounts", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPartnerSettlementAccountInfo> settlementAccounts;
    @XmlElementRef(name = "BusinessAddresses", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPartnerBusinessAddressInfo> businessAddresses;

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
     * Gets the value of the longName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLongName() {
        return longName;
    }

    /**
     * Sets the value of the longName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLongName(JAXBElement<String> value) {
        this.longName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setType(JAXBElement<String> value) {
        this.type = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the taxCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxCode() {
        return taxCode;
    }

    /**
     * Sets the value of the taxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxCode(JAXBElement<String> value) {
        this.taxCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddress(JAXBElement<String> value) {
        this.address = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the businessAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessAddress() {
        return businessAddress;
    }

    /**
     * Sets the value of the businessAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessAddress(JAXBElement<String> value) {
        this.businessAddress = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the managerName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getManagerName() {
        return managerName;
    }

    /**
     * Sets the value of the managerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setManagerName(JAXBElement<String> value) {
        this.managerName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the managerPosition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getManagerPosition() {
        return managerPosition;
    }

    /**
     * Sets the value of the managerPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setManagerPosition(JAXBElement<String> value) {
        this.managerPosition = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the chiefAccountantName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChiefAccountantName() {
        return chiefAccountantName;
    }

    /**
     * Sets the value of the chiefAccountantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChiefAccountantName(JAXBElement<String> value) {
        this.chiefAccountantName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the chiefAccountantPosition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChiefAccountantPosition() {
        return chiefAccountantPosition;
    }

    /**
     * Sets the value of the chiefAccountantPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChiefAccountantPosition(JAXBElement<String> value) {
        this.chiefAccountantPosition = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mainAim property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMainAim() {
        return mainAim;
    }

    /**
     * Sets the value of the mainAim property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMainAim(JAXBElement<String> value) {
        this.mainAim = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhone(JAXBElement<String> value) {
        this.phone = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the stateRegister property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStateRegister() {
        return stateRegister;
    }

    /**
     * Sets the value of the stateRegister property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStateRegister(JAXBElement<String> value) {
        this.stateRegister = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the passport property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassport() {
        return passport;
    }

    /**
     * Sets the value of the passport property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassport(JAXBElement<String> value) {
        this.passport = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the birthday property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBirthday() {
        return birthday;
    }

    /**
     * Sets the value of the birthday property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBirthday(JAXBElement<XMLGregorianCalendar> value) {
        this.birthday = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSex(JAXBElement<String> value) {
        this.sex = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nextContractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNextContractNumber() {
        return nextContractNumber;
    }

    /**
     * Sets the value of the nextContractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNextContractNumber(JAXBElement<String> value) {
        this.nextContractNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the supplier property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupplier() {
        return supplier;
    }

    /**
     * Sets the value of the supplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupplier(Boolean value) {
        this.supplier = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomer(Boolean value) {
        this.customer = value;
    }

    /**
     * Gets the value of the foreign property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForeign() {
        return foreign;
    }

    /**
     * Sets the value of the foreign property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForeign(Boolean value) {
        this.foreign = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the actorID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActorID() {
        return actorID;
    }

    /**
     * Sets the value of the actorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActorID(Integer value) {
        this.actorID = value;
    }

    /**
     * Gets the value of the partnerID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPartnerID() {
        return partnerID;
    }

    /**
     * Sets the value of the partnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPartnerID(Integer value) {
        this.partnerID = value;
    }

    /**
     * Gets the value of the partnerContracts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPartnerContractInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPartnerContractInfo> getPartnerContracts() {
        return partnerContracts;
    }

    /**
     * Sets the value of the partnerContracts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPartnerContractInfo }{@code >}
     *     
     */
    public void setPartnerContracts(JAXBElement<ArrayOfPartnerContractInfo> value) {
        this.partnerContracts = ((JAXBElement<ArrayOfPartnerContractInfo> ) value);
    }

    /**
     * Gets the value of the settlementAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPartnerSettlementAccountInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPartnerSettlementAccountInfo> getSettlementAccounts() {
        return settlementAccounts;
    }

    /**
     * Sets the value of the settlementAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPartnerSettlementAccountInfo }{@code >}
     *     
     */
    public void setSettlementAccounts(JAXBElement<ArrayOfPartnerSettlementAccountInfo> value) {
        this.settlementAccounts = ((JAXBElement<ArrayOfPartnerSettlementAccountInfo> ) value);
    }

    /**
     * Gets the value of the businessAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPartnerBusinessAddressInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPartnerBusinessAddressInfo> getBusinessAddresses() {
        return businessAddresses;
    }

    /**
     * Sets the value of the businessAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPartnerBusinessAddressInfo }{@code >}
     *     
     */
    public void setBusinessAddresses(JAXBElement<ArrayOfPartnerBusinessAddressInfo> value) {
        this.businessAddresses = ((JAXBElement<ArrayOfPartnerBusinessAddressInfo> ) value);
    }

}
