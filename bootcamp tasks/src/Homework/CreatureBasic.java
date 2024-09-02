
import java.math.BigDecimal;

abstract class CreatureBasic {
    public String name;
    public double basicHp;
    public double basicAttackPower;
    public int level;


    public CreatureBasic(String name, double basicHp, int level,
            double basicAttackPower) {
        this.name = name;
        this.basicHp = basicHp;
        this.level = level;
        this.basicAttackPower = basicAttackPower;
    }


     double AttackPower(){
        return 1.0;
     } 
    

    public double Hp() {
        double totalHp = this.basicHp * this.level;
        return totalHp;
    }

}
