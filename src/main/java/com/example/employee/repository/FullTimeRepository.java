package com.example.employee.repository;

import com.example.employee.models.Employee;
import com.example.employee.models.FullTimeEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FullTimeRepository extends JpaRepository<FullTimeEmployee, Long> {

}
