package com.mycompany.lista1;

public class Ex6 {
    public static void fibonacci(int a, int b) {
        int fib = (a+b);
        if (fib <= 100) {
            System.out.printf(">%d\n", fib);
            fibonacci(b, fib);
        }
    }
    
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.printf(">%d\n", a);
        System.out.printf(">%d\n", b);
        fibonacci(a,b);
    }
}
