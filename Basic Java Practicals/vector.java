import java.util.*;
import java.io.*;
public class vector
{ 
public static void main(String args[])
{
Vector list=new Vector();
for(int i=0;i<args.length;i++)
{
list.addElement(args[i]);
}
System.out.println(list);
System.out.println("vector length="+list.size());
}
}
