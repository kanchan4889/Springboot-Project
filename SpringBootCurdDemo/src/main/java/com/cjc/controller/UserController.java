package com.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cjc.model.User;
import com.cjc.service.ServiceInterface;

@Controller
public class UserController
{

	@Autowired
	private ServiceInterface service;
	
	@RequestMapping("/")
	public String welcome()
	{
		System.out.println("index page");
		return "index";
	}
	
	@RequestMapping("registerPage")
	public String register()
	{
		System.out.println("register page");
		return "register";
	}
	
	@RequestMapping("addUser")
	public ModelAndView addUser(@ModelAttribute User user,BindingResult br)
	{
		System.out.println("in addUser");
		System.out.println(user.getName());
		System.out.println(user.getAddress());
		System.out.println(user.getUid());
		System.out.println(user.getUname());
		System.out.println(user.getPassword());
		service.addUser(user);
		System.out.println("User is added");
		return new ModelAndView("index","msg","Login Successful");
	}
	
	/*@RequestMapping(value="/login")
	public String loginCheck(@RequestParam("uname") String uname,@RequestParam("password") String password,User user,Model model)
	{
		System.out.println(uname);
		System.out.println(password);
		user = service.loginCheck(uname, password);
		
		/*if(user!=null)
		{
			model.addAttribute("data",user);
			
		}
		return "success";
	}*/
	
	
    @RequestMapping(value="/SaveEmployee")
    public String SaveEmployee(Model model,@ModelAttribute User user)
    {
   	 System.out.println("in controller");
   	
   	user=service.addUser(user);
  
   	 if(user!=null)
   	 {
   		 model.addAttribute("msg", "registered successfullyy..");
   	 }
   	 else
   	 {
   		 model.addAttribute("msg","you need to register first");
   	 } 
   	 
   	 return "login";
    }
    
    @RequestMapping(value="/login")
    public String LoginCheck(@RequestParam("uname") String uname,@RequestParam("password") String password,User user,Model model)
    {
   	 
       System.out.println(uname);
       System.out.println(password);
       user=service.loginCheck(uname, password);
   	 
   	if(user!=null)
   	{
   		model.addAttribute("data",user);
   	}
   	 return "success";
    }
    
    @RequestMapping(value="/delet")
    public String DeleteEmployee(@RequestParam("rd") int RadioId,Model model,User user)
    {
   	 
   	 service.deleteUser(RadioId);
   	 System.out.println("record deleted ..");
   	 return "login"; 
    }
    
    @RequestMapping(value="/Edit")
    public String EditEmployee(@RequestParam("rd") int RadioId,User user,Model model)
    {
   	System.out.println(RadioId);
   	 
   	user=service.EditUser(RadioId);
   	if(user!=null)
   	{
   		model.addAttribute("EditData",user);
   	}
   	 return "Edit";
    }
    
    @RequestMapping(value="/update")
    public String UpdateEmployee(Model model,@ModelAttribute User user)
    {
   	 user=service.UpdateUser(user);
   	 if(user!=null)
   	 {
   		 model.addAttribute("msg","updated..");
   	 }
   	 else
   	 {
   		 model.addAttribute("msg","not updated..");
   	 }
   	 return "updateSuccess";
    }
    
   
}
