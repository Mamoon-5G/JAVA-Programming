import java.io.*;
import java.util.*;
class si {
    public static void main(String[] args) {
        int p, n;
        float r, si;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Principal, Number of years, rate of interest");
        p = s.nextInt();
        n = s.nextInt();
        r = s.nextFloat();
        si = (p*n*r)/100;
        System.out.println("The simple interest is: "+si);
    }
}
