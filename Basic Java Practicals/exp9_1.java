import java.io.*;
import java.util.*; 

class exp9_1 {
    public static void main(String args[]) {
        double p, n, r;
        float si;
        Scanner s = new Scanner(System.in);
        System.out.println("ENter p, n, r");
        p = s.nextDouble();
        n = s.nextDouble();
        r = s.nextDouble();
        si = ((float)p * (float)n* (float)r)/100;
        System.out.println("The Simple Interest using explicit conversion is: "+si);

    }    
}