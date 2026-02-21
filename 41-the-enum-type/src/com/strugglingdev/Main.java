package com.strugglingdev;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        MyDayOfTheWeek weekDay = MyDayOfTheWeek.FRI;
        System.out.println(weekDay);

        for (int i = 0; i < 7; i++) {
            weekDay = getRandomDay();
//            System.out.printf("Name is %s, Ordinal Value = %d%n",
//                    weekDay.name(), weekDay.ordinal());
//
//            if (weekDay == MyDayOfTheWeek.FRI) {
//                System.out.println("Found a Friday!!!");
//            }
            switchDayOfTheWeek(weekDay);
        }

        for (Topping topping : Topping.values()) {
            System.out.println(topping.name() + " : " + topping.getPrice());
        }
    }


    public static void switchDayOfTheWeek(MyDayOfTheWeek weekDay) {

        int weekDayInteger = weekDay.ordinal() + 1;

        switch (weekDay) {
            case WED -> System.out.println("Wednesday is Day " + weekDayInteger);
            case FRI -> System.out.println("Friday is Day " + weekDayInteger);
            default -> System.out.println(weekDay.name().charAt(0) +
                    weekDay.name().substring(1).toLowerCase() +
                    "day is Day " + weekDayInteger);

        }

    }

    public static MyDayOfTheWeek getRandomDay() {

        int randomInteger = new Random().nextInt(7);
        var allDays = MyDayOfTheWeek.values();

        return allDays[randomInteger];
    }

}