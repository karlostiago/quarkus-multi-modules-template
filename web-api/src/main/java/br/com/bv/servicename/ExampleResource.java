package br.com.bv.servicename;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.bv.servicename.domain.StatementService;

@Path("/hello")
public class ExampleResource {
	
	@Inject
	StatementService statementService;
		
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
    	System.out.println(statementService.account());
        return "Hello RESTEasy";
    }
}