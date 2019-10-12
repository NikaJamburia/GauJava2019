package gau;

public class Ragaca {
    private double a,b,z;

    Ragaca(int a, int b, int z){
        this.a = a;
        this.b = b;
        this.z = z;
    }

    public double method_1(){
        return (this.a + Math.pow(this.b, 3) - 7) / (this.z + 8);
    }

    public double method_2(){
        return (this.a + this.z - Math.pow(this.b, 3)) / (this.a * this.b * this.z);
    }

    public double method_3(){
        return (this.a * this.z - this.b) / (this.z * this.b);
    }
}
