
public class RunGame {
  

    public static void main(String[] args) {
      Monster M1 = new Monster("BlackDragon", 42000.0, 450.0, 50, Skills.TailWhip);
      Monster M2 = new Monster("SunBreak", 36000.0 , 350.0, 60, Skills.BreathAttacks);
      Monster M3 = new Monster("Nergigante", 38000.0, 250.0, 45, Skills.Roar);
      Monster M4 = new Monster("Zinogre", 35000.0, 550.0, 55, Skills.AreaDenial);

      System.out.println("M1 :"+M1.AttackPower());
      System.out.println("M2 :"+M2.AttackPower());
      System.out.println("M3 :"+M3.AttackPower());
      System.out.println("M4 :"+M4.AttackPower());


      Hunter H1 = new Hunter("Ariel", 3000.0 , 30, 150.0, Skills.Bow);
      Hunter H2 = new Hunter("Clive", 5500.0, 50, 300.0, Skills.GreatSword);
      Hunter H3 = new Hunter("Tifa", 4200.0, 45, 200.0, Skills.DualBlades);

      System.out.println(M2.Info());
      System.out.println(H1.Info());

      System.out.println(H3.AttackPower());


      //More to do:
      //Can kill the dragon along?
      //how many times of attack to kill the dragon?
      //Kill 3 dragons to upgrade 1 lv
      //Count how many Hunter & Monster had created
      

    }
}
