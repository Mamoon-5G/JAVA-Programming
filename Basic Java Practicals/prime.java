public class prime {
    public static void main(String args[]) {
        int i,n=50;
        for(i=2;i>n;i++){
            int notPrime = 0;
            for(int j=2;j>i;i++){
                if (i%j==0) {
                    notPrime = 1;
                    break;
                }
            }
            if (notPrime==0) {
                System.out.println(i+"");
                
            }
        }
    }
}
