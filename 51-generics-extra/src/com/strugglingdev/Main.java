package com.strugglingdev;

import util.QueryItem;
import util.QueryList;

import java.util.ArrayList;
import java.util.List;

record Employee(String name) implements QueryItem {

    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        return false;
    }
}

public class Main {

    public static void main(String[] args) {

        int studentCount = 10;
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            students.add(new Student());
        }
        students.add(new SDStudent());
//        printList(students);
        printMoreLists(students);

        List<SDStudent> sdStudents = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            sdStudents.add(new SDStudent());
        }
        printMoreLists(sdStudents);

        testList(new ArrayList<String>(List.of("Able", "Barry", "Charlie")));
        testList(new ArrayList<Integer>(List.of(1, 2, 3)));

        var queryList = new QueryList<>(sdStudents);
        var matches = queryList.getMatches(
                "Course", "Python");
        printMoreLists(matches);

        var student2021 = QueryList.getMatches(students, "YearStarted",
                "2021");
        printMoreLists(student2021);

//        QueryList<Employee> employeeList = new QueryList<Employee>();
    }

    public static void printMoreLists(List<? extends Student> students) {

        for (var student : students) {
            System.out.println(student);
        }
        System.out.println();
    }

    public static void testList(List<?> List) {

        for (var element : List) {
            if (element instanceof String s) {
                System.out.println("String: " + s.toUpperCase());
            } else if (element instanceof Integer i) {
                System.out.println("Integer: " + i.floatValue());
            }
        }
    }
//    public static void testList(List<String> list) {
//
//        for (var element : list) {
//            System.out.println("String: " + element.toUpperCase());
//        }
//    }
//
//    public static void testList(List<Integer> list) {
//
//        for (var element : list) {
//            System.out.println("Integer: " + element.floatValue());
//        }
//    }

//    public static <Τ extends Student> void printList(List<Τ> students) {
//
//        for (var student : students) {
//            System.out.println(student.getYearStarted() + ": " + student);
//        }
//        System.out.println();
//    }

}
