import java.io.*;
import java.util.*;

class exp7a8_e2 {
    public static void main(String args[]) {
        int fno, sno, tno, pos;
        fno = 0; sno = 1;
        Scanner s = new Scanner(System.in);
        System.out.println("TO print fibonacci, enter last position: ");
        pos = s.nextInt();
        System.out.println("Fibonacci series : ");
        System.out.println(fno+"\n"+sno);
        for (int i=1; i<=pos; i++){
            tno = fno+sno;
            System.out.println(tno);
            fno = sno;
            sno = tno;
        }
        
    }
}
