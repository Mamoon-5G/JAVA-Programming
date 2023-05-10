import java.io.*;
import java.util.*;

interface A {
void disp1();
void disp2(); 
}
interface B {
void disp3(); 
}
class C implements A,B {
public void disp1(){
    System.out.println("This is disp() method of Interface A");
}
public void disp2(){}
public void disp3(){
    System.out.println("This is disp() method of Interface B");
    }
public static void main(String args[]) {
        C obj = new C();
        obj.disp1();
        obj.disp3();
        System.out.println("Interface - Demo ");
    } 
}

