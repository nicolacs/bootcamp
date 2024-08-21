package customer;
import java.math.BigDecimal;
import java.util.Arrays;

public class Order {
  private static int count = 0;

  private int id; // system generate id
  private Item[] items; // one to many
  private String currency; //one to one
  
  // constructor
  public Order(){ // {後面冇野, 因開新order 既人唔需要為張order入基礎資訊, 例如 order id. , 將會想買幾多件野而要俾幾多格arrays佢
    this.id = getId();  // 背後每張new order都有++count 一個新id
    this.items = new Item[0]; //fixed length, 加野落車仔先加一個位
  }
  //public Order(Item[] items){
    //this.items = items;
  //}

  // static method
  public static int getId(){
  return ++count;
  }

  // Method Signature: method name + parameter list(number + type)
  public void add(Item item){    // 冇static 就係instance method
    // Item[] newItems = new Item[this.items.length + 1];
    // for (int i = 0; i < this.items.length; i++) { // loop old array
    // newItems[i] = this.items[i];
    // }
    Item[] newItems = Arrays.copyOf(this.items, this.items.length + 1);// 黎行只係加array 既格, 未放野
    newItems[newItems.length - 1] = item; //黎行係放個item 入去最後一格
    this.items = newItems;  //更新左order入面個條array
  }

  public void remove(int index) { // i.e. length 4 -> length 3
    if (index > this.items.length - 1 && index >= 0)  // 大過item數量冇野減, 直接return nothing, 做完黎個指令
      return;          // 符合item 數量, 有野可以減就做野:
    Item[] newItems = new Item[this.items.length - 1];// 
    int idx = 0;
    for (int i = 0; i < this.items.length; i++) {
      if (i != index) {
        newItems[idx++] = this.items[i];
      }
    }
    this.items = newItems;
  }

  public Item[] getItems() {
    return this.items;
  }

  public double totalValue() {
    // double + double -> BigDecimal
    BigDecimal total = new BigDecimal(0.0);
    for (int i = 0; i < this.items.length; i++) {
      total = total.add(BigDecimal.valueOf(this.items[i].subtotal()));
    }
    return total.doubleValue();
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

