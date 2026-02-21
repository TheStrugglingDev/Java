package com.strugglingdev;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        MyDayOfTheWeek weekDay = MyDayOfTheWeek.FRI;
        System.out.println(weekDay);

        for (int i = 0; i < 7; i++) {
            weekDay = getRandomDay();
            System.out.printf("Name is %s, Ordinal Value = %d%n",
                    weekDay.name(), weekDay.ordinal());

            if (weekDay == MyDayOfTheWeek.FRI) {
                System.out.println("Found a Friday!!!");
            }
        }

    }

    public static MyDayOfTheWeek getRandomDay() {

        int randomInteger = new Random().nextInt(7);
        var allDays = MyDayOfTheWeek.values();

        return allDays[randomInteger];
    }
}
