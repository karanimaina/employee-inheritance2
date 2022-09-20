package com.example.employee.repository;

import com.example.employee.models.PartTimeEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PartTimeEmployeeRepository extends JpaRepository<PartTimeEmployee,Long> {


}
