package org.example.Homework4;

import lombok.Getter;

import java.util.ArrayList;

@Getter
public enum Holidays {
    NULL("нет праздника"), NEW_YEAR("Новый Год"), EIGHT_MARCH("8 Марта"), TWENTY_THREE_FEBRUARY("23 Февраля");

    private final String holiday;

    Holidays(String holiday) {
        this.holiday = holiday;
    }

    public static void Congratulate(ArrayList<Employee> list, Holidays holiday) {
        if (holiday.getHoliday() == NEW_YEAR.holiday) {
            for (Employee e : list) {
                System.out.println(e.getName() + ", поздравляю с новым годом!");
            }
        } else if (holiday.getHoliday() == EIGHT_MARCH.holiday) {
            for (Employee e : list) {
                if (e.getGender() == Buyer.Gender.FEMALE) {
                    System.out.println(e.getName() + ", поздравляем вас с 8 Марта!");
                }
            }
        } else if (holiday.getHoliday() == TWENTY_THREE_FEBRUARY.holiday) {
            for (Employee e : list) {
                if (e.getGender() == Buyer.Gender.MALE) {
                    System.out.println(e.getName() + ", поздравляем вас с 23 Февраля!");
                }
            }
        } else {
            System.out.println("Быстро работать!");
        }
    }

}
