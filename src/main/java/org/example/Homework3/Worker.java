package org.example.Homework3;

import java.util.*;

public class Worker {
    private String name;
    private int age;
    private int salary;

    public Worker(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public static long Comparator (Date firstDate, Date secondDate) {
        return firstDate.getTime() - secondDate.getTime();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
