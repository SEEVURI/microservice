package com.srini.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srini.model.Emp;

@RestController
public class EmpController {

	@RequestMapping("/displayEmp")
	public Emp getEmployee(){
		Emp emp = new Emp();
		emp.setEmpId(100);
		emp.setFirstName("srinivasa");
		emp.setLastName("E");
		emp.setSalary(100000); 
		return emp;
	}

}
