import java.io.*;
import java.util.*;
class exp7a8_e3 {
    public static void main(String args[]) {
        int n,rev,rem,n1;
        rev=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a no : ");
        n=s.nextInt();
        n1=n;
        while (n>0){
            rem = n%10;
            rev = rev*10 + rem;
            n=n/10;
        }
        System.out.println("Reverse of "+n1+" = "+rev);
    }
}
