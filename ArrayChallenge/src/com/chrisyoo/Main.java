package com.chrisyoo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(12);
        printArray(myIntegers);
        sortIntegers(myIntegers);
        printArray(myIntegers);


    }

    public static int[] getIntegers (int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printArray (int[] myIntegers) {
        for (int i=0; i<myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
    }

    public static int[] sortIntegers (int[] myIntegers) {
        Arrays.sort(myIntegers);
        for(int i = 0; i < myIntegers.length / 2; i++)
        {
            int temp = myIntegers[i];
            myIntegers[i] = myIntegers[myIntegers.length - i - 1];
            myIntegers[myIntegers.length - i - 1] = temp;
        }
        return myIntegers;
    }
}
