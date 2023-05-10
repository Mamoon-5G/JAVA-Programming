import java.io.*;
import java.util.*;
class employee {
    int age = 17;
    float basic_s = 50000;
    String name = "Saad";
    void display(){
        System.out.println("Employee name = "+name);
        System.out.println("Employee age = "+age);
        System.out.println("Basic salary = "+basic_s);
    }
}
class salary extends employee
{
    float hra,da,ta;
    void t_salary(float h,float d,float t){
       
        float total;
        hra = (h/100) * basic_s;
        da = (d/100) * basic_s;
        ta = (t/100) * basic_s;
        total = basic_s + ta + da + hra;
        System.out.println("Total salary = "+total);
    };
}
class exp18_1{
    public static void main(String args[]) {
        salary s = new salary();
        s.display();
        s.t_salary(10,20,30);
    }
}