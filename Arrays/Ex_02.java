package arrays;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] vectA = new int[9];
        int [] vectB = new int[9];

        for (int i = 1; i < vectA.length; i++) {
            System.out.println("Digite 8 valores inteiros: ");
            vectA[i] = sc.nextInt();
        }

        System.out.println("-----------------------");

        for (int a : vectA){
            System.out.println(a);
        }

        System.out.println("------------------");

        for (int i = 1; i < vectA.length; i++) {
            vectB[i]= vectA[i] * 2;
        }

        for (int b : vectB){
            System.out.println(b);
        }
    sc.close();
    }
}
