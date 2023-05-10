class square{
int side;
square(int s){
side=s;
}
void display(){
System.out.println("Side of a square = "+side);
}}
class area extends square{
area(int s){
super(s);
}
void cal_area(){
System.out.println("Area of a square = "+(side *side));
}
}
class volume extends area{                                                                                           
volume(int s)
{
super(s);
}
void cal_volume(){
System.out.println("Volume of a square = "+(side*side*side));
}
public static void main(String args[]){
volume obj=new volume(20);
System.out.println("Using multilevel inheritance");
obj.display();
obj.cal_area();
obj.cal_volume();
}
}