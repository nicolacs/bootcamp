import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExercies {
    public static void main(String[] args) {
        // 1.
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> output = numbers1.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .sorted((a, b) -> b.compareTo(a)) // !!!or: .sorted((n1, n2)-> n1 > n2? -1:1)
                .collect(Collectors.toList()); // 黎行出ArrayList<>() / LinkedList: .toCollection(() -> new LinkedList<>())
        System.out.println(output); //[100, 64, 36, 16, 4]

        // 1. Vincent's approach
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers = numbers.stream() //
        .filter(n -> n % 2 == 0) //
        .map(n -> n * n) //
        .sorted((n1, n2) -> n1 > n2 ? -1 : 1) //
        .collect(Collectors.toList()); // ArrayList

        System.out.println(numbers); // [100, 64, 36, 16, 4]

        numbers.add(999);
        System.out.println(numbers);

        // !!! Arrays.asList - No add & remove, but set is OK
        // Mutable but fixed size
        List<String> strings = Arrays.asList("abc", "ooo", "ijk"); 
        // strings.add("abc"); //java.lang.UnsupportedOperationException
        strings.set(1, "hello"); // OK
        System.out.println(strings); // [abc, hello, ijk]

        // !!! List.of - Java 9 (No add, remove, set)
        // Immutable
        List<String> strings2 = List.of("abc", "ooo", "ijk", "pol"); // 
        // strings2.add("xyz"); // java.lang.UnsupportedOperationException
        // strings2.set(1, "hello"); // java.lang.UnsupportedOperationException

        // strings2 = List.of(null, "abc", "hello"); // java.lang.NullPointerException
        
        // 2.
        List<String> names =
                Arrays.asList("Alice", "Bob", "Annie", "David", "Alex");
        List<String> output2 = names.stream().filter(n -> n.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("output2: " +output2);

        // 3.
        List<Integer> numbers3 = Arrays.asList(10, 20, 5, 30, 15);
        // List<Integer> output3 = numbers3.stream()
        // .max((a,b) -> a compareTo(b).orElse(0));
        System.out.println("Max: "
                + numbers3.stream().max((a, b) -> a.compareTo(b)).get());
        System.out.println("Min: "
                + numbers3.stream().min((a, b) -> a.compareTo(b)).get());

        // 4.
        List<String> words = Arrays.asList("apple", "banana", "pear");
        List<Integer> output4 = words.stream().map(w -> w.length())
                .collect(Collectors.toList());
        System.out.println("output4: " +output4);

        // 5.
        List<String> words2 =
                Arrays.asList("hi", "hello", "world", "java", "stream");
        // long output5 = words2.stream()
        // .filter(w -> w.length() > 3)
        // .count();
        // System.out.println(output5);
        System.out.println("output5: " + words2.stream().filter(x -> x.length() > 3).count()); // Try一句過

        // 6.
        List<Integer> numbers6 = Arrays.asList(5, 10, 15, 20, 10, 5);
        Set<Integer> output6 = numbers6.stream().filter(n -> n > 10)
                .collect(Collectors.toSet());
        System.out.println("output6: " +output6);

        // 7.
        List<ExStudent> students =
                Arrays.asList(new ExStudent("Alice", 85), new ExStudent("Bob", 75));
        Map<String, Integer> output7 = students.stream()
                //students.forEach(x -> System.out.println(x.getName() + " = " + x.getScore()));
                // .map(n -> n.getScore())
                // .map(n -> n.getName())
                .collect(Collectors.toMap(n -> n.getName(),n -> n.getScore()));
        System.out.println("output7: " +output7);

        // 8.
        List<Employee> employees = Arrays.asList(
                new Employee("John", 65000),new Employee("Jane", 55000),new Employee("Doe",40000));
        List<String> output8 = employees.stream()
                .filter(e -> e.getSalary() > 50000)
                .map(e -> e.getName())
                .collect(Collectors.toList());
        System.out.println("output8: " +output8);

        // 9.
        List<Person> people = Arrays.asList(
                new Person("Alice", 30), new Person("Bob", 25), 
                new Person("Charlie", 30));

        Map<Integer, List<String>> output9 = people.stream()
                .collect(Collectors.groupingBy(p -> p.getAge(),
                Collectors.mapping(p -> p.getName(),
                Collectors.toList())));
        System.out.println("output9: " +output9);
        
        // 10.
        List<Person> people2 = Arrays.asList(
                new Person("Alice", "Female"), new Person("Bob", "Male"), 
                new Person("Charlie", "Male"));
        Map<Boolean, List<String>> output10 = people2.stream()
                .collect(Collectors.groupingBy(p ->  p.getGender().equals("Male")
                ,Collectors.mapping(p -> p.getName()
                ,Collectors.toList())));
        System.out.println("output10: " +output10);
        
        // 11.
        List<Integer> numbers11 = Arrays.asList(5, 15, 20, 7, 30);
                List<Integer> output11 = numbers11.stream()
                .filter(n -> n > 10)
                .map(n -> n * 2)
                .collect(Collectors.toList());
                //.collect(Collectors.summingInt(e-> Integer.valueOf(e))); 如果想加起曬可咁打
        System.out.println("output11: " +output11);

        // 12.
        List<String> names12 = Arrays.asList("Alice", "Bob", "Charlie");
        int defaultAge = 30;
                List<Person> output12 = names12.stream()
                .map(p -> new Person(p, defaultAge))
                // Stream<Person> output12 = Stream.of(new Person("Alice", defaultAge)
                //         ,new Person("Bob", defaultAge), new Person("Charlie", defaultAge));
                .collect(Collectors.toList());
                //output12.forEach(p -> System.out.println(p.getName()+ ", " + p.getAge()));
        System.out.println("output12: " +output12);

        // 13.
        List<String> words13 = Arrays.asList("hello", "world", "java");
                Deque<String> output13 = words13.stream()
                .map(w -> w.toUpperCase())
                .collect(Collectors.toCollection(ArrayDeque::new));
        System.out.println("output13: " +output13);

        // 14.
        List<Integer> numbers14 = Arrays.asList(1,2,3,4);
                List<Int[]> output14 = new int[].stream()
                .map(n -> n *n)
                .collect(Collectors.toList());
        System.out.println("output14: " +output14);

 
                
    }
}
