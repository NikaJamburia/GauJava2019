package gau;

import java.util.Scanner;

public class Class_c {
    private int a, b, c;

    public void setNumbers(){
        Scanner input = new Scanner(System.in);
        System.out.print("A: ");
        this.a = input.nextInt();

        System.out.print("B: ");
        this.b = input.nextInt();

        System.out.print("C: ");
        this.c = input.nextInt();
    }

    public int a_last(){
        if(this.a > 0){
            String str = Integer.toString(this.a);
            int len = str.length();

            char s = str.charAt(len-1);
            return Integer.parseInt(String.valueOf(s));
        }
        else{
            System.out.print("Use setter method first!");
            return 0;
        }
    }

    public int b_first(){
        if(this.b > 0){
            String str = Integer.toString(this.b);

            char s = str.charAt(0);
            return Integer.parseInt(String.valueOf(s));
        }
        else{
            System.out.print("Use setter method first!");
            return 0;
        }
    }

    public int c_sum(){
        if(this.c > 0){
            String str = Integer.toString(this.c);

            int len = str.length();
            int sum = 0;

            for(int i = 0; i < len; i++){
                char s = str.charAt(i);
                sum += Integer.parseInt(String.valueOf(s));
            }

            return sum;
        }
        else{
            System.out.print("Use setter method first!");
            return 0;
        }
    }

    public int first_mult_second(){
        return this.a_last() * this.b_first();
    }

    public int third_plus_fifth(){
        return this.b_first() + this.first_mult_second();
    }
}
