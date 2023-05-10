import java.io.*;
import java.util.*;

class Bank{
    void roi(){
    };
}
class ICICI extends Bank{
    void roi(){
        System.out.println("ICICI\t 10%");
    }
}
class HDFC extends ICICI{
    void roi(){
        super.roi();
        System.out.println("HDFC\t 12%");
    }
}
class CBI extends HDFC{
    void roi(){
        super.roi();
        System.out.println("CBI\t 6%");
    }
    public static void main(String args[]) {
        CBI obj = new CBI();
        System.out.println("Banks\t Rate of interest");
        obj.roi();

    }
}