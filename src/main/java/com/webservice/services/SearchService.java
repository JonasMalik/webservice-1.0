package com.webservice.services;

import com.webservice.requests.SearchRequest;
import com.webservice.responses.SearchResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

@WebService
public interface SearchService {

    @WebMethod
    @WebResult(name = "searchResponse")
    @XmlElement(required = true, nillable = false)
    SearchResponse createSearch(
            @XmlElement(required = true, nillable = false)
            @WebParam(name = "searchRequest")
                    SearchRequest createUserRequest1);
}
