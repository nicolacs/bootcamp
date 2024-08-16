import java.util.Arrays;

public class DemoStringMethod {
  public static void main(String[] args) {
     // String Methods 可分為3大類
     // 1. Searching (contains, indexOf, lastIndexOf, endsWith, startsWith, equals, compareTo)
     // 2. Presentation (length, charAt, isEmpty, isBlank, substring, concat)
     // 3. Transform (replace, trim, toLowerCase, toUpperCase)


    // isEmpty() vs isBlank()
    String s1 = "hello";
    System.out.println(s1.isEmpty());//false
    System.out.println(s1.isBlank()); //false

    String s2 = "";
    System.out.println(s2.isEmpty());//ture
    System.out.println(s2.isBlank()); //true

    String s3 = " ";
    System.out.println(s3.isEmpty());//true
    System.out.println(s3.isBlank()); //false

    String s4 = " hello ";
    System.out.println(s4.isEmpty());//false
    System.out.println(s4.isBlank()); //false

    String s5 = "Hello";
    System.out.println(s5.toLowerCase());//hello
    System.out.println(s5); //Hello 重print s5 唔會都係細階, String 係每次獨立使用, 用完唔會改變原本
    System.out.println(s5.toUpperCase());//HELLO

    // indexOf()
    s5.indexOf('e'); //1
    System.out.println("indexOf()幾個用法" + s5.indexOf('E'));//-1 (case sensitive)
    System.out.println(s5.indexOf("ll")); //2
    System.out.println(s5.indexOf('e', 2));//-1 黎度 ,2 代表係邊度開始揾, 'e'係第1個位, 所以顯示 -1搵唔到
    System.out.println(s5.indexOf("ll, 3"));


    // lastIndexOf()
    System.out.println(s5.lastIndexOf('l'));//3
    System.out.println(s5.lastIndexOf("ll"));//2

    // +, +=
    // concat()
    String s6 = "hello";
    s6 = s6 + "!!!";

    String s7 = "hello";
    s7 += "!!!";

    String s8 = "hello";
    s8 = s8.concat("!!!");

    System.out.println("s6 " + s6 +" s7 "+ s7 +"  s8 " +s8);

    // startWith()
    // endWith()
    System.out.println(new String("bootcamp").startsWith("boot")); //true
    System.out.println(new String("bootcamp").indexOf("boot") ==0); // true

    System.out.println(new String("bootcamp").endsWith("boot")); //false
    //咁樣寫個bootcamp, 冇開一個String 裝住佢, 個"bootcamp" run完黎次就會消失左, 即用即棄左.

    // replace()
    String s9 = "hello!!!";
    s9 = s9.replace('!', '?'); // replace ! by ?
    System.out.println(s9);/// hello???

    s9 = "abcdef";
    s9 = s9.replace("bcd" , "ijk");
    System.out.println(s9); // aijkef

    System.out.println(s9.contains("ijk"));// true
    System.out.println(s9.contains("IJK"));// false
    System.out.println(s9.contains("bcd"));// false

    // trim()  -> remove leading & tailing spaces
    String s10 = "  Vincent Lau";
    s10 = s10.trim();
    System.out.println(s10); // "Vincent Lau"

    // 錯誤示範 , 唔可以用 ==
    String s11 = "abc";
    String s12 = "abc";
    System.out.println(s11 == s12); // true
    String s13 = new String("abc");
    System.out.println(s12 == s13); // this is false

    // compareTo() -> 8 Wrapper Class + String.class
    // a.compareTo(b) >0      -> a>b
    // a.compareTo(b) == 0    -> a==b
    // a.compareTo(b) <0      -> a<b

    // String -> >, <
    // Ascii
    System.out.println("abc".compareTo("bbc")); //-1
    System.out.println("bbc".compareTo("abc")); // 1
    System.out.println("abc".compareTo("acc")); //-1
    System.out.println("abc".compareTo("abc")); // 0

    char[] characters = "abc".toCharArray();  // auto CharArray
    System.out.println(Arrays.toString(characters));// [a,b,c]

    System.out.println("~~~Try abc -> cde~~~~");
    // "abc -> "cde
    // 已auto CharArray
    char c = ' ';
    String result = "";
    for (int i =0; i < characters.length ; i++){
      c = (char) (characters[i] +2); // 將char + 2 -> int
      result += c;  // String + char 
    }
    System.out.println(result); //cde


    String name = "VINCENT";
    // change it to "vincent" without toLowerCase()
    c = ' ';
    result = "";
    char[] names = name.toCharArray();
    for (int i=0 ; i < names.length ; i++){
      c =names[i];
      if (names[i] >= 65 && names[i] <=91){
        c = (char) (names[i] + 32);
      }
      result += c;
    }
       System.out.println("VINCENT to vincent : " + result);

      // indexOf() Example
       String jenny = "Jenny";
       // 2, not found -> -1
       char target = 'n';
       int idx = -1;
       for (int i = 0; i< jenny.length(); i++){
         if (jenny.charAt(i) == target){
          idx = i;
          break;
         }
       }
       System.out.println(idx);// 2

       // lastIndexOf()
       for (int i = jenny.length()-1 ; i >=0 ; i--){
        if (jenny.charAt(i) == target){
          idx = i;
          break;
        }
       }
       System.out.println("Using lastIndexOf() : " + idx);//3

  }
  
}
