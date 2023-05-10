import java.io.*;
import java.util.*;
class exp10_e1 {
    double pi,r;
    exp10_e1(double p,double radius){
        pi=p;
        r=radius;
    }    
    void area(){
        double res = pi*r*r;
        System.out.println("Area of a circle : "+res);
    }
    public static void main(String args[]) {
        exp10_e1 c = new exp10_e1(3.14,10);
        c.area();
    }
}
