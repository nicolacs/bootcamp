import java.math.BigDecimal;

public class Monster extends CreatureBasic {
  public Skills skill;

  public Monster(String name, double basicHp, double basicAttackPower,
      int level, Skills skill) {
    super(name, basicAttackPower, level, basicAttackPower);
    this.skill = skill;
  }

  @Override
  public double AttackPower() {
    BigDecimal total = BigDecimal.valueOf(this.level) // revised with BigDecimal 25/8
        .multiply(BigDecimal.valueOf(this.basicAttackPower)
            .multiply(BigDecimal.valueOf(0.3))
            .multiply(BigDecimal.valueOf(this.skill.getAttackBonus())));
    return total.doubleValue();
  }

  public String Info() {
    return "Monster (" + "Monster : " + super.name + " Lv : "
        + super.basicAttackPower + " Hp : " + super.basicHp + " AttackPower : "
        + super.basicAttackPower + " Skill : " + this.skill + ")";
  }
  // BlackDragon(50, 22000.00, 450.00, Skills.ofTailWhip),
  // SunBreak(60, 16000.00, 350.00, Skills.ofBreathAttacks),
  // Nergigante(45, 18000.00, 250.00, Skills.ofRoar),
  // Zinogre(55, 15000.00, 550.00, Skills.ofAreaDenial),



}
