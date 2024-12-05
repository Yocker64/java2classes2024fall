package task14;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Lambda {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(8);
        nums.add(10);
        nums.forEach((n) -> {System.out.println(n);});
        
    }

}
