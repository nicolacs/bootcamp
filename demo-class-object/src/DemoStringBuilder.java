public class DemoStringBuilder {
  public static void main(String[] args) {
    String s = "hello";
     s += "!!!";   // this is a slow perfarmance
     System.out.println(s);// hello!!!

    // Solution (leetcode -> avoid to use String concat)
    // StringBuilder will solve the performance issue
     StringBuilder sb = new StringBuilder("hello");
     sb.append("!!!");  // revise its attribute value, and then return its address 所以唔洗寫 sb =...
     char last = sb.append("???").append("abc").charAt(sb.length() - 1);
     System.out.println(sb.toString()); // hello!!!???abc
     System.out.println(last); // c
     System.out.println(sb.substring(1, 3)); // el , return a new String
     System.out.println(sb); // hello!!!???abc

     System.out.println(sb.reverse()); // return a new String -> cba???!!!olleh
     System.out.println(sb); // revise itself
 
     // !!! Most of the String.class method exists in StringBuilder.class
     // 1. length()
     // 2. charAt()
     // 3. substring()
     // 4. indexOf()
     // etc ... no concat
     
    long startTime = System.currentTimeMillis(); //ms
    String s1 = "";
    for ( int i=0; i< 100_000 ; i++){
      //s1 += "a";
      s1 = s1.concat("a");
    }
    long afterTime = System.currentTimeMillis(); //ms
    System.out.println(afterTime - startTime); // 1100-1300ms

    startTime = System.currentTimeMillis();
    StringBuilder sb2 = new StringBuilder("");
    for (int i = 0; i< 100_000 ; i++){
      sb2.append("a");
    }
    afterTime= System.currentTimeMillis(); //ms
    System.out.println(afterTime - startTime); // 0 ms

    String s2 = "hellolllollklll";
    String s3 = s2.replace("lll" , "x"); // helloxollkx
    System.out.println(s3);
    System.out.println(s2.indexOf("lll")); // 5

  } 
}