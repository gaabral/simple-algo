package com.gaba;

public class Factorial {
    public static void main(String[] args) {

        System.out.println(factorial(5));
    }

    public static int factorial(int n) {
        //n*(n-1)*(n-2)*....*1
        int result = 1;
        for (int i = 0; i < n; i++) {
            result = result * (n - i);

        }
        return result;
    }
}


//n=3
//3*2*1
//3-0 * 3-1 * 3-2