class animal{
void move()
{
System.out.println("This is move method of Animal class");
}
}
class dog extends animal{
void move(){
super.move();
System.out.println("This is move method of dog class");
}
}
class exp17_3{
public static void main(String args[]){
dog obj=new dog();
System.out.println("Calling move() using super");
obj.move();
}
}