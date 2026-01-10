package com.thestrugglingdev;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] integers = SortedArray.getIntegers(5);
        SortedArray.printArray(integers);
        int[] sortedArray = SortedArray.sortIntegers(integers);
        SortedArray.printArray(sortedArray);

    }


    public class SortedArray {


        public static int[] getIntegers(int len) {

            int[] integers = new int[len];
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < len; i++) {
                integers[i] = scanner.nextInt();
            }
            return integers;

        }

        public static void printArray(int[] integers) {
            for (int i = 0; i < integers.length; i++) {
                System.out.println("Element " + i + " contents " + integers[i]);
            }
        }

        public static int[] sortIntegers(int[] integers) {

            int[] sortedArray = Arrays.copyOf(integers, integers.length);
            boolean flag = true;
            int temp;
            while (flag) {
                flag = false;
                for (int i = 0; i < sortedArray.length - 1; i++) {
                    if (sortedArray[i] < sortedArray[i + 1]) {
                        temp = sortedArray[i];
                        sortedArray[i] = sortedArray[i + 1];
                        sortedArray[i + 1] = temp;
                        flag = true;
                    }
                }
            }
            return sortedArray;
        }
    }

}