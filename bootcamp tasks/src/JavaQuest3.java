import java.util.Scanner;

public class JavaQuest3 {
  /**
   * Expected Output:
   * 
   * Example 1:
   * Input a month number: 2 
   * Input a year: 2016 
   * 
   * February 2016 has 29 days
   * 
   * Example 2:
   * Input a month number: 12 
   * Input a year: 2014 
   * 
   * December 2014 has 31 days
   */
   // Program the number of days that the month of a year has.

  public static void main(String[] strings) {

    Scanner input = new Scanner(System.in);

    int numberOfDaysInMonth = 0;
    String monthOfName = "Unknown";

    System.out.print("Input a month number: ");
    int month = input.nextInt();

    System.out.print("Input a year: ");
    int year = input.nextInt();
    
    // Complete the switch statement
    switch (month) {
      case 1:
        monthOfName = "January";
        // Code here ...
        numberOfDaysInMonth = 31;
        System.out.println( monthOfName + year + " has " + numberOfDaysInMonth + " days.");
        break;
      case 2:
        monthOfName = "Feberuary";
        if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0 ){
          numberOfDaysInMonth = 29;
        }else {
          numberOfDaysInMonth = 28;
        }
        System.out.println(monthOfName + " " +year + " has " + numberOfDaysInMonth + " days.");
        break;
      case 3:
        monthOfName = "March";
        numberOfDaysInMonth = 31;
        System.out.println( monthOfName + " " +year + " has " + numberOfDaysInMonth + " days.");
        break;
       case 4:
        monthOfName = "April";
        numberOfDaysInMonth = 30;
        System.out.println( monthOfName + " " +year + " has " + numberOfDaysInMonth + " days.");
        break;
       case 5:
        monthOfName = "May";
        numberOfDaysInMonth = 31;
        System.out.println( monthOfName + " " +year + " has " + numberOfDaysInMonth + " days.");
        break;
      case 6:
        monthOfName = "June";
        numberOfDaysInMonth = 30;
        System.out.println( monthOfName + " " +year + " has " + numberOfDaysInMonth + " days.");
        break;
      case 7:
        monthOfName = "July";
        numberOfDaysInMonth = 31;
        System.out.println( monthOfName + " " +year + " has " + numberOfDaysInMonth + " days.");
        break;
      case 8:
        monthOfName = "August";
        numberOfDaysInMonth = 31;
        System.out.println( monthOfName + " " +year + " has " + numberOfDaysInMonth + " days.");
        break;
      case 9:
        monthOfName = "September";
        numberOfDaysInMonth = 30;
        System.out.println( monthOfName + " " +year + " has " + numberOfDaysInMonth + " days.");
        break;
      case 10:
        monthOfName = "October";
        numberOfDaysInMonth = 31;
        System.out.println( monthOfName + " " +year + " has " + numberOfDaysInMonth + " days.");
        break;
      case 11:
        monthOfName = "November";
        numberOfDaysInMonth = 30;
        System.out.println( monthOfName + " " +year + " has " + numberOfDaysInMonth + " days.");
        break;
      case 12:
        monthOfName = "December";
        numberOfDaysInMonth = 31;
        System.out.println( monthOfName + " " +year + " has " + numberOfDaysInMonth + " days.");
        break;}
        // The February has 29 days: (Every 4 years and the year cannot divded by 100)
        // or The year can divided by 400
        // otherwise the February should have 28 days only
        // how about other months, December?
  }

}