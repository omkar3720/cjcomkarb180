package com.springboot_calculatorapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController 
{
@RequestMapping("/cal")	
public String calculator()
{
	return "calculator";
}
@RequestMapping("/addition")
public String addition()
{
	return "addition";
}
@RequestMapping("/add")
public String success1(@RequestParam("num1")int num1,@RequestParam("num2")int num2,Model m)
{
  int z = num1 + num2;
  m.addAttribute("addition",z);
  return "success";	
}
@RequestMapping("/substraction")
public String substraction()
{
	return "substraction";
}
@RequestMapping("/sub")
public String success2(@RequestParam("num1")int num1,@RequestParam("num2")int num2,Model m)
{
  int z = num1 - num2;
  m.addAttribute("substraction",z);
  return "success";	
}
@RequestMapping("/multiplication")
public String multiplication()
{
	return "multiplication";
}
@RequestMapping("/mul")
public String success3(@RequestParam("num1")int num1,@RequestParam("num2")int num2,Model m)
{
  int z = num1 * num2;
  m.addAttribute("multiplication",z);
  return "success";	
}
@RequestMapping("/divison")
public String divison()
{
	return "divison";
}
@RequestMapping("/div")
public String success4(@RequestParam("num1")int num1,@RequestParam("num2")int num2,Model m)
{
  int z = num1 / num2;
  m.addAttribute("divison",z);
  return "success";	
}
@RequestMapping("/average")
public String average()
{
	return "average";
}
@RequestMapping("/avg")
public String success5(@RequestParam("num1")int num1,@RequestParam("num2")int num2,@RequestParam("num3")int num3,@RequestParam("num4")int num4,@RequestParam("num5")int num5,Model m)
{
  int z = num1 + num2 + num3 + num4 + num5/5;
  m.addAttribute("average",z);
  return "success";	
}
}
