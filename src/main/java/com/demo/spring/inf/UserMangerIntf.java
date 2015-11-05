package com.demo.spring.inf;

import java.util.Map;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path(value = "/usermanger")
@Produces({ MediaType.APPLICATION_JSON })
public interface UserMangerIntf {

	@GET
	@Path("/test")
	public String test();
	
	@POST
	@Path("/ajax")
	public void ajax() throws Exception;
	
	/**
	 * 
	 * @param mail
	 * @param password
	 * @return
	 */
	@POST
	@Path("/login")
	public Response login(
			@FormParam("mail") String mail,
			@FormParam("password") String password
			);
	
	/**
	 * 注册用户
	 * 
	 * @param mail
	 * @param name
	 * @param password
	 * @return
	 * @throws Exception 
	 */
	@POST
	@Path("/register")
	public String Register(
			@FormParam("mail") String mail,
			@FormParam("name") String name,
			@FormParam("password") String password) throws Exception;
	
	@POST
	@Path("/map")
	public Map mapTest(@FormParam("value") String value);
	
}
