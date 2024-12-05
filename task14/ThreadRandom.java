package task14;

class InnerThreadRandom implements Runnable {
 

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("My thread output: "+i);
        }   
    }
    
}
public class ThreadRandom {


    public static void main(String[] args) {
        InnerThreadRandom  thr = new InnerThreadRandom();
        Thread thread = new Thread(thr);
        thread.start();
        for (int i = 0; i < 50; i++) {
            System.out.println("Main class output: " + i);
        }
    }
}