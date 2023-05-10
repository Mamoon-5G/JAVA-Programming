import java.io.*;
public class replace
{
public static void main(String[] args)
{
String str = "His name is Saad and Saad is a good boy.";
String strreplace = "Saad";
String result = str.replaceFirst("Mamoon", strreplace);
System.out.println(result);
}
}
