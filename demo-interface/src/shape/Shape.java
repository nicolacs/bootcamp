package shape;

import java.math.BigDecimal;

public interface Shape {   
    // Interface 係唔應該係noun, Interface冇形容緊一個物件, 因為形容係靠attributes
    // 係俾個物件履行一D動作
    // 唔係真係唔得, 但唔係GOOD DESIGN
    // In this example, Shape should be desihned as abstract class

    double area(); // super abstract


//咁有其他attributes點算? 
//可能收ORDER 多左requesrment, 要多左color? 
//咁就要返返去每個形狀class 各自自己加attribute.

 // Interface still support Polymorphism
 public static double totalArea(Shape[] shapes) {
    BigDecimal bd = BigDecimal.valueOf(0.0);
    for (Shape shape : shapes) {
      bd = bd.add(BigDecimal.valueOf(shape.area())); //
    }
    return bd.doubleValue();
  }

  public static void main(String[] args) {
    // Interface still support Polymorphism
    Shape[] circles = new Shape[] {new Circle(2.0), new Circle(1.0)};
    System.out.println(Shape.totalArea(circles));

    Shape shape = new Circle(3.0); // OK
    shape.area();
    // shape.getColor();
    Circle circle = (Circle) shape;
    System.out.println(circle.getColor());

    Shape[] shapes = new Circle[] {new Circle(1.0), new Circle(3.0)};
  }
}