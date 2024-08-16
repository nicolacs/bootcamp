public class Cat { // blueprint
  // attributes: 睇所需開需要既範圍屬性
  private String name; //指外界唔可以攞黎用, 要用工具先得
  private String color;
  private int age;

  // instance method (object method)
  // getter
  public String getName(){
    return this.name;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getColor(){  // Ok, same
    return this.color;
  }
  public void setColor(String color){  // Ok, same
    this.color = color;
  }
  public int getAge(){  // Ok, same
    return this.age;
  }
  public void setAge(int age){  // Ok, same
    this.age= age;
  }
}
