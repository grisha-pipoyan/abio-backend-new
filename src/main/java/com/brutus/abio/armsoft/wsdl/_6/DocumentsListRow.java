
package com.brutus.abio.armsoft.wsdl._6;

import com.brutus.abio.armsoft.wsdl._07.DocumentType;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;


/**
 * <p>Java class for DocumentsListRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentsListRow">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.armsoft.am/Accountant/6.0}SerializationBase">
 *       &lt;sequence>
 *         &lt;element name="ISN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DocumentType" type="{http://schemas.datacontract.org/2004/07/}DocumentType"/>
 *         &lt;element name="DocumentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DocumentState" type="{http://www.armsoft.am/Accountant/6.0}DocumentState"/>
 *         &lt;element name="PartnerCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PartnerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="SummaCash" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="SummaBank" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="SummaPrePay" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="SummaBonus" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="SummaCredit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ECRCheckNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentsListRow", propOrder = {
    "isn",
    "documentType",
    "documentDate",
    "documentNumber",
    "documentState",
    "partnerCode",
    "partnerName",
    "currencyCode",
    "amount",
    "summaCash",
    "summaBank",
    "summaPrePay",
    "summaBonus",
    "summaCredit",
    "ecrCheckNum",
    "comment"
})
public class DocumentsListRow
    extends SerializationBase
{

    @XmlElement(name = "ISN", required = true, nillable = true)
    protected String isn;
    @XmlElement(name = "DocumentType", required = true)
    protected DocumentType documentType;
    @XmlElement(name = "DocumentDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar documentDate;
    @XmlElement(name = "DocumentNumber", required = true, nillable = true)
    protected String documentNumber;
    @XmlElement(name = "DocumentState", required = true)
    protected DocumentState documentState;
    @XmlElement(name = "PartnerCode", required = true, nillable = true)
    protected String partnerCode;
    @XmlElement(name = "PartnerName", required = true, nillable = true)
    protected String partnerName;
    @XmlElement(name = "CurrencyCode", required = true, nillable = true)
    protected String currencyCode;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "SummaCash", required = true)
    protected BigDecimal summaCash;
    @XmlElement(name = "SummaBank", required = true)
    protected BigDecimal summaBank;
    @XmlElement(name = "SummaPrePay", required = true)
    protected BigDecimal summaPrePay;
    @XmlElement(name = "SummaBonus", required = true)
    protected BigDecimal summaBonus;
    @XmlElement(name = "SummaCredit", required = true)
    protected BigDecimal summaCredit;
    @XmlElement(name = "ECRCheckNum", required = true, nillable = true)
    protected String ecrCheckNum;
    @XmlElement(name = "Comment", required = true, nillable = true)
    protected String comment;

    /**
     * Gets the value of the isn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISN() {
        return isn;
    }

    /**
     * Sets the value of the isn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISN(String value) {
        this.isn = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType }
     *     
     */
    public DocumentType getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType }
     *     
     */
    public void setDocumentType(DocumentType value) {
        this.documentType = value;
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
     * Gets the value of the documentState property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentState }
     *     
     */
    public DocumentState getDocumentState() {
        return documentState;
    }

    /**
     * Sets the value of the documentState property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentState }
     *     
     */
    public void setDocumentState(DocumentState value) {
        this.documentState = value;
    }

    /**
     * Gets the value of the partnerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerCode() {
        return partnerCode;
    }

    /**
     * Sets the value of the partnerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerCode(String value) {
        this.partnerCode = value;
    }

    /**
     * Gets the value of the partnerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerName() {
        return partnerName;
    }

    /**
     * Sets the value of the partnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerName(String value) {
        this.partnerName = value;
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
     * Gets the value of the summaCash property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSummaCash() {
        return summaCash;
    }

    /**
     * Sets the value of the summaCash property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSummaCash(BigDecimal value) {
        this.summaCash = value;
    }

    /**
     * Gets the value of the summaBank property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSummaBank() {
        return summaBank;
    }

    /**
     * Sets the value of the summaBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSummaBank(BigDecimal value) {
        this.summaBank = value;
    }

    /**
     * Gets the value of the summaPrePay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSummaPrePay() {
        return summaPrePay;
    }

    /**
     * Sets the value of the summaPrePay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSummaPrePay(BigDecimal value) {
        this.summaPrePay = value;
    }

    /**
     * Gets the value of the summaBonus property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSummaBonus() {
        return summaBonus;
    }

    /**
     * Sets the value of the summaBonus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSummaBonus(BigDecimal value) {
        this.summaBonus = value;
    }

    /**
     * Gets the value of the summaCredit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSummaCredit() {
        return summaCredit;
    }

    /**
     * Sets the value of the summaCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSummaCredit(BigDecimal value) {
        this.summaCredit = value;
    }

    /**
     * Gets the value of the ecrCheckNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getECRCheckNum() {
        return ecrCheckNum;
    }

    /**
     * Sets the value of the ecrCheckNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setECRCheckNum(String value) {
        this.ecrCheckNum = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

}
