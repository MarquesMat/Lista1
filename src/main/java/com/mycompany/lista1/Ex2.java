package com.mycompany.lista1;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            int r, s, t, maior;
            System.out.print("\nDigite o valor de R: ");
            r = teclado.nextInt();
            System.out.print("\nDigite o valor de S: ");
            s = teclado.nextInt();
            System.out.print("\nDigite o valor de T: ");
            t = teclado.nextInt();
            maior = r;
            if (maior < s) maior = s;
            if (maior < t) maior = t;
            System.out.print("\nO maior valor eh "+maior);
        }
}