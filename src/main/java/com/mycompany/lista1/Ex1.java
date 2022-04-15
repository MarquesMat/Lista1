package com.mycompany.lista1;

import java.util.Scanner;

public class Ex1 {
	public static void main (String[] args) {
		Scanner teclado = new Scanner (System.in);
		int n, i, num, negat = 0;
                do {
                    System.out.print("Digite a quantidade de valores que deseja inserir: ");
                    n = teclado.nextInt();
                    if (n < 0) System.out.printf("%d nao eh um numero valido. Favor informar um valor positivo.\n", n);
                } while (n < 0); //Verificar se o valor é válido e continuar perguntando até receber um válido
                
		for (i=0; i<n; i++) {
			System.out.print("Digite um numero inteiro: ");
			num = teclado.nextInt();
			if (num < 0) negat++;
		}
		System.out.print("Foram informados "+ negat +" numeros negativos.");
	}
}	