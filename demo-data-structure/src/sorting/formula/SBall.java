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

    //     return ball.getColor().getValue() < this.getColor().getValue()? 1:-1;
    // }
    // if ((ball.getName().compareTo(this.getName())) == 1)

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
        List<SBall> S1 = new ArrayList<>();
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
