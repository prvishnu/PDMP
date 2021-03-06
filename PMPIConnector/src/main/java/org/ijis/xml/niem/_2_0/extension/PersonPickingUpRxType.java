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

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import gov.niem.niem.niem_core._2.IdentificationType;
import gov.niem.niem.niem_core._2.PersonType;


/**
 * <p>Java class for PersonPickingUpRxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonPickingUpRxType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://niem.gov/niem/niem-core/2.0}PersonType">
 *       &lt;sequence>
 *         &lt;element ref="{http://xml.ijis.org/niem/2.0/extension}PersonIdentifier" minOccurs="0"/>
 *         &lt;element ref="{http://xml.ijis.org/niem/2.0/extension}RelationshipToPatientCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonPickingUpRxType", propOrder = {
    "personIdentifier",
    "relationshipToPatientCode"
})
public class PersonPickingUpRxType
    extends PersonType
{

    @XmlElementRef(name = "PersonIdentifier", namespace = "http://xml.ijis.org/niem/2.0/extension", type = JAXBElement.class)
    protected JAXBElement<?> personIdentifier;
    @XmlElement(name = "RelationshipToPatientCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String relationshipToPatientCode;

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
     * Gets the value of the relationshipToPatientCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipToPatientCode() {
        return relationshipToPatientCode;
    }

    /**
     * Sets the value of the relationshipToPatientCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipToPatientCode(String value) {
        this.relationshipToPatientCode = value;
    }

}
