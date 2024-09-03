import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoArrayList {
    public static void main(String[] args) {
        String[] arr = new String[]{"abc", "def", "ijk"};
        System.out.println(arr.length); //3(get)
        arr[1] = "hello"; // similar to (set)
        // 如果loop佢:
        for (String s : arr){
            System.out.print(s);
        }
        System.out.println(arr[1]); // similar to get()
        // if we want to add one more String object to array object
        // you have to create another String array object, and then copy ....
        // so, array object is fixed length

        // After Java 5
        // ArrayList OBJ is variable length
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("abc");
        strings.add("def");
        strings.add("ijk");
        strings.add("hello");
        System.out.println(strings.size()); //4

        // 1. 可replace 其他value
        strings.set(1, "opq"); // -> arr[1] = "opq";

        // 2. for loop
        for (String s : strings){
            System.out.println(s);
        }

        // 3.check value
        System.out.println(strings.get(3)); // hello

        // 4. delete
        //strings.remove("ijk");  // 就算係new String("ijk"), 都remove到. 
        strings.remove(new String("ijk")); // !!!因為背後係用 equals(), value岩就remove到
        System.out.println(strings); // ArrayList.toString() -> [abc, opq, hello] 

        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(1);
        integers.add(10000);
        integers.add(-2_100_000_000);
        System.out.println(integers.size()); //3

         // !!! you should think of the scenario of without equals() in Customer.class
             // new ArrayList<Customer>() -> constructor
        ArrayList<Customer> customers = new ArrayList<Customer>();
        Customer john = new Customer("John");

        customers.add(john);
        customers.add(john);
        System.out.println(customers.size()); // 2
        customers.remove(john); // !!! Object.class equals() true -> break
        System.out.println(customers.size()); // 1

        customers.add(john);
        System.out.println(customers.size()); // 2

        ArrayList<Customer> targetRemoveList = new ArrayList<>();
        targetRemoveList.add(john);

        customers.removeAll(targetRemoveList); // -> Customer.equals()

        System.out.println(customers.size()); // 0

        ArrayList<BigDecimal> decimals = new ArrayList<>();
        // add
        decimals.add(BigDecimal.valueOf(3.0d));
        decimals.add(BigDecimal.valueOf(3.5));
        decimals.add(BigDecimal.valueOf(3.5));
        // remove
         decimals.remove(BigDecimal.valueOf(3.5)); // remove one and break
         // size
        System.out.println(decimals.size()); // 2

        //
        System.out.println(decimals.contains(BigDecimal.valueOf(3.5))); // true
         // ArrayList.class -> contains() -> for loop, break
         // but the defintion of equals() is still controlled by BigDecimal.class ->
         // equals()

        // New Method ~ Ask if contains both 3.0 , 3.5
        //Approach 1://ArrayList<BigDecimal> checkIfContains = new ArrayList<>();
                     // checkIfContains.add(BigDecimal.valueOf(3.0));
                     // checkIfContains.add(BigDecimal.valueOf(3.5));
                     // decimals.containsAll(checkIfContains);
                     //用4行整一個想check既value既array, 再用containsAll睇下目標OBJ有冇array入面既value
        //Approach 2:
        System.out.println(decimals.containsAll(
            Arrays.asList(BigDecimal.valueOf(3.0), BigDecimal.valueOf(3.5)))); // true
            // Now, 直接用.asList(value...)就可以一句攪掂

        // ArrayList<Number> is not the parent of ArrayList<Integer> 黎個叫generic, 用佢括著既野都唔會有parent / child relationship
        // ArrayList<Number> integers3 = new ArrayList<Integer>(); // compile error

         // but Number is the parent of Integer
            Number n = new Integer(3);
            Number[] numbers = new Integer[] {3, 7, 10}; //唔可以轉換一次, int > long is OK, int > long > LONG 唔OK
            numbers = new Long[] {3L, 7L, 10L}; // long -> Long

              long[] arr10 = new long[] {3, 7, 10}; // int -> long // 可自然升級
              // L108  int -> long 係primitive, 可以promotion.  NOT int[] 同 long[]
            //Long l1 = new Integer(10);  //Integer object has no relationship with Long object
            // ^ Integer > int > long > Long OBJ  this is 垃圾

        System.out.println(decimals.isEmpty()); // false
        System.out.println(decimals.size() == 0); // false // 同isEempty()同樣功能, 但唔好睇唔專業

        // for loop - ArrayList
        for (int i = 0; i < decimals.size()-1 ; i++){
            System.out.println(decimals.get(i) + "," + decimals.get(i+1));
        }

        if (!decimals.isEmpty()) {

        }
  
        // for-each loop - ArrayList
         for (BigDecimal bd : decimals) {
        System.out.println(bd);
      }

      // Create method to print student's score
      Subject english = new Subject(90, "English");
      Subject maths = new Subject(99, "Maths");
      ArrayList<Subject> subjects = new ArrayList<>();
      subjects.add(english);
      subjects.add(maths);
      Student peter = new Student("Peter", subjects);
  
      ArrayList<Student> students = new ArrayList<>();
      students.add(peter);
  
      // ArrayList<Subject> subjects2 = new ArrayList<>();
      subjects = new ArrayList<>();
      // subjects.clear(); // Wrong answer
  
      Subject english2 = new Subject(70, "English");
      Subject maths2 = new Subject(100, "Maths");
  
      subjects.add(english2);
      subjects.add(maths2);
      Student sally = new Student("Sally", subjects);
  
      students.add(sally);
  
      // print out all Students
      System.out.println("all student " +students);
  
      // remove by index
      System.out.println("before removal:" + decimals);
      BigDecimal removedDecimal = decimals.remove(0); // remove the first element
      System.out.println("removedDecimal=" + removedDecimal);
      System.out.println("after removal:" + decimals);
  
      boolean isRemoved = decimals.remove(BigDecimal.valueOf(4.0));
      System.out.println(isRemoved); // false
  
      // add element
      decimals.add(BigDecimal.valueOf(10.5));
  
      // if add element success
      if (decimals.add(BigDecimal.valueOf(100.0))) { // "if" can be used together with modification
        System.out.println("Added 100 to ArrayList");
      }
  
      // Cannot use ArrayList together with primitive
      // ArrayList<char> characters = new ArrayList<>();
      ArrayList<Character> characters = new ArrayList<>();
      characters.add('c'); // char -> Character
      characters.add(Character.valueOf('a'));
      double ascii = characters.get(0); // Character Object -> char (unbox) -> int
      double d = (byte) 3; // byte -> double

      // Unbox 升級
      int l1 = Short.valueOf((short) 3); // Short OBJ -> short -> int (upcast)
      // Long l2 = 3; //int -> long -> Long OBJ (this is not ok)

      long l = new Integer(3); // OK, Integer -> int -> long
      // Long l2 = new Integer(3); // NOT OK, Integer -> int -> long -> Long 
  
      ArrayList<Object> objects = new ArrayList<Object>();
    
    // Interface: List.class
    // List is the interface of ArrayList
    List<String> strings2 = new ArrayList<>();
    strings2.add("abc");
    strings2.add("def");
    System.out.println(strings2.get(0)); // "abc"
    System.out.println(strings2.size()); // 2

    // 用下面1句開 arraylist, 代替上面用3句. 但黎款唔可以再modify -> 即係唔可以 .add 同 .remove
    System.out.println(strings2.equals(Arrays.asList("abc", "def"))); // true
    System.out.println(strings2.equals(Arrays.asList("abc", "def", "ijk"))); // false
    System.out.println(strings2.equals(Arrays.asList("def", "abc"))); // false

    System.out.println(strings2.hashCode()); // 3087268
    System.out.println(Arrays.asList("abc", "def").hashCode()); // 3087268

    // indexOf() -> return the first matched element
    System.out.println(strings2.indexOf("def")); // 1
    System.out.println(strings2.indexOf("hello")); // -1

    // lastIndexOf() -> return the last matched element
    System.out.println(strings2.lastIndexOf("def")); // 1

    // Conversion:
    // 1. String[] -> ArrayList<String> 
    String[] arr2 = new String[] {"abc", "def", "ijk"};
    
    // L214 (String ... a)
    List<String> arrayList = Arrays.asList(arr2);
    List<String> arrayList2 = Arrays.asList("abc", "def", "ijk");

    // 2. ArrayList<String> -> String[]
    System.out.println(strings2); // [abc, def]
    String[] stringArray = strings2.toArray(new String[strings2.size()]);
    System.out.println(Arrays.toString(stringArray)); // [abc, def]

    // !!!Arrays.asList() -> return List object -> Cannot modify the array OBJ
    // Disadvantage: you cannot perform write operation.
    // arrayList.add("xyz");  // arrayList .add/ .remove ->run-time error
    // System.out.println(arrayList); // java.lang.UnsupportedOperationException

    // read operation is ok
    for (String s : arrayList) {
      System.out.println("L235 " + s);
    }

    // !!!
    // Conversion: array to arraylist
    // support both read and write operations
    List<String> arrayList4 = new ArrayList<>(Arrays.asList(arr2));
    arrayList4.add("hello");
    System.out.println(arrayList4); // [abc, def, ijk, hello]



      //My wrong trying
        // @Override
        // public String toString(){
        //     return "Student("
        //     + "name= " + this.name
        //     + ", score= " + super.score
        //     + ", subject= " + super.desc
        //     +")";
        // }

        // ArrayList<Student> students = new ArrayList<>();
        // students.add(new Student("John", 80, "ENGLISH"));
        // students.add(new Student("ROY", 85, "ENGLISH"));
        // students.add(new Student("BO", 95, "ENGLISH"));

        // System.out.println(students);


        // ArrayList<Object> objects = new ArrayList<Object>();

    }

    
}