package com.gaba;

public class Fibonacci {
    public static void main(String[] args) {
        fib(5);

        System.out.println();

        int n=5;
        for (int i =0; i<n; i++){
            System.out.print(recursiveFib(i) + " ");
        }

    }

    private static void fib(int n) {
        // 0 1 1 2 3 5 8 13

        int n0 = 0;
        int n1 = 1;
        int counter = 0;

        while (counter < n) {
            System.out.print(n0 + " ");
            int next = n1 + n0;
            n0 = n1;
            n1 = next;
            counter++;

        }

    }

    public static int recursiveFib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return recursiveFib(n - 1) + recursiveFib(n - 2);
        }

    }
}
