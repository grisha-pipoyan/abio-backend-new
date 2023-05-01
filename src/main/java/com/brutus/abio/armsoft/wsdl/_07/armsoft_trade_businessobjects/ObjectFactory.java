
package com.brutus.abio.armsoft.wsdl._07.armsoft_trade_businessobjects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.armsoft_trade_businessobjects package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CommonConstGoodsTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/ArmSoft.Trade.BusinessObjects.Common", "CommonConst.GoodsTypes");
    private final static QName _CommonConstStoragesModeType_QNAME = new QName("http://schemas.datacontract.org/2004/07/ArmSoft.Trade.BusinessObjects.Common", "CommonConst.StoragesModeType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.armsoft_trade_businessobjects
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommonConstGoodsTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ArmSoft.Trade.BusinessObjects.Common", name = "CommonConst.GoodsTypes")
    public JAXBElement<CommonConstGoodsTypes> createCommonConstGoodsTypes(CommonConstGoodsTypes value) {
        return new JAXBElement<CommonConstGoodsTypes>(_CommonConstGoodsTypes_QNAME, CommonConstGoodsTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommonConstStoragesModeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ArmSoft.Trade.BusinessObjects.Common", name = "CommonConst.StoragesModeType")
    public JAXBElement<CommonConstStoragesModeType> createCommonConstStoragesModeType(CommonConstStoragesModeType value) {
        return new JAXBElement<CommonConstStoragesModeType>(_CommonConstStoragesModeType_QNAME, CommonConstStoragesModeType.class, null, value);
    }

}
