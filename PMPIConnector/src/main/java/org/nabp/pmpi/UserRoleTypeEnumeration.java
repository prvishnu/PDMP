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


package org.nabp.pmpi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserRoleTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserRoleTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Patient"/>
 *     &lt;enumeration value="Research Institute"/>
 *     &lt;enumeration value="VA"/>
 *     &lt;enumeration value="IHS"/>
 *     &lt;enumeration value="Medicaid"/>
 *     &lt;enumeration value="Workers Comp"/>
 *     &lt;enumeration value="Child Protection Services"/>
 *     &lt;enumeration value="Pharmacist"/>
 *     &lt;enumeration value="Pharmacy Tech"/>
 *     &lt;enumeration value="Pharmacy"/>
 *     &lt;enumeration value="Licensed Prescriber's Delegate"/>
 *     &lt;enumeration value="Unlicensed Prescriber's Delegate"/>
 *     &lt;enumeration value="Criminal Investigative Subpoena"/>
 *     &lt;enumeration value="Civil Investigative Subpoena"/>
 *     &lt;enumeration value="Physician"/>
 *     &lt;enumeration value="Nurse Practitioner"/>
 *     &lt;enumeration value="Physician's Assistant"/>
 *     &lt;enumeration value="Other Prescriber"/>
 *     &lt;enumeration value="State Police"/>
 *     &lt;enumeration value="Local Police"/>
 *     &lt;enumeration value="DEA"/>
 *     &lt;enumeration value="FBI"/>
 *     &lt;enumeration value="State Attorney General"/>
 *     &lt;enumeration value="US Attorney"/>
 *     &lt;enumeration value="Medical Examiner/Coroner"/>
 *     &lt;enumeration value="ATF"/>
 *     &lt;enumeration value="HHS/OIG"/>
 *     &lt;enumeration value="Homeland Security"/>
 *     &lt;enumeration value="Probation/Parole"/>
 *     &lt;enumeration value="Corrections"/>
 *     &lt;enumeration value="State Investigative Agencies"/>
 *     &lt;enumeration value="Drug Task Force"/>
 *     &lt;enumeration value="Other Law Enforcement"/>
 *     &lt;enumeration value="Grand Jury Subpoena"/>
 *     &lt;enumeration value="Drug Courts/Drug Diversion Programs"/>
 *     &lt;enumeration value="Court Order"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserRoleTypeEnumeration")
@XmlEnum
public enum UserRoleTypeEnumeration {

    @XmlEnumValue("Patient")
    PATIENT("Patient"),
    @XmlEnumValue("Research Institute")
    RESEARCH_INSTITUTE("Research Institute"),

    /**
     * 
     *             Currently, the VA does not share data with state PMPs. Some
     *             PMPs have taken the stance that if the VA does not share
     *             data with the state, the state will not share data with the VA.
     *           
     * 
     */
    VA("VA"),

    /**
     * 
     *             Same as VA
     *           
     * 
     */
    IHS("IHS"),

    /**
     * 
     *             Some states' laws allow medicaid to get data from the PMP.
     *             Some states do not allow this.
     *           
     * 
     */
    @XmlEnumValue("Medicaid")
    MEDICAID("Medicaid"),

    /**
     * 
     *             Same as Medicaid.
     *           
     * 
     */
    @XmlEnumValue("Workers Comp")
    WORKERS_COMP("Workers Comp"),

    /**
     * 
     *             Some states consider Child Protection Services to be law
     *             enforcmennt and all all law enforcement to access the PMP.
     *             Some states only allow access for drug-related cases.
     *           
     * 
     */
    @XmlEnumValue("Child Protection Services")
    CHILD_PROTECTION_SERVICES("Child Protection Services"),
    @XmlEnumValue("Pharmacist")
    PHARMACIST("Pharmacist"),

    /**
     * 
     *             Some states allow pharmacists to have delegates - namely,
     *             Pharmacy Techs.
     *           
     * 
     */
    @XmlEnumValue("Pharmacy Tech")
    PHARMACY_TECH("Pharmacy Tech"),

    /**
     * 
     *             Some states allow group accounts for a pharmacy. Most states
     *             require an individual person to have an account and only
     *             that person is permitted to use the account.
     *           
     * 
     */
    @XmlEnumValue("Pharmacy")
    PHARMACY("Pharmacy"),

    /**
     * 
     *             This includes RN, PA, etc.
     *             A number of states allow a prescriber to have one or more
     *             delegates. Some states require the delegate to have some
     *             sort of healthcare professional license.
     *           
     * 
     */
    @XmlEnumValue("Licensed Prescriber's Delegate")
    LICENSED_PRESCRIBER_S_DELEGATE("Licensed Prescriber's Delegate"),

    /**
     * 
     *             This includes MA, Office Manager, etc.  Some states which
     *             allow prescriber's to have delegates do not require the
     *             delegate to hold a healthcare professional license.
     *           
     * 
     */
    @XmlEnumValue("Unlicensed Prescriber's Delegate")
    UNLICENSED_PRESCRIBER_S_DELEGATE("Unlicensed Prescriber's Delegate"),

    /**
     * 
     *             There are a number of instances where a subpoena can be used
     *             to request information from the PMP. Some states require the
     *             subpeona to come from a grand jury, some require it to be in
     *             reference to a criminal proceeding and some allow Civil
     *             Subpoena's as well.
     *           
     * 
     */
    @XmlEnumValue("Criminal Investigative Subpoena")
    CRIMINAL_INVESTIGATIVE_SUBPOENA("Criminal Investigative Subpoena"),

    /**
     * 
     *             See Criminal Investigative Subpoena.
     *           
     * 
     */
    @XmlEnumValue("Civil Investigative Subpoena")
    CIVIL_INVESTIGATIVE_SUBPOENA("Civil Investigative Subpoena"),

    /**
     * 
     *             This role is a Prescriber related role.  Laws vary from
     *             state to state in who is permitted to prescribe controlled
     *             substances, and further in which prescribers are permitted
     *             to access the PMP. The Physician role should be used for MDs
     *             and DOs.
     *           
     * 
     */
    @XmlEnumValue("Physician")
    PHYSICIAN("Physician"),

    /**
     * 
     *             This role is a Prescriber related role. Some states permit a
     *             Nurse Practitioner to prescribe controlled substances and
     *             therefore also allow them access to the PMP.
     *           
     * 
     */
    @XmlEnumValue("Nurse Practitioner")
    NURSE_PRACTITIONER("Nurse Practitioner"),

    /**
     * 
     *             This role is a Prescriber related role.  Some states permit
     *             Physician's Assistants to prescribe controlled substnaces
     *             and therefore also allow them to access the PMP.
     *           
     * 
     */
    @XmlEnumValue("Physician's Assistant")
    PHYSICIAN_S_ASSISTANT("Physician's Assistant"),

    /**
     * 
     *             This role is a Prescriber related role.  This is a catch-all
     *             for any other prescriber role that may come up
     *           
     * 
     */
    @XmlEnumValue("Other Prescriber")
    OTHER_PRESCRIBER("Other Prescriber"),

    /**
     * 
     *             This role is a Law Enforcement related role.  Some states
     *             are very specific on which law enforcement agencies are
     *             permitted to access their PMP.
     *           
     * 
     */
    @XmlEnumValue("State Police")
    STATE_POLICE("State Police"),

    /**
     * 
     *             This role is a Law Enforcement related role. Some states are
     *             very specific on which law enforcement agencies are
     *             permitted to access their PMP.
     *           
     * 
     */
    @XmlEnumValue("Local Police")
    LOCAL_POLICE("Local Police"),

    /**
     * 
     *             This role is a Law Enforcement related role.  Some states
     *             are very specific on which law enforcement agencies are
     *             permitted to access their PMP.
     *           
     * 
     */
    DEA("DEA"),

    /**
     * 
     *             This role is a Law Enforcement related role. Some states are
     *             very specific on which law enforcement agencies are
     *             permitted to access their PMP.
     *           
     * 
     */
    FBI("FBI"),

    /**
     * 
     *             This role is a Law Enforcement related role.  Some states
     *             are very specific on which law enforcement agencies are
     *             permitted to access their PMP. The Attorney General is not
     *             law enforcement in some states.
     *           
     * 
     */
    @XmlEnumValue("State Attorney General")
    STATE_ATTORNEY_GENERAL("State Attorney General"),

    /**
     * 
     *             This role is a Law Enforcement related role. Some states
     *             are very specific on which law enforcement agencies are
     *             permitted to access their PMP.
     *           
     * 
     */
    @XmlEnumValue("US Attorney")
    US_ATTORNEY("US Attorney"),

    /**
     * 
     *             This role is a Law Enforcement related role. Some states
     *             are very specific on which law enforcement agencies are
     *             permitted to access their PMP. Some states may consider a
     *             Medical Examiner/Coroner to be a physician.
     *           
     * 
     */
    @XmlEnumValue("Medical Examiner/Coroner")
    MEDICAL_EXAMINER_CORONER("Medical Examiner/Coroner"),

    /**
     * 
     *             This role is a Law Enforcement related role. Some states are
     *             very specific on which law enforcement agencies are
     *             permitted to access their PMP.
     *           
     * 
     */
    ATF("ATF"),

    /**
     * 
     *             This role is a Law Enforcement related role. Some states are
     *             very specific on which law enforcement agencies are
     *             permitted to access their PMP.
     *           
     * 
     */
    @XmlEnumValue("HHS/OIG")
    HHS_OIG("HHS/OIG"),

    /**
     * 
     *             This role is a Law Enforcement related role. Some states are
     *             very specific on which law enforcement agencies are
     *             permitted to access their PMP.
     *           
     * 
     */
    @XmlEnumValue("Homeland Security")
    HOMELAND_SECURITY("Homeland Security"),

    /**
     * 
     *             This role is a Law Enforcement related role. Some states are
     *             very specific on which law enforcement agencies are
     *             permitted to access their PMP.
     *           
     * 
     */
    @XmlEnumValue("Probation/Parole")
    PROBATION_PAROLE("Probation/Parole"),

    /**
     * 
     *             This role is a Law Enforcement related role. Some states are
     *             very specific on which law enforcement agencies are
     *             permitted to access their PMP.
     *           
     * 
     */
    @XmlEnumValue("Corrections")
    CORRECTIONS("Corrections"),

    /**
     * 
     *             This role is a Law Enforcement related role. Some states are
     *             very specific on which law enforcement agencies are
     *             permitted to access their PMP.
     *           
     * 
     */
    @XmlEnumValue("State Investigative Agencies")
    STATE_INVESTIGATIVE_AGENCIES("State Investigative Agencies"),

    /**
     * 
     *             This role is a Law Enforcement related role. Some states are
     *             very specific on which law enforcement agencies are
     *             permitted to access their PMP.
     *           
     * 
     */
    @XmlEnumValue("Drug Task Force")
    DRUG_TASK_FORCE("Drug Task Force"),

    /**
     * 
     *             This role is a Law Enforcement related role. Some states are
     *             very specific on which law enforcement agencies are
     *             permitted to access their PMP.
     *           
     * 
     */
    @XmlEnumValue("Other Law Enforcement")
    OTHER_LAW_ENFORCEMENT("Other Law Enforcement"),

    /**
     * 
     *             This role is a Judical related role. See Civil and Criminal
     *             Subpoena's.
     *           
     * 
     */
    @XmlEnumValue("Grand Jury Subpoena")
    GRAND_JURY_SUBPOENA("Grand Jury Subpoena"),

    /**
     * 
     *             This role is a Judical related role.  Drug Courts are
     *             treated very differently from state to state.
     *           
     * 
     */
    @XmlEnumValue("Drug Courts/Drug Diversion Programs")
    DRUG_COURTS_DRUG_DIVERSION_PROGRAMS("Drug Courts/Drug Diversion Programs"),

    /**
     * 
     *             This role is a Judical related role. Some states do not
     *             respond to court orders.
     *           
     * 
     */
    @XmlEnumValue("Court Order")
    COURT_ORDER("Court Order");
    private final String value;

    UserRoleTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserRoleTypeEnumeration fromValue(String v) {
        for (UserRoleTypeEnumeration c: UserRoleTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
