import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("正の整数を入力してください。");
        int N = scan.nextInt();
        if (N <= 0) {
            System.out.println("正の整数ではありません！");
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    System.out.print("@ ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        scan.close();
    }
}