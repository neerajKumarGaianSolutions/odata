package com.odata.olingo.example.service;


import org.apache.olingo.odata2.jpa.processor.api.ODataJPAContext;
import org.apache.olingo.odata2.jpa.processor.api.ODataJPADefaultProcessor;

public class CustomODataJpaProcessor extends ODataJPADefaultProcessor {

    public CustomODataJpaProcessor(ODataJPAContext oDataJPAContext) {
        super(oDataJPAContext);
    }
    
}
