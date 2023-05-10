import java.io.*;
import java.util.*;
interface area{
    
    void calarea();
}
class rectangle implements area{
    int l,b;
    rectangle(int a,int d){
    l=a;
    b=d;
}
public void calarea(){
    System.out.println("Area (Rect) = "+(l*b));
}
}
class exp19_2 implements area{
    int r;
    exp19_2(int c){
        r=c;
    }
    public void calarea(){
    System.out.println("Area (Circle) = "+(3.14*r*r));
}

public static void main(String[] args) {
 rectangle obj1=new rectangle(10, 20);
 exp19_2 obj2=new exp19_2(20);
 obj1.calarea();
 obj2.calarea();  
}
}

