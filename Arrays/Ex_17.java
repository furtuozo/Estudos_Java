package arrays;

import java.util.Scanner;

public class Ex_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetA = new int[10];

        for (int i = 0; i < vetA.length; i++) {
            System.out.println("Entre com a idade da pessoa " + (i + 1) + ": ");
            vetA[i] = sc.nextInt();
        }

        int maior35 = 0;

        for (int i = 0; i < vetA.length; i++) {
            if (vetA[i] > 35) {
                maior35++;
            }
        }

        System.out.println("Vetor de Idades = ");
        for (int i = 0; i < vetA.length; i++) {
            System.out.println(vetA[i] + "");
        }
        System.out.println();

        System.out.println("Quantidade de Pessoas com idade > 35: " + maior35 + " pessoas");

        sc.close();
    }
}





