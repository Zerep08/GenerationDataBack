package com.controllers;



import javax.validation.Valid;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/student")
public class StudentController {
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder){
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	//show the form and add the new student to the model
	@RequestMapping("/showForm")
	public String showForm(Model theModel){
		
		
		
		//Add student object to the model
		theModel.addAttribute("student", new Student());
		
		
		
		return "student-form";
	}
	
	
	//validate the data and switch the view
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("student")Student theStudent,
			BindingResult theBindingResult){
		if(theBindingResult.hasErrors()){
			
			return "student-form";
		}else{
		
			// create session factory
			SessionFactory factory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Student.class)
										.buildSessionFactory();
						
						//create session						
						Session session = factory.getCurrentSession();											
						try{
							// start a transaction
							session.beginTransaction();
							
							//save the student							
							session.save(theStudent);
							
							//commit transaction
							session.getTransaction().commit();
							
						}finally{
							factory.close();
						}
			
			
		
		return "student-confirmation";
		}
	}
	
	
	@RequestMapping("/buscarForm")
	public String updateForm(Model theModel){
		
		
		
		//Add student object to the model
		theModel.addAttribute("genID", new GenId());
		
		
		
		return "obtenerId-form";
	}
	
	
	
	@RequestMapping("/updateForm")
	public String updateForm(@Valid @ModelAttribute("genID")GenId theId, Model theModel,
			BindingResult theBindingResult){
		
		if(theBindingResult.hasErrors()||theId.getId()==null){				
			return "error";
		}else{
		
			// create session factory
			SessionFactory factory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Student.class)
										.buildSessionFactory();
						
																	
						try{
							//create session
							Session session = factory.getCurrentSession();
							
							// start a transaction
							session.beginTransaction();

							
							// Retrieve the student with the id
							Student myStudent = session.get(Student.class, theId.getId());
							
							//add the student to the model
							if(myStudent==null) {
								return "error";
							}else {
								theModel.addAttribute("student", myStudent);
							}
								
							//commit transaction
							session.getTransaction().commit();
							
						}finally{
							factory.close();
						}
			
			
		
		return "updateStudent-form";
		}
	}
	
	
	
	
	
	//Update the student found
	@RequestMapping("/updateStudent")
	public String updateStudentForm(@Valid @ModelAttribute("student")Student theStudent,
			BindingResult theBindingResult){
		if(theBindingResult.hasErrors()){
			
			return "updateStudent-form";
		}else{
		
			// create session factory
			SessionFactory factory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Student.class)
										.buildSessionFactory();
						
						//create session						
						Session session = factory.getCurrentSession();											
						try{
							// start a transaction
							session.beginTransaction();
							
							session.update(theStudent);
							
							//commit transaction
							session.getTransaction().commit();
							
						}finally{
							factory.close();
						}
			
			
		
		return "student-confirmation";
		}
	}
	
	
	
}

