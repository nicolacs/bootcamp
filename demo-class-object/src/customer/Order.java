package customer;

import java.util.Arrays;

public class Order {

  private Item[] items; // one to many
  private String currency; //one to one
  

  public Order(){
    this.items = new Item[0]; //fixed length
  }
  //public Order(Item[] items){
    //this.items = items;
  //}

  // Method Signature: method name + parameter list(number + type)
  public void add(Item item){
    Item [] newItems = new Item[this.items.length +1];
    for(int i=0 ; i < this.items.length ; i++){
      newItems[i] = this.items[i];
    }
    newItems[newItems.length -1] = item;
    this.items = newItems ;
  }

  //public void remove/////copy note



  public Item[] getItems(){
    return this.items;
  }

  public long totalValue() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'totalValue'");
  }



  //private double priceAmounts;
  //private int pcs;
  
  //public Order(int pcs){
  //  this.items = new Item[pcs.length()];
 // }
  
  //public static void main(String[] args) {
 // Order order1 = new Item[];
  //}
}

