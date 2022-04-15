package com.mycompany.lista1;

import java.util.Scanner;

public class Ex8 {
    public static boolean comparar_linhas(int[][] mat, int n, int ref) {
        int i, j, refl;
        for (i=0; i<n; i++) {
            refl = 0;
            for (j=0; j<n; j++) {
                refl += mat[i][j];
            }
            if (refl != ref) return false;
        }
        return true;
    }
    
    public static boolean comparar_colunas(int[][] mat, int n, int ref) {
        int i, j, refc;
        for (j=0; j<n; j++) {
            refc = 0;
            for (i=0; i<n; i++) {
                refc += mat[i][j];
            }
            if (refc != ref) return false;
        }
        return true;
    }
    
    public static boolean comparar_diagonais(int[][] mat, int n, int ref) {
        int i, j, refd = 0;
        for (i=0; i<n; i++) {
            refd += mat[i][i];
        }
        if (refd != ref) return false;
        i = 0;
        refd = 0;
        for (j=-1; j>=(-n); j--) {
            refd += mat[i][i];
            i++;
        }
        if (refd != ref) return false;
        return true;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, i, j, ref = 0;
        System.out.print("Digite a ordem da matriz quadrada: ");
        n = teclado.nextInt();
        int[][] mat = new int[n][n];
        for (i=0; i<n; i++) {
            for (j=0; j<n; j++) {
                System.out.printf("Digite o valor [%d][%d]: ", i, j);
                mat[i][j] = teclado.nextInt();
            }
        }
        for (j=0; j<n; j++) {
            ref += mat[0][j]; //soma da primeira coluna
        }
        if (!(comparar_linhas(mat, n, ref))) System.out.print("A matriz nao eh um quadrado magico.");
        else if (!(comparar_colunas(mat, n, ref))) System.out.print("A matriz nao eh um quadrado magico.");
        else if (!(comparar_diagonais(mat, n, ref))) System.out.print("A matriz nao eh um quadrado magico.");
        else System.out.print("A matriz eh um quadrado magico.");
    }
}
