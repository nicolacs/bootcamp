import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) {
    // A special type in Java
    // Problem (double, float in Math Operation +, - ,*, /)
    System.out.println(0.2 + 0.1);// 0.30000000000000004
    System.out.println(0.2 * 0.1);// 0.020000000000000004

    // Here shows that 0.2+0.1 != 0.3
    double x = 0.2 + 0.1;
    if (x ==0.3){
      System.out.println("x = 0.3");
    }else{
      System.out.println("x != 0.3");
    }

      // BigDecimal (double)
      BigDecimal bd1 = new BigDecimal("0.2");
      BigDecimal bd2 = new BigDecimal("0.1");
      //instance method for Math operations
      System.out.println("~~~~~~~~~~~~~  +數  x.add(y) ~~~~~~~~~~~~~");
      double result = bd1.add(bd2).doubleValue(); //Need to use this method 處理+, - ,*, /
      System.out.println(result); //0.3

      // multiply *數
      System.out.println("~~~~~~~~~~~~~ multiply *數 ~~~~~~~~~~~~~");
      System.out.println(bd1.multiply(bd2).doubleValue()); // 0.02
      System.out.println(bd1.multiply(bd2).intValue());// 0

      //  divide /數
      System.out.println(bd1.divide(bd2).doubleValue()); 

      // subtract -數
      System.out.println(bd1.subtract(bd2).doubleValue()); //0.1

      // for most the cases, you should start with a double primitive
      bd1 = BigDecimal.valueOf(10);
      bd2 = BigDecimal.valueOf(3);
      System.out.println(bd1.divide(bd2, RoundingMode.HALF_UP).doubleValue()); // 3.0
      System.out.println(bd1.divide(bd2, 2, RoundingMode.HALF_UP)); //3.33333> 3.33
      System.out.println(bd1.divide(bd2, 2, RoundingMode.CEILING)); //3.33333> 3.34

      // 好多人鐘意以下類似寫法:
      //System.out.println(bd1.divide(bd2).setScale(2, RoundingMode.HALF_UP).doubleValue());

      // In java, 唔可以除0, 以下可避免除0
      double m = 0.0;
      if (m==0.0){
        result = 0.0;
      } else {
        result = bd1.divide(BigDecimal.valueOf(m), RoundingMode.HALF_UP).doubleValue();
      }

      System.out.println(BigDecimal.valueOf(3.441).setScale(2, RoundingMode.UP)); //3.45   就咁.UP 有數就+1
      System.out.println(BigDecimal.valueOf(3.455).setScale(2, RoundingMode.HALF_UP)); //3.46 4捨5入

      // equals() , 所有wrapper class 同Bigdecimal 都唔可以 >=, ==, <=
      System.out.println(BigDecimal.valueOf(10L).equals(BigDecimal.valueOf(10.0))); //false
      System.out.println(BigDecimal.valueOf(10.0).equals(BigDecimal.valueOf(10.0))); // true
      System.out.println(BigDecimal.valueOf(10L).doubleValue() == BigDecimal.valueOf(10.0).doubleValue()); // true

      // compareTo()
      System.out.println(BigDecimal.valueOf(10L).compareTo(BigDecimal.valueOf(10.0))); //0
      System.out.println(BigDecimal.valueOf(11).compareTo(BigDecimal.valueOf(10.0))); // 1
      System.out.println(BigDecimal.valueOf(9).compareTo(BigDecimal.valueOf(10.0))); // -1
  }
  
}
