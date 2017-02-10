package com.webservice.config;

import com.webservice.services.PersonServiceImpl;
import com.webservice.services.SearchServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class WebServiceConfig {
  @Bean
  public ServletRegistrationBean dispatcherSerlvet() {
    return new ServletRegistrationBean(new CXFServlet(), "/services/*");
  }

  @Bean(name = Bus.DEFAULT_BUS_ID)
  public SpringBus springBus() {
    return new SpringBus();
  }

  @Bean
  public Endpoint personServiceEndpoint() {
    Endpoint ep = new EndpointImpl(springBus(), new PersonServiceImpl());
    ep.publish("/PersonService");
    return ep;
  }

  @Bean
  public Endpoint searchServiceEndpoint1() {
    Endpoint ep = new EndpointImpl(springBus(), new SearchServiceImpl());
    ep.publish("/SearchService");
    return ep;
  }


}
