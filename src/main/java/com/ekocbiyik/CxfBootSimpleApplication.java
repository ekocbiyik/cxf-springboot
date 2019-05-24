package com.ekocbiyik;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
@EnableAutoConfiguration
public class CxfBootSimpleApplication {

    public static void main(String[] args) {
        SpringApplication.run(CxfBootSimpleApplication.class, args);
    }

    @Bean
    public ServletRegistrationBean cxfServletRegistration() {
        ServletRegistrationBean registration = new ServletRegistrationBean(new CXFServlet(), "/*");
        registration.setName("CXFServlet");
        registration.addInitParameter("hide-service-list-page", "true");
        registration.setLoadOnStartup(1);
        return registration;
    }

    @Autowired
    private Bus bus;

    @Bean("queryQuotaWebService")
    public Endpoint queryQuotaEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new QueryQuotaWebServiceImpl());
        endpoint.publish("/QueryQuotaWebService");
        return endpoint;
    }

}
