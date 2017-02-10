package com.webservice.services;

import com.webservice.requests.CreatePersonRequest;
import com.webservice.responses.CreatePersonResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

@WebService
public interface PersonService {

    @WebMethod
    @WebResult(name = "createPersonResponse")
    @XmlElement(required = true, nillable = false)
    CreatePersonResponse personCreate(
            @XmlElement(required = true, nillable = false)
            @WebParam(name = "createPersonRequest")
                    CreatePersonRequest createUserRequest);
}
