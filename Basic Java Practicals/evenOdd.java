import java.io.*;
import java.util.*;
class evenOdd {
    int num;
    evenOdd(int n){
        num = n;
    }
    evenOdd(){
        System.out.println("ENter a number");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
    }
    void display(){
        if (num%2==0) {
            System.out.println(num+ " is even");
        } else {
            System.out.println(num+ " is odd");
        }
    }
    public static void main(String args[]) {
        evenOdd eO = new evenOdd();
        eO.display();
    }
}
