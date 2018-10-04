package com.chrisyoo;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + caculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + caculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + caculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + caculateInterest(10000.0, 5.0));

        for (int i=0; i<5; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        for (int i=2; i<9; i++) {
            System.out.println("10,000 at "+ i + "% interest = " + String.format("%.2f", caculateInterest(10000.0, i)));
        }

        System.out.println("**************");

        for (int i=8; i>1; i--) {
            System.out.println("10,000 at "+ i + "% interest = " + String.format("%.2f", caculateInterest(10000.0, i)));
        }

        System.out.println("**************");

        int count = 0;
        for (int i=1; i < 10; i++) {
            if (count == 3) {
                break;
            }
            if(isPrime(i)) {
                System.out.println(i);
                count++;
            }
        }


    }

    public static boolean isPrime(int n) {

        if (n==1) {
            return false;
        }

        for (int i=2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;

    }

    public static double caculateInterest (double amount, double interstRate) {
        return (amount*(interstRate/100));
    }
}
