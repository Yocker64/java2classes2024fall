package task15;

public class ThreadLesson {
    public static void main(String[] args) {
        Thread3 t3 = new Thread3();
        t3.start();

        for (int i = 5; i <= 1000; i += 5) {
            System.out.println("main:" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Thread3 extends Thread {
    public void run() {
        for (int i = 3; i <= 999; i += 3) {
            System.out.println("Sub:" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}