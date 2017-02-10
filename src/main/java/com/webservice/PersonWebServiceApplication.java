package com.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
public class PersonWebServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(PersonWebServiceApplication.class, args);
    System.out.println("\n\nKLAR!!\n\n");
  }
}
