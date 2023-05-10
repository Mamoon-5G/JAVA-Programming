import java.io.*;
import java.util.*;
class exp7a8_e1 {
    public static void main(String args[]) {
        int fact,i,n;
        fact=1;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a no : ");
        n= s.nextInt();
        for(i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+n+" is : "+fact);
    }
}