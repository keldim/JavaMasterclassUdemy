package com.chrisyoo;

public class Main {

    public static void main(String[] args) {
//	    int count = 1;
//        while(count != 6){
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        count = 1;
//        while(true) {
//            if (count == 6) {
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        count = 1;
//        do {
//            System.out.println("Count value is " + count);
//            count++;
//        } while (count != 6);

//        int number = 5;
//        int finishNumber = 20;
//        while (number <= finishNumber) {
//            if (!isEvenNumber(number)) {
//                number++;
//                continue;
//            }
//
//            System.out.println("Even number " + number);
//            number++;
//        }

        int number = 5;
        int finishNumber = 20;
        int evenCount = 0;
        while (number <= finishNumber) {
            if (!isEvenNumber(number)) {
                number++;
                continue;
            }
            System.out.println("Even number " + number);
            number++;
            evenCount++;
            if (evenCount == 5) {
                System.out.println("Total even numbers: " + evenCount);
                break;
            }
        }


    }

    public static boolean isEvenNumber (int number) {
        if ((number%2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
