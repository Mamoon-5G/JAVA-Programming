import java.io.*;
import java.util.*;
class neven_odd {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number till you want to print");
        n = s.nextInt();
        System.out.println("Even numbers are");
            for (int i=2;i<n;i=i+2){
                System.out.print(i+"\t");
        }
        System.out.println("\nOdd numbers are");
            for (int i=1;i<n;i=i+2){
                System.out.print(i+"\t");
        }
    }
}
