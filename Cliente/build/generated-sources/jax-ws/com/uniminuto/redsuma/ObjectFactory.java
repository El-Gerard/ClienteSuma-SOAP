
package com.uniminuto.redsuma;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.uniminuto.redsuma package. 
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

    private final static QName _AgregarNum_QNAME = new QName("http://redsuma.uniminuto.com/", "agregarNum");
    private final static QName _RecibirPet_QNAME = new QName("http://redsuma.uniminuto.com/", "recibirPet");
    private final static QName _HelloResponse_QNAME = new QName("http://redsuma.uniminuto.com/", "helloResponse");
    private final static QName _RecibirPetResponse_QNAME = new QName("http://redsuma.uniminuto.com/", "recibirPetResponse");
    private final static QName _PedirSumaResponse_QNAME = new QName("http://redsuma.uniminuto.com/", "pedirSumaResponse");
    private final static QName _Hello_QNAME = new QName("http://redsuma.uniminuto.com/", "hello");
    private final static QName _AgregarNumResponse_QNAME = new QName("http://redsuma.uniminuto.com/", "agregarNumResponse");
    private final static QName _PedirSuma_QNAME = new QName("http://redsuma.uniminuto.com/", "pedirSuma");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.uniminuto.redsuma
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AgregarNum }
     * 
     */
    public AgregarNum createAgregarNum() {
        return new AgregarNum();
    }

    /**
     * Create an instance of {@link RecibirPet }
     * 
     */
    public RecibirPet createRecibirPet() {
        return new RecibirPet();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link RecibirPetResponse }
     * 
     */
    public RecibirPetResponse createRecibirPetResponse() {
        return new RecibirPetResponse();
    }

    /**
     * Create an instance of {@link PedirSumaResponse }
     * 
     */
    public PedirSumaResponse createPedirSumaResponse() {
        return new PedirSumaResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link AgregarNumResponse }
     * 
     */
    public AgregarNumResponse createAgregarNumResponse() {
        return new AgregarNumResponse();
    }

    /**
     * Create an instance of {@link PedirSuma }
     * 
     */
    public PedirSuma createPedirSuma() {
        return new PedirSuma();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarNum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://redsuma.uniminuto.com/", name = "agregarNum")
    public JAXBElement<AgregarNum> createAgregarNum(AgregarNum value) {
        return new JAXBElement<AgregarNum>(_AgregarNum_QNAME, AgregarNum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecibirPet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://redsuma.uniminuto.com/", name = "recibirPet")
    public JAXBElement<RecibirPet> createRecibirPet(RecibirPet value) {
        return new JAXBElement<RecibirPet>(_RecibirPet_QNAME, RecibirPet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://redsuma.uniminuto.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecibirPetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://redsuma.uniminuto.com/", name = "recibirPetResponse")
    public JAXBElement<RecibirPetResponse> createRecibirPetResponse(RecibirPetResponse value) {
        return new JAXBElement<RecibirPetResponse>(_RecibirPetResponse_QNAME, RecibirPetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PedirSumaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://redsuma.uniminuto.com/", name = "pedirSumaResponse")
    public JAXBElement<PedirSumaResponse> createPedirSumaResponse(PedirSumaResponse value) {
        return new JAXBElement<PedirSumaResponse>(_PedirSumaResponse_QNAME, PedirSumaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://redsuma.uniminuto.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarNumResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://redsuma.uniminuto.com/", name = "agregarNumResponse")
    public JAXBElement<AgregarNumResponse> createAgregarNumResponse(AgregarNumResponse value) {
        return new JAXBElement<AgregarNumResponse>(_AgregarNumResponse_QNAME, AgregarNumResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PedirSuma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://redsuma.uniminuto.com/", name = "pedirSuma")
    public JAXBElement<PedirSuma> createPedirSuma(PedirSuma value) {
        return new JAXBElement<PedirSuma>(_PedirSuma_QNAME, PedirSuma.class, null, value);
    }

}
