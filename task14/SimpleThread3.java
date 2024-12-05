package task14;

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("MyThreadのrunメソッド(" + i + ")");
        }
    }
}

public class SimpleThread3 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        for (int i = 0; i < 100; i++) {
            System.out.println("SimpleThreadTestのmainメソッド(" + i + ")");
        }
    }
}
