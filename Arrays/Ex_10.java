package arrays;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] vectA = {1,2,3,4,5,6,7,8,9,10};
        int [] vectB = new int[vectA.length];

        for (int i = 0; i < vectA.length; i++) {
            vectB[i] = vectA[i] % 2;
        }

        for(int b : vectB){
            System.out.println(b);
        }

    sc.close();
    }
}
