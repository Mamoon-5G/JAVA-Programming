import java.io.*;
import java.util.*;
class exp9_2 {
    public static void main(String args[]) {
        double a = 10.11;
        float b = (float) a ;
        long c = (long) b;
        int d = (int) c;
        short e = (short) d;
        byte f = (byte) e;
        System.out.println("Double Value = "+a);
        System.out.println("Float Value = "+b);
        System.out.println("Long Value = "+c);
        System.out.println("Int Value = "+d);
        System.out.println("Short Value = "+e);
        System.out.println("Byte Value = "+f);
    }
}
