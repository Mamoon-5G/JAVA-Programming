import java.io.*;
import java.util.*;

public class exp11a12_2 {
    public static void main(String args[]) {
        StringBuffer str1 = new StringBuffer("Hello");
        StringBuffer str2 = new StringBuffer("World");
        System.out.println("After appending str1 & str2 = " + str1.append(str2));
        System.out.println("After insering Mhssp in str1 = " + str1.insert(5, "Mhssp"));
        System.out.println("After set character at in str2 ");
        str2.setCharAt(3, 'O');
        System.out.println(str2);
        System.out.println("After reverse of str1 = " + str1.reverse());
    }
}
