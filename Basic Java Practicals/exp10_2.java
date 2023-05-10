import java.io.*;
import java.util.*;

class exp10_2 {
    int r, i;
    exp10_2(){}
    exp10_2(int real , int img){
        r = real;
        i = img;
    }
    exp10_2 addition(exp10_2 obj1, exp10_2 obj2){
        exp10_2 obj3 = new exp10_2();
        obj3.r = obj1.r + obj2.r;
        obj3.i = obj1.i + obj2.i;
        return obj3;
    }
    public static void main(String args[]) {
        exp10_2 obj1 = new exp10_2(10, 2);
        exp10_2 obj2 = new exp10_2(3, 4);
        exp10_2 obj3 = new exp10_2();
        obj3 = obj3.addition(obj1, obj2);
        System.out.println("("+obj1.r+" + "+obj1.i+"i)"+"("+obj2.r+" + "+obj2.i+"i) = "+obj3.r+" + "+obj3.i+"i");
    }
}
