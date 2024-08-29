package arrays;

import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] vetA = new int[10];
        int soma = 0;
        int impar= 0;
        for (int i = 0; i < vetA.length; i++) {
            System.out.println("Digite os valores : " + i);
                vetA[i] = sc.nextInt();
        }

        for (int i = 0; i < vetA.length; i++) {
            if (vetA[i] % 2 != 0) {
                soma += vetA[i];
                impar ++;
            }
        }

        for (int i = 0; i < vetA.length; i++) {
            System.out.print(vetA[i] + " ");
        }
        System.out.println("");
        System.out.println("=======");

        System.out.print("Valor dos elementos Impares no vetor A: " + soma);
        System.out.println(" ");
        System.out.println("-----");
        System.out.print("Valor da Media dos elementos Impares no vetor A: " + soma/impar);
        sc.close();
    }


}





