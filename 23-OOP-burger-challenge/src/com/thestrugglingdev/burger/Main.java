package com.thestrugglingdev.burger;

public class Main {

    public static void main(String[] args) {

//        com.thestrugglingdev.burger.Item coke = new com.thestrugglingdev.burger.Item("drink", "coke", 1.5);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        com.thestrugglingdev.burger.Item avocado = new com.thestrugglingdev.burger.Item("Topping", "avocado", 1.5);
//        avocado.printItem();

//        com.thestrugglingdev.burger.Burger burger = new com.thestrugglingdev.burger.Burger("regular", 4.00);
//        burger.addToppings("BACON", "CHEESE", "MAYO");
//        burger.printItem();

//        com.thestrugglingdev.burger.MealOrder regularMeal = new com.thestrugglingdev.burger.MealOrder();
//        regularMeal.addBurgerToppings("BACON", "CHEESE", "MAYO");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemizedList();
//
//        com.thestrugglingdev.burger.MealOrder secondMeal = new com.thestrugglingdev.burger.MealOrder("turkey", "7-up",
//                "chili");
//        secondMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
//        secondMeal.setDrinkSize("SMALL");
//        secondMeal.printItemizedList();

        MealOrder deluxeMeal = new MealOrder("deluxe", "7-up",
                "chili");
        deluxeMeal.addBurgerToppings("AVOCADO", "BACON", "LETTUCE",
                "CHEESE", "MAYO");
        deluxeMeal.setDrinkSize("SMALL");
        deluxeMeal.printItemizedList();
    }
}
