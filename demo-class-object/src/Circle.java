public class Circle {
  // label IS NOT object Ref 因為 static左
  // String Obj "LAB" exists, even though there is no Circle Obj created.
  private static String label = "LAB"; //大家都可以分享既String, in stack memory

  // Static method 好用之處之一,係大家會變既時候一齊變既變量, eg,公司名, all staff same co. name
  
  private double radius;

  public Circle(double radius){
    this.radius = radius;
  }
    public static String getLabel1(){ // label 1 係static
      return label;  
    }   // !!!!!!!static method係公家地方
       // 唔能夠call this. static method never return instance variable
        // public static double getRadius2() {
        // return this.radius;
        // }
    public String getLabel2(){
      return  label;
    }


  // Presentation
  public double area(){
    return Math.pow(this.radius, 2.0)* Math.PI;
  }

  public static void main(String[] args) {
    Circle circle = new Circle(2.0);
    System.out.println(circle.area()); //12.566370614359172

    // As lable is a static variable, so it does not belongs to any Circle obj
    // Way to get static method: //this is a 公家既工具, 可以直接用class.名去用method
     // Every circle object has getLabel2() method
     new Circle(3.3).getLabel2(); // return static variable
     new Circle(4.5).getLabel2(); // return static variable
     new Circle(10.2).getLabel2(); // return static variable
     new Circle(20.9).getLabel2(); // return static variable
 
     new Circle(10.2).getLabel1(); // technical OK, but you should not call
                                   // static method in this way
                                   // we should call it by "Circle.getLabel1()"

  }
}
