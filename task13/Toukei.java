package task13;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Toukei {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "s";
        LinkedList<Integer> list = new LinkedList<Integer>();
        try {
            while (str != "") {
                System.out.println("Gimme the Juice");
                str = scan.nextLine();
                list.add(Integer.parseInt(str));
            }
        } catch (NumberFormatException e) {
            if (str.equals("")) {
                System.out.println("Exiting input phase");                
            }else {
                System.out.println("You entered something that is not a integer you silly little boy, Ima have to spank you!");
            }
        }
        Collections.sort(list);
        for (Integer integer : list) {
            System.out.println(integer);
        }

        
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        System.out.println("The number of inputs is: " + list.size());
        System.out.println("The sum of all inputs is: " + sum);
        System.out.println("The average is: " + sum/list.size());
        System.out.println("The minimum is: " + Collections.min(list));
        System.out.println("The maximum is: " + Collections.max(list));
    }
}
