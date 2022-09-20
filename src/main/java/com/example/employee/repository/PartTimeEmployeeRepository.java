package com.example.employee.repository;

import com.example.employee.models.PartTimeEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PartTimeEmployeeRepository extends JpaRepository<PartTimeEmployee,Long> {


}
