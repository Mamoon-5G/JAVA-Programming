class Even extends Thread{
    public void run(){
        try {
            for (int i=2;i<=50;i=i+2){
                System.out.println("\t Even Thread: "+i);
                sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Even thread interrupted");
        }
    }
}
class Odd extends Thread{
    public void run(){
        try {
            for (int i=1;i<=50;i=i+2){
                System.out.println("\t Odd Thread: "+i);
                sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Odd thread interrupted");
        }
    }
}
class thread_demo {
    public static void main(String[] args) {
        new Even().start();
        new Odd().start();
    }    
}
