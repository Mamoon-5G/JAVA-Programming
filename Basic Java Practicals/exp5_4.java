import java.io.*;
import java.util.*;

class exp5_4 {
    public static void main(String args[]) {
        int i, j, r, ch, sp;
        char a = 65;
        Scanner s = new Scanner(System.in);
        System.out.println("1. (ABCD) pattern");
        System.out.println("2. Full pyramid");
        System.out.println("Enter your choice");
        ch = s.nextInt();
        System.out.println("Enter number of rows");
        r = s.nextInt();
        switch (ch) {
            case 1:
                for (i = 1; i <= r; i++) {
                    for (j = 1; j <= i; j++) {
                        System.out.println("a");
                        a++;
                    }
                    System.out.print("\n");
                }

                break;
            case 2:
                for (i = 1; i <= r; i++) {
                    for (sp = r; sp > i ; sp--) {
                        System.out.print(" ");
                    }
                    for (j=1; j<=(2*i-1); j++){
                        System.out.print("*");    
                    }
                    System.out.print("\n");
                }

                break;

            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}