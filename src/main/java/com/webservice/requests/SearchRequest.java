package com.webservice.requests;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class SearchRequest {

  @XmlElement(required = true, nillable = false)
  private String search;

  public String getSearch() {
    return search;
  }

  public void setSearch(String search) {
    this.search = search;
  }
}
