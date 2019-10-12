package gau;

public class Ragaca {
    private float x, y;

    Ragaca(){}
    Ragaca(int x){
        this.x = x;
    }
    Ragaca(int x, int y){
        this.x = x;
        this.y = y;
    }

    public float method_1(){
        float gcd  = 1;
        for(int i = 1; i <= x && i <= y; i++)
        {
            if(x%i==0 && y%i==0)
                gcd  = i;
        }
        return gcd;
    }

}
