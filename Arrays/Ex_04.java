package arrays;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] vectA = {25, 36, 49, 64, 81, 100, 121, 144, 169, 196, 225, 256, 289, 324, 361};
        double [] vectB = new double[vectA.length];

        for(double a : vectA){
            System.out.println(a);
        }
        System.out.println("-------------");

        for (double i = 0; i < vectA.length; i++) {
            vectB[(int) i] = sqrt(vectA[(int)i]);
        }


        for (double b : vectB){
            System.out.println(b);
        }
    sc.close();
    }
}
