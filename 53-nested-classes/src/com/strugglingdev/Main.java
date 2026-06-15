package com.strugglingdev;

import java.util.ArrayList;
import java.util.List;

public record Main() {

    public static void main(String[] args) {

        List<com.strugglingdev.Employee> employees = new ArrayList<>(List.of(
                new com.strugglingdev.Employee(10001, "Ralph", 2015),
                new com.strugglingdev.Employee(10005, "Carole", 2021),
                new com.strugglingdev.Employee(10022, "Jane", 2013),
                new com.strugglingdev.Employee(13151, "Laura", 2020),
                new com.strugglingdev.Employee(10050, "Jim", 2018)
        ));

//        var comparator = new EmployeeComparator<>();
//        employees.sort(comparator);

        employees.sort(new com.strugglingdev.Employee.EmployeeComparator<>("yearStarted").reversed());
        for (com.strugglingdev.Employee e : employees) {
            System.out.println(e);
        }

        System.out.println("Store members");

        List<com.strugglingdev.StoreEmployee> storeEmployees = new ArrayList<>(List.of(
                new com.strugglingdev.StoreEmployee(10015, "Meg", 2019, "Target"),
                new com.strugglingdev.StoreEmployee(10515, "Joe", 2021, "Walmart"),
                new com.strugglingdev.StoreEmployee(10105, "Tom", 2020, "Macys"),
                new com.strugglingdev.StoreEmployee(10215, "Marty", 2018, "Walmart"),
                new com.strugglingdev.StoreEmployee(10322, "Bud", 2016, "Target")
        ));


        var comparator = new com.strugglingdev.StoreEmployee().new StoreComparator<>();
        storeEmployees.sort(comparator);
        for (com.strugglingdev.StoreEmployee e : storeEmployees) {
            System.out.println(e);
        }
    }
}
