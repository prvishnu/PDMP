//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.02.04 at 02:02:33 PM IST 
//


package org.ijis.xml.niem._2_0.extension;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import gov.niem.niem.niem_core._2.IdentificationType;
import gov.niem.niem.niem_core._2.TextType;
import gov.niem.niem.structures._2.ComplexObjectType;


/**
 * Type of medicinal treatment made of organic or inorganic compounds  that can be legally ordered for a patient's care  .
 * 			
 * 
 * <p>Java class for PrescriptionDrugType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrescriptionDrugType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://niem.gov/niem/structures/2.0}ComplexObjectType">
 *       &lt;sequence>
 *         &lt;element ref="{http://xml.ijis.org/niem/2.0/extension}DrugProductIdentifier"/>
 *         &lt;element ref="{http://xml.ijis.org/niem/2.0/extension}DrugProductNameText" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://xml.ijis.org/niem/2.0/extension}DrugStrengthText" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://xml.ijis.org/niem/2.0/extension}DrugUnitOfMeasureText" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://xml.ijis.org/niem/2.0/extension}DEAClassScheduleText" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://xml.ijis.org/niem/2.0/extension}CompoundDrugIngredient" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrescriptionDrugType", propOrder = {
    "drugProductIdentifier",
    "drugProductNameText",
    "drugStrengthText",
    "drugUnitOfMeasureText",
    "deaClassScheduleText",
    "compoundDrugIngredient"
})
public class PrescriptionDrugType
    extends ComplexObjectType
{

    @XmlElementRef(name = "DrugProductIdentifier", namespace = "http://xml.ijis.org/niem/2.0/extension", type = JAXBElement.class)
    protected JAXBElement<?> drugProductIdentifier;
    @XmlElement(name = "DrugProductNameText", nillable = true)
    protected List<TextType> drugProductNameText;
    @XmlElement(name = "DrugStrengthText", nillable = true)
    protected List<TextType> drugStrengthText;
    @XmlElement(name = "DrugUnitOfMeasureText", nillable = true)
    protected List<TextType> drugUnitOfMeasureText;
    @XmlElement(name = "DEAClassScheduleText", nillable = true)
    protected List<TextType> deaClassScheduleText;
    @XmlElement(name = "CompoundDrugIngredient", nillable = true)
    protected List<CompoundDrugIngredientType> compoundDrugIngredient;

    /**
     * Gets the value of the drugProductIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IdentificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IdentificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     {@link JAXBElement }{@code <}{@link IdentificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IdentificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IdentificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IdentificationType }{@code >}
     *     
     */
    public JAXBElement<?> getDrugProductIdentifier() {
        return drugProductIdentifier;
    }

    /**
     * Sets the value of the drugProductIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IdentificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IdentificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     {@link JAXBElement }{@code <}{@link IdentificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IdentificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IdentificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IdentificationType }{@code >}
     *     
     */
    public void setDrugProductIdentifier(JAXBElement<?> value) {
        this.drugProductIdentifier = ((JAXBElement<?> ) value);
    }

    /**
     * Gets the value of the drugProductNameText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the drugProductNameText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrugProductNameText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getDrugProductNameText() {
        if (drugProductNameText == null) {
            drugProductNameText = new ArrayList<TextType>();
        }
        return this.drugProductNameText;
    }

    /**
     * Gets the value of the drugStrengthText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the drugStrengthText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrugStrengthText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getDrugStrengthText() {
        if (drugStrengthText == null) {
            drugStrengthText = new ArrayList<TextType>();
        }
        return this.drugStrengthText;
    }

    /**
     * Gets the value of the drugUnitOfMeasureText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the drugUnitOfMeasureText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrugUnitOfMeasureText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getDrugUnitOfMeasureText() {
        if (drugUnitOfMeasureText == null) {
            drugUnitOfMeasureText = new ArrayList<TextType>();
        }
        return this.drugUnitOfMeasureText;
    }

    /**
     * Gets the value of the deaClassScheduleText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deaClassScheduleText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDEAClassScheduleText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getDEAClassScheduleText() {
        if (deaClassScheduleText == null) {
            deaClassScheduleText = new ArrayList<TextType>();
        }
        return this.deaClassScheduleText;
    }

    /**
     * Gets the value of the compoundDrugIngredient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compoundDrugIngredient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompoundDrugIngredient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompoundDrugIngredientType }
     * 
     * 
     */
    public List<CompoundDrugIngredientType> getCompoundDrugIngredient() {
        if (compoundDrugIngredient == null) {
            compoundDrugIngredient = new ArrayList<CompoundDrugIngredientType>();
        }
        return this.compoundDrugIngredient;
    }

}