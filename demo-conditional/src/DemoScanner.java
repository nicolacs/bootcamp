import java.util.Scanner;

public class DemoScanner {
  public static void main(String[] args){
    // User input
    Scanner s = new Scanner(System.in);
    System.out.println("Please input a number: ");
    int input = s.nextInt(); 
    // terminal will stop at "s.nextInt()", and wait for a user inoput
    // After capturing the user input -> assignment

    //System.out.println("The user input= " + input);
    // the user input is an odd number
    // the user input is an even number
    if (input % 2 == 0){
      System.out.println("The user input is an even number");
    }else {
      System.out.println("The user input is an odd number");
    }
    // Example 2
    // "Choose an option: 1) Deposit 2) Withdraw 3) Check Balance"
    // if user input 1
       // Question ->"Please input the deposit amount:"
         // Print out the amount after deposit
    // if user input 2
      // Question ->"Please input the withdrawal amount:"
        // Print out the amount after withdrawal
    // if user input 3
      // Print out current balance
    double currentBalance = 300.0;
    Scanner b = new Scanner(System.in);
    System.out.println("Choose an option: 1) Deposit 2) Withdraw 3) Check Balance");
    int option = b.nextInt(); 

    if (option == 1){
      System.out.println("Please input the deposit amount:");
      Scanner c1 = new Scanner(System.in);
      double deposit = c1.nextDouble();
      double afterDeposit = currentBalance + deposit;
      // c1.close();
      System.out.println("The Amount After Deposit: " + afterDeposit);
    }else if (option == 2){
      System.out.println("Please input the withdrawal amount:");
      Scanner c2 = new Scanner(System.in);
      int withdrawal = c2.nextInt();
      double afterWithdrawal = currentBalance - withdrawal;
      System.out.println("The Amount After Withdrawal: " + afterWithdrawal);
    }else {
      System.out.println("Current Balance : " + currentBalance);
    }
    

  }
  
}
