package org.example.Homework3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Director extends Worker{

    public Director(String name, int age, int salary) {
        super(name, age, salary);
    }

    public static void upgradeSalaryEveryone (int money, ArrayList<Worker> allWorkers) {
        for (Worker worker : allWorkers) {
            if (!(worker instanceof Director)) {
                worker.setSalary(worker.getSalary() + money);
            }
        }
    }

}
