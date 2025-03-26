import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.*;
public class TreeSett {
    public static void main(String[] args) {
        System.out.println("-----------16----------");//16
        Set<Integer> Num=new TreeSet<>();
        Num.add(7);
        Num.add(12);
        Num.add(99);
        Num.add(20);
        Num.add(1);
        System.out.println(Num);
        Num.remove(7);
        System.out.println(Num);
        System.out.println("-----------15----------");//15
        Set<Integer> NumTree=new TreeSet<>();
        NumTree.add(4);
        NumTree.add(4);
        NumTree.add(1);
        NumTree.add(7);
        System.out.println(NumTree);
        Iterator<Integer> iterator = NumTree.iterator();
        Integer lastElement = null;
        while (iterator.hasNext()) {
            lastElement = iterator.next();
        }
        NumTree.remove(lastElement);
        System.out.println(NumTree);
        System.out.println("-----------14----------");//14
        System.out.println(NumTree);
        //NumTree.pollFirst(); удаляет первое
        System.out.println("-----------13----------");//13
        System.out.println(NumTree);
        //NumTree.lower(7); ниже какого то числа
        System.out.println("-----------12----------");//12
        //NumTree.higher(1) выше какого то числа
        System.out.println("-----------11----------");//11
        //NumTree.higher(4); меньше или равно
    }
}
