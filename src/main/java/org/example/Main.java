package org.example;

import org.example.Homework3.Director;
import org.example.Homework3.Worker;
import org.example.Homework4.Buyer;
import org.example.Homework4.Employee;
import org.example.Homework4.Holidays;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // HW3
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

        System.out.println();

        // HW4
        int answer = 0;
        ArrayList<Employee> allEmployee = new ArrayList<>();
        Employee employee1 = new Employee(Buyer.Gender.MALE, "Паша");
        Employee employee2 = new Employee(Buyer.Gender.FEMALE, "Александра");
        Employee employee3 = new Employee(Buyer.Gender.FEMALE, "Екатерина");
        Employee employee4 = new Employee(Buyer.Gender.MALE, "Николай");
        Employee employee5 = new Employee(Buyer.Gender.MALE, "Дмитрий");
        allEmployee.add(employee1);
        allEmployee.add(employee2);
        allEmployee.add(employee3);
        allEmployee.add(employee4);
        allEmployee.add(employee5);
        System.out.println("Какой сегодня праздник?");
        System.out.println("1. Новый Год");
        System.out.println("2. 8 Марта");
        System.out.println("3. 23 Февраля");
        System.out.println("4. Сегодня нет праздника");
        while (answer < 1 || answer > 4) {
            Scanner scanner = new Scanner(System.in);
            answer = scanner.nextInt();
        }
        if (answer == 1) {
            Holidays.Congratulate(allEmployee, Holidays.NEW_YEAR);
        } else if (answer == 2) {
            Holidays.Congratulate(allEmployee, Holidays.EIGHT_MARCH);
        } else if (answer == 3) {
            Holidays.Congratulate(allEmployee, Holidays.TWENTY_THREE_FEBRUARY);
        } else {
            Holidays.Congratulate(allEmployee, Holidays.NULL);
        }

    }
}