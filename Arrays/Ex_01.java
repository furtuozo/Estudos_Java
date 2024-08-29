package arrays;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] vetA = new int [6];
        int [] vetB = new int [6];

        for (int i = 1; i < vetA.length; i++) {
            System.out.println("Digite um numero inteiro "+ + i + ": ");
            vetA[i] = sc.nextInt();
        }
        System.out.println("O vetor B possui o msm tamanho de A: ");
        for (int i = 1; i < vetA.length; i++) {
            vetB[i] = vetA[i];
            System.out.println("B = " + vetB[i]);
        }
        sc.close();
    }
}
