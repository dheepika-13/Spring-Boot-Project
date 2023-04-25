package com.employeeDetails.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeeDetails.model.Emp;

public interface EmpRepository extends JpaRepository<Emp,Integer>{

}
