import java.io.*;
import java.util.*;

class exp6_ex1 {
    public static void main(String args[]) {
        int sum, r, i, n, n1;
        sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number");
        n = s.nextInt();
        n1 = n;
        while (n!=0) {
            r = n%10;
            sum = sum + (r*r*r);
            n = n/10;
        }
        if (n1==sum) {
            System.out.println(n1+ " is an armstrong");
        }
        else
            System.out.println("Its not an armstrong");
    }    
}