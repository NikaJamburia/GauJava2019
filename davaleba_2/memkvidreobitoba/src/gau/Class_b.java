package gau;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Class_b  extends Class_a{
    private int a, b;

    public void setVariables(){
        Scanner input = new Scanner(System.in);
        System.out.print("a: ");
        this.a = input.nextInt();

        System.out.print("b: ");
        this.b = input.nextInt();
    }

    public void swap(){
        int temp;
        if (this.a > this.b){
            temp = this.a;
            this.a = this.b;
            this.b = temp;
        }
    }

    public void setX(){
        Random rand = new Random();
        this.x = ThreadLocalRandom.current().nextInt(this.a, this.b + 1);

        System.out.println("X = "+this.x);
    }

}
