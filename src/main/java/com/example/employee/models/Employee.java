package com.example.employee.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
//@Entity
@Setter
@AllArgsConstructor
@NoArgsConstructor
//single table inheritance
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@MappedSuperclass  //mapped superclass cannot be an entity
public abstract  class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
}
