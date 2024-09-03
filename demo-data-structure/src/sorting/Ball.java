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

    public static void main(String[] args) {
      
        

    }
    
}
