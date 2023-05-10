import java.io.*;
import java.util.*;

class exp101 {
    int l, b;
    exp101(){
        l = 10;
        b = 30;
    }
    exp101(int len, int br){
        l = len;
        b = br;
    }
    exp101(exp101 rect){
        l = rect.l;
        b = rect.b;
    }
    void area(){
        System.out.println("Area of rectangle = "+(l*b));
    }
}
    class exp10_1{
       public static void main(String args[]) {
           exp101 obj1 = new exp101();
           System.out.println("Using default constructor");
           obj1.area();
           exp101 obj2 = new exp101(30,70);
           System.out.println("Using parameterized constructor");
           obj2.area();
           exp101 rect = new exp101(obj2);
           System.out.println("Copy of parameterized");
           rect.area();
       } 
    }
