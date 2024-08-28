public class Square {
  private double length;
  //private String color;  黎個唔好用, 串錯字, 大楷RED細楷red
  private Colour color;

  public void Suqare(double length, Colour color){
    // 遲D學exception , length <0?會點
    this.length = length;
    this.color = color;
  }

  //Square.OfRed(3):
  public static Square ofRed(int length){
    return newSquare(length, Colour.ofRed());
  }

  public double getLength(){
    return this.length;
  }

  public Colour getColor(){
    return this.color;
  }

  public double area(){
    return BigDecimal.valueOf(this.length).multiply(BigDecimal(this.length)).doubleValue();
  }
  
  public static void main(String[] args) {
    Square s1 = new Square(4.0d, Colour.ofRED());
    System.out.println(s1.area());

    Square s2 = new Square(4.0d, Colour.ofRED()); // new Colour ("RED ")
    Square s3 = new Square(4.0d, Colour.ofRED());

    //  >>copy Note


    // Do we really need more than one Red Colour OBJ?



  }
}
