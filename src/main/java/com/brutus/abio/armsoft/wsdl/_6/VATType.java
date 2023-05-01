
package com.brutus.abio.armsoft.wsdl._6;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VATType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VATType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WithVAT"/>
 *     &lt;enumeration value="WithinVAT"/>
 *     &lt;enumeration value="WithoutVAT"/>
 *     &lt;enumeration value="ZeroVAT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VATType")
@XmlEnum
public enum VATType {

    @XmlEnumValue("WithVAT")
    WITH_VAT("WithVAT"),
    @XmlEnumValue("WithinVAT")
    WITHIN_VAT("WithinVAT"),
    @XmlEnumValue("WithoutVAT")
    WITHOUT_VAT("WithoutVAT"),
    @XmlEnumValue("ZeroVAT")
    ZERO_VAT("ZeroVAT");
    private final String value;

    VATType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VATType fromValue(String v) {
        for (VATType c: VATType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
