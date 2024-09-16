package revision;
import java.math.BigDecimal;

public abstract class Account implements Creditable, Debitable {
    public static int count;
    private String accNo;
    private double balance;
    // add attribute owner;

    public Account(String prefix) {
      this.accNo = this.genAccNo(prefix);
      this.balance = 0.0;
    }

    // public Account(double balance) {   >>>>>已經冇用了
    //     // count++;
    //     // this.accNo = count; // or this.accNo= ++count;
    //     this.accNo = this.genAccNo();
    //     this.balance = balance;
    // }
    
      public double getBalance() {
        return this.balance;
      }
    
      public void setBalance(double balance) {  // setter -> primitve
        this.balance = balance;
      }
    
      public String getAccNo() {
        return this.accNo;
      }
    
   // handle null?
      public final void credit(Double amount) {
        if (amount == null)
        amount = 0.0;
      double newBalance = BigDecimal.valueOf(this.getBalance()) //
          .add(BigDecimal.valueOf(amount)) //
          .doubleValue();
      this.setBalance(newBalance);
    }
  
    public final boolean debit(Double amount) {
      if (amount == null)
        amount = 0.0;
      if (this.getBalance() < amount) {
        System.out.println("Insufficient Balance.");
        return false;
      }
      double newBalance = BigDecimal.valueOf(this.getBalance()) //
          .subtract(BigDecimal.valueOf(amount)) //
          .doubleValue();
      this.setBalance(newBalance);
      return true;
    }
    
      private String genAccNo(String prefix) {
        return prefix.concat(String.format("%03d", ++count));
      }
    
      public static void main(String[] args) {
        Account account = new SavingAccount();
        System.out.println(account.getAccNo()); // "001001"
    
        account.credit(100.0);
        account.credit(58.0);
        account.debit(150.0);
        account.debit(10.0); // Insufficient Balance.
        System.out.println(account.getBalance()); // 8.0
    
    
        Account account2 = new SavingAccount();
        System.out.println(account2.getAccNo()); // "001002"
      }
    }