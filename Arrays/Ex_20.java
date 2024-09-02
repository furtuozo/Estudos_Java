package arrays;

import java.util.Scanner;

public class Ex_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] vetorA = new double[20];
        double cotacao;

        System.out.print("Entre com a cotação do Dolar: ");
        cotacao = sc.nextDouble();

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = cotacao * (i + 1);
        }

        System.out.println("Vetor A: ");

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i] + "") ;
        }
        System.out.println();
        sc.close();
    }
}





