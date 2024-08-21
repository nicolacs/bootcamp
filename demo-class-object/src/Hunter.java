import java.math.BigDecimal;

public class Hunter {
  public static String GameName = "Monster Hunter PS5";
  public String HunterName;
  public String Skill;
  public int Hp;
  public double BasicAttackPower;
  public int Level;

  public String getName(){
    return this.HunterName;
  }

  public Hunter(String HunterName, int Level, String Skill, int hp, double BasicAttackPower){
    this.HunterName = HunterName;
    this.Level = Level;
    this.Skill = Skill;
    this.Hp = hp;
    this.BasicAttackPower = BasicAttackPower;
  }

  public String Info() {
    return "Hunter (" + "Hunter : " + this.HunterName + " , HP : " + this.Hp
        + " , Level : " + this.Level + " , Skill : " + this.Skill
        + " , Basic Power : " + this.BasicAttackPower + " , " + GameName + ")";
  }

  public double AttackPower(){
    //BigDecimal total = BigDecimal.valueOf(0.0);
    //total = this.Level.multiply(this.BasicAttackPower);
   return this.Level * this.BasicAttackPower;
  }
  

  public static void main(String[] args) {
    Hunter Hunter1 = new Hunter("Ariel", 3, "Double Gun", 300, 150);
    Hunter Hunter2 = new Hunter("Clive", 5, "Glaive", 550, 300);

    System.out.println(Hunter1.Info());
    System.out.println(Hunter2.getName() +"'s attack power are " +Hunter2.AttackPower());


  }  
}
