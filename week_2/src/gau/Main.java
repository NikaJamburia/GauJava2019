package gau;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TestStudent student1 = new TestStudent();
	    student1.name = "nika";
	    student1.lastName = "jamburia";

        TestStudent student2 = new TestStudent();
        student2.name = "Saba";
        student2.lastName = "Kevlishvili";
        student2.course = 3;

        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        student2.setAge(age);
        student2.printData();

        testMagistr m1 = new testMagistr();
    }
}
