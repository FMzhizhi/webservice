
package com.zjj.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.zjj.service package. 
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

    private final static QName _Orther_QNAME = new QName("http://service.zjj.com/", "orther");
    private final static QName _Query_QNAME = new QName("http://service.zjj.com/", "query");
    private final static QName _QueryResponse_QNAME = new QName("http://service.zjj.com/", "queryResponse");
    private final static QName _OrtherResponse_QNAME = new QName("http://service.zjj.com/", "ortherResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.zjj.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Orther }
     * 
     */
    public Orther createOrther() {
        return new Orther();
    }

    /**
     * Create an instance of {@link QueryResponse }
     * 
     */
    public QueryResponse createQueryResponse() {
        return new QueryResponse();
    }

    /**
     * Create an instance of {@link Query }
     * 
     */
    public Query createQuery() {
        return new Query();
    }

    /**
     * Create an instance of {@link OrtherResponse }
     * 
     */
    public OrtherResponse createOrtherResponse() {
        return new OrtherResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Orther }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.zjj.com/", name = "orther")
    public JAXBElement<Orther> createOrther(Orther value) {
        return new JAXBElement<Orther>(_Orther_QNAME, Orther.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Query }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.zjj.com/", name = "query")
    public JAXBElement<Query> createQuery(Query value) {
        return new JAXBElement<Query>(_Query_QNAME, Query.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.zjj.com/", name = "queryResponse")
    public JAXBElement<QueryResponse> createQueryResponse(QueryResponse value) {
        return new JAXBElement<QueryResponse>(_QueryResponse_QNAME, QueryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrtherResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.zjj.com/", name = "ortherResponse")
    public JAXBElement<OrtherResponse> createOrtherResponse(OrtherResponse value) {
        return new JAXBElement<OrtherResponse>(_OrtherResponse_QNAME, OrtherResponse.class, null, value);
    }

}
