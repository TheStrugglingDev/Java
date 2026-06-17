package com.strugglingdev.burger;


public class Store {

    public static void main(String[] args) {

        Meal regularMeal = new Meal();
        regularMeal.addToppings("Ketchup", "Mayo", "Bacon", "Cheddar");
        System.out.println(regularMeal);

        Meal USRegularMeal = new Meal(0.71); //AUS to USD as for 15/6/2026
        System.out.println(USRegularMeal);
    }
}
