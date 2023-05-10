import java.io.*;
import java.util.*;

class exp6_ex5 {
    public static void main(String args[]) {
        int n, i, j;
        Scanner a = new Scanner(System.in);
        System.out.println("Enter number to print tables from 1 to n");
        n = a.nextInt();
        System.out.println("Tables from from 1 to "+n+ ".....");
        for (i = 1; i<=n; i++){
            for (j = 1; j<=10; j++){
                System.out.print(j*i);
                System.out.print("\t");
            }
            System.out.println("\n");
        }
    }    
}
