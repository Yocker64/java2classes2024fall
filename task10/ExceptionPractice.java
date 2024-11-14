package task10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("xの値:");
            int x = sc.nextInt();
            System.out.print("yの値:");
            int y = sc.nextInt();
            System.out.println("x * y = " + (x * y));
            System.out.println("x / y = " + (x / y));
        } catch (ArithmeticException e) {
            System.err.println("You must not divide by zero, elsewhise you will perish!");
        } catch (InputMismatchException e){
            System.out.println("You introduced a character that is not allowed");
        }

        System.out.println("プログラムを終了します。");
    }
}