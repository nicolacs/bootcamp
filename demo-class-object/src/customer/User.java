package customer;

import java.math.BigDecimal;
public class User {
  // 首先整個人 -> User
  // 跟住俾個袋佢買野 -> Order Array
  // 有個袋先放野落去買 -> Order
  // Order 去present item

  // User input must be attributes, 一定要儲底客人俾既資料
  private Order[] orders; // Order[] object
  private String name;
  private String contact;

  public User() {
    this.orders = new Order[0];
  }
  //public User(Order[] orders){
    //this.orders = orders;
  //}
  public void add(Order order) {
    Order[] orders = new Order[this.orders.length + 1];
    for (int i = 0; i < this.orders.length; i++) {
      orders[i] = this.orders[i];
    }
    orders[orders.length - 1] = order;
    this.orders = orders;
  }

  public void signUp() {

  }
  public void login() {

  }
  public Order[] getOrders() {
    return this.orders;
}

  public boolean isVIP(){
    return this.totalTransactionAmount() >=100000;
  }
  // Unit Test
public double totalTransactionAmount(){       // 必須識, 輕鬆打
  BigDecimal total = BigDecimal.valueOf(0.0);
  for (int i = 0; i < orders.length; i++) {
    total = total.add(BigDecimal.valueOf(this.orders[i].totalValue())); //
  }
  return total.doubleValue();
}

public static void main(String[] args) {
  User john = new User(); // User -> Order Array -> Order

  john.totalTransactionAmount();

  if (john.isVIP()) {
  
  }

//  public String getName(){
//    return this.name;
//  }
//  public void setName(String name){
//    this.name = name;
//  }

//  public String getContact(){
//    return this.contact;
//  }
//  public void setContact(String contact){
//    this.contact = contact;
//  }
  }
}
