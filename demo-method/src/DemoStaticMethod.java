public class DemoStaticMethod {
  public static void main(String[] args) {
     //public static 即係自定義method


    // Approach 1:
    // Bad -> careless mistake -> wrong formula
    double radius1 = 1.3;
    System.out.println(radius1 * radius1 *3.14);
    double radius2 = 1.4;
    System.out.println(radius2 * radius2 *3.14);
    double radius3 = 1.5;
    System.out.println(radius3 * radius3 *3.14);

    // Approach 2:
    // Bad -> Only you understand, but we need business meaning
    double[] radiusList = new double[] {1.3, 1.4, 1.5};
    for(int i =0; i<radiusList.length; i++){
      System.out.println("Approach 2: " + radiusList[i] * radiusList[i] * 3.14);
    }

      // Approach 3:
    // Bad -> 
    double[] radiusList2 = new double[] {1.3, 1.4, 1.5};
    // Sum up all circle area
    double totalArea = 0.0 ;
    for(int i =0; i<radiusList2.length; i++){
      totalArea +=calculateCircleArea(radiusList2[i]);
    }
      System.out.println("Approach 3: " + totalArea);
    
    //wrong: Approach to understand public static
     totalArea = 0.0 ;
    for(int i =0; i<radiusList2.length; i++){
      totalArea += abc(radiusList2[i]);
    }
      System.out.println("Approach to understand public static: " + totalArea);

      // Try encrypt 用下面return 計加密
      // input (parameters) ->"abc"
      String encrypted = encrypt("abc");
      System.out.println(encrypted); // 

      String original = decrypt(encrypted);
      System.out.println(original);// abc
      // if output type = string, then you must return String value inside the method
      
      //Static Method: 係一個公家既地方既工具
      // encrypt("abc") / System.out.println("hello")
      // charAt("abc", 1)

      //Instance Method:
      //"abc".charAt(0)  -> this is a Obj presentation

      //System.out.println(charAt("abc", 1));//b


      //
      System.out.println(sum(1,2));//
      System.out.println(sum(1.3, 2.2));// if i change line 130 to float . during compile time, checked that there is no sum (double, double) -> compile error
      System.out.println(sum(1L , 2L));//
      System.out.println(sum((byte)1, (byte)2));//
      System.out.println(sum(1.2f , 8.8f));//
      System.out.println(sum(1,2,3));// (int, int , int)
      print(5,6); // = sysout

      calculateCircleArea(3.0);
      calculateAreaForSquare(3.0);





      // 10.longValue(); //Not ok
      new Integer(10).longValue();// ok, longValue() -> instance method
    }

    // input String -> output String
    // Try encrypt 加密
  public static String encrypt(String password) {
    char[] characters = password.toCharArray();
    String encrypted = "";
    for (int i=0 ; i< characters.length ; i++){
      encrypted += (char)((characters[i] + 3) *2);
    }
    return encrypted;
  }

      // Try encrypt 加密 2nd approach
      public static String encrypt2(String password){
        char[] characters = password.toCharArray();
        String encrypted = "";
        int sum=0;
        for( int i =0 ; i <characters.length ; i++){
          sum += characters[i];
        }
      }

  //Try to decrypt 解密
  public static String decrypt(String encrypted){
    char[] characters = encrypted.toCharArray();
    String original ="";
    for(int i =0 ; i < characters.length ; i++){
    
    }

  }
   

    // input String, String -> output Integer
  
  // Static method is : if input is able to -> produce output
  // double java.lang.Math.pow(double a , double b)
  // Method name -> start with verb

  //input double, output double
  public static double calculateCircleArea(double radius){  //red colour is method name, usually start with verb
    // return radius * radius * Math.PI;
    // pow(base, index) -> base ^ index
    return Math.pow(radius, 2.0) * Math.PI;
  }

  public static double abc(double fg){  //red colour is method name, usually start with verb
    // return radius * radius * Math.PI;
    // pow(base, index) -> base ^ index
    return Math.pow(fg, 2.0) * Math.PI;
    // fg都只係一個唔影響CODE既名, 黎2行可以當作一倨說明書. 
    // 見line 31-35.跟本冇出現 fg.  但當 abc(obj), 即係用 obj去運算 return 既公式
  }
   

    // Method Signature = Method Name + Name & Type of Parameters
    // You can reuse the method name as long as they have diffeence method signature
  public static int sum(int x , int y){
    System.out.println("Method sum(int x, int y)");
    return x+y;
  }
  public static int sum(int x, int y, int z){
    System.out.println("Method sum(int x, int y , int z)");
    return x+y+z;
  }
  public static int sum(double x, double y){
    System.out.println("Method sum(double x, double y)");
    return (int) (x+y);
  }

  // Return Type : Total 17 : primitives + wrapper + String
  // void -> return nothing (No "return" keyword)
  public static void print(int x , int y){
    System.out.println("x= " + x);
    System.out.println("y= " +y);
  }

  

        // calculateSquareArea
        public static double calculateAreaForSquare(double length){
          return Math.pow(length, 2.0);
        }
}
