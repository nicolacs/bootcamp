package sorting.formula;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import sorting.Color;

public class SBall implements Comparable<SBall>{
    private BallColor color;
    private String name;
    public SBall ball;

    public SBall(BallColor color, String name){
        this.color = color;
        this.name = name;
    }
    // getter
    public BallColor getColor(){
        return this.color;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public int compareTo(SBall ball){
        if (ball.getColor().getValue() == this.getColor().getValue()){
            return ball.getName().compareTo(this.getName());
        }
            return ball.getColor().getValue() < this.getColor().getValue()? 1:-1;
    }

    //!!! Vincent's Approach
    // @Override
    // public int compareTo(SBall ball) {
    //   // this (John) -1, ball (Benny) 1
    //   if (this.color == ball.getColor())
    //     return this.name.compareTo(ball.getName()) > 0 ? -1 : 1;
    //   // Different Color (Order: YELLOW -> GREEN -> RED)
    //   if (this.color == Color.YELLOW || ball.getColor() == Color.RED)
    //     return -1;
    //   if (this.color == Color.RED || ball.getColor() == Color.YELLOW)
    //     return 1;
    //   if (this.color == Color.GREEN) {
    //     if (ball.getColor() == Color.YELLOW)
    //       return 1;
    //     return -1;
    //   }
    //   if (ball.getColor() == Color.GREEN) {
    //     if (this.color == Color.YELLOW)
    //       return -1;
    //     return 1;
    //   }
    //   return -1;
    // }

    @Override
    public String toString(){
        return "SBall("
            +"Color= " + this.color
            +" Name= " + this.name
            + ")";
    }

    // sorting
    // 1. YELLOW -> GREEN -> RED
    // 2. If same color, name descending order.

    // After sorting:
    // i.e. SBall (Yellow, "John") -> SBall(Yellow, "Benny") -> SBall(Green, "Susan")

    public static void main(String[] args) {
        List<SBall> S1 = new ArrayList<>();  //!!! You don't have to use new ArrayList OBJ for Collections.sort()
        // As Collections.sort() doesn't use add(), remove() modification method.
        // .asList() 背後係冇method的, 係OBJ黎, 可read 唔可以write
        // 驚有野加既話, 直接用ArrayList都冇錯
        S1.add(new SBall(BallColor.GREEN, "AAA"));
        S1.add(new SBall(BallColor.YELLOW, "John"));
        S1.add(new SBall(BallColor.YELLOW, "Benny"));
        S1.add(new SBall(BallColor.RED, "John"));
        S1.add(new SBall(BallColor.GREEN, "ABC"));
        S1.add(new SBall(BallColor.RED, "Roy"));
        Collections.sort(S1);
        System.out.println(S1);



        
    }
    
}
