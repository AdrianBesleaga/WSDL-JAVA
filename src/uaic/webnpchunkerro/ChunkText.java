
package uaic.webnpchunkerro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chunkText complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chunkText">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inputText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chunkText", propOrder = {
    "inputText"
})
public class ChunkText {

    protected String inputText;

    /**
     * Gets the value of the inputText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputText() {
        return inputText;
    }

    /**
     * Sets the value of the inputText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputText(String value) {
        this.inputText = value;
    }

}
