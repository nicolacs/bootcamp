public class DemoIfTryExampleMyself {
  public static void main(String[] args) {
    int x = 30;

    if (x >= 30) {
      System.out.println("x >=30");// print
    } else {
      System.out.println("x < 30");
    }
    // Example 3 //OK, <5min done
    int a = 10;
    int b = 20;
    // "20 is larger than 10."

    int min = 0;
    int max = 0;
    if (a > b) {
      max = a;
      min = b;
    } else {
      max = b;
      min = a;
    }
    System.out.println(max + " is larger than " + min);

    // Example 4 //OK, <5min done
    String day = "Wednesday";

    // "Sunday is weekend."
    // "Saturday is weekend."
    if (day.equals("Sunday") || day.equals("Saturday")) {
      System.out.println(day + " is weekend.");
    } else {
      System.out.println(day + " is weekday.");
    }

    // Example 5 //OK, <5min done
    int num = 11;
    // 7 is an odd number.
    // 8 is an even number.
    if (num % 2 == 0) {
      System.out.println(num + " is an even number");
    } else {
      System.out.println(num + " is an odd number.");
    }

    // Example 6 //OK, <5min done
    String str = "helloABCDEFGHIJK";
    // Sample output:
    // The last character of str is K
    // This is an empty String
    if (str.length() == 0) {
      System.out.println("This is an emtry String");
    } else {
      System.out.println(
          "The last character of str is " + str.charAt(str.length() - 1));
    }

    // Example 7 //OK, <5min done
    String S = "abc"; // output cba
    System.out.println("" + S.charAt(2) + S.charAt(1) + S.charAt(0));

    // Example 8 //OK, <5min done
    // Leap Year
    // 1. Divided by 4
    // 2. Not Divided by 100
    // 3. Or Divided by 400

    int year = 2100;
    // Sample output
    // 1900 is not a leap year. //2000 is a leap year. //2004 is a leap year.
    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
      System.out.println(year + " is a leap year.");
    } else {
      System.out.println(year + " is not a leap year.");
    }

    // Example 9 //OK , <8min done
    int age = 17;
    boolean isCitizen = false;
    // age 18 or above and he is a citizen -> eligible to vote.
    // Sample Output
    // Eligible to vote.
    // Not eligible. Age < 18.
    // Not eligible. Not a citizen.
    // Not eligible. Age < 18 and not a citizen.
    if (age >= 18 && isCitizen == true) {
      System.out.println("Eligible to vote.");
    } else if (age >= 18 && isCitizen == false) {
      System.out.println("Not eligible. Not a citizen.");
    } else if ((age < 18 && isCitizen == true)) {
      System.out.println("Not eligible. Age < 18.");
    } else {
      System.out.println("Not eligible. Age < 18 and not a citizen.");
    }

    // Example 10 //OK , <8min done
    double totalPurchase = 620.0;
    // >= 500.0 -> 20% off
    // >= 200.0 -> 10% off
    // < 200.0 -> no discount
    // output: discount and amount to pay
    double discount = 0.0;
    if (totalPurchase >= 500) {
      discount = totalPurchase * 0.2;
    } else if (totalPurchase >= 200) {
      discount = totalPurchase * 0.1;
    } else {
      discount = 0;
    }
    System.out.println("Total Discount : $" + discount + " Amount to pay : $"
        + (totalPurchase - discount));

    // Example 11
    char c = 'c';
    // a e i o u -> vowel
    // Sample Output:
    // a is vowel.
    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
      System.out.println(c + " is vowel.");
    } else {
      System.out.println(c + " is conconant.");
    }

    // Example 12 (Using .contains())   //What's wrong?? 
    String password = "bc123456789012344%#$";
    // Strong password definition:
    // # ! @ $ -> special character
    // password length >= 12
    // output:
    // It is a strong password.
    // It is a weak password. No special character.
    // It is a weak password. Length < 12.
    if (password.contains("#") || password.contains("!")
        || password.contains("@")
        || password.contains("$") && password.length() < 12) {
      System.out.println("It is a weak password. Length < 12.");
    } else if (password.contains("#") || password.contains("!")
        || password.contains("@")
        || password.contains("$") && password.length() >= 12) {
      System.out.println("It is a strong password.");
    } else {
      System.out.println("It is a weak password. No special character.");
    }

    // Trying 2 "if" in Example 12  //OK, <15min
    String password1 = "Admi$567";
    if (password1.length() >= 12)
      if (password1.contains("#") || password1.contains("!")
          || password1.contains("@") || password1.contains("$")) {
       System.out.println("PW1 is a strong password.");
      } else{
        System.out.println("PW1 is a weak password. No special character.");
      }else {
        System.out.println("PW1 is a weak password. Length < 12.");
      }


  }

}
