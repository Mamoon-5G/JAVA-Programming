import java.io.*;
import java.util.*;
public class wordcount
{ 
public static void main(String args[])
{ 
DataInputStream in=new DataInputStream(System.in);
String searchfor, base;
try { 
System.out.print("\nEnetr the string\t\t\t:\t"); 
base=in.readLine();
System.out.print("\nEnter the word you want to search\t:\t"); 
searchfor=in.readLine();
int len=searchfor.length(); 
int result=0;
if(len>0)
{ int start=base.indexOf(searchfor); 
while(start!=-1) 
{ 
result++; 
start=base.indexOf(searchfor,start+len);
}
}
System.out.println("\n The Occurance of word "+searchfor+" in string is\t:\t"+ result);
} 
catch(Exception e){}
}
}
