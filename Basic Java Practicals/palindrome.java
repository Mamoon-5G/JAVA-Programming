import java.io.*;
class palindrome {
public static void main(String args[])
{
String name="";
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
try
{
System.out.println("20461 SIDDIQUI MAMOON");
System.out.println("please any string: ");
name=in.readLine();
}
catch(Exception e){}
int n=name.length();
char ch1,ch2;
int p=1,i,j;
for(i=0,j=n-1;i<n;i++,j--)
{
ch1=name.charAt(i);
ch1=Character.toUpperCase(ch1);
ch2=name.charAt(j);
ch2=Character.toUpperCase(ch2);
if(ch1!=ch2)
{
p=0;
break;
}
}
if(p==1)
System.out.println("The entered string "+name+" is a palindrome string");
else
System.out.println("The entered string "+name+" is not a palindrome string");
}
}