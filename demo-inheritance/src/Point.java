import java.util.Objects;

public class Point {
  private int x;
  private int y;

  public Point(int x, int y){
    this.x = x;
    this.y = y;
  }
  public int getX(){
    return this.x;
  }

  public int getY(){
    return this.y;
  }
  
@Override
  public boolean equals(Object obj){
    if ( this == obj)
      return true;
      if (!(obj instanceof Point))
      return false;
      Point point = (Point) obj;
      return Objects.equals(this.x, point.getX()) 
      && Objects.equals(this.y, point.getY());
  }
  public static void main(String[] args) {
    // before override equals(), it is false
    System.out.println(new Point(1, 1).equals(new Point(1, 1)));// 

    Person person = new Person(new Point(1, 2));

    // asking if the person located in Point (1,2)
    // I'm not asking if the point objects
    if (person.getPoint().equals(new Point(1, 2))); { //true
      System.out.println("right");

    }
  }
}