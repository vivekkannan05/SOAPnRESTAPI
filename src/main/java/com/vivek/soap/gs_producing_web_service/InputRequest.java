//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.31 at 05:26:34 PM CEST 
//


package com.vivek.soap.gs_producing_web_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ediId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="requestXML" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ediId",
    "requestXML"
})
@XmlRootElement(name = "inputRequest")
public class InputRequest {

    protected int ediId;
    @XmlElement(required = true)
    protected String requestXML;

    /**
     * Gets the value of the ediId property.
     * 
     */
    public int getEdiId() {
        return ediId;
    }

    /**
     * Sets the value of the ediId property.
     * 
     */
    public void setEdiId(int value) {
        this.ediId = value;
    }

    /**
     * Gets the value of the requestXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestXML() {
        return requestXML;
    }

    /**
     * Sets the value of the requestXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestXML(String value) {
        this.requestXML = value;
    }

}
