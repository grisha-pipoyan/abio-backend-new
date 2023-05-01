
package com.brutus.abio.armsoft.wsdl._07;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PayOrdDoc"/>
 *     &lt;enumeration value="CashInDoc"/>
 *     &lt;enumeration value="CashOutDoc"/>
 *     &lt;enumeration value="BankInDoc"/>
 *     &lt;enumeration value="BankOutDoc"/>
 *     &lt;enumeration value="PartnerRemCorrectDoc"/>
 *     &lt;enumeration value="MTIncomeDoc"/>
 *     &lt;enumeration value="MTInvoiceDoc"/>
 *     &lt;enumeration value="MTExpenseDoc"/>
 *     &lt;enumeration value="MTMoveDoc"/>
 *     &lt;enumeration value="MTComplectationDoc"/>
 *     &lt;enumeration value="MTDeComplectationDoc"/>
 *     &lt;enumeration value="MTOverheadExpDoc"/>
 *     &lt;enumeration value="MTReturnToSupplierDoc"/>
 *     &lt;enumeration value="MTReturnFromCustomerDoc"/>
 *     &lt;enumeration value="MTStockTakingDoc"/>
 *     &lt;enumeration value="ReceivedServiceDoc"/>
 *     &lt;enumeration value="RevaluationDoc"/>
 *     &lt;enumeration value="MTBillDoc"/>
 *     &lt;enumeration value="MTBillReturnDoc"/>
 *     &lt;enumeration value="MTIncomeImportDoc"/>
 *     &lt;enumeration value="MTSaleRetailDoc"/>
 *     &lt;enumeration value="MTIncomeRetailDoc"/>
 *     &lt;enumeration value="MTStockTakingRetailDoc"/>
 *     &lt;enumeration value="MTRevaluationRetailDoc"/>
 *     &lt;enumeration value="MTRevaluationDoc"/>
 *     &lt;enumeration value="MTIncomeRemDoc"/>
 *     &lt;enumeration value="PartnersGroupRevaluationDoc"/>
 *     &lt;enumeration value="ReceivedTaxInvoiceDoc"/>
 *     &lt;enumeration value="PartnerRemMoveDoc"/>
 *     &lt;enumeration value="PartnerRemGroupCorrectDoc"/>
 *     &lt;enumeration value="BonusGroupCorrectDoc"/>
 *     &lt;enumeration value="MTPurchaseOrderDoc"/>
 *     &lt;enumeration value="InvoiceForPayDoc"/>
 *     &lt;enumeration value="ReconciliationDoc"/>
 *     &lt;enumeration value="MTMoveOrderDoc"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentType", namespace = "http://schemas.datacontract.org/2004/07/")
@XmlEnum
public enum DocumentType {

    @XmlEnumValue("PayOrdDoc")
    PAY_ORD_DOC("PayOrdDoc"),
    @XmlEnumValue("CashInDoc")
    CASH_IN_DOC("CashInDoc"),
    @XmlEnumValue("CashOutDoc")
    CASH_OUT_DOC("CashOutDoc"),
    @XmlEnumValue("BankInDoc")
    BANK_IN_DOC("BankInDoc"),
    @XmlEnumValue("BankOutDoc")
    BANK_OUT_DOC("BankOutDoc"),
    @XmlEnumValue("PartnerRemCorrectDoc")
    PARTNER_REM_CORRECT_DOC("PartnerRemCorrectDoc"),
    @XmlEnumValue("MTIncomeDoc")
    MT_INCOME_DOC("MTIncomeDoc"),
    @XmlEnumValue("MTInvoiceDoc")
    MT_INVOICE_DOC("MTInvoiceDoc"),
    @XmlEnumValue("MTExpenseDoc")
    MT_EXPENSE_DOC("MTExpenseDoc"),
    @XmlEnumValue("MTMoveDoc")
    MT_MOVE_DOC("MTMoveDoc"),
    @XmlEnumValue("MTComplectationDoc")
    MT_COMPLECTATION_DOC("MTComplectationDoc"),
    @XmlEnumValue("MTDeComplectationDoc")
    MT_DE_COMPLECTATION_DOC("MTDeComplectationDoc"),
    @XmlEnumValue("MTOverheadExpDoc")
    MT_OVERHEAD_EXP_DOC("MTOverheadExpDoc"),
    @XmlEnumValue("MTReturnToSupplierDoc")
    MT_RETURN_TO_SUPPLIER_DOC("MTReturnToSupplierDoc"),
    @XmlEnumValue("MTReturnFromCustomerDoc")
    MT_RETURN_FROM_CUSTOMER_DOC("MTReturnFromCustomerDoc"),
    @XmlEnumValue("MTStockTakingDoc")
    MT_STOCK_TAKING_DOC("MTStockTakingDoc"),
    @XmlEnumValue("ReceivedServiceDoc")
    RECEIVED_SERVICE_DOC("ReceivedServiceDoc"),
    @XmlEnumValue("RevaluationDoc")
    REVALUATION_DOC("RevaluationDoc"),
    @XmlEnumValue("MTBillDoc")
    MT_BILL_DOC("MTBillDoc"),
    @XmlEnumValue("MTBillReturnDoc")
    MT_BILL_RETURN_DOC("MTBillReturnDoc"),
    @XmlEnumValue("MTIncomeImportDoc")
    MT_INCOME_IMPORT_DOC("MTIncomeImportDoc"),
    @XmlEnumValue("MTSaleRetailDoc")
    MT_SALE_RETAIL_DOC("MTSaleRetailDoc"),
    @XmlEnumValue("MTIncomeRetailDoc")
    MT_INCOME_RETAIL_DOC("MTIncomeRetailDoc"),
    @XmlEnumValue("MTStockTakingRetailDoc")
    MT_STOCK_TAKING_RETAIL_DOC("MTStockTakingRetailDoc"),
    @XmlEnumValue("MTRevaluationRetailDoc")
    MT_REVALUATION_RETAIL_DOC("MTRevaluationRetailDoc"),
    @XmlEnumValue("MTRevaluationDoc")
    MT_REVALUATION_DOC("MTRevaluationDoc"),
    @XmlEnumValue("MTIncomeRemDoc")
    MT_INCOME_REM_DOC("MTIncomeRemDoc"),
    @XmlEnumValue("PartnersGroupRevaluationDoc")
    PARTNERS_GROUP_REVALUATION_DOC("PartnersGroupRevaluationDoc"),
    @XmlEnumValue("ReceivedTaxInvoiceDoc")
    RECEIVED_TAX_INVOICE_DOC("ReceivedTaxInvoiceDoc"),
    @XmlEnumValue("PartnerRemMoveDoc")
    PARTNER_REM_MOVE_DOC("PartnerRemMoveDoc"),
    @XmlEnumValue("PartnerRemGroupCorrectDoc")
    PARTNER_REM_GROUP_CORRECT_DOC("PartnerRemGroupCorrectDoc"),
    @XmlEnumValue("BonusGroupCorrectDoc")
    BONUS_GROUP_CORRECT_DOC("BonusGroupCorrectDoc"),
    @XmlEnumValue("MTPurchaseOrderDoc")
    MT_PURCHASE_ORDER_DOC("MTPurchaseOrderDoc"),
    @XmlEnumValue("InvoiceForPayDoc")
    INVOICE_FOR_PAY_DOC("InvoiceForPayDoc"),
    @XmlEnumValue("ReconciliationDoc")
    RECONCILIATION_DOC("ReconciliationDoc"),
    @XmlEnumValue("MTMoveOrderDoc")
    MT_MOVE_ORDER_DOC("MTMoveOrderDoc");
    private final String value;

    DocumentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DocumentType fromValue(String v) {
        for (DocumentType c: DocumentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
