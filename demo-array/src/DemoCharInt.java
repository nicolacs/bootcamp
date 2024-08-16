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
      byte b1 = (byte) 128;  // =127+1
      System.out.println(b1);// -128
      b1 = (byte) 129;
      System.out.println(b1);// -127
      b1 = (byte) 383;
      System.out.println(b1);// 127 . 如個數超過, +-128, 會不停轉

      int asset = (int) 2_200_000_000L;
      //overflow
      System.out.println(asset); // -2094967296

      // double -> int (precision loss)
      double d10 = 10.25;
      int x5 = (int) d10;
      System.out.println(x5); // 10.25 ->10
      d10 = 10.99;
      x5 = (int) d10;
      System.out.println(x5);// 10.99 -> 10

      // overflow + for loop (careless mistake)
      //for (int i=0; i <2_200_000_000L; i++){
        //System.out.println("hello");
      

     byte b20 = 7;
     int i20 = 8;
     boolean result = b20 <i20;//true
     System.out.println("boolean result: " + result);

      // byte b21 = 128; //compile error , cannot overflow;
      int i21 = 128;
      byte b22 = (byte) i21; // overflow

      // 之前會用 -2_100_000_000, 宜家有黎個方法代替
      int[] arr2 = new int[3];
      max = Integer.MIN_VALUE; // instead of -2.1b
      for (int i = 0 ; i <arr2.length ; i++){
        if (arr2[i] > max){
          max = arr2[i];
        }
      }

      long l2 = Long.MIN_VALUE; //-9223372036854775808
      System.out.println(l2); // 2^-63


  }
  
}
