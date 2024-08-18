package customer;

public class Shopping {
  public static void main(String[] args) {
    // Cteate customer
    // Create Orders
    // Create items
    Item apple = new Item(10.99, 4, "" );
    Item orange = new Item(11.9, 2, " ");
    Item[] items = new Item[] {apple, orange};
    Order order = new Order(items);

    Item apple2 = new Item(10.99, 4,"");
    Item orange2 = new Item(11.9, 2,"");
    Item[] items2 = new Item[] {apple2, orange2};
    Order order2 = new Order(items2);

    User user = new User(new Order[] {order, order2});

  }
  
}
