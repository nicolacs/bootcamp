public class DemoString {
  public static void main(String[] args) {
    String s = "hello";
    String s2 = "hello";
    String s3 = new String("hello");

    // "==" always checking if they are in the same address
    System.out.println(s == s2); // true
    System.out.println(s == s3); // false

    Integer i = 13;
    Integer i2 = 13;
    Integer i3 = new Integer(13);
    System.out.println(i == i2); // true
    System.out.println(i == i3); // false
  }
}