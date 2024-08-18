public class Customer {
  private int age;

  public Customer(int age){
    this.age = age;
  }

  public void setAge(int age){
    this.age = age;
  }

  // Presentation
  public boolean isElderly(){
    return this.age >=66;
  }
  

  public static void main(String[] args) {
    Customer customer = new Customer(66);

    // for void method, there is no eturn value.
    // System.out.println(customer.setAge(70)); // !

    customer.setAge(70);
    System.out.println(customer.isElderly());// true

    // isElderly() is better design, because:
    // 1. method is for accuracy running repeatedly 可一致性正確地無限重複使用
    // 2. readability
    if (customer.isElderly()){ // customer.getAge() >=66 係冇咁好既寫法而且要再用既話要不停重寫同一句, 如打少個"=" 之類, 大量計算就錯曬

    }
  }
}
