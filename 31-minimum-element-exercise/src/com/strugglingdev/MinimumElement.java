package com.strugglingdev;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
    // write code here


    private static int readInteger() {

        Scanner scanner = new Scanner(System.in);
        int integer = Integer.parseInt(scanner.nextLine());
        return integer;
    }

    private static int[] readElements(int numbers) {

        Scanner scanner = new Scanner(System.in);
        int array[] = new int[numbers];

        for (int i = 0; i < numbers; i++) {

            array[i] = Integer.parseInt(scanner.nextLine());
        }

        return array;
    }

    private static int findMin(int[] array) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }
}