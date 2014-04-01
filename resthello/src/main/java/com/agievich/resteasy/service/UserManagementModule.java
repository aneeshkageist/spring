package com.agievich.resteasy.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.agievich.resteasy.bean.User;

@Path("/user-management")
public class UserManagementModule {
	@GET
	@Path("/users")
	public Response getAllUsers(){
		String result = "<h1>Restful demo application</h1>";
		return Response.status(200).entity(result).build();
	}
	@GET
	@Path("/users/{id}")
	@Produces("application/json")
	public Response getUserById(@PathParam("id") Integer id){
		User user = new User();
		user.setId(id);
		user.setFirstName("Kate");
		user.setLastName("Agievich");
		return Response.status(200).entity(user).build();
	}
}
