import java.io.*;
import java.util.*;

class exp10_e2 {
    int a, b;
    double c, d;
    exp10_e2 (int n1, int n2, double n3, double n4){
        a = n1; b = n2; c = n3; d = n4;
        System.out.println("Addition of two integers: "+(a+b));
        System.out.println("Addition of two decimal values: "+(c+d));
    }
    public static void main(String args[]) {
        exp10_e2 obj = new exp10_e2(10, 20 , 10.1, 10.2);
    }
}
