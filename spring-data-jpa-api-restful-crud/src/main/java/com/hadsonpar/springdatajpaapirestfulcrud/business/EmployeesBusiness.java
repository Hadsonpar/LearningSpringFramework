package com.hadsonpar.springdatajpaapirestfulcrud.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.hadsonpar.springdatajpaapirestfulcrud.entity.Employees;
import com.hadsonpar.springdatajpaapirestfulcrud.repository.EmployeesRepository;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeesBusiness implements IEmployeesBusiness{
	
	@Autowired
	private EmployeesRepository employeesRepository;
	
	@GetMapping
	public List<Employees> getAllEmployees(){
		return employeesRepository.findAll();
	}

	@PostMapping
	public Employees createEmployee(@RequestBody Employees employees){
		return employeesRepository.save(employees);
	}

	@GetMapping("{id}")
	public Employees getIdEmployees(@PathVariable("id") Long id) throws Exception {
		return employeesRepository.findById(id).orElseThrow(
				() -> new Exception("No se encontró el registro"));
	}

	@PutMapping("/{id}")
	public Employees updateEmployee(@RequestBody Employees employees, @PathVariable("id") Long id) throws Exception {
		try {
			employees.setId(id);
			return this.employeesRepository.save(employees);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No se encontró el registro", e);
		}
	}

	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable("id") Long id) throws Exception {
		try {
			this.getIdEmployees(id);
			employeesRepository.deleteById(id);
		}catch (Exception e){
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No se encontró el registro", e);
		}
	}
}