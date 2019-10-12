package gau;

import java.util.Random;
import java.util.Scanner;

public class Class_a {
    protected int x, y;

    public void setVariables(){
        Scanner input = new Scanner(System.in);
        System.out.print("x: ");
        this.x = input.nextInt();

        System.out.print("y: ");
        this.y = input.nextInt();
    }

    public void random(){
        Random rand = new Random();

        this.x = rand.nextInt(12);
        this.y = rand.nextInt(12);
    }

    public float calculate(){
        return (float)(this.y - (3 * this.x)) / 3;
    }
}
