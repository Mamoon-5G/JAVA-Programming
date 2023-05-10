import java.io.*;
import java.util.*;

class even_odd {
    public static void main(String args[]) {
        int i, n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        n = s.nextInt();
        System.out.println("Even numbers are");
        for (i=1;i<=n;i++){
            if (i%2==0) {
                System.out.print(i+ "\t");
            }
        }
        System.out.println("\nOdd numbers are");
        for (i=1;i<=n;i++){
            if (i%2!=0) {
                System.out.print(i+ "\t");
            }
        }
    }
}    

