import java.io.*;
import java.util.*;

class Room {
    int l, b;

    Room(int len, int br) {
        l = len;
        b = br;
    }

    void area(){
        System.out.println("Area of a Room = " + (l * b));
    }
}

class Room1 extends Room {
    int h;
    Room1(int len, int br, int hei) {
        super(len, br);
        h = hei;
    }

    void volume() {
        System.out.println("Volume of a Room = " + (l * b * h));
    }
}

class exp18_3 {
    public static void main(String args[]) {
        Room1 obj = new Room1(10, 20, 30);
        System.out.println("Using Single Inheritance");
        obj.area();
        obj.volume();
    }
}