import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LInkedList {
    public static void main(String[] args) {
        System.out.println("-----------1----------");//1
        List<Integer> Linkked = new LinkedList<>();
        Linkked.add(7);
        Linkked.add(10);
        Linkked.add(90);
        Linkked.add(1);
        System.out.println(Linkked);
        Linkked.addLast(5);
        System.out.println(Linkked);
        System.out.println("-----------2----------");//2
        for (int element : Linkked) {
            System.out.println(element);
        }
        System.out.println("-----------26----------");//26
        Linkked.set(4,1000);
        System.out.println(Linkked);
        System.out.println("-----------25----------");//25
        if(!Linkked.isEmpty()){
            System.out.println("there are elements");
        }else {
            System.out.println("There is nothing");
        }
        System.out.println("-----------24----------");//24
        List<Integer> Linkked2 = new LinkedList<>();
        Linkked2.add(7);
        Linkked2.add(18);
        Linkked2.add(900);
        Linkked2.add(1);
        System.out.println(Linkked2);
        List<Integer> Linkked3 = new LinkedList<>();
        for(int e:Linkked){
            if(!Linkked2.contains(e)){
                Linkked3.add(e);
            }
        }
        System.out.println(Linkked3);
        System.out.println("-----------23----------");//23
        List<Integer> list=new ArrayList<>(Linkked);
        System.out.println(list);


    }
}
