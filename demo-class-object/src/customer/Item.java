package customer;

import java.math.BigDecimal;

public class Item {
  public static Object newItems;
  private double price;
  //private int quantity;
  private double discount;
  private String itemName;
  private int quantity;

  // Constructor
  public Item(double price, double discount, String itemName){
    this.price = price;
    this.discount = discount;
    this.itemName = itemName;
  }


  // getter, setter
  public double getPrice(){
    return this.price;
  }
  public void setPrice(double price){
    this.price = price;
  }

  // BigDecimal (doube +-*% double, float....都必用BigDecimal)
  public double subValue(){
    BigDecimal total = BigDecimal.valueOf(0);
    total = BigDecimal.valueOf(this.price).multiply(BigDecimal.valueOf(this.quantity));
    // multiply() -> return a new Obj
    return total.doubleValue();
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
