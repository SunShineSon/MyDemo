package com.demo.spring.inf;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path(value = "/usermanger")
@Produces({ MediaType.APPLICATION_JSON })
public interface UserMangerIntf {

	@Path("/test")
	public void test();
	
	@GET
	@Path("/login")
	public void login();
}
