package com.cjc.springbootcrudapp.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cjc.springbootcrudapp.app.model.Student;
import com.cjc.springbootcrudapp.app.servicei.StudentServiceI;

@Controller
public class StudentController 
{
@Autowired
StudentServiceI ssi;

@RequestMapping("/")	
public String prelogin()
{
	System.out.println("openloginpage");
	return "login";
}
@RequestMapping("/openregisterpage")
public String preregister()
{
	System.out.println("openregisterpage");
	return "register";
}
@RequestMapping("/save")
public String saveStudent(@ModelAttribute Student s)
{
	System.out.println("In Controller");
	ssi.saveStudent(s);
	System.out.println("Out Controller");
	return "login";
}

}
