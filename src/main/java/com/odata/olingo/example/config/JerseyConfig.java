package com.odata.olingo.example.config;

import org.apache.olingo.odata2.core.rest.ODataRootLocator;
import org.apache.olingo.odata2.core.rest.app.ODataApplication;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.odata.olingo.example.service.CustomODataServiceFactory;
import com.odata.olingo.example.service.OdataJpaServiceFactory;

import javax.persistence.EntityManagerFactory;
import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/odata")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig(OdataJpaServiceFactory serviceFactory, EntityManagerFactory entityManagerFactory) {
        ODataApplication oDataApplication = new ODataApplication();
        System.out.println("oDataApplication " + oDataApplication.getClass());
        oDataApplication
                .getClasses()
                .forEach( c -> {
                    if ( !ODataRootLocator.class.isAssignableFrom(c)) {
                        register(c);
                    }
                });
        register(ODataServiceRootLocator.class);
        register(new EntityManagerFilter(entityManagerFactory));
    }

}