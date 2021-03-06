/*
   Copyright 2013 Collaborative For Universal Health (C4UH), Logicoy Inc.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
  */


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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import gov.niem.niem.niem_core._2.ContactInformationType;
import gov.niem.niem.niem_core._2.IdentificationType;
import gov.niem.niem.niem_core._2.PersonType;
import gov.niem.niem.niem_core._2.TextType;


/**
 * <p>Java class for PatientType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PatientType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://niem.gov/niem/niem-core/2.0}PersonType">
 *       &lt;sequence>
 *         &lt;element ref="{http://xml.ijis.org/niem/2.0/extension}PersonPrimaryContactInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://xml.ijis.org/niem/2.0/extension}PersonIdentifier" minOccurs="0"/>
 *         &lt;element ref="{http://xml.ijis.org/niem/2.0/extension}SpeciesCode" minOccurs="0"/>
 *         &lt;element ref="{http://xml.ijis.org/niem/2.0/extension}PatientLocationCode" minOccurs="0"/>
 *         &lt;element ref="{http://xml.ijis.org/niem/2.0/extension}PatientNameOfAnimalText" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PatientType", propOrder = {
    "personPrimaryContactInformation",
    "personIdentifier",
    "speciesCode",
    "patientLocationCode",
    "patientNameOfAnimalText"
})
public class PatientType
    extends PersonType
{

    @XmlElement(name = "PersonPrimaryContactInformation")
    protected List<ContactInformationType> personPrimaryContactInformation;
    @XmlElementRef(name = "PersonIdentifier", namespace = "http://xml.ijis.org/niem/2.0/extension", type = JAXBElement.class)
    protected JAXBElement<?> personIdentifier;
    @XmlElement(name = "SpeciesCode", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String speciesCode;
    @XmlElement(name = "PatientLocationCode", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String patientLocationCode;
    @XmlElement(name = "PatientNameOfAnimalText", nillable = true)
    protected TextType patientNameOfAnimalText;

    /**
     * Gets the value of the personPrimaryContactInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personPrimaryContactInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonPrimaryContactInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInformationType }
     * 
     * 
     */
    public List<ContactInformationType> getPersonPrimaryContactInformation() {
        if (personPrimaryContactInformation == null) {
            personPrimaryContactInformation = new ArrayList<ContactInformationType>();
        }
        return this.personPrimaryContactInformation;
    }

    /**
     * Gets the value of the personIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IdentificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IdentificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IdentificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IdentificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IdentificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IdentificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     {@link JAXBElement }{@code <}{@link IdentificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IdentificationType }{@code >}
     *     
     */
    public JAXBElement<?> getPersonIdentifier() {
        return personIdentifier;
    }

    /**
     * Sets the value of the personIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IdentificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IdentificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IdentificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IdentificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IdentificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IdentificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     {@link JAXBElement }{@code <}{@link IdentificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IdentificationType }{@code >}
     *     
     */
    public void setPersonIdentifier(JAXBElement<?> value) {
        this.personIdentifier = ((JAXBElement<?> ) value);
    }

    /**
     * Gets the value of the speciesCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeciesCode() {
        return speciesCode;
    }

    /**
     * Sets the value of the speciesCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeciesCode(String value) {
        this.speciesCode = value;
    }

    /**
     * Gets the value of the patientLocationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientLocationCode() {
        return patientLocationCode;
    }

    /**
     * Sets the value of the patientLocationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientLocationCode(String value) {
        this.patientLocationCode = value;
    }

    /**
     * Gets the value of the patientNameOfAnimalText property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getPatientNameOfAnimalText() {
        return patientNameOfAnimalText;
    }

    /**
     * Sets the value of the patientNameOfAnimalText property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setPatientNameOfAnimalText(TextType value) {
        this.patientNameOfAnimalText = value;
    }

}
