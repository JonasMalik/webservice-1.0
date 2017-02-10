package com.webservice.responses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class SearchResponse {

  @XmlElement(required = true, nillable = false)
  private ArrayList<PersonResponse> personList = new ArrayList<>();

  public ArrayList<PersonResponse> getPersonList() {
    return personList;
  }

  public void setPersonList(ArrayList<PersonResponse> personList) {
    this.personList = personList;
  }
}
