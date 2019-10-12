package gau;

public class Main {

    public static void main(String[] args) {
	    Class_a parent = new Class_a();
	    Class_b child = new Class_b();

	    parent.setVariables();
		parent.random();
	    System.out.println(parent.calculate());

		child.setVariables();
		child.swap();
		child.setX();


    }
}
