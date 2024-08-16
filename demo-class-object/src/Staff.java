public class Staff {
  // 1. set attributes
  private int id;
  private double salary;
  private String firstName;
  private String lastName;
  private double height;
  private double weight;

  // 2. empty constructor implicitly exists
  public Staff() {
    System.out.println("Creating staff object...");
    this.salary = 20000; // 令起薪點by default 係20000.

    // You can perform any logic here..
    // for (){
    // if(){
    // }
    // }
  }

  // Class may have more than one constructor
  // constructor signature
  public Staff(String firstName, String lastName, double height,
      double weight) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.height = height;
    this.weight = weight;
  }

  // All arguments (parameters) constructor
  public Staff(int id, int salary, String firstName, String lastName, double height, double weight){
      this.id = id;
      this.salary = salary;
      this.firstName = firstName;
      this.lastName = lastName;
      this.height = height;
      this.weight = weight;

  // 3. instance method:
  // getter  //黎2個=直接存取
  // setter

  // private String fullName // 唔會開黎舊野
  // More instance methods
  // Presentation  -> 唔洗增加RAW DATA(attributes), 但可重新組織一個meaning 
  public String getFullName() {
    return this.firstName + " " + this.lastName;
  }

  public double getBMI() {
    return this.weight / Math.pow(this.height, 2.0);
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public double weight() {
    return this.weight;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double height() {
    return this.height;
  }

}
