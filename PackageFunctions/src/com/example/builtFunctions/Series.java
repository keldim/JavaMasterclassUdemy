package com.example.builtFunctions;

public class Series {

    public Series() {
    }

    public static int nSum (int n) {
        int sum = 0;
        for (int i=0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int factorial (int n) {
        if (n == 0) {
            return 1;
        }
        int sum = 1;
        for (int i=1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }

    public static int fibonacci (int n) {
        int n1=0;
        int n2=1;
        int n3=0;
        for (int i=0; i <= n; i++) {
           if (i == 0 || i == 1) {
                continue;
           } else {
               n3 = n1 + n2;
               n1 = n2;
               n2 = n3;
           }
        }
        if (n == 0) {
            return n1;
        } else if (n==1) {
            return n2;
        } else {
            return n3;
        }


    }
}
