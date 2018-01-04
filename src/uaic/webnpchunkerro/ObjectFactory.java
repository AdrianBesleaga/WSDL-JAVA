
package uaic.webnpchunkerro;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uaic.webnpchunkerro package. 
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

    private final static QName _ChunkTextResponse_QNAME = new QName("http://webNpChunkerRo.uaic/", "chunkTextResponse");
    private final static QName _ChunkTaggedTextResponse_QNAME = new QName("http://webNpChunkerRo.uaic/", "chunkTaggedTextResponse");
    private final static QName _ChunkTaggedText_QNAME = new QName("http://webNpChunkerRo.uaic/", "chunkTaggedText");
    private final static QName _ChunkText_QNAME = new QName("http://webNpChunkerRo.uaic/", "chunkText");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uaic.webnpchunkerro
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ChunkTaggedText }
     * 
     */
    public ChunkTaggedText createChunkTaggedText() {
        return new ChunkTaggedText();
    }

    /**
     * Create an instance of {@link ChunkText }
     * 
     */
    public ChunkText createChunkText() {
        return new ChunkText();
    }

    /**
     * Create an instance of {@link ChunkTaggedTextResponse }
     * 
     */
    public ChunkTaggedTextResponse createChunkTaggedTextResponse() {
        return new ChunkTaggedTextResponse();
    }

    /**
     * Create an instance of {@link ChunkTextResponse }
     * 
     */
    public ChunkTextResponse createChunkTextResponse() {
        return new ChunkTextResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkTextResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webNpChunkerRo.uaic/", name = "chunkTextResponse")
    public JAXBElement<ChunkTextResponse> createChunkTextResponse(ChunkTextResponse value) {
        return new JAXBElement<ChunkTextResponse>(_ChunkTextResponse_QNAME, ChunkTextResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkTaggedTextResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webNpChunkerRo.uaic/", name = "chunkTaggedTextResponse")
    public JAXBElement<ChunkTaggedTextResponse> createChunkTaggedTextResponse(ChunkTaggedTextResponse value) {
        return new JAXBElement<ChunkTaggedTextResponse>(_ChunkTaggedTextResponse_QNAME, ChunkTaggedTextResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkTaggedText }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webNpChunkerRo.uaic/", name = "chunkTaggedText")
    public JAXBElement<ChunkTaggedText> createChunkTaggedText(ChunkTaggedText value) {
        return new JAXBElement<ChunkTaggedText>(_ChunkTaggedText_QNAME, ChunkTaggedText.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChunkText }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webNpChunkerRo.uaic/", name = "chunkText")
    public JAXBElement<ChunkText> createChunkText(ChunkText value) {
        return new JAXBElement<ChunkText>(_ChunkText_QNAME, ChunkText.class, null, value);
    }

}
