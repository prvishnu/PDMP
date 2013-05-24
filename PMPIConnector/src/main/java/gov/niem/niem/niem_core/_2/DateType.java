//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.02.04 at 02:02:33 PM IST 
//


package gov.niem.niem.niem_core._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import gov.niem.niem.proxy.xsd._2.Date;
import gov.niem.niem.structures._2.ComplexObjectType;


/**
 * <p>Java class for DateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://niem.gov/niem/structures/2.0}ComplexObjectType">
 *       &lt;sequence>
 *         &lt;element ref="{http://niem.gov/niem/niem-core/2.0}DateRepresentation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateType", propOrder = {
    "dateRepresentation"
})
public class DateType
    extends ComplexObjectType
{

    @XmlElementRef(name = "DateRepresentation", namespace = "http://niem.gov/niem/niem-core/2.0", type = JAXBElement.class)
    protected List<JAXBElement<?>> dateRepresentation;

    /**
     * Gets the value of the dateRepresentation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateRepresentation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateRepresentation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Date }{@code >}
     * {@link JAXBElement }{@code <}{@link Date }{@code >}
     * {@link JAXBElement }{@code <}{@link Date }{@code >}
     * {@link JAXBElement }{@code <}{@link Date }{@code >}
     * {@link JAXBElement }{@code <}{@link Date }{@code >}
     * {@link JAXBElement }{@code <}{@link Date }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getDateRepresentation() {
        if (dateRepresentation == null) {
            dateRepresentation = new ArrayList<JAXBElement<?>>();
        }
        return this.dateRepresentation;
    }

}