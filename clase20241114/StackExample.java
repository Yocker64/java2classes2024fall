package clase20241114;

import java.util.LinkedList;

public class StackExample {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<Integer>();
        stack.push(1);
        System.out.println("スタックの状態：" + stack);
        stack.push(2);
        System.out.println("スタックの状態：" + stack);
        stack.push(3);
        System.out.println("スタックの状態：" + stack);
        stack.push(4);
        System.out.println("スタックの状態：" + stack);

        while (!stack.isEmpty()) {
            System.out.println("要素の取り出し：" + stack.pop());
            System.out.println("スタックの状態：" + stack);
        }
    }
}
