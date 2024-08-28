package shape;
//2D
//public class Shape {
  abstract class Shape {
  private Color color; // enum OBJ default value -> null

  public Shape() {
    
  };

  public Shape(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return this.color;
  }
  //public double area(){
  //return -1.0d;
  //}
  // After defining the class become abstract class, 
  // 1. we can create abstract method (without implementation)
   //2. connot create OBJ for Abstract Class
   //3. Abstract class can still hold its own attributes
   //4. why still have constructor? if we don't new Shape() -> 唔係用黎自己開new, 係俾個仔call黎用 (for child class to invoke呼喚)
  // 4. The constructor in abstract class is for child class to call
  // 5. by default, All abstract method must be public, no need to write public
   abstract double area();

  public static void main(String[] args) {
     //Shape shape= new Shape();
    //System.out.println(shape.area());// -1.0

  }
  
}
