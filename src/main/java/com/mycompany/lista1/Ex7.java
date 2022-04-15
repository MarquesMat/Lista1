package com.mycompany.lista1;

import java.util.Scanner;

public class Ex7 {
    public static void imprimir(int p, int r, int b, int o, int total) {
        double p1, r1, b1, o1;
        p1 = (p*100.0/total);
        r1 = (r*100.0/total);
        b1 = (b*100.0/total);
        o1 = (o*100.0/total);
        System.out.print("\nRESULTADO DA PESQUISA:\n");
        System.out.printf("PESSIMAS: %.2f%%\n", p1);
        System.out.printf("RUINS: %.2f%%\n", r1);
        System.out.printf("BOAS: %.2f%%\n", b1);
        System.out.printf("OTIMAS: %.2f%%\n", o1);
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int p = 0, r = 0, b = 0, o = 0, n, total = 0;
        System.out.print("Digite sua nota para a comida: ");
        n = teclado.nextInt();
        while (n>=0 && n<=100) {           
            total++;
            if (n <= 25) p++;
            else if (n <= 50) r++;
            else if (n <= 75) b++;
            else o++;
            System.out.print("Digite sua nota para a comida: ");
            n = teclado.nextInt();
        }
        imprimir(p, r, b, o, total);
    }
}
