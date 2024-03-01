package com.telusko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.telusko.request.Student;
import com.telusko.response.AdmitCard;
import com.telusko.response.RegCard;
import com.telusko.service.RegAdmitServiceImpl;

@Controller
public class RegistrationController 
{
	@Autowired
	RegAdmitServiceImpl service;
	
	@GetMapping("/welcome")
	public String getWelcomePage(Model model)
	{
		return "welcome";
	}
	
	@PostMapping("/register")
	public String registerStudent(@ModelAttribute Student student,Model model)
	{
		RegCard regcard = service.registerStudents(student);
		model.addAttribute("regNum", "Registration number is: "+regcard.getRegNum());
		System.out.println(regcard);
		return "home";
	}
	
	@GetMapping("/form")
	public String getHomePage(Model model)
	{
		
		model.addAttribute("student",new Student());
		return "home";
	}
	@GetMapping("/reg")
	public String getRegistrationForm(Model model)
	{
		model.addAttribute("reg", new RegCard());
		
		return "regcard";
	}
	@GetMapping("/get-regcard")
	public String getRegistrationForm(@RequestParam("regNum") Integer regNum,Model model)
	{
		RegCard regicard=service.fetchRegistrationCardInfo(regNum);
		model.addAttribute("reg",regicard );
		
		return "regcard";
	}
	@GetMapping("/admit")
	public String getAdmitForm(Model model)
	{
		model.addAttribute("admit", new AdmitCard());
		
		return "admitcard";
	}
	@GetMapping("/get-admitcard")
	public String getAdmitCard(@RequestParam("regNum") Integer regNum,Model model)
	{
		 AdmitCard admitcard = service.fetchAdmitCardInfo(regNum);
		 model.addAttribute("admit",admitcard);
		
		return "admitcard";
	}
}
