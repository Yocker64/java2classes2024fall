package clase20241114;

import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("first name", "Batto");
        map.put("last name", "Iredui");
        map.put("address", "Kyoto city");
        map.put("phone", "075-000-0000");
        System.out.println(map.entrySet());
        System.out.println(map.values());
        System.out.println(map.keySet());
        System.out.println(map.get("first name"));
        System.out.println(map.get("last name"));
        System.out.println(map.get("address"));
        System.out.println(map.get("phone"));
        System.out.println(map.get("Email"));
    }
}
