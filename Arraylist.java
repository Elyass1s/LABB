import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylist{
    public static void main(String[] args) {
        List<String> Colors=new ArrayList<>();
        System.out.println("-----------1----------");//1
        Colors.add("red");
        Colors.add("red");
        Colors.add("red");
        System.out.println(Colors.size());
        System.out.println("-----------3----------");//3
        Colors.addFirst("blue");
        Colors.addLast("orange");
        Colors.add(0,"black");
        System.out.println(Colors);
        System.out.println("-----------2----------");//2
        for(String color:Colors){
            System.out.println(color);
        }
        System.out.println("-----------4----------");//4
        for(int i=0;i<Colors.size();i++){
            System.out.println(Colors.get(i));
        }
        System.out.println(Colors.get(1));
        System.out.println("-----------5----------");//5
        Colors.set(0,"WHITE");
        System.out.println(Colors);
        System.out.println("-----------6----------");//6
        Colors.remove(2);
        System.out.println(Colors);
        System.out.println("-----------7----------");//7
        String z="orange";
        for(String color:Colors){
            if(color==z){
                System.out.println("YEEE its here "+color);
            }else {
                System.out.println("no");
            }
        }
        //using "contains"
        if(Colors.contains(z)){
            System.out.println("yeeey");
        }
        System.out.println("-----------8----------");//8
        List<Integer> Given=new ArrayList<>();
        Given.add(90);
        Given.add(50);
        Given.add(77);
        Given.add(7);
        Given.add(98);
        System.out.println("Before: "+Given);
        Collections.sort(Given);
        System.out.println(Given);

    }

}