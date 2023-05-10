import java.io.*;
import java.util.*;
class A{
    void display(){
        System.out.println("This is display method of grand parent class");
    }
}
class B extends A{
    void display(){
        super.display();
        System.out.println("This is display method of parent class");
    }
}
class C extends B{
    void display1(){
        System.out.println("This is display method of child class");
    }
}
class exp18_4 {
    public static void main(String[] args) {
        C obj = new C();
        obj.display();  
        obj.display1();  
    }
}
