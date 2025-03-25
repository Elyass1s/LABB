import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

interface MathOperations{
    int operate(int a,int b);
}
public class Lambda {
    public static void main(String[] args) {
        //-------------------------------------------
        //первое задание
        MathOperations addOp=((a, b) -> a+b);
        MathOperations subOp=((a, b) -> a-b);
        MathOperations multiOp=((a, b) -> a*b);
        MathOperations divOp=((a, b) -> a/b);

        System.out.println(addOp.operate(7,10));
        System.out.println(subOp.operate(10,5));
        System.out.println(multiOp.operate(10,5));
        System.out.println(divOp.operate(10,5));
        //--------------------------------------------
        //второе задание
        List<Integer> numbers=Arrays.asList(10,15,22,33,40,55);
        List<Integer> OddNumbers=new ArrayList<>();
        Predicate<Integer> oddNum= num ->num%2!=0;
        numbers.forEach(num->{if(oddNum.test(num)){OddNumbers.add(num);}});
        System.out.println(OddNumbers);
        //---------------------------------------------
        //третье задание
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        names.sort((a, b) -> b.compareTo(a));
        System.out.println("Sorted: " + names);
        //--------------------------------------------
        //четвертое
        List<String> words = Arrays.asList("hello", "java", "lambda");
        Function<String, String> transform = s -> new StringBuilder(s.toUpperCase()).reverse().toString();
        List<String> transformedWords = new ArrayList<>();
        for (String word : words) {
            transformedWords.add(transform.apply(word));
        }
        System.out.println("Transformed Strings: " + transformedWords);
        //--------------------------------------------
        //пятое
        List<String> cities = Arrays.asList("New York", "London", "Tokyo", "Berlin");
        Consumer<String> printCity = city -> System.out.println(city);
        cities.forEach(printCity);
        //----------------------------------------------
        //шестое
        List<String> cities1 = Arrays.asList("New York", "London", "Tokyo", "Berlin");
        cities1.forEach(System.out::println);
        //----------------------------------------------
        //седьмое
        int a = 25, b = 40;

        BiFunction<Integer, Integer, Integer> max = (x, y) -> x > y ? x : y;
        BiFunction<Integer, Integer, Integer> min = (x, y) -> x < y ? x : y;
        System.out.println("Max: " + max.apply(a, b));
        System.out.println("Min: " + min.apply(a, b));

    }
}
