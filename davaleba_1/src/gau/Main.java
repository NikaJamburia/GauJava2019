package gau;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //d_1();
        //d_2();
        //d_3();
        //d_4();
        //d_5();
        //d_6();
        //d_7();
        //d_8();
        //d_9();
        //d_10();
        d_11_12();
    }

    public static void d_1(){
        System.out.println("C++");
        System.out.println("C#");
        System.out.println("Java");
        System.out.println("Pascal");
        System.out.println("PHP");
        System.out.println("Javascript");
        System.out.println("ActionScript");
    }

    public static void d_2(){
        Scanner input = new Scanner(System.in);

        System.out.print("x: ");
        int x = input.nextInt();

        System.out.print("y: ");
        int y = input.nextInt();

        System.out.println("x % y = " + x % y);
        System.out.println("y % x = " + y % x);
    }

    public static void d_3(){
        Scanner input = new Scanner(System.in);

        System.out.print("x: ");
        int x = input.nextInt();

        System.out.print("y: ");
        int y = input.nextInt();

        System.out.print("z: ");
        int z = input.nextInt();

        System.out.println("jami: " + (x + y + z));
        System.out.println("namravli: " + x * y * z);
    }

    public static void d_4(){
        Scanner input = new Scanner(System.in);

        System.out.print("sheiyvanet samnishna ricxvi: ");
        int x = input.nextInt();

        int hundred = x / 100;
        int ten = (x % 100) / 10;
        int one = (x % 100) % 10;

        System.out.println(hundred);
        System.out.println(ten);
        System.out.println(one);

    }

    public static void d_5(){
        Scanner input = new Scanner(System.in);

        System.out.print("sheiyvanet otxnishna ricxvi: ");
        int x = input.nextInt();

        int thousand = x / 1000;
        int hundred = (x % 1000) / 100;
        int ten = (x % 100) / 10;
        int one = (x % 100) % 10;

        System.out.println(thousand + hundred + ten + one);
    }

    public static void d_6(){
        Scanner input = new Scanner(System.in);

        System.out.print("sheiyvanet ricxvi: ");
        int x = input.nextInt();

        String str = Integer.toString(x);
        int len = str.length();
        int sum = 0;

        for(int i = 0; i < len; i++){
            char s = str.charAt(i);
            sum += Integer.parseInt(String.valueOf(s));
        }

        System.out.println(sum);
    }

    public static void d_7(){
        Scanner input = new Scanner(System.in);

        System.out.print("x: ");
        int x = input.nextInt();

        System.out.print("y: ");
        int y = input.nextInt();

        while (x != y ){

            if (x > y){
                x = x - y;
            }
            else{
                y = y - x;
            }
        }

        System.out.println(x);
    }

    public static void d_8(){
        Scanner input = new Scanner(System.in);

        System.out.print("m: ");
        int m = input.nextInt();

        System.out.print("n: ");
        int n = input.nextInt();

        for(int i = m; i < (n+1); i++ ){
            System.out.println(i);
        }
    }

    public static void d_9(){
        int arr[] = {12, 76, 23, 77, 45, 84, 8, 56};
        
        int biggest = 0;
        int smallest = arr[0];

        for (int i: arr) {
            if (biggest < i){
                biggest = i;
            }

            if (smallest > i){
                smallest = i;
            }

            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("udidesi: " + biggest);
        System.out.println("imciresi: " + smallest);
        
    }

    public static void d_10(){
        int arr[] = {12, 76, 23, 77, 45, 84, 8, 56};
        boolean flag = true;
        int temp;

        while(flag){
            flag = false;

            for(int i = 0;i < arr.length - 1; i++){
                if(arr[i] > arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    flag = true;
                }
            }
        }

        for (int i: arr) {
            System.out.print(i + " ");
        }

    }

    public static void d_11_12(){
        int[] arr = new int[8];
        Random rand = new Random();

        for(int i = 0; i < 8; i++){
            int r = rand.nextInt(100);
            arr[i] = r;
        }

        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        boolean flag = true;
        int temp;

        while(flag){
            flag = false;

            for(int i = 0;i < arr.length - 1; i++){
                if(arr[i] < arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    flag = true;
                }
            }
        }

        for (int i: arr) {
            System.out.print(i + " ");
        }

    }
}
