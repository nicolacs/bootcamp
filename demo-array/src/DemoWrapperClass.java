public class DemoWrapperClass {
  public static void main(String[] args) {
    int x = 10; // 10 is an int value, x is variable

    // int -> Integer
    Integer i1 = 10; // i become object reference
    // Java -> create Integer object

    Integer i2 = new Integer(10); // i2 -> also object ref
    // object ref stores object address
    // String 同Int 都係大階開頭, 代表they are class

    double d1 = i2.doubleValue();// 攞i2 既value 內容 定義 d1 黎個double, d1 -> 10.0
    System.out.println(i2.compareTo(new Integer(11))); // -1 (一樣就出0 , 唔一樣就出-1)
    // If you are going to compare an number object (Intege, Long, Short, Byte)
    Double d2 = new Double(3);// Here is a Double object with value 3.0
    System.out.println(d2.doubleValue());// 3.0
    System.out.println(d2.toString()); // "3.0"
    System.out.println(d2); // 3.0

    String s = "hello"; // Java -> create String object
    String s2 = new String("hello");
    System.out.println(s2.length());
    System.out.println(s2.charAt(3));

    // Short, Long, Byte
    Long l1 = new Long(123); // 123 ->int
    Long l2 = new Long(123L); // 123 -> long
    Long l3 = new Long("123"); // 123 -> String
    System.out.println("Try Long " + l1.toString());
    System.out.println(l1.longValue());

    Short sh1 = l3.shortValue(); // (short) l3
    System.out.println("Try Short " + sh1); // -> overflow

    int x6 = new Double(10.5).intValue();
    System.out.println(x6); // 10 ->decision loss

    short s3 = new Double(40000.55).shortValue();
    System.out.println(s3); // -25536 (overflow + precision loss)

    // char -> Character
    Character c = 'a'; // auto-box 自動打包個value 成 new
    Character c2 = new Character('a');  // 上面個寫法java會自動幫你 new左 , 其實等於黎行既寫法
    // int -> Integer
    Integer i5 = 10; // auto-box, but actually it is calling "new"
    Boolean b1 = true; // auto-box to new Boolean(true)
    b1 = new Boolean("true");
    b1 = new Boolean(false);

    // 8 primitives + 8 wrapper classes + String 所以TOTAL 學左根基既17個types

    int[] arr = new int[] {2, 6, 10};
    // 以下arr2 & arr3係同一件事有2個寫法
    Integer[] arr2 =
        new Integer[] {new Integer(2), new Integer(6), new Integer(10)};
    Integer[] arr3 = new Integer[] {2, 6, 10};

    Integer g = 10;
    if (g.equals(new Integer(10))) {

    }

    Integer[] integers = new Integer[] {10, 8, 4, -3, 7};
    // Find the number of integers >5
    int count = 0;
    for (int i = 0; i < integers.length; i++) {
      if (integers[i].compareTo(new Integer(5)) > 0) { // >0 即係correct , <0 即係incorret, =0 即係= compareTo 入面既數值
        count++;
      }
    }
    System.out.println("Count: " + count);


    Character[] characters = new Character[] {'c', '9', 'g', '0', 'e', '!'};
    //Find the number of "number" in the array , here output ->2
    int count1 =0;
    for (int i =0; i<characters.length ; i++){
      if (characters[i].charValue() >= 48 && characters[i].charValue() <=57){    //>>This is approach 
        count1++;
      }
    }
    System.out.println("Character Example : " + count1);

    int result = Integer.parseInt("10");
    System.out.println(result);
    //result= Integer.parseInt("hello"); // this sentence is a bug
    // System.out.println(result); // java.lang.NumberFormatException


  }

}
