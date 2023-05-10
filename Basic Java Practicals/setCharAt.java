import java.io.*;
class setCharAt {
public static void main(String args[]) {
StringBuffer sb = new StringBuffer("Hello");
System.out.println("buffer before setCharAt= " + sb);
System.out.println("charAt(1) before setCharAt= " + sb.charAt(1)); 
sb.setCharAt(1, 'i');
sb.setLength(2);
System.out.println("buffer after setCharAt= " + sb);
System.out.println("charAt(1) after setCharAt="+sb.charAt(1));
}
}