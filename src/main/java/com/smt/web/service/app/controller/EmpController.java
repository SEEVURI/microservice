package com.smt.web.service.app.controller;

import com.smt.web.service.app.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.smt.web.service.app.model.Emp;

@RestController
public class EmpController {

	@Autowired
	EmpService empService;

	@PostMapping(value = "/createEmp", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Emp createEmployee(@RequestBody Emp emp){
		empService.insertEmp(emp);
		return null;
	}

	@GetMapping(value = "/getEmp/{empId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Emp getEmp(@PathVariable int empId){
		Emp emp = empService.getEmpDetails(empId);
		return emp;
	}

}
