package Homework;
import java.math.BigDecimal;

public class Hunter {
  public static String GameName = "Monster Hunter PS5";
  public String HunterName;
  public String Skill;
  public int Hp;
  public double BasicAttackPower;
  public int Level;

  public String getName() {
    return this.HunterName;
  }

  public Hunter(String HunterName, int
   Level, String Skill, int hp,
      double BasicAttackPower) {
    this.HunterName = HunterName;
    this.Level = Level;
    this.Skill = Skill;
    this.Hp = hp;
    this.BasicAttackPower = BasicAttackPower;
  }

  public String Info() {   //  .toString()
    return "Hunter (" + "Hunter : " + this.HunterName + " , HP : " + this.Hp
        + " , Level : " + this.Level + " , Skill : " + this.Skill
        + " , Basic Power : " + this.BasicAttackPower + " , " + GameName + ")";
  }

  public double AttackPower() {  //revised with BigDecimal 25/8
     BigDecimal total = BigDecimal.valueOf((this.Level)*(this.BasicAttackPower));
    return total.doubleValue();
  }


  public static void main(String[] args) {
    Hunter Hunter1 = new Hunter("Ariel", 30, "Double Gun", 3000, 150);
    Hunter Hunter2 = new Hunter("Clive", 50, "Glaive", 5500, 300);
    Hunter Hunter3 = new Hunter("Tifa", 45, "", 4200, 200);

    System.out.println(Hunter1.Info());
    System.out.println(
        Hunter2.getName() + "'s attack power are " + Hunter2.AttackPower());



        /// set monster's attribute > attack and hp
        /// hunter attack > moster hp, boolean win = true
        /// 
  }
}
