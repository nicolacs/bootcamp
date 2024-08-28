package shape;

import java.math.BigDecimal;

// The implications of "extends Shape": obtains color attribute
public class Circle extends Shape {  // Circle.class is a -> concrete class -> implement all abstract method
  private double radius;

  public Circle(double radius){
    super(); //唔寫都call左
    this.radius = radius;
  }

  public Circle(double radius, Color color) {
    super(color);
    this.radius = radius;
  }

  // Override -> 要用一樣既 Method Signature
  // "@" -> annotation (for compiler to read) 代碼, 可寫可唔寫
  @Override // This is to ask compiler to check if the parent class contains area()method.
           // if no, compile error.
  // If you do not annotate it, it still override the method, coz they are same method signature
  public double area() {
    return BigDecimal.valueOf(Math.pow(this.radius, 2.0)) //
        .multiply(BigDecimal.valueOf(Math.PI)) //
        .doubleValue();
  }

  public static void main(String[] args) {
    Circle circle = new Circle(3.5);
    System.out.println(circle.area()); // 38.48451000647496
  }
}