import java.io.*;
class login
{
public static void main(String args[])
{
String name="";
String password="";
String s;
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
try
{
System.out.println("20461 SIDDIQUI MAMOON");
System.out.println("ENTER USERNAME: ");
name=in.readLine();
System.out.println("ENTER PASSWORD: ");
password=in.readLine();
}
catch(Exception e){}
if(password.equals("786"))
System.out.println("Good");
else
System.out.println("Incorrect password ");
StringBuffer sb=new StringBuffer();
s=sb.append(password).append(" welcome to java!!!").toString();
System.out.println(s);
StringBuffer ss=new StringBuffer(password);
ss.reverse();
System.out.println("reverse of string"+ss);
String sr=password.replace('!','*');
System.out.println("replace ! with *"+sr);
}
}
