package com.hadsonpar.springdatajpaapirestfulcrud.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hadsonpar.springdatajpaapirestfulcrud.entity.Employees;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Long> {

}