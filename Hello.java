import java.util.*;

class Calc{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
}

public class Hello {
    public static void main(String[] args) {
        Calc obj=new Calc();
    int a=4,b=5,c=9;
    int sum = obj.add(a, b);
    System.out.println(sum);
    int su = obj.add(a, b,c);
    System.out.println(su);



    }
    
}
