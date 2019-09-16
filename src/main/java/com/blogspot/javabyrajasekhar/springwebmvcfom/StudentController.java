package com.blogspot.javabyrajasekhar.springwebmvcfom;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.blogspot.javabyrajasekhar.springwebmvcfom.model.Student;

@Controller
@RequestMapping("/")
public class StudentController {
	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public String student(Model model) {
		//return new ModelAndView("student", "command", new Student());
		model.addAttribute("student", new Student());
		return "student";
	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String addStudent(Student student,ModelMap model) {    //@ModelAttribute("SpringWeb") 
		model.addAttribute("name", student.getName());
		model.addAttribute("age", student.getAge());
		model.addAttribute("id", student.getId());
		return "result";

		
	
	}
}