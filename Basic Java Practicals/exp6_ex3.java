import java.io.*;
import java.util.*;

class exp6_ex3 {
    public static void main(String args[]) {
        int i, n, sum;    
        sum =0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any natural number");
        n = s.nextInt();
        for (i = 1; i<=n; i++){
            sum = i + sum;
        }
        System.out.println(sum);
        
    }
}
