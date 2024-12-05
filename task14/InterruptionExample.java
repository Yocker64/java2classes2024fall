package task14;

public class InterruptionExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            try {
                 Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Error detected: " + e);
            }
            System.out.println("*");
        }
    }
}
