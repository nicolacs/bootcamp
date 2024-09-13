import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DemoLambdaFunction {

    public static void main(String[] args) {
        // Function.class
        // interface Function<T, R> //T同R 係RUNTIME必須定義
        // R apply(T t);
        String a = "abcde";
        Function<String, Integer> stringlength = str -> str.length(); // !!! Formula
        System.out.println(stringlength.apply(a)); // 5

        // Try myself:   XXX唔岩, Function黎個interface係入前, 出後
        //  Function<String, Integer> checkpass =
        //          (str, i) -> str.length > i ? System.out.println(str)
        //                  : System.out.println("not enough words");

        // Runtime Formula (differs to Class instance method & static method)
        Function<List<String>, Set<String>> lengthlargerThan3 = strings -> {
            Set<String> newStrings = new HashSet<>();
            for (String s: strings){
                if(s.length() > 3)
                newStrings.add(s);
            }
            return newStrings;
        };
        List<String> stringList = Arrays.asList("abcd", "abc", "abcd", "abcde");
        Set<String> stringSet = lengthlargerThan3.apply(stringList);
        System.out.println(stringSet);  //[abcde, abcd]

        // BiFunction.class
        // interface BiFunction<T, U, R>
        // R apply(T t, U u);
            // Try myself:
         BiFunction<List<String>, Integer, Set<String>> checkPass = (strings, x) -> {
             Set<String> newStrings = new HashSet<>();
             for (String s : strings){
                 if (s.length() >= x)
                 newStrings.add(s);
             }
             return newStrings;
         };
         Set<String> stringSet2 = checkPass.apply(stringList, 3);
         System.out.println(stringSet2);

        // Vincent's example:
        BiFunction<String, String, String> concat = (s1, s2) -> s1.concat(s2);
        System.out.println(concat.apply("hello", "world")); // helloworld

        // Consumer.class
        // interface Consumer<T> {
        // void accept(T t);
        Consumer<List<String>> printer = strings -> {
            for (String s : strings){
                System.out.println(s);
            }
        };
        printer.accept(stringList);

        // Biconsumer
        BiConsumer<Map<Integer, String>, Integer> printValue = (map, key) ->
            System.out.println(map.get(key));
        
            Map<Integer, String> nameMap = new HashMap<>();
            nameMap.put(1, "John");
            nameMap.put(2, "Peter");
            printValue.accept(nameMap, 2);

        // Supplier
        // Supplier<T>
        // T get();

        // !!! "() -> Math.random();" this is a formula to return Double, but not return Double
        Supplier<Double> randomNumber = () -> Math.random();
        System.out.println(randomNumber.get()); // 0.xxxx

        Function<Integer, Integer> randomNumber2 = to -> new Random().nextInt(to) +1;
        System.out.println(randomNumber2.apply(100)); // (random number between 1-100)

        // Predicate<T>
        //boolean test(T t);
        // !!! "customer -> customer.getAge() >= 18" is a formula to return true/false
        Predicate<Customer> isAdult = customer -> customer.getAge() >= 18;
        System.out.println(isAdult.test(new Customer(18))); // true
        System.out.println(isAdult.test(new Customer(17))); // false

        // BiPredicate
        BiPredicate<Customer, Customer> isOlderThan = (cus1, cus2) -> cus1.getAge() > cus2.getAge();
        System.out.println(isOlderThan.test(new Customer(30), new Customer(31)));

        // UnaryOperator<T> extends Function<T, T> // In同Out 一定要同一個type 
        // 其實唔用UnaryOperator 用下面Function寫返開都OK
        UnaryOperator<String> replaceSpaceByEmptyString = s -> s.replace(" ", "");
        System.out.println
        //!!! NOTE

        BinaryOperator<String> firstCharacters = (s1, s2) -> {
            String result = "";
            if (s1 != null && s1.length() >0 )
             result += s1.charAt(0);
            if (s2 != null && s2.length() >0 )
             result += s2.charAt(0);
             return result;
        };
        
    }
}
