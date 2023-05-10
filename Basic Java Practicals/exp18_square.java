import java.io.*;
import java.util.*;
class square{
    int side=10;
    void display(){
        System.out.println("The side is "+side);
    };
}
class area extends square{
    void cal_area(){
        int area;
        area = side*side;
        System.out.println("The area is = "+area);
    };
}
class volume extends area{
    void cal_volume(){
        float volume;
        volume = side*side*side;
        System.out.println("Volume is "+volume);
    };
}
class exp18_square {
    public static void main(String args[]) {
        volume v = new volume();
        v.display();
        v.cal_area();
        v.cal_volume();
    }
}
