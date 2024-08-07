public class DemoSwitch {
  public static void main(String[] args) {
    int age = 18;
    boolean isAdult = false;
    if (age >= 18){
      isAdult = true;
    }
    System.out.println("isAdult = " + isAdult);

    // 1. If you do not "break" the switch case, the flow will go through all cases.
    // 2. For each case, you can only define one value for checking. No range checking.
    // 3. Method "Switch" statement is only for finite scenario (For小數量既range)
    // 4. For "Switch", Java will check your value, it alerts when there is duplicated.
    // 5. Content are all means or, or, or,  no "and". That's why you need to write all scenario.
    switch (age){
      case 18:
        isAdult = true;
        System.out.println("18");
        break;
      case 17:
        isAdult = false;
        System.out.println("17");
        break;
      case 16:
        isAdult = false;
        System.out.println("16");
        break;
    }
    System.out.println("isAdult = " + isAdult);

    //Vincent's Sample
    String day = "Tuesday";
    switch (day){
      case "Monday":
        System.out.println("It is weekday");
      break;
      case "Tuesday":
        System.out.println("It is weekday");
      break;
      case "Wednesday":
        System.out.println("It is weekday");
     break;
     case "Thursday":
        System.out.println("It is weekday");
     break;
     case "Friday":
        System.out.println("It is weekday");
     break;
     default:
        System.out.println("It is weekend");
    }

  }
  
}
