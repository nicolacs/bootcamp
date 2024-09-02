
import java.math.BigDecimal;

public class Hunter extends CreatureBasic {
  public static String GameName = "Monster Hunter PS5";
  // public String HunterName;
  public Skills skill;
  // public int Hp;
  // public double BasicAttackPower;
  // public int Level;

  public Hunter(String name, double basicHp, int level, double basicAttackPower,
      Skills skill) {
    super(name, basicHp, level, basicAttackPower);
    this.skill = skill;
  }

  public String Info() { // .toString()
    return "Hunter (" 
    + "Hunter : " + this.name 
    + " , HP : " + this.basicHp
    + " , Level : " + this.level 
    + " , Skill : " + this.skill
    + " , Basic Power : " + this.basicAttackPower 
    + " , " + GameName + ")";
  }

  

  public static void main(String[] args) {
    // Hunter Hunter1 = new Hunter("Ariel", 30, "Double Gun", 3000, 150);
    // Hunter Hunter2 = new Hunter("Clive", 50, "Glaive", 5500, 300);
    // Hunter Hunter3 = new Hunter("Tifa", 45, "", 4200, 200);

    // System.out.println(Hunter1.Info());
    // System.out.println(
    //     Hunter2.getName() + "'s attack power are " + Hunter2.AttackPower());



    /// set monster's attribute > attack and hp
    /// hunter attack > moster hp, boolean win = true
    ///
  }
}
