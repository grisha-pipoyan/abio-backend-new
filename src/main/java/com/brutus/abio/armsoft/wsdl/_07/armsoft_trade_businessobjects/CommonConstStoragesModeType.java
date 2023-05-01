
package com.brutus.abio.armsoft.wsdl._07.armsoft_trade_businessobjects;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommonConst.StoragesModeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommonConst.StoragesModeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="WholeSale"/>
 *     &lt;enumeration value="Retail"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommonConst.StoragesModeType", namespace = "http://schemas.datacontract.org/2004/07/ArmSoft.Trade.BusinessObjects.Common")
@XmlEnum
public enum CommonConstStoragesModeType {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("WholeSale")
    WHOLE_SALE("WholeSale"),
    @XmlEnumValue("Retail")
    RETAIL("Retail");
    private final String value;

    CommonConstStoragesModeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommonConstStoragesModeType fromValue(String v) {
        for (CommonConstStoragesModeType c: CommonConstStoragesModeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
