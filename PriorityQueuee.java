import java.util.*;
public class PriorityQueuee {
    public static void main(String[] args) {
        System.out.println("-----------12----------");//12
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(10, Collections.reverseOrder());
        pq1.add(10);
        pq1.add(22);
        pq1.add(36);
        pq1.add(25);
        pq1.add(16);
        pq1.add(70);
        pq1.add(82);
        pq1.add(89);
        pq1.add(14);
        System.out.println("\nOriginal Priority Queue: "+pq1);
        System.out.print("\nMaximum Priority Queue: ");
        //Integer val = null;
        //while( (val = pq1.poll()) != null) {
        //    System.out.print(val+"  ");
        //}
        System.out.println("-----------11----------");//11
        PriorityQueue<String> pq2 = new PriorityQueue<>();
        pq2.add("black");
        pq2.add("black");
        pq2.add("blue");
        pq2.add("red");
        String str2;
        str2 = pq2.toString();
        System.out.println(str2);
        System.out.println("-----------10----------");//10
        List<String> array_list = new ArrayList<String>(pq2);
        System.out.println(array_list);
        System.out.println("-----------9----------");//9
        System.out.println(pq1);
        System.out.println(pq1.poll());
        System.out.println(pq1);
        System.out.println("-----------8----------");//8
        System.out.println(pq1);
        System.out.println(pq1.peek());
        System.out.println("-----------7----------");//7
        PriorityQueue<String> pq3 = new PriorityQueue<String>();
        pq3.add("black");
        pq3.add("black");
        pq3.add("blue");
        pq3.add("red");
        pq3.add("orange");
        pq3.add("white");
        for (String element : pq2){
            System.out.println(pq3.contains(element) ? "Yes" : "No");
        }
    }
}
