package com.webservice.services;

import com.webservice.requests.SearchRequest;
import com.webservice.responses.SearchResponse;
import com.webservice.responses.PersonResponse;

import java.util.ArrayList;

public class SearchServiceImpl implements SearchService {

  @Override
  public SearchResponse createSearch(SearchRequest searchRequest) {

    String ShowDatabase = "FROM Person";
    ArrayList<PersonResponse> fakeDB = new ArrayList<>();
    PersonResponse p1 = new PersonResponse();
    PersonResponse p2 = new PersonResponse();

    p1.setFirstName("sara");
    p1.setLastName("malik");
    p1.setAge(1);

    p2.setFirstName("jonas");
    p2.setLastName("malik");
    p2.setAge(2);

    fakeDB.add(p1);
    fakeDB.add(p2);

    SearchResponse createSearchResponse = new SearchResponse();
    createSearchResponse.setPersonList(fakeDB);

    String mySearch = searchRequest.getSearch();

    return createSearchResponse;
  }
}
