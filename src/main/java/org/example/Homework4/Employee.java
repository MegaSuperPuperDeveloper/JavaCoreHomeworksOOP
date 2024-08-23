package org.example.Homework4;

import lombok.Getter;

@Getter
public class Employee {
    private String name;
    private Buyer.Gender gender;

    public Employee(Buyer.Gender gender, String name) {
        this.name = name;
        this.gender = gender;
    }

}
