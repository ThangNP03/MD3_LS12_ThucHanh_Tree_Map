package hasMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        //HasMap
        Map<String , Integer> hasMap = new HashMap<>();
        hasMap.put("Thanng ", 20);
        hasMap.put("TheAnh", 20);
        hasMap.put("AnhKhoa", 23);
        hasMap.put("Lam" ,28);
        System.out.println("Hien thi hasMap ");
        System.out.println(hasMap + " \n");

        //TreeMap
        Map<String , Integer> treeMap = new TreeMap<>();
        System.out.println(" Hiển thị mục nhp theo thứ tự tăng dần ");
        System.out.println(treeMap);

        //LinkedHashMap
        Map<String, Integer> linkedHashMap  = new LinkedHashMap<>();
        linkedHashMap .put("Hung", 24);
        linkedHashMap .put("Chax", 20);
        linkedHashMap.put("thang", 22);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap +"thang");

    }
}