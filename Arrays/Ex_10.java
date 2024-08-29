package arrays;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] vectA = {1,2,3,4,5,6,7,8,9,10};
        int [] vectB = {1,2,3,4,5,6,7,8,9,10};
        double [] vectC = new double[vectA.length];

        for(int a : vectA){
            System.out.println(a);
        }
        System.out.println("-------------");
        for(int b : vectB){
            System.out.println(b);
        }
        System.out.println("-------------");

        for (int i = 0; i < vectA.length; i++) {
            vectC[i] = vectA[i] / (vectB[i]);
        }
        for (double c : vectC  ){
            System.out.println(c);
        }
    sc.close();
    }
}
