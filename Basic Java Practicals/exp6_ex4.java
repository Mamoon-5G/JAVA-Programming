import java.io.*;
import java.util.*;

class exp6_ex4 {
    public static void main(String args[]) {
        int n, i;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number which table you wanna print");
        n = s.nextInt();
        for (i = 1; i<=10; i++){
            System.out.println(n+ "x" +i+ " = " +(n*i));
        }
    }    
}
