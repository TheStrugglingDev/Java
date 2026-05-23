package com.strugglingdev;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int studentCount = 10;
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            students.add(new Student());
        }
        students.add(new SDStudent());
        printList(students);

        List<SDStudent> sdStudents = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            sdStudents.add(new SDStudent());
        }
        printList(sdStudents);
    }

    public static void printList(List students) {

        for (var student : students) {
            System.out.println(student);
        }
        System.out.println();
    }
}
