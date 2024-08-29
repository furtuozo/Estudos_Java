package arrays;

import java.util.Scanner;

public class Ex_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetA = new int[10];

        int impares = 0;

        for (int i = 0; i < vetA.length; i++) {
            System.out.println("Enter number " + i + ": ");
            vetA[i] = sc.nextInt();
        }
        for (int i = 0; i < vetA.length; i++) {
            if (vetA[i] % 2 != 0) {
                impares++;
            }
        }

        int pares = vetA.length - impares;

        double porPar = (pares * 100)/vetA.length;
        double porImpar = (impares * 100)/vetA.length;

        System.out.println("Porcentagem Pares: " + porPar);
        System.out.println("Porcentagem Impares: " + porImpar);

        sc.close();
    }
}





