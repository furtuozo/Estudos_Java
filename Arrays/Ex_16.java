package arrays;

import java.util.Scanner;

public class Ex_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetA = new int[10];

        for (int i = 0; i < vetA.length; i++) {
            System.out.println("Enter number " + i + ": ");
            vetA[i] = sc.nextInt();
        }

        int somaMenor15 = 0;
        int igual15 = 0;
        int somaMaior15 = 0;
        int qtdMaior15 = 0;

        for (int i = 0; i < vetA.length; i++) {
            if (vetA[i] == 15) {
                igual15++;

            } else if (vetA[i] < 15) {
                somaMenor15 += vetA[i];
            } else {
                qtdMaior15++;
                somaMaior15 += vetA[i];
            }
        }

        System.out.println("Vetor A = ");
        for (int i = 0; i < vetA.length; i++) {
            System.out.println(vetA[i] + "");
        }
        System.out.println();

        System.out.println("Quantidade numeros == 15: " + igual15);
        System.out.println("Soma dos  numeros < 15: " + somaMenor15);
        System.out.println("Media dos  numeros > 15: " + somaMaior15 / qtdMaior15);

        sc.close();
    }
}





