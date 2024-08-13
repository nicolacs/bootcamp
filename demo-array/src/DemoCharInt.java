public class DemoCharInt {
  public static void main(String[] args) {
    char c = 'A';
    int x = c;  // upcasting/ promotion
    System.out.println(x); //65 is ASCII code of A

    // char c2 = x; // Not ok, as int to char is downcasting

    char c3 = '0'; // ascii ->48
    int x2 = c3;
    System.out.println(x2);//48

// char[] -> String.class  String.class其實由char array 組成
    System.out.println("hello".substring(0,2)); //he

    // long -> float
    float f1 = 10L;
    System.out.println(f1); //10.0
    // long ->double
    double d1 = 100L;
    System.out.println(d1); //100.0
    // int ->float
    float f2 = 10;
    System.out.println(f2);//10.0
    //char -> float
    float f3 ='c';
    System.out.println(f3);// 99.0 in ascii code
    //char ->double
    double d2 = 'B';
    System.out.println(d2); //66.0 in ascii code

    // Can Char do Math Operation?
    int sum = 'a' + 'a';  //char + char -> can become int + int and support +, -, *, /
    System.out.println("Can Char do Math Operation? " + sum); //194

    // Counting Example
    char[] arr = new char[]{'a','y', 'z', 'b', 'a'};
    // Find the Max count value =a
    int Max = 0;
    int[] counts = new int[26];
    for (int i=0 ; i <arr.length ; i++){
      counts[arr[i] - 97]++;
      }
      int max = -1;
      char target = ' ';
      for (int i=0 ; i < counts.length; i++){
        if (counts[i] > max){
          max = counts[i];
          // int -> char
          // In java, you can still downcast the value to lower level typr by
          // expliciyly conversion
          target = (char) (i+97);
        }
      }
      System.out.println("The target is " + target);//a

      int s = 12360;
      char c2 = (char) s;
      System.out.println(c2); // OK

      s = 66000;
      char c4 = (char) s;
      System.out.println(c4); // OK, but overflow

      //Overflow
      byte b1 = (byte) 128;
      System.out.println(b1);// -128
      b1 = (byte) 129;
      System.out.println(b1);// -127

      int asset = (int) 2_200_000_000L;
      //overflow
      System.out.println(asset); // -2094967296





  }
  
}
