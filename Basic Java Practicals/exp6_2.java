import java.io.*;
import java.util.*;

class exp6_2 {
    public static void main(String args[]) {
        int n;
        int i = 1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number till you wanna print");
        n = s.nextInt();
        do {
            System.out.print(i+ "\t");
            i++;
        } while (i<=n);
        System.out.println("\nLoop ends!!");
    }    
}
