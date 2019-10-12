package gau;

import java.util.Random;
import java.util.Scanner;

public class Class_b {
    private int[] arr = new int[12];

    public void setArr(){
        Scanner input = new Scanner((System.in));

        for(int i=0; i<12; i++){
            System.out.print("arr["+i+"]: ");
            this.arr[i] = input.nextInt();
        }
    }

    public void setArr_random(){
        Random rand = new Random();

        for(int i=0; i<12; i++){
            this.arr[i] = rand.nextInt(15);
        }
    }

    public void getArr(){
        for(int i=0; i<12; i++){
            System.out.print(this.arr[i]+ " ");
        }
        System.out.println();
    }

    public void more_then_7(){
        System.out.println("Elements greater then 7: ");
        for(int i=0; i<12; i++){

            if(arr[i] > 7){
                System.out.println("index: "+i+", value: "+this.arr[i]);
            }
        }
    }

    public int diapazoni(){
        int max = this.arr[0];
        int min = this.arr[0];

        for (int i: this.arr) {
            if (max < i){
                max = i;
            }

            if (min > i){
                min = i;
            }
        }

        return max - min;
    }





}
