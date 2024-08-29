package arrays;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int [] vetA = {2,6,8,9,11,10,12,13};
        System.out.print("Vetor A = ");

        int pares = 0;
        for (int i = 0; i < vetA.length; i++) {
            if (vetA[i] % 2 == 0) {
                pares ++;
            }
        }

        for (int i = 0; i < vetA.length; i++) {
            System.out.print(vetA[i] + " ");
        }
        System.out.println("");
        System.out.println("=======");

        System.out.print("Quantidade Pares: " + pares);
        sc.close();
    }

}

