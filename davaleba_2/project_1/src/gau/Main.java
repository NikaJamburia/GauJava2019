package gau;

public class Main {

    public static void main(String[] args) {
	    Class_c obj = new Class_c();

	    obj.setNumbers();
	    System.out.println();
        System.out.println("A-s bolo cifri: " + obj.a_last());
        System.out.println("B-s pirveli cifri: " + obj.b_first());
        System.out.println("C-s cifrta jami: " + obj.c_sum());
        System.out.println("1 da 2 metodebis namravli: " + obj.first_mult_second());
        System.out.println("3 da 5 metodebis jami: " + obj.third_plus_fifth());
    }
}
