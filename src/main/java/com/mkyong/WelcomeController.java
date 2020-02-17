package com.mkyong;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eventmgtsys.model.CompanyEntity;
import com.eventmgtsys.model.EventEntity;
import com.eventmgtsys.model.UserInfoEntity;
import com.eventmgtsys.pojo.UserInfo;
import com.eventmgtsys.service.CompanyService;
import com.eventmgtsys.service.EventService;
import com.eventmgtsys.service.UserRolesService;
import com.eventmgtsys.service.UserService;

@Controller
public class WelcomeController {
	@Autowired
	private UserService userService;
	@Autowired
	private UserRolesService userRolesService;
	@Autowired
	private CompanyService companyService;
	@Autowired
	private EventService eventService;
	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "admin";
	}
	/*@RequestMapping("/addUser")
	public String addUser(Map<String, Object> model) {
		model.put("message", this.message);
		return "addUser";
	}*/
	@RequestMapping(value = "/addUser", method = RequestMethod.GET)
	public ModelAndView adminPage() {
		ModelAndView model = new ModelAndView();
		//model.setViewName("addUser");
		
		model.addObject("roleList", userRolesService.getAllRoles());
		model.setViewName("addUser");
		model.addObject("userInfo",new UserInfoEntity());
		return model;
	}
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public ModelAndView submit(  @ModelAttribute("userInfo")@Valid UserInfoEntity userInfo){ 
		ModelAndView model = new ModelAndView();
		System.out.println(userInfo.getFirstName()+"firstname");
		System.out.println("roleid"+userInfo.getUserRolesEntity().getRoleId());
		Boolean flag=userService.addArticle(userInfo);
		model.addObject("roleList", userRolesService.getAllRoles());
		model.setViewName("addUser");
		return model;
}
	@RequestMapping(value = "/getUsers", method = RequestMethod.GET)
    public ModelAndView getUsers(){ 
		ModelAndView model = new ModelAndView();
		model.addObject("userList", userService.getAllArticles());
		model.setViewName("getUsers");
		return model;
}
	@RequestMapping(value = "/deleteUsersByID", method = RequestMethod.GET)
    public ModelAndView deleteUsersBYId(HttpServletRequest req,HttpServletResponse res){ 
		ModelAndView model = new ModelAndView();
		model.addObject("userList", userService.getAllArticles());
		model.setViewName("getUsers");
		return model;
}
	@RequestMapping(value = "/addCompanyDetails", method = RequestMethod.POST)
    public ModelAndView addCompanyDetails(@ModelAttribute("companyDetails")@Valid CompanyEntity companyDetails){ 
		ModelAndView model = new ModelAndView();
		Boolean flag=companyService.addCompanyDetails(companyDetails);
		model.setViewName("addCompanyDetails");
		return model;
}
	@RequestMapping(value = "/addCompanyDetails", method = RequestMethod.GET)
    public ModelAndView editCompanyDetails(){ 
		ModelAndView model = new ModelAndView();
		CompanyEntity companyDetails;
		List<CompanyEntity> list=companyService.getAllCompanyyDetails();
		if(list.size()>0) {
			companyDetails=list.get(0);
		}
		else {
			companyDetails=new CompanyEntity();
		}
		model.addObject("companyDetails",companyDetails);
		model.setViewName("addCompanyDetails");
		return model;
}
	@RequestMapping(value = "/getEvents", method = RequestMethod.GET)
    public ModelAndView getEvents(){ 
		ModelAndView model = new ModelAndView();
		model.addObject("eventList", eventService.getEvents());
		model.setViewName("getEvents");
		return model;
}
	@RequestMapping(value = "/addEvent", method = RequestMethod.GET)
    public ModelAndView addEvent(){ 
		ModelAndView model = new ModelAndView();
		model.addObject("event",new EventEntity());
		model.setViewName("addEvent");
		return model;
}
	
	@RequestMapping(value = "/addEvent", method = RequestMethod.POST)
	 public ModelAndView addEvent(@ModelAttribute("event")@Valid EventEntity event){ 
		ModelAndView model = new ModelAndView();
		Boolean flag=eventService.addEvent(event);
		model.setViewName("addEvent");
		return model;
}
	@RequestMapping(value = "/editUser", method = RequestMethod.GET)
	 public ModelAndView editUserGet(HttpServletRequest req,HttpServletResponse res){ 
		ModelAndView model = new ModelAndView();
		//userService.updateArticle(userInfoEntity);
		String id=req.getParameter("id");
		System.out.println(id+".................id");
		UserInfoEntity userInfo=userService.getArticleById(Long.parseLong(id));
		model.addObject("userInfo", userInfo);
		model.addObject("roleList", userRolesService.getAllRoles());
		model.setViewName("editUser");
		return model;
}
	@RequestMapping(value = "/editUser", method = RequestMethod.POST)
    public ModelAndView editUserPost(  @ModelAttribute("userInfo")@Valid UserInfoEntity userInfo){ 
		ModelAndView model = new ModelAndView();
		System.out.println(userInfo.getFirstName()+"firstname");
		System.out.println("roleid"+userInfo.getUserRolesEntity().getRoleId());
		Boolean flag=userService.addArticle(userInfo);
		model.addObject("roleList", userRolesService.getAllRoles());
		model.setViewName("editUser");
		return model;
}
	@RequestMapping(value = "/editEvent", method = RequestMethod.GET)
	 public ModelAndView editEventGet(HttpServletRequest req,HttpServletResponse res){ 
		ModelAndView model = new ModelAndView();
		//userService.updateArticle(userInfoEntity);
		String id=req.getParameter("id");
		System.out.println(id+".................id");
		EventEntity event=eventService.getEventById(Long.parseLong(id));
		model.addObject("event", event);
		model.setViewName("editUser");
		return model;
}
	@RequestMapping(value = "/editEvent", method = RequestMethod.POST)
    public ModelAndView editEventPost(  @ModelAttribute("event")@Valid EventEntity event){ 
		ModelAndView model = new ModelAndView();
		Boolean flag=eventService.addEvent(event);
		model.setViewName("editEvent");
		return model;
}
}