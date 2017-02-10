package com.webservice.services;

import com.webservice.Database.MyFactories;
import com.webservice.Database.Person;
import com.webservice.requests.CreatePersonRequest;
import com.webservice.responses.CreatePersonResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.servlet.http.HttpServletResponse;

public class PersonServiceImpl implements PersonService {

  @Override
  public CreatePersonResponse personCreate(CreatePersonRequest createPerson) {

    CreatePersonResponse createPersonResponse = new CreatePersonResponse();
    createPersonResponse.setMessage("CREATION SUCCESSFUL");
    createPersonResponse.setStatus("SUCCESS");


    int age = createPerson.getAge();
    String firstName = createPerson.getFirstName();
    String lastName = createPerson.getLastName();

    // Getting an instance of a SessionFactory
    SessionFactory sessionFactory = MyFactories.getInstance().getSessionFactory();

    // Creating person
    Person person = new Person();
    person.setAge(age);
    person.setFirst_name(firstName);
    person.setLast_name(lastName);

    // Open database connection
    Session session = sessionFactory.openSession();
    session.beginTransaction();

    // Saving to database
    session.save(person);
    session.getTransaction().commit();

    // Closing database connection
    session.close();

    return createPersonResponse;
  }
}
