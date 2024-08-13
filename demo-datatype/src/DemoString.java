public class DemoString {
  public static void main(String[] args){
    System.out.println("hello world!!!");
    // "hello world!!!!" -> String value

    // String is not a primitive!!!
    String s;
    s = "abc";

    String s2 = "def";// "def" is a String value, and then assign to String variable
    // String s3 = 3; 錯的, 3 is not string value
    // String s4 = ture; 錯的, true is not string value

    String s3 = "3"; // Its ok, but you cannot perform Math Operation
    s3 = s3 + 1; //append meaning, but not +1
    // +號係String 既世界只係合併既意思
    // String value + int value
    // String value + String value
    System.out.println(s3);// "31"

    s3 = s3 + true;
    System.out.println(s3);// "31ture"

    // In String, there is no -, *, /, %
    // Example 1
    int age = 40;
    String message = "I'm " + age + " years old.";
    System.out.println(message);// I'm 40 years old.

    // Example 2
    char grade = 'A';
    System.out.println("My grade of History is " + grade);
    // String + char -> String

    // +=
    //Try myself
    String t = "apple";
    String y = "pine";
    String message1 = y + t + " is a song";
    System.out.println(message1);

    // Vincent's example:
    String firstName = "Vincent";
    String lastName = "Lau";
    String fullName = ""; // empty String value

    fullName += firstName + " " + lastName;
    // fullName = fullName + firstName + " " + lastName;
    System.out.println(fullName); // Vincent Lau

    // Primitive -> Math Operation, Comparsion (>,<,>=,<=,==,!=)
    // String -> Not Primitive, we use method (tool) to compare their values
    // String 左邊叫 VARIABLE
    String s10 = "hello";
    String s20 = "hello";

    // equals()
    System.out.println(s10.equals(s20));//true

    boolean isValueSame = "abc".equals(s20);// false as asking is abc equal to hello, of couse not.

    System.out.println("~~~~chatAt()~~~~");
    // charAt()
    char result = s10.charAt(1);// 2nd char of String value
    System.out.println(result);// 'e' in s10 "hello",h is 0, e is 1, l is 2...
    System.out.println(s10.charAt(0));// h, as h is no.0 char
    // there are no -1 or negative to find out something, will be error 404
    // In case, s10 "hello" only have 0,1,2,3,4 total 5 index, if out of range, also runtime error
    // s10.charAt(1L); also wrong
    // s10.charAt(1.0); also wrong

    System.out.println(s10.charAt(2) == 'l');// true
    System.out.println(s10.charAt(2) != 'l');// false

    // length()
    //問緊一個value既長度, (唔洗再打野)
    System.out.println(s10.length());//5
    System.out.println(s10.length()>=5); //int 5>= 5? -> true


  }
  
}
