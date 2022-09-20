package com.example.employee.service;

import com.example.employee.models.FullTimeEmployee;
import com.example.employee.models.PartTimeEmployee;
import com.example.employee.repository.FullTimeRepository;
import com.example.employee.repository.PartTimeEmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

@RequiredArgsConstructor
public class EmployeeService{
private final FullTimeRepository fullTimeRepository;
private final PartTimeEmployeeRepository partTimeEmployeeRepository;

public void insertFull(FullTimeEmployee employee){
    fullTimeRepository.save(employee);
}

public List<FullTimeEmployee>retrieveFullTimeEmployee(){
    return fullTimeRepository.findAll();
}
    public void insertPart(PartTimeEmployee employee){
        partTimeEmployeeRepository.save(employee);
    }

    public List<PartTimeEmployee>retrievePartTimeEmployee(){
        return partTimeEmployeeRepository.findAll();
    }



}
