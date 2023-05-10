import java.io.*;
import java.util.*;
public class vectorone {
public static void main(String args[])
{
Vector circleVector=new Vector();
System.out.println("vector length " + circleVector.size());
for(int i=0;i<5;i++)
{
circleVector.addElement(""+i);
}
System.out.println(circleVector);
System.out.println("vector length= " + circleVector.size());
}
}
