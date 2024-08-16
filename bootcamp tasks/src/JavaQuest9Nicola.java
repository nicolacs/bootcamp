public class JavaQuest9Nicola {
/**
 * Expected Output:
 * J
 * e
 * 3
 * 9
 * 10
 * ab c
 * VenturenixLAB, Coding
 * 19
 * ren
 * VENTURENIXLAB, JAVA
 * venturenixlab, java
 * V*NTUR*NIXLAB, JAVA!!!
 */
  public static void main(String[] args) {
    String str = "VenturenixLAB, Java";

    // prints J
    // prints e (the 1st e)
    // code here ...
    int target = 0;
    for (int i=0 ; i < str.length() ; i++){
      if (str.charAt(i) =='J'){
        target = i;
      }
    }
    System.out.println(str.charAt(target));
    System.out.println(str.charAt(1));

    // Use indexOf()
    // prints 3
    // prints 9
    // prints 10
    // code here ...//? What is the question asking about
    System.out.println(str.indexOf('t'));//??? like this? count myself?
    //if i use loop, i do need to write target == t...also count myself

    // Use String trim()
    String abc = "    ab c    ";
    // prints "ab c"
    System.out.println(abc.trim());

    // Use String replace() method
    // prints VenturenixLAB, Coding
    // code here ...
      abc= abc.replace(abc,str);
    System.out.println(abc);

    // int length()
    // prints 19
    // code here ...
    System.out.println(abc.length());

    // Use String substring(int start, int end)
    // prints "ren"
    // code here ...
    System.out.println("Using substring : " + abc.substring(5, 8));

    // print "VENTURENIXLAB, JAVA"
    // prints "venturenixlab, java"
    // code here ...
    System.out.println(abc.toUpperCase());
    System.out.println(abc.toLowerCase());

    // Method Chaining (one line to complete)
    // prints "V*NTUR*NIXLAB, JAVA!!!"
    // code here ...
    System.out.println(abc.replace("*","E") .concat("!!!"));
    System.out.println(abc.replace("*","E") + "!!!");

  }
}
