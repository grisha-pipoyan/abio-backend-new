
package com.brutus.abio.armsoft.wsdl._07.armsoft_trade_businessobjects;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommonConst.GoodsTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommonConst.GoodsTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="Goods"/>
 *     &lt;enumeration value="Services"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommonConst.GoodsTypes", namespace = "http://schemas.datacontract.org/2004/07/ArmSoft.Trade.BusinessObjects.Common")
@XmlEnum
public enum CommonConstGoodsTypes {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Goods")
    GOODS("Goods"),
    @XmlEnumValue("Services")
    SERVICES("Services");
    private final String value;

    CommonConstGoodsTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommonConstGoodsTypes fromValue(String v) {
        for (CommonConstGoodsTypes c: CommonConstGoodsTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
