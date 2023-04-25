package com.employeeDetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employeeDetails.model.Emp;
import com.employeeDetails.service.EmpService;

@RestController
public class EmpController {
	@Autowired
	EmpService empService;
	@GetMapping(value="/fetchEmployees")
	public List<Emp>getAllEmployees(){
		List<Emp>empList=empService.getAllEmployees();
		return empList;
	}
	@PostMapping(value="/saveEmployee")
	public Emp saveEmployee1(@RequestBody Emp e)
	{
		return empService.saveEmployee(e);
	}


}
