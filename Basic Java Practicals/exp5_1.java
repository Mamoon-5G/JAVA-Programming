import java.io.*;
import java.util.*;
class exp5_1 {
    public static void main(String args[]){
        int i;
        System.out.println("User Entered arg[0] via command line argument "+args[0]);
        for (i = 1; i<=args.length; i++){
            System.out.println("value of i = "+i);   
            System.out.println("args [ "+i+" ]" +args[i]);
        }
        System.out.println("Total command = "+i);
    }
}