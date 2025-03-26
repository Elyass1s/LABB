import java.util.*;
public class HashMapp {
    public static void main(String[] args) {
        System.out.println("-----------12----------");//12
        Map<Integer,String> hash_map= new HashMap();
        hash_map.put(1,"Red");
        hash_map.put(2,"Green");
        hash_map.put(3,"Black");
        hash_map.put(4,"White");
        hash_map.put(5,"Blue");
        System.out.println(hash_map.values());
        System.out.println("-----------11----------");//11
        Set keyset = hash_map.keySet();
        System.out.println(keyset);
        System.out.println("-----------10----------");//10
        System.out.println(hash_map.get(3));
        System.out.println("-----------9----------");//9
        System.out.println(hash_map.entrySet());
        System.out.println("-----------8----------");//8
        System.out.println(hash_map);
        if (hash_map.containsValue("Green")) {
            System.out.println("Yesss ");
        } else {
            System.out.println("no");
        }
        System.out.println("-----------7----------");//7
        System.out.println(hash_map);
        if (hash_map.containsKey("Green")) {
            System.out.println("yes - " + hash_map.get("Green"));
        } else {
            System.out.println("no");
        }
    }
}
