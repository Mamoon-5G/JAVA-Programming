import java.io.*;
import java.util.*;

class exp11a12 {
    public static void main(String args[]) {
        String str1 = "HELLO";
        String str2 = "hello";
        System.out.println("1st strings = " + str1);
        System.out.println("2nd strings = " + str2);
        System.out.println("Length of str1 = " + str1.length());
        System.out.println("Length of str2 = " + str2.length());
        System.out.println("In string1 - char at 0th position : " + str1.charAt(0));
        System.out.println("In string2 - char at 3rd position : " + str1.charAt(3));
        System.out.println("In string2 - index of l : " + str2.indexOf('l'));
        System.out.println("In string2 - last index of l : " + str2.lastIndexOf('l'));
        System.out.println("After replacing , h with H in string2 = " + str2.replace('h', 'H'));
        System.out.println(str2);
        if (str1.equals(str2)) {
            System.out.println(str1 + "==" + str2);
        } else {
            System.out.println(str1 + "!=" + str2);
        }
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println(str1 + "==" + str2 + " ignore case");
        } else {
            System.out.println(str1 + "!=" + str2);
        }
        if (str1.startsWith("H")) {
            System.out.println(str1 + " starts with H ");
        } else {
            System.out.println(str1 + " doesnt starts with H ");
        }
        if (str2.endsWith("O")) {
            System.out.println(str2 + " ends with O");
        } else {
            System.out.println(str2 + " doesnt ends with O");
        }
        System.out.println("After substituting, str1 " + str1.substring(2));
        System.out.println("After compare to, str1 " + str1.compareTo(str2));
    }
}