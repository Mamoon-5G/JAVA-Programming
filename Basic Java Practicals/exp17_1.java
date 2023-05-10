import java.io.*;
import java.util.*;
class A{
    void display(){
        System.out.println("This is display method of super class");

    }
}
class B extends A
{
    void display(){
        super.display();
        System.out.println("This is display method of sub class");
    }
}
class exp17_1 {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println("Using super & subclass with super keyword");
        obj.display(); 
    }
    
}
