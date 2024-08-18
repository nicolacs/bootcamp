package customer;

public class User {
  private Order[]orders;
  private String name;
  private String contact;

  public User(Order[] orders){
    this.orders = orders;
  }
  public Order[] getOrders() {
    return this.orders;
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
