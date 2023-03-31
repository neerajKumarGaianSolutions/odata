package com.odata.olingo.example.config;

import javax.inject.Inject;
import javax.ws.rs.Path;

import org.apache.olingo.odata2.api.ODataServiceFactory;
import org.apache.olingo.odata2.core.rest.ODataRootLocator;

import com.odata.olingo.example.service.CustomODataServiceFactory;
import com.odata.olingo.example.service.OdataJpaServiceFactory;

public class ODataServiceRootLocator extends ODataRootLocator{
	
	 private CustomODataServiceFactory serviceFactory;

     @Inject
     public ODataServiceRootLocator (OdataJpaServiceFactory serviceFactory) {
         this.serviceFactory = serviceFactory;
     }

     @Override
     public ODataServiceFactory getServiceFactory() {
         return this.serviceFactory;
     }

}
