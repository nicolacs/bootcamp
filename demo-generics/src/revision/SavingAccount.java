package revision;

import java.math.BigDecimal;

public class SavingAccount extends Account {
    private static final String ACC_PREFIX = "001";

  // Saving Account -> prefix "001"
    // The first saving account -> "0010001"
    // The second saving account -> "0010002"
  // Commerical Account -> prefix "002"
    // The first Commerical account -> "0020003"
    // The second Commerical account -> "0020004"

    public SavingAccount() {
        super(ACC_PREFIX);
      }
    
        // handle attribute owner


        
      // @Override
      // public void credit(double amount) {
      //   double newBalance = BigDecimal.valueOf(this.getBalance()) //
      //       .add(BigDecimal.valueOf(amount)) //
      //       .doubleValue();
      //   this.setBalance(newBalance);
      // }
    
      // @Override
      // public void debit(double amount) {
      //   if (this.getBalance() < amount) {
      //     System.out.println("Insufficient Balance.");
      //     return;
      //   }
      //   double newBalance = BigDecimal.valueOf(this.getBalance()) //
      //       .subtract(BigDecimal.valueOf(amount)) //
      //       .doubleValue();
      //   this.setBalance(newBalance);
      // }
    }
