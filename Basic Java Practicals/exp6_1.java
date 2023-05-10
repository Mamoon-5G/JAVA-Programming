import java.io.*;
import java.util.*;

class exp6_1 {
    public static void main(String args[]) {
        int a, b;
        a = 10;
        b = 15;
        System.out.println("VAlue of a: "+a+"\nvalue of b: "+b);
        System.out.println("Or condition");
        do {
            a++;
            b++;  
            System.out.println(a+ "\t" +b);
        } while (a<=12 || b<=16);
        System.out.println("And condition");
    }
}
