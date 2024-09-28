package com.cjc.springbootcrudapp.app.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.cjc.springbootcrudapp.app.model.Student;
import com.cjc.springbootcrudapp.app.servicei.StudentServiceI;

@Service
public class StudentServiceImpl implements StudentServiceI
{
     List<Student> l = new ArrayList<Student>();
     
	@Override
	public void saveStudent(Student s) 
	{
		l.add(s);
		System.out.println(l);
		
	   for(Student s1: l)
	   {
		   if(s1.getRollno()==2)
		   {
				s1.setName("Prakash"); 
				System.out.println(s1);
		   }
	   
	   }
	   
	}
	

}
