import java.io.*;
import java.util.*;

class exp5_3 {
    public static void main(String args[]) {
        int i, j, r, ch, n;
        n = 1;
        Scanner s = new Scanner(System.in);
        System.out.println("1. (123) pattern");
        System.out.println("2. (122) pattern");
        System.out.println("Enter your choice");
        ch = s.nextInt();
        System.out.println("Enter number of rows");
        r = s.nextInt();
        switch (ch) {
            case 1:
                for (i = 1; i <= r; i++) {
                    for (j = 1; j <= i; j++) {
                        System.out.print(n);
                        n++;
                    }
                    System.out.print("\n");
                }

                break;
            case 2:
                for (i = 1; i <= r; i++) {
                    for (j = 1; j <= i; j++) {
                        System.out.print(i);
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
