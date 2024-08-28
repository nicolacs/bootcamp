import java.math.BigDecimal;
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



      /////Week 3 要攪掂 4樣野:  static final 係OBJ+公家唔俾改, static 唔係OBJ+係外面, final(belongs to OBJ), instance variable ->可以get (non-static, non final) 
      //  BigDecimal
      // Class 係一個工具, 俾一個Obj ref 可以做到更多既事, 否則 int x 就係形容緊一件事
      //public String toString(){
      //  return "Deck(" + "cards= " + Arrays.toString(this.cards) + ")";
      //}
      //Order.java 入面add & remove items 要識
      // "==" 係用黎check address, 全世界enum 都用 == 黎check係唔係一樣

      BigDecimal.valueOf(0.3);
      //int value = new Random().nextInt(5)+1; //1-5


      /// Example about immutable, 唔係修改自己 , new左個新既STRING出黎俾你(個METHOD)去做野. 但我自己本身有個底 ( Note: week 3/ Immutability in OOP)
      String s = "hello";
      s = s.concat(" world"); // one OBJref, two OBJs

      String s2 = s.concat("world");// String Obj s won't change (Two reference, Two Objs)





    }
}