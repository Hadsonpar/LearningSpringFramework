package com.hadsonpar.springdatajpaapirestfulcrud.business;

import java.util.List;

import com.hadsonpar.springdatajpaapirestfulcrud.entity.Employees;

public interface IEmployeesBusiness {
	public List<Employees> getAllEmployees();
	public Employees createEmployee(Employees employees);
	public Employees getIdEmployees(Long id) throws Exception;
	public Employees updateEmployee(Employees employees, Long id) throws Exception;
	public void deleteEmployee(Long id) throws Exception;
}