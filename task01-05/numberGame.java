import java.util.Scanner;

public class numberGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1〜100の乱数を１つ作ります");
        int target = (int) (Math.random() * 100 + 1);

        int guess = scan.nextInt();
        if (target < guess) {
            System.out.println("大きすぎます。");
        } else if (target > guess) {
            System.out.println("小さすぎます。");
        } else {
            System.out.println("あたり！");
        }
        scan.close();
    }
}
