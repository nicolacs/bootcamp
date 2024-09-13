import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExercies {
    public static void main(String[] args) {
        // 1.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> output = numbers.stream().filter(n -> n % 2 == 0)
                .map(n -> n * n).sorted((a, b) -> b.compareTo(a)) // !!!唔了解
                .collect(Collectors.toList());
        System.out.println(output);

        // 2.
        List<String> names =
                Arrays.asList("Alice", "Bob", "Annie", "David", "Alex");
        List<String> output2 = names.stream().filter(n -> n.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(output2);

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
        System.out.println(output4);

        // 5.
        List<String> words2 =
                Arrays.asList("hi", "hello", "world", "java", "stream");
        // long output5 = words2.stream()
        // .filter(w -> w.length() > 3)
        // .count();
        // System.out.println(output5);
        System.out.println(words2.stream().filter(x -> x.length() > 3).count()); // Try一句過

        // 6.
        List<Integer> numbers6 = Arrays.asList(5, 10, 15, 20, 10, 5);
        Set<Integer> output6 = numbers6.stream().filter(n -> n > 10)
                .collect(Collectors.toSet());
        System.out.println(output6);

        // 7.
        List<ExStudent> students =
                Arrays.asList(new ExStudent("Alice", 85), new ExStudent("Bob", 75));
        Map<String, Integer> output7 = students.stream()
                //students.forEach(x -> System.out.println(x.getName() + " = " + x.getScore()));
                // .map(n -> n.getScore())
                // .map(n -> n.getName())
                .collect(Collectors.toMap(n -> n.getName(),n -> n.getScore()));
        System.out.println(output7);

        // 8.
        List<Employee> employees = Arrays.asList(
                new Employee("John", 65000),new Employee("Jane", 55000),new Employee("Doe",40000));
        List<String> output8 = employees.stream()
                .filter(e -> e.getSalary() > 50000)
                .map(e -> e.getName())
                .collect(Collectors.toList());
        System.out.println(output8);
                
    }
}
