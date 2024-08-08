public class Demolf {
  public static void main(String[] args){
    int x = 30;
    
    if (x >= 30){
      System.out.println("x >=30");// print
    }else {
      System.out.println("x < 30");
    }

    boolean isXLargerThan30 = x >= 30; // true

    if (isXLargerThan30){
      System.out.println("x >= 30");// print
    }else {
      System.out.println("x < 30");
    }

    // 8 primitives, String (equals(), charAt(), length())

    // Example 1
    //1. Else-if  !!need to avoid event overlap!!
    int number = -3;
    if (number >= 0){
      System.out.println("The number is positive");
    }else if (number < 0){
      System.out.println("The number is negative");
    }else {
      System.out.println("The number is zero");
    }
    //"The number is positive"
    //"The nmber is negative"

    //Example 2  (Avoid overlap)
    int score = 85;
    if (score >= 90){
      System.out.println("A");
    }else if (score >= 80 && score < 90){
      System.out.println("B");
    }else {
      System.out.println("F");
    }

    // Example 3
    int a =10;
    int b =20;
    // "20 is larger than 10."

    int max;//declaration
    int min;
    if (a > b){
      max = a;
      min = b;
    }else{
      max = b;
      min = a;
    }
    System.out.println(max + " is larger than " + min + ".");


    //if (a <= 10 && b >=20){///wrong
      //System.out.println("20 is larger than 10.");///wrong
    //}else {///wrong
      //System.out.println("Wrong");///wrong
    //}

    //Example 4
    String day = "Wednesday";

    // "Sunday is weekend."
    // "Saturday is weekend."

    //Try Myself
    if ("Sunday". equals(day) || "Saturday". equals(day) ) {
      System.out.println( day + "is weekend");
    } else {
      System.out.println( day + " is weekday");
    }

    // Example 4 approach 2
    if ("Wednesday". equals (day) || "Monday". equals (day) || "Tuesday". equals(day) || "Thursday". equals(day) || "Friday". equals(day)){
      System.out.println( day + " is weekday.");
    }else {
      System.out.println( day + " is weekend");
    }

    //Example 5
    int num =11;
    // 7 is an odd number.
    // 8 is an even number.
    if (num % 2 > 0){ //Vincent's ans if (num % 2 ==1){
      System.out.println(num + " is an odd number.");
    }else {
      System.out.println(num + " is an even number.");
    }

    //Example 6
    String str = "helloABCDEFGHIJK";
    // Sample output:
    // The last character of str is o
    // This is an empty String
    int V = str.length() - 1;

    if (V <=0){
      System.out.println("This is an empty String" );
    }else {
      System.out.println("The last character of str is " + str.charAt(V) );
    }

    //Example 6 Vincent's approach:
    

    //Example 7
    String S = "abc";
    System.out.println("" + S.charAt(2) + S.charAt(1) + S.charAt(0)); //Correct

    // Example 8
    // Leap Year
    // 1. Divided by 4
    // 2. Not Divided by 100
    // 3. Or Divided by 400

    int year = 2003;
    //Sample output
    //1900 is not a leap year.
    //2000 is a leap year.
    //2004 is a leap year.

    if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0 ){ // Correct
      System.out.println( year + " is a leap year.");
    }else {
      System.out.println( year + " is not a leap year.");
    }

    //Example 8's Vincent's ans for sample output 2003 is not a leap year.
    int year1 = 1990;
    boolean isLeapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 ==0);
    boolean isLeap = false;
    if (year % 4 ==0){ //2004
      if (year % 100 == 0){
        if (year % 400 ==0){
          isLeap = true;
        } else {
          isLeap = false;

        }
      }
    }

    //Example 9
    int age = 17;
    boolean isCitizen = false;
    // age 18 or above and he is a citizen -> eligible to vote.
    // Sample Output
    // Eligible to vote.
    // Not eligible. Age < 18.
    // Not eligible. Not a citizen.
    // Not eligible. Age < 18 and not a citizen.

    if ( age >=18 && isCitizen == true){
      System.out.println(" Eligible to vote.");
    }else if ( age < 18 && isCitizen == true){
      System.out.println("Not eligible. Age < 18.");
    }else if ( age >= 18 && isCitizen == false){
      System.out.println("Not eligible. Not a citizen.");
    }else {
      System.out.println("Not eligible. Age < 18 and not a citizen.");
    }

    //Example 10
    double totalPurchase = 250.0;
    // >= 500.0 -> 20% off
    // >= 200.0 -> 10% off
    // < 200.0 -> no discount
    double discount = totalPurchase;
    if ( totalPurchase >= 500){
      System.out.println("Discount Amount= " + totalPurchase * 0.8);
    }else if ( totalPurchase >=200 && totalPurchase <500){
    System.out.println("Discount amount= " + totalPurchase * 0.9);
    }else {
      System.out.println(totalPurchase);
    }
    //double amounToPay = totalPurchase - discount;   ?????not yet finish
    //System.out.println("Amount to Pay= " + amountToPay);     ????not yet finish

    //Vincent's output
    double discount1 = 0.0d;
    if (totalPurchase >= 500.0){  // Correct, same
      discount1 = totalPurchase *0.8;
    }else if (totalPurchase >= 200.0 && totalPurchase < 500.0){ // Correct, same
      discount1 = totalPurchase * 0.9;
    }
    double amountToPay1 = totalPurchase - discount1;

    System.out.println("Discount amount= " + discount1);
    System.out.println("Amount to Pay= " + amountToPay1);


    //Example 11
    char c = 'c';
    //a e i o u -> vowel
    //Sample Output:
    // a is vowel.
    // c is consonant.

    if ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){ //Correct, same
      System.out.println( c + " is vowel.");  //Correct, same
    }else {
      System.out.println( c + " is consonant.");  //Correct, same
    }

    //Example 12 (Using .contains())
    String password = "Admin1234567#";
    // Strong password definition:
    // # ! @ $ -> special character
    // password length >= 12

    // It is a strong password.
    // It is a weak password. No special character.
    // It is a weak password. Length < 12.
    if (password.length() >=12 && password.contains("#") || password.contains("!") ||password.contains("@")|| password.contains("$")){
      System.out.println("It is a strong password.");
    }else if (password.length() <12 && password.contains("#") || password.contains("!") || password.contains("@")|| password.contains("$")){
      System.out.println("It is a weak password. Length < 12.");
    }else {
      System.out.println("It is a weak password. No special character.");
    }
        //Vincent's output1
        String password1 = "Admin1237#";
        if (password1.length() >= 12)
          if (password1.contains("#") || password1.contains("!") ||password.contains("@")|| password.contains("$")){
          System.out.println("It is a strong password.");
          } else {
          System.out.println("It is a weak password. No special character.");

        } else {
          System.out.println("It is a weak password. Length < 12.");
        }
      }

     // Vincent's output2
    boolean withoutSpecialCharacter = false 
    if (password.length()>=12)
          withoutSpecialCharacter = !password.contains("#")// !password.contains("#") 同 password.contains("#") == false
            && !password.contains("!")
            && !password.contains("@")
            && !password.contains("$")
        if (!withoutSpecialCharacter){
          System.out.println("It is a strong password.");
        } else {
          System.out.println("It is a weak password. No special character.");
        } else {
          System.out.println("It is a weak password. Length < 12.");
        }
        }

  ////////////////////////// Teaching//////////////////////////

  String s1 = "hello";System.out.println(s1.contains("ll"));// true
  System.out.println(s1.contains("lll"));// false
  s1="helloll";System.out.println(s1.contains("ll"));// true
  s1="Nicola Sin";System.out.println(s1.contains("cola"));
}

}
