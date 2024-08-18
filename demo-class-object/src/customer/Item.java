package customer;

public class Item {
  private double price;
  //private int quantity;
  private double discount;
  private String itemName;

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
