package org.example.Homework4;

import lombok.Getter;
import lombok.Setter;

public class Buyer {

    @Getter
    public enum Gender {
        MALE("Мужчина"), FEMALE("Девушка");

        private final String gender;

        Gender(String gender) {
            this.gender = gender;
        }

    }
}
