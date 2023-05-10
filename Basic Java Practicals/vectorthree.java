import java.io.*;
import java.util.*;
public class vectorthree {
public static void main(String args[])
{
Vector list=new Vector();
for(int i=0;i<args.length;i++)
list.addElement(args[i]);
System.out.println(list);
System.out.println("vector length= " + list.size());
int l=list.size();
String name[]=new String[l];
list.copyInto(name);
System.out.println("The name string array");
for(int i=0;i<l;i++)
System.out.println(name[i]);
}
}
