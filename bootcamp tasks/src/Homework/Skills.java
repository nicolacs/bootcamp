
public enum Skills {
    BreathAttacks(2.0),
    TailWhip(1.7),
    AreaDenial(1.3),
    Roar(1.5),
    Bow(1.1),
    GreatSword(1.5),
    DualBlades(1.3),
    ;

    private double attackBonus;

    private Skills(double attackBonus){
        this.attackBonus = attackBonus;
    }

    public double getAttackBonus(){
        return this.attackBonus;
    }
}
