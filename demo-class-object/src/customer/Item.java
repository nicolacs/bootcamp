package customer;

import java.math.BigDecimal;

public class Item {
  //public static Object newItems;
  private double price;
  private int quantity;
  private double discount;
  private String itemName;

  // Constructor
  public Item(double price, int quantity) {
    this.price = price;
    this.quantity = quantity;
  }


  // getter, setter
  public double getPrice(){
    return this.price;
  }

  public int getQuantity() {
    return this.quantity;
  }

  // BigDecimal (doube +-*% double, float....都必用BigDecimal)
  // Not a must to use BigDecimal (double * int)
  public double subtotal() {
    // int * double -> 1.0 * 0.2
    // double * double -> 0.1 * 0.2
    BigDecimal total = BigDecimal.valueOf(0);
    total = BigDecimal.valueOf(this.price) //
        .multiply(BigDecimal.valueOf(this.quantity));
    // multiply() -> return a new BigDecimal Object
    return total.doubleValue();
  }

  public static void main(String[] args) {
    int x = 2; // 2.0
    double y = 0.2;
    System.out.println(x * y);
    System.out.println(x + y);
    System.out.println(x - y);
  }

  
  
  //public int getquantity(){
  //  return this.quantity;
  //}
  //public void setquantity(int quantity){
  //  this.quantity = quantity;
  //}
  public double getDiscount(){
    return this.discount;
  }
  public void setDiscount(double discount){
    this.discount = discount;
  }
  public double totalPrice(){
    return this.price * this.quantity * this.discount;
  }
  public String getItemName(){
    return this.itemName;
  }
  public void setItemName(String itemName){
    this.itemName = itemName;
  }
}
