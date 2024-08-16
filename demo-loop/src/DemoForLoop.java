public class DemoForLoop {
  public static void main(String[] args) {
    int x = 3;
    x *= 3;
    x *= 3;
    x *= 3;
    System.out.println(x);//81

    ////////////////To use Loop instead of repeat and repeat
    int y = 3;
    for (int i = 0 ; i < 3 ; i++ ){ //(counter intialization ; continue condition ; counter +1 )
      y = y * 3;
      }
      System.out.println(y);//81
      // Step 1: int 1 =0
      // Step 2: i < 3?  -> true  ,check緊 i是否 <3
      // Step 3: y = y * 3  //y=9
      // Step 4: i++ -> 1  //load左1次
      // Step 5: i < 3 -> true//仲有qouta load
      // Step 6: y = y *3  //load -> 9 *3 =27
      // Step 7: i++ -> 2  //load左2次
      // Step 8: i < 3 -> true//仲有qouta load
      // Step 9: y = y * 3   //load -> 27 *3 =81
      // Step 10: i++ -> 3  //load左3次
      // Step 11: i < 3 -> false //冇qouta load lu
      // Step 12: Exit the loop


      //Example 1
      // Print 5 times Hello World

      for (int i = 0 ; i < 5 ; i++){ // print 5 times  -> 0,1,2,3,4
        System.out.println("Hello World");
      }

      // Example 2
      // We can use i for other purpose.
      for(int i = 0 ; i <6 ; i++){
        System.out.println(i);
      }

      //Example 3
      // Print all odd numbers between 0 - 10
      for (int i = 0 ; i < 11 ; i++){ // 0,1,2,3,4,5,6,7,8,9,10 -> 11 times
        if (i % 2 == 1){
          System.out.println(i);  //lines 44&45 run 11 times // 1 3 5 7 9
        }
      }

      // Example 4
      // 10
      // 8
      // 6
      // 4
      // 2
      //////Approach 1
      for (int i = 10 ; i > 0 ; i--){ //10,9,8,7,6,5,4,3,2,1
        if (i % 2 == 0){
          System.out.println(i);
        }
      }

       //////Approach 1
      for (int i = 0 ; i <10 ; i++)
        if (i % 2 ==0){
          System.out.println( 10 - i );
        }

        System.out.println("----------Example 5 ---------");
      // Example 5
      //
      String str = "abcdefghijk" ; // the index of last character 'k' is length() -1
      // "acegik"
      // Loop, charAt
      String str2 = "";
      for (int i =0 ; i < str.length() ; i++){  //Correct
        //if (str.charAt(str.length() % 2 == 1))  //wrong
        if (i % 2 == 0){
          str2 += str.charAt(i); // same as str2 = str2 + str.charAt(i); // str2本身冇野, loop完第1次變左 a , 再重新定義 str2 再 loop, 多左 c, 變左 ac....
        }
      }
        System.out.println(str2);

      // Example 6 - counting
      String s2 = "bbaaaacceeeef";
      // 
      char target = 'e';
      int count = 0;
      // Output: The number of character e is 3
      for (int i = 0; i < s2.length() ; i++){ //Correct
       if (s2.charAt(i) == target){  // count 個條件出現幾多次
        count++;
       }
      }
      System.out.println("The number of character " + target + " is " + count );


       // Example 7  - counting
       // 1-100
       // How many numbers can be divided by 3 or divided by 4?
       int num = 0;
       for (int i = 1 ; i < 101 ; i++){
        if (i % 3 == 0 || i % 4 == 0){
          num++;
        }    //correct but vincent use int count only.
       }
       System.out.println("There are " + num + " numbers can be divided by 3 or divided by 4.");

       // Example 8
       System.out.println("---------Example 8----------");
       // 1 - 50
       // Find the total number, which sum up all odd number and subtract all even numbers 
       //between 1 - 50
       int total = 0;
       for (int i = 1 ; i < 51 ; i++){
        if (i % 2 == 1){
          total += i;
        }else {
          total -= i;
        }
       }
 System.out.println(total);//-25

       //Example 9
       String s3 = "abcdxyzijk";
       // Print the index of j. If j is not found, print -1
       boolean found = false;
       int position = -1;
       for (int i = 0 ; i < s3.length() ; i++){  // >>>黎兩行係good 組合
        if (s3.charAt(i) == 'j'){
          found = true;
          position = i;
        }
       }
       int idx = -1;
       if (found){
        idx = position;
       }
       System.out.println("Position of j = " + idx);

       // **********Alternative**********indexOf() 搵位置
       s3 = "abc";
       System.out.println(s3.indexOf('j'));

       System.out.println("----------Example 10 ---------");
       // Example 10
       String s4 = "hello";
       //check if the last character is o -> true
       char targetEndWith = 'o';
       System.out.println(s4.charAt(s4.length()-1) == targetEndWith);   // 基礎

       // **********Alternative**********endsWith("--") & startsWith("--") 搵最後, 最頭值
       System.out.println(s4.endsWith("o"));//true
       System.out.println(s4.startsWith("he"));//true
       System.out.println(s4.startsWith("eh"));//false

      System.out.println("*********substring*********");
       // *********substring********* 搵中間既值
       String s5 = "abcdefghik";
       // Find "def"
       System.out.println(s5.contains("def"));//true
       // Find the index between 2 and 4
       System.out.println(s5.substring(0, 3));//cde , for substring last index is always -1. So, if you want to find index no.4, you entre 5
       System.out.println(s5.indexOf("abc"));// 0
       System.out.println(s5.substring(0, 3));///abc

       System.out.println(s5.substring(s5.length() -1, s5.length()));//k, last character
       System.out.println(s5.substring(0,1));// print first character a

       System.out.println("----------Example 11 ---------");
      // Example 11
      String s6 = "abcdefghik";
      String subString = "def";
      // use for loop
      // Don't use indexof() or contains()
      //output: Found or not found
      //for (int i = 0 ; i < s6.length() ; i++)     !!!!!!BOSS!!!!!!  Homework

      System.out.println("----------Nested Loop ---------");
      // Nested Loop
      for (int i = 0; i<3 ; i++){// outer loop 0,1,2
        for (int j=0 ; j<2 ; j++){ // inner loop 0,1
          System.out.println("i= " + i + " , j= " + j);
        }
      }
      //i= 0 , j= 0
      //i= 0 , j= 1
      //i= 1 , j= 0
      //i= 1 , j= 1
      //i= 2 , j= 0
      //i= 2 , j= 1

      // Exampe 12
      // break  =離開個logic 既意思  >> Vincent suggest 寫最尾, contiune 寫最頭
      // break 同 continue 都係做緊current loop only, let's say: 如要break曬2個nested loop, 要入面,出面都break1次
      for (int i=0 ; i<5 ; i++){
        System.out.println("hello");
        if (i >=3){
          break;
        }
      }   //print hello 0,1,2,3  ->4times

      // Example 13
      // break - searching - how to use breck to find k
      String s7 = "ijkdef";
      found = false;
      for (int i =0 ; i < s7.length() ; i++){
        if (s7.charAt(i) == 'k'){
          found = true;
          break; // break the loop
        }
      }


      // Example 14
      // continue - skipsome patterns
      // print odd number in 1 -50
      for (int i=0 ; i <50 ; i++){ //0 - 49
        if (i % 2 == 0){
          continue; // skip the rest of code for current iteration
        }
        if (i>30){ //加左黎2句, 只會計到30, 因當 i >30 就俾你停左
          break;
        }
        System.out.println(i); //odd number
      }


      // Example 15
      // *****
      for (int i = 0 ; i<5 ; i++){
        System.out.println("*****");
      }
      System.out.println("");

       System.out.println("---------Example 16 - Nested Loop---------");
      // Example 16  try output:
      // *****   -> i=0
      // ****    -> i=1
      // ***
      // **
      // *

      // Nested Loop (i and j)
      for (int i=0 ; i < 5 ; i++){ //control the number of rows
        for (int j=0 ; j< 5-i ; j++){ // every row
          System.out.print("*");
        }
      System.out.println("");
    }   // OK, same as Vincent
    System.out.println("---------Example 17 - Nested Loop---------");
    // Example 17  try output:
     // ******
     // ****
     // **
    for (int i=0 ; i < 6 ; i=i+2){
      for (int j=0 ; j< 6-i ; j++){
        System.out.print("*");
      }
    System.out.println("");
  }

    //infinity loop  錯誤的loop
    // for ( ; ; ) {
    // System.out.println("hello"); 會無限print




     System.out.println("~~~~~~~ Challenge in Note - Loop~~~~~~~");
     // use my method not the note's answer to get the same output
     String searchMe = "peter piper";
     int num5 =0;

     for (int i =0 ; i< searchMe.length() ; i++){
      if (searchMe.charAt(i) == 'p' ){    //correct, same
        num5++;   //correct, same
      }
     }
     System.out.println("I can found " + num5 + " p in searchMe"); //ok, get the same answer in note



  }
}
