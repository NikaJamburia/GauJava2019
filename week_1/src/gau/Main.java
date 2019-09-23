package gau;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       // hello();

        int[] m = new int[4];
        int[] m1 = {1, 3, 4};

        for (int i = 0; i < m1.length; i++){
            System.out.println(m1[i]);
        }

        Random random = new Random();
        System.out.println(random.nextInt(100));

        String s;
        Scanner in = new Scanner(System.in);

        s = in.nextLine();

        System.out.println(s);
    }

    public static void hello(){
        System.out.println(" Hello world " );
    }
}
