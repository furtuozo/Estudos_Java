package arrays;

import java.util.Scanner;

public class Ex_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] idades = new int[10];

        for (int i = 0; i < idades.length; i++) {
            System.out.println("Entre com a idade da pessoa " + (i + 1) + ": ");
            idades[i] = sc.nextInt();
        }

        int menor = idades[0];
        int indexmenor = 0;
        int maior = idades[0];
        int indexmaior = 0;

        for (int i = 1; i < idades.length; i++) {
            if (idades[i] > maior) {
                maior = idades[i];
                indexmaior = i;
            } else if (idades[i] < menor) {
                menor = idades[i];
                indexmenor = i;
            }
        }

        System.out.println("Vetor de Idades = ");
        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i] + "");
        }
        System.out.println();

        System.out.println("Menor idade: " + menor);
        System.out.println("Index menor idade: " + indexmenor);

        System.out.println("Maior idade: " + maior);
        System.out.println("Index maior idade: " + indexmaior);
        
        sc.close();
    }
}





