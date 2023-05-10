import java.util.*;
public class vect
{
public static void main(String arg[]) {
Vector list = new Vector();
for (int i=0; i <4; i++) {
list.addElement(new Integer(i+1)); }
list.addElement(new String("C")); list.addElement(new String("C++"));
list.addElement(new String("Java"));
list.addElement("A");
list.addElement("B");
list.addElement(new Float(23.78));
list.addElement(new Float(88.90));
System.out.println(list);
System.out.println("Vector Length = " + list.size());
list.addElement(new String("VB")); //to add object at the end of vector
System.out.println("add object at the end of vector :"+list);
list.removeElementAt(1); //to remove 2nd object form the vector
System.out.println("remove 2nd object form the vector : "+list);
if(list.contains(new Float(88.90))) System.out.println("Searching :"+"Object Found"); 
else
System.out.println("Searching :"+"Object not Found");
System.out.println("Display irst elements :"+list.elementAt(0));
System.out.println("Display last elements:"+list.elementAt(list.size()-1));
System.out.println(list);
}
}
