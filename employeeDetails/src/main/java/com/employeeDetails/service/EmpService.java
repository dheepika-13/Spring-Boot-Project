package com.employeeDetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeDetails.dao.EmpRepository;
import com.employeeDetails.model.Emp;

@Service
public class EmpService {
	@Autowired
	EmpRepository empRepository;
	public List<Emp> getAllEmployees(){
		List<Emp>empList=empRepository.findAll();
		return empList;
	}
	public Emp saveEmployee(Emp e)
	{
		Emp emp=empRepository.save(e);
		return emp;
	}
	

}
