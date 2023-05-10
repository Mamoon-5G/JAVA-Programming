import java.io.*;
import java.util.*;

class exp5_2 {
    public static void main(String args[]) {
        int i, j, r, ch;
        Scanner s = new Scanner(System.in);
        System.out.println("1. (*) pattern increasing");
        System.out.println("2. (*) pattern decreasing");
        System.out.println("Enter your choice");
        ch = s.nextInt();
        System.out.println("Enter number of rows");
        r = s.nextInt();
        switch (ch) {
            case 1:
                for (i = 1; i <= r; i++) {
                    for (j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.print("\n");
                }

                break;
            case 2:
                for (i = r; i > 0; i--) {
                    for (j = 1; j <= i; j++) {
                        System.out.print("* ");
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
