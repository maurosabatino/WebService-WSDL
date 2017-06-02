package com.isp.it.pshs0;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "NewDataSet" })
@XmlRootElement(name = "NewDataSet")
public class NewDataSet implements Serializable {

    private static final long serialVersionUID = -1182016944703813959L;

    private List<Table> newDataSet;

    public List<Table> getNewDataSet() {
	return newDataSet;
    }

    public void setNewDataSet(List<Table> newDataSet) {
	this.newDataSet = newDataSet;
    }
}

class Table implements Serializable {

    private static final long serialVersionUID = -1182016944703813959L;

    private String Country;
    private String City;

    public String getCountry() {
	return Country;
    }

    public String getCity() {
	return City;
    }

    public void setCountry(String country) {
	Country = country;
    }

    public void setCity(String city) {
	City = city;
    }

}