package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ball implements Comparable<Ball>{
    private Color color;
    private Ball ball;
    public int value;

    public Color getColor(){
        return this.color;
    }

    public Ball(Color color){
        this.color = color;
    }

    @Override
    public int compareTo(Ball ball) {
        return ball.getColor().getValue() < this.getColor().getValue() ? 1: -1; 
    }

    @Override
    public String toString(){
        return "Ball("
            +"color=" + this.color
            + ")";
    }

    // List<Ball> -> ordering
    // GREEN -> RED -> YELLOW

    //!!! Vincent's Approach
    // @Override
    // public int compareTo(Ball ball) {
    //   // this (-1) vs ball (1)
    //   if (this.color == Color.GREEN || ball.getColor() == Color.YELLOW)
    //     return -1;
    //   if (this.color == Color.YELLOW || ball.getColor() == Color.GREEN)
    //     return 1;
    //   if (this.color == Color.RED) {
    //     if (ball.getColor() == Color.GREEN)
    //       return 1;
    //     return -1;
    //   }
    //   if (ball.getColor() == Color.RED) {
    //     if (this.color == Color.GREEN)
    //       return -1;
    //     return 1;
    //   }
    //   return -1;
    // }
  
    // @Override
    // public String toString() {
    //   return "Ball(" //
    //       + "color=" + this.color.name() //
    //       + ")";
    // }

    public static void main(String[] args) {
      
        

    }
    
}
