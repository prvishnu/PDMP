//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.02.04 at 02:02:33 PM IST 
//


package gov.niem.niem.niem_core._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gov.niem.niem.structures._2.ComplexObjectType;


/**
 * <p>Java class for PersonNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonNameType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://niem.gov/niem/structures/2.0}ComplexObjectType">
 *       &lt;sequence>
 *         &lt;element ref="{http://niem.gov/niem/niem-core/2.0}PersonNamePrefixText" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://niem.gov/niem/niem-core/2.0}PersonGivenName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://niem.gov/niem/niem-core/2.0}PersonMiddleName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://niem.gov/niem/niem-core/2.0}PersonSurName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://niem.gov/niem/niem-core/2.0}PersonNameSuffixText" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://niem.gov/niem/niem-core/2.0}PersonFullName" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonNameType", propOrder = {
    "personNamePrefixText",
    "personGivenName",
    "personMiddleName",
    "personSurName",
    "personNameSuffixText",
    "personFullName"
})
public class PersonNameType
    extends ComplexObjectType
{

    @XmlElement(name = "PersonNamePrefixText", nillable = true)
    protected List<TextType> personNamePrefixText;
    @XmlElement(name = "PersonGivenName", nillable = true)
    protected List<PersonNameTextType> personGivenName;
    @XmlElement(name = "PersonMiddleName", nillable = true)
    protected List<PersonNameTextType> personMiddleName;
    @XmlElement(name = "PersonSurName", nillable = true)
    protected List<PersonNameTextType> personSurName;
    @XmlElement(name = "PersonNameSuffixText", nillable = true)
    protected List<TextType> personNameSuffixText;
    @XmlElement(name = "PersonFullName", nillable = true)
    protected List<PersonNameTextType> personFullName;

    /**
     * Gets the value of the personNamePrefixText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personNamePrefixText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonNamePrefixText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getPersonNamePrefixText() {
        if (personNamePrefixText == null) {
            personNamePrefixText = new ArrayList<TextType>();
        }
        return this.personNamePrefixText;
    }

    /**
     * Gets the value of the personGivenName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personGivenName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonGivenName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonNameTextType }
     * 
     * 
     */
    public List<PersonNameTextType> getPersonGivenName() {
        if (personGivenName == null) {
            personGivenName = new ArrayList<PersonNameTextType>();
        }
        return this.personGivenName;
    }

    /**
     * Gets the value of the personMiddleName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personMiddleName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonMiddleName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonNameTextType }
     * 
     * 
     */
    public List<PersonNameTextType> getPersonMiddleName() {
        if (personMiddleName == null) {
            personMiddleName = new ArrayList<PersonNameTextType>();
        }
        return this.personMiddleName;
    }

    /**
     * Gets the value of the personSurName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personSurName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonSurName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonNameTextType }
     * 
     * 
     */
    public List<PersonNameTextType> getPersonSurName() {
        if (personSurName == null) {
            personSurName = new ArrayList<PersonNameTextType>();
        }
        return this.personSurName;
    }

    /**
     * Gets the value of the personNameSuffixText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personNameSuffixText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonNameSuffixText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getPersonNameSuffixText() {
        if (personNameSuffixText == null) {
            personNameSuffixText = new ArrayList<TextType>();
        }
        return this.personNameSuffixText;
    }

    /**
     * Gets the value of the personFullName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personFullName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonFullName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonNameTextType }
     * 
     * 
     */
    public List<PersonNameTextType> getPersonFullName() {
        if (personFullName == null) {
            personFullName = new ArrayList<PersonNameTextType>();
        }
        return this.personFullName;
    }

}