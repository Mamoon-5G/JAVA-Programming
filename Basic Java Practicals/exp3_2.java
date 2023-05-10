import java.util.Scanner;

class exp3_2 {
    public static void main(String args[]) {
        int n;
        System.out.println("Enter number");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        if (n%2==0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }    
}
