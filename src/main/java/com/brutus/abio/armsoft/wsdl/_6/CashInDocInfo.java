
package com.brutus.abio.armsoft.wsdl._6;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;


/**
 * <p>Java class for CashInDocInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CashInDocInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OperType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DocumentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CashDesk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CurrencyExchangeRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CurrencyExchangeBase" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="AmountNCC" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PartnerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartnerAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PayerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CashOutDesk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Employee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Base" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Appendix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankAcquiringPartner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankAcquiringContract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankAcquiringCardIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ECRCheckNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CashierShiftNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaseISN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsDraft" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExtBody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashInDocInfo", propOrder = {
    "operType",
    "documentDate",
    "documentNumber",
    "cashDesk",
    "currencyCode",
    "currencyExchangeRate",
    "currencyExchangeBase",
    "amount",
    "amountNCC",
    "partnerCode",
    "contract",
    "partnerAmount",
    "payerName",
    "cashOutDesk",
    "employee",
    "accountCode",
    "base",
    "appendix",
    "comment",
    "bankAcquiringPartner",
    "bankAcquiringContract",
    "bankAcquiringCardIndex",
    "ecrCheckNumber",
    "cashierShiftNumber",
    "baseISN",
    "isDraft",
    "isDeleted",
    "extBody",
    "owner",
    "isn"
})
public class CashInDocInfo {

    @XmlElement(name = "OperType", required = true, nillable = true)
    protected String operType;
    @XmlElement(name = "DocumentDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar documentDate;
    @XmlElement(name = "DocumentNumber", required = true, nillable = true)
    protected String documentNumber;
    @XmlElement(name = "CashDesk", required = true, nillable = true)
    protected String cashDesk;
    @XmlElement(name = "CurrencyCode", required = true, nillable = true)
    protected String currencyCode;
    @XmlElement(name = "CurrencyExchangeRate", required = true)
    protected BigDecimal currencyExchangeRate;
    @XmlElement(name = "CurrencyExchangeBase", required = true)
    protected BigDecimal currencyExchangeBase;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "AmountNCC", required = true)
    protected BigDecimal amountNCC;
    @XmlElementRef(name = "PartnerCode", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> partnerCode;
    @XmlElementRef(name = "Contract", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> contract;
    @XmlElement(name = "PartnerAmount")
    protected BigDecimal partnerAmount;
    @XmlElement(name = "PayerName", required = true, nillable = true)
    protected String payerName;
    @XmlElementRef(name = "CashOutDesk", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> cashOutDesk;
    @XmlElementRef(name = "Employee", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> employee;
    @XmlElementRef(name = "AccountCode", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> accountCode;
    @XmlElementRef(name = "Base", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> base;
    @XmlElementRef(name = "Appendix", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> appendix;
    @XmlElementRef(name = "Comment", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> comment;
    @XmlElementRef(name = "BankAcquiringPartner", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> bankAcquiringPartner;
    @XmlElementRef(name = "BankAcquiringContract", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> bankAcquiringContract;
    @XmlElementRef(name = "BankAcquiringCardIndex", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> bankAcquiringCardIndex;
    @XmlElementRef(name = "ECRCheckNumber", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> ecrCheckNumber;
    @XmlElementRef(name = "CashierShiftNumber", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> cashierShiftNumber;
    @XmlElementRef(name = "BaseISN", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> baseISN;
    @XmlElement(name = "IsDraft")
    protected Boolean isDraft;
    @XmlElement(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlElementRef(name = "ExtBody", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> extBody;
    @XmlElementRef(name = "Owner", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> owner;
    @XmlElementRef(name = "ISN", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<String> isn;

    /**
     * Gets the value of the operType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperType() {
        return operType;
    }

    /**
     * Sets the value of the operType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperType(String value) {
        this.operType = value;
    }

    /**
     * Gets the value of the documentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentDate() {
        return documentDate;
    }

    /**
     * Sets the value of the documentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocumentDate(XMLGregorianCalendar value) {
        this.documentDate = value;
    }

    /**
     * Gets the value of the documentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Sets the value of the documentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumber(String value) {
        this.documentNumber = value;
    }

    /**
     * Gets the value of the cashDesk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashDesk() {
        return cashDesk;
    }

    /**
     * Sets the value of the cashDesk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashDesk(String value) {
        this.cashDesk = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the currencyExchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrencyExchangeRate() {
        return currencyExchangeRate;
    }

    /**
     * Sets the value of the currencyExchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrencyExchangeRate(BigDecimal value) {
        this.currencyExchangeRate = value;
    }

    /**
     * Gets the value of the currencyExchangeBase property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrencyExchangeBase() {
        return currencyExchangeBase;
    }

    /**
     * Sets the value of the currencyExchangeBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrencyExchangeBase(BigDecimal value) {
        this.currencyExchangeBase = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the amountNCC property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountNCC() {
        return amountNCC;
    }

    /**
     * Sets the value of the amountNCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountNCC(BigDecimal value) {
        this.amountNCC = value;
    }

    /**
     * Gets the value of the partnerCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartnerCode() {
        return partnerCode;
    }

    /**
     * Sets the value of the partnerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartnerCode(JAXBElement<String> value) {
        this.partnerCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the contract property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContract() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContract(JAXBElement<String> value) {
        this.contract = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partnerAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPartnerAmount() {
        return partnerAmount;
    }

    /**
     * Sets the value of the partnerAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartnerAmount(BigDecimal value) {
        this.partnerAmount = value;
    }

    /**
     * Gets the value of the payerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerName() {
        return payerName;
    }

    /**
     * Sets the value of the payerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerName(String value) {
        this.payerName = value;
    }

    /**
     * Gets the value of the cashOutDesk property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCashOutDesk() {
        return cashOutDesk;
    }

    /**
     * Sets the value of the cashOutDesk property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCashOutDesk(JAXBElement<String> value) {
        this.cashOutDesk = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the employee property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmployee() {
        return employee;
    }

    /**
     * Sets the value of the employee property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmployee(JAXBElement<String> value) {
        this.employee = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the accountCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountCode() {
        return accountCode;
    }

    /**
     * Sets the value of the accountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountCode(JAXBElement<String> value) {
        this.accountCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBase(JAXBElement<String> value) {
        this.base = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the appendix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAppendix() {
        return appendix;
    }

    /**
     * Sets the value of the appendix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAppendix(JAXBElement<String> value) {
        this.appendix = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComment(JAXBElement<String> value) {
        this.comment = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bankAcquiringPartner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBankAcquiringPartner() {
        return bankAcquiringPartner;
    }

    /**
     * Sets the value of the bankAcquiringPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBankAcquiringPartner(JAXBElement<String> value) {
        this.bankAcquiringPartner = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bankAcquiringContract property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBankAcquiringContract() {
        return bankAcquiringContract;
    }

    /**
     * Sets the value of the bankAcquiringContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBankAcquiringContract(JAXBElement<String> value) {
        this.bankAcquiringContract = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bankAcquiringCardIndex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBankAcquiringCardIndex() {
        return bankAcquiringCardIndex;
    }

    /**
     * Sets the value of the bankAcquiringCardIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBankAcquiringCardIndex(JAXBElement<String> value) {
        this.bankAcquiringCardIndex = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ecrCheckNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getECRCheckNumber() {
        return ecrCheckNumber;
    }

    /**
     * Sets the value of the ecrCheckNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setECRCheckNumber(JAXBElement<String> value) {
        this.ecrCheckNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cashierShiftNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCashierShiftNumber() {
        return cashierShiftNumber;
    }

    /**
     * Sets the value of the cashierShiftNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCashierShiftNumber(JAXBElement<String> value) {
        this.cashierShiftNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the baseISN property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBaseISN() {
        return baseISN;
    }

    /**
     * Sets the value of the baseISN property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBaseISN(JAXBElement<String> value) {
        this.baseISN = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the isDraft property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDraft() {
        return isDraft;
    }

    /**
     * Sets the value of the isDraft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDraft(Boolean value) {
        this.isDraft = value;
    }

    /**
     * Gets the value of the isDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeleted() {
        return isDeleted;
    }

    /**
     * Sets the value of the isDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeleted(Boolean value) {
        this.isDeleted = value;
    }

    /**
     * Gets the value of the extBody property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExtBody() {
        return extBody;
    }

    /**
     * Sets the value of the extBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExtBody(JAXBElement<String> value) {
        this.extBody = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwner(JAXBElement<String> value) {
        this.owner = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the isn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getISN() {
        return isn;
    }

    /**
     * Sets the value of the isn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setISN(JAXBElement<String> value) {
        this.isn = ((JAXBElement<String> ) value);
    }

}
