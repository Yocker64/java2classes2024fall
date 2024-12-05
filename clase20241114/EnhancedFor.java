package clase20241114;

import java.util.HashSet;

public class EnhancedFor {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");

        for (String str : set) {
            System.out.println(str);
        }
    }
}
