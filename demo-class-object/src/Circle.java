public class Circle {
  // label IS NOT object Ref 因為 static左
  // String Obj "LAB" exists, even though there is no Circle Obj created.
  private static String label = "LAB"; //大家都可以分享既String, in stack memory
  
  private double radius;

  public Circle(double radius){
    this.radius = radius;
  }
    public static String getLabel1(){ // label 1 係static
      return label;  
    }   // !!!!!!!static method係公家地方, 唔能夠call this. static method never return instance variable
    public String getLabel2(){
      return  label;
    }


  // Presentation
  public double area(){
    return Math.pow(this.radius, 2.0)* Math.PI;
  }

  public static void main(String[] args) {
    Circle circle = new Circle(2.0);
    System.out.println(circle.area());

    // As lable is a static variable, so it does not belongs to any Circle obj
    // Way to get static method: //this is a 公家既工具, 可以直接用class.名去用method
    Circle.getLabel1(); //return static variable

    // in

  }
}
