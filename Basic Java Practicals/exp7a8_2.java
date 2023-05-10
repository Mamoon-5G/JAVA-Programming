import java.io.*;
import java.util.*; 

class exp7a8_2 {
    public static void main(String args[]) {
        int p, n, r;
        float si;
        Scanner s = new Scanner(System.in);
        System.out.println("ENter p, n, r");
        p = s.nextInt();
        n = s.nextInt();
        r = s.nextInt();
        si = (p*n*r)/100;
        System.out.println("The Simple Interest is: "+si);

    }    
}