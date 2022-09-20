package com.example.employee.repository;

import com.example.employee.models.Employee;
import com.example.employee.models.FullTimeEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FullTimeRepository extends JpaRepository<FullTimeEmployee, Long> {


}
