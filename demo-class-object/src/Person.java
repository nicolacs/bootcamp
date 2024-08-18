public class Person {
  private String name;
  private int age;

  // default empty constructor, only if you did not create another constructor
  // empty, all-args
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // You can just read the attribute from Obj, if there is no setter.
  // You cannot override/rewrite the attribute anymore after Obj creation.
  public String getName(){
    return this.name;
  }
  public int getAge(){
    return this.age;
  }

  // Testing , below is Memory Processing
  public static void main(String[] args) {
    // memory
    // When you create one all-arg constructor only
    // compiler would not create the empty constructor for you anymore
    // Person person = new Person(); //黎句而家係唔WORK, compile error

    Person person = new Person("John", 66);
    System.out.println(person.getName());
    System.out.println(person.getAge());

  }

}
