package com.mycompany.lista1;

import java.util.Scanner;

public class Ex5 {
    public static int fatorial(int n) {
        int i, fat = 1;
        if (n < 0) {
            System.out.printf("NAO FOI POSSIVEL CALCULAR O FATORIAL DE %d\n", n);
            return (-1);
        } else {
            for (i=1; i<=n; i++) {
                fat *= i;
            }
            System.out.print("N! = ");
        }
        return fat;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, fat;
        System.out.print("Digite um valor para N: ");
        n = teclado.nextInt();
        fat = fatorial(n);
        System.out.print(fat);
    }
}
