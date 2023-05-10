import java.io.*;
import java.util.*;
class GrandParent{
GrandParent(){
System.out.println("From inside the consutructor of grandparent class");
}
}
class Parent extends GrandParent{
Parent(){
System.out.println("From inside the consutructor of Parent class");
}
}
class Child extends Parent{
Child(){
super();
System.out.println("From inside the consutructor of Child class");
}
}
public class exp18{
public static void main(String[] args){
Child obj= new Child();
}
}
