import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class DemoApplyLambdaFunction {
    //!!! 好重要, 係新一代既寫法
    public static void main(String[] args) {
        // for-each
        List<String> strings = new LinkedList<>();
        
        //NOTE

        // foreach (Java 8) 係List 入面加左個自己既foreach
        // !!! List.foreach 要用到 Consumer.class
        strings.forEach(s -> System.out.println(s));

        List<Customer> customers = Arrays.asList(new Customer(19), new Customer(30));
        // filter customer whose age > 20, and print his age by foreach
        customers.forEach(customer -> {
            if (customer.getAge() >20)
            System.out.println(customer.getAge());
        });

        Map<String, Integer> nameMap = new HashMap<>();
        nameMap.put("Jogn", 30);
        nameMap.put("Peter", 7);
        nameMap.computeIfAbsent("Betty",s -> 3);
        System.out.println(nameMap.get("Betty")); // 3
        nameMap.computeIfAbsent("Betty", s -> 4);
        System.out.println(nameMap.get("Betty")); // 3

        nameMap.merge("Betty", 10, (original, multipler) -> original * multipler);
        System.out.println(nameMap.get("Betty")); // 30

        nameMap.merge("Vincent", 10, (original, multipler) -> original * multipler);
        System.out.println(nameMap.get("Vincent")); // 10  // default處理左null既情況直接return old value

        nameMap.put("Oscar", -1);
        System.out.println(nameMap.get("Oscar")); // null

        // All entry'value * 2, if the value is not null
        // otherwise, remove the entry
        for (String key : nameMap.keySet()) { 
        nameMap.merge(key, 2, (x1, x2) -> {
        if (x1 < 0)
          return null;
        return x1 * x2;
        });
        }

        System.out.println(nameMap);
    
    }
}
