import java.util.*;

public class HashSett {
    public static void main(String[] args) {
        System.out.println("-----------12----------");//12
        Set<Integer> HAshset=new HashSet<>();
        HAshset.add(18);
        HAshset.add(19);
        HAshset.add(180);
        HAshset.add(18);
        HAshset.add(27);
        System.out.println("Before: "+HAshset);
        //HAshset.clear();
        System.out.println(HAshset);
        System.out.println("-----------11----------");//11 ля похожих элементов
        Set<Integer> HAshset1=new HashSet<>();
        HAshset1.add(18);
        HAshset1.add(1);
        HAshset1.add(180);
        HAshset1.add(19);
        HAshset1.add(27);
        //HAshset.retainAll(HAshset1);
        System.out.println(HAshset);
        System.out.println("-----------10----------");//10
        HAshset.add(7777);
        for (Integer element : HAshset) {
            System.out.println(HAshset1.contains(element) ? "Yes":"No");
        }
        System.out.println("-----------9----------");//9
        Set<Integer> Num=new TreeSet<>();
        Num.add(7);
        Num.add(12);
        Num.add(99);
        Num.add(20);
        Num.add(1);
        System.out.println(Num);
        for(int t:Num){
            if(t<7){
                System.out.println(t);
            }
        }
        System.out.println("-----------8----------");//8
        //Set<Integer> ConverttoTreeSet=new TreeSet<>(HAshset);
        System.out.println("-----------7----------");//7
        //String[] new_array = new String[HAshset.size()];
        //HAshset.toArray(new_array);
        System.out.println("-----------6----------");//6
        HashSet <Integer> new_h_set =(HashSet<Integer>) ((HashSet<Integer>) HAshset).clone();
        System.out.println(HAshset);
        System.out.println("Cloned Hash Set: " + new_h_set);




    }
}
