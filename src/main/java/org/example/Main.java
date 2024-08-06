package org.example;

import org.example.Homework3.Director;
import org.example.Homework3.Worker;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Worker> allWorkers = new ArrayList<>();
        Worker worker1 = new Worker("Паша", 27, 15000);
        Worker worker2 = new Worker("Саша", 27, 15000);
        Worker worker3 = new Worker("Миша", 27, 15000);
        Worker worker4 = new Worker("Кирилл", 27, 15000);
        Worker worker5 = new Worker("Лёша", 27, 15000);
        Worker director = new Director("Николай", 30, 20000);
        allWorkers.add(worker1);
        allWorkers.add(worker2);
        allWorkers.add(worker3);
        allWorkers.add(worker4);
        allWorkers.add(worker5);
        allWorkers.add(director);
        Director.upgradeSalaryEveryone(100000, allWorkers);
        for (Worker worker : allWorkers) {
            System.out.println(worker.getSalary());
        }
    }
}