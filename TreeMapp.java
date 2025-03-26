import java.util.*;
public class TreeMapp {
    public static void main(String[] args) {
        System.out.println("-----------26----------");//26
        TreeMap<Integer,String> tree_map =new TreeMap<>();
        // Put elements to the map
        tree_map.put(10, "Red");
        tree_map.put(20, "Green");
        tree_map.put(40, "Black");
        tree_map.put(50, "White");
        tree_map.put(60, "Pink");
        System.out.println(tree_map);
        System.out.println("greater than or equal to: " + tree_map.ceilingKey(20));
        System.out.println(tree_map.ceilingKey(30));
        System.out.println(tree_map.ceilingKey(50));
        System.out.println("-----------25----------");//25
        System.out.println(tree_map);
        System.out.println(tree_map.ceilingEntry(20));
        System.out.println(tree_map.ceilingEntry(40));
        System.out.println( tree_map.ceilingEntry(50));
        System.out.println("-----------24----------");//24
        System.out.println(tree_map);
        System.out.println(tree_map.tailMap(20, false));
        System.out.println("-----------23----------");//23
        System.out.println(tree_map);
        System.out.println(tree_map.tailMap(20));
        System.out.println("-----------22----------");//22
        SortedMap < Integer, String > sub_tree_map = new TreeMap < Integer, String > ();
        System.out.println(tree_map);
        sub_tree_map = tree_map.subMap(20, true, 40, true);
        System.out.println( sub_tree_map);
        System.out.println("-----------21----------");//21
        System.out.println(tree_map);
        sub_tree_map = tree_map.subMap(20, 40);
        System.out.println( sub_tree_map);
    }
}
