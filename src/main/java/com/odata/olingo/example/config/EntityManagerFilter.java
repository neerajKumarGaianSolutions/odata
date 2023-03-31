package com.odata.olingo.example.config;

import java.io.IOException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.Context;
import javax.ws.rs.ext.Provider;

import org.springframework.stereotype.Component;

@Provider
public class EntityManagerFilter implements ContainerRequestFilter,ContainerResponseFilter {
	

	public static final String EM_REQUEST_ATTRIBUTE =
            EntityManagerFilter.class.getName() + "_ENTITY_MANAGER";
    private final EntityManagerFactory entityManagerFactory;

    @Context
    private HttpServletRequest httpRequest;
    public EntityManagerFilter(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
        EntityManager entityManager = this.entityManagerFactory.createEntityManager();
        httpRequest.setAttribute(EM_REQUEST_ATTRIBUTE, entityManager);
        System.out.println("containerRequestContext.getMethod()" + containerRequestContext.getMethod());
        if (!"GET".equalsIgnoreCase(containerRequestContext.getMethod())) {
            entityManager.getTransaction().begin();
        }
    }
    @Override
    public void filter(ContainerRequestContext requestContext,
                       ContainerResponseContext responseContext) throws IOException {
        EntityManager entityManager = (EntityManager) httpRequest.getAttribute(EM_REQUEST_ATTRIBUTE);
        if (!"GET".equalsIgnoreCase(requestContext.getMethod())) {
            EntityTransaction entityTransaction = entityManager.getTransaction(); //we do not commit because it's just a READ
            if (entityTransaction.isActive() && !entityTransaction.getRollbackOnly()) {
                entityTransaction.commit();
            }
        }
        entityManager.close();
    }
	

}
