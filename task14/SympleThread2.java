package task14;

class InnerSympleThread2 extends Thread{
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("Thread: " + i);
        }
    }    
}
public class SympleThread2 {
    public static void main(String[] args) {
        InnerSympleThread2 thr = new InnerSympleThread2();
        thr.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("Main class: " + i);

        }
    }
}
