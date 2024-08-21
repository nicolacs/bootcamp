import java.util.Arrays;
public class AllMethod {
  public static void main(String[] args) {
      /////////////////將String 變 array, sysout array 做String///////////
      String str1 = "apple banana cherry";
      char[] strArray = str1.toCharArray();
      System.out.println(Arrays.toString(strArray));
      System.out.println(String.valueOf(strArray));

      // public static final...
      //



      /////Week 3 要攪掂 4樣野:  static final 係OBJ+公家唔俾改, static 唔係OBJ+係外面, final(belongs to OBJ), instance variable (non-static, non final) 
      //  BigDecimal
      // Class 係一個工具, 俾一個Obj ref 可以做到更多既事, 否則 int x 就係形容緊一件事
      //public String toString(){
      //  return "Deck(" + "cards= " + Arrays.toString(this.cards) + ")";
      //}





    }
}