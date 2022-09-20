package com.example.employee;

import com.example.employee.models.FullTimeEmployee;
import com.example.employee.models.PartTimeEmployee;
import com.example.employee.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class EmployeeApplication implements CommandLineRunner {
private final EmployeeService employeeService;
    public static void main(String[] args) {
        SpringApplication.run(EmployeeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        employeeService.insertPart(new PartTimeEmployee(1L,"feliz",20L));
        employeeService.insertFull(new FullTimeEmployee(2L,"feliz",2000000L));

    }
}
