package com.eventmgtsys.controller;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.eventmgtsys.model.UserInfoEntity;
import com.eventmgtsys.service.CompanyService;
import com.eventmgtsys.service.EventService;
import com.eventmgtsys.service.UserRolesService;
import com.eventmgtsys.service.UserService;
//this is a comment
@RestController
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private UserRolesService userRolesService;
	@Autowired
	private CompanyService companyService;
	@Autowired
	private EventService eventService;
	
	/*@ResponseBody
	@RequestMapping(value = "/deleteUser", method = RequestMethod.GET,produces="application/json")
	public ResponseEntity<String> deleteUser(HttpServletRequest req,HttpServletResponse res) {
		String id=req.getParameter("id");
		System.out.println(id+"id .................");
		String response="User deleted successfully";
		return new ResponseEntity(response,HttpStatus.OK);
	}*/
	@RequestMapping(value="/deleteEvent", method=RequestMethod.GET,produces="application/json")
	public Response deleteEvent(HttpServletRequest req,HttpServletResponse res) {
		String id=req.getParameter("id");
		System.out.println(id+".................id");
		String json="Event Deleted";
		eventService.deleteEvent(Long.parseLong(id));
		return Response.ok(json,MediaType.APPLICATION_JSON).build();
	}
	@RequestMapping(value="/deleteUser", method=RequestMethod.GET,produces="application/json")
	public Response deleteUser(HttpServletRequest req,HttpServletResponse res) {
		String id=req.getParameter("id");
		System.out.println(id+".................id");
		String json="User Deleted";
		userService.deleteArticle(Long.parseLong(id));
		return Response.ok(json,MediaType.APPLICATION_JSON).build();
	}
	
	/*@RequestMapping(value="/editUser", method=RequestMethod.GET,produces="application/json")
	public Response editUser(HttpServletRequest req,HttpServletResponse res) throws IOException {
		ModelAndView model = new ModelAndView();
		String id=req.getParameter("id");
		System.out.println(id+".................id");
		UserInfoEntity userInfo=userService.getArticleById(Long.parseLong(id));
		pushResponce("edit event",res);
		return Response.ok("edit User",MediaType.APPLICATION_JSON).build();
		//return model;
	}*/

}

