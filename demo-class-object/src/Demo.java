public class Demo {
 public static void main(String[] args) {
    // memory
    int x =3;

    // arr -> is object ref -> saving array object address
    // int arr object (length =2)
    int[]arr = new int [2];

    // cat -> is object ref -> saving cat object address
    // Cat object is in heap memory
    Cat cat = new Cat(); 
    //System.out.println(cat.name); // NOT OK, because "name" is private in Cat.java

    cat.setName("John");
    System.out.println(cat.getName()); // OK, 用左工具去攞資料

    //易可以開array
    Cat[] cat3 = new Cat[3];

    // if the attribute is private, you cannot read the attribate directly by obj ref.
    // For example, cat.name  & cat.color

    Cat cat2 = new Cat();
    String name = "Peter";
    cat2.setName(name); 
    System.out.println(cat2.getName());

    cat.getName(); // return this.name
    cat2.getName(); // return this.name

    //System.oyt.println(this.name);  You cannot use "this" in main
    System.out.println(cat2.getName());// need to get the name by .getName()

    // Try to set color and get color
    cat.setColor("BLACK");
    // getColor
    System.out.println(cat.getColor());//BLACK

    System.out.println(cat.getAge());// Not yet set -> 0
    cat.setAge(6);
    System.out.println(cat.getAge());// 6

    Staff staff = new Staff(); // 舊 Staff(), 其實係一個constructor 
    staff.setHeight(1.72);
    staff.setWeight(51.5);
    // getBMI() -> class encapsulate
    System.out.println(staff.getBMI());//17.408058409951327

    Staff staff2 = new Staff("Jenny", "Chan", 1.65, 60.2);
    System.out.println(staff2.getBMI());// 22.11202938475666
    




 } 
}
