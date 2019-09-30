package gau;

public class TestStudent {
    String name;
    public String lastName;
    private int age;
    protected int course;

    public void printData(){
        System.out.println(this.name+" "+this.lastName+" "+age+" "+course);
    }

    public void setAge(int _age){
        age = _age;
    }
}
