package customer;

import java.math.BigDecimal;
public class User {
  // 首先整個人 -> User
  // 跟住俾個袋佢買野 -> Order Array
  // 有個袋先放野落去買 -> Order
  // Order 去present item

  // User input must be attributes, 一定要儲底客人俾既資料
  private Order[]orders;
  private String name;
  private String contact;

  //public User(Order[] orders){
    //this.orders = orders;
  //}
  public void add(Order order){
    Order [] orders = new Order[this.orders.length +1];
    for (int i=0 ; i< orders.length ; i++){
      orders[i] = 
    }
  }



  public Order[] getOrders() {
    return this.orders;
}

  public boolean isVIP(){
    return this.totalTransactionAmount() >=100000;
  }

public double totalTransactionAmount(){       // 必須識, 輕鬆打
  BigDecimal totalTran = BigDecimal.valueOf(0);
  for ( int i=0 ; i < orders.length ; i++ ){
    totalTran = totalTran.add(BigDecimal.valueOf(this.orders[i].subValue())); // Obj.add 等於 +=
  }
  return totalTran.doubleValue();
}




  public String getName(){
    return this.name;
  }
  public void setName(String name){
    this.name = name;
  }

  public String getContact(){
    return this.contact;
  }
  public void setContact(String contact){
    this.contact = contact;
  }


}
