package by.lessons.practices.class7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) throws Exception {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B1111");
        map.put(3, "C");
        map.put(4, "D");
        map.put(5, "E11111");
        map.put(6, "F");
        map.put(7, "G");
        map.put(8, "H");
        map.put(9, "I11111111");
        map.put(10, "G");

//        method1Task1(map);
        System.out.println(method1Task1(map));
        System.out.println(method2Task1(map));

    }

    public static String method1Task1(Map<Integer, String> map) {
        String result = "";
        for (Map.Entry<Integer, String> obj : map.entrySet()) {
            if (obj.getKey() > 5 && obj.getKey() != map.size()) {
                result = result + obj.getKey() + ", ";
            } else if (obj.getKey() == map.size()) {
                result = result + obj.getKey();
            } else {
                continue;
            }
        }
        return result;
    }

    public static int method2Task1(Map<Integer, String> map) {
        Set <Integer> keyList = map.keySet();
        int multiplication = 1;
        for (Integer obj : keyList) {
            if (map.get(obj).length() > 5) {
                multiplication *= obj;
            } else {
                continue;
            }
        }
        return multiplication;
    }

}
