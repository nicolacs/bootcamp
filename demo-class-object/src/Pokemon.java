public class Pokemon {  //<--- class name
  private String[] skillSets; //<---target
  //說明書


  public Pokemon() {
    this.skillSets = new String[0]; // !!!<----增加學習位置 []
  }

  public Pokemon(String[] skillSets) { // <------- 增加已有技能位置 []
    this.skillSets = skillSets; 
  }

  ///-------------getter setter--------------------------//

  public int size() {
    return this.skillSets.length; //<----size = arr length == 可用幾多Skill 
  }

  public void learnSkill(String[] arr) { //--this is a setter // rule for setting name leanSkill
    this.skillSets = arr; //<---- learn skill = line 60-61
  }

  public String[] getSkill() { //<----63 64
    return this.skillSets;
  }

  public String getSkillsLength(int index) {  // <---- =charAt ,搵位置，內容
    // index -> negative?
    return this.skillSets[index];
  }

  public String totalLongValue() { //< ------ total 有幾多技能
    String sum = "";
    for (int i = 0; i < this.skillSets.length; i++) {
      sum += this.skillSets[i];
    }
    return sum;
  }

  public static void main(String[] args) { //使用
    Pokemon pikachu = new Pokemon(); // Box object exits
    pikachu.size(); // 0

    // If there is no custom constructor and no setter
    // then the array cannot be initialized
    // arr is null pointer exception

    // 2 ways to solve (either):
    // 1. Custom Constructor
    // but the "implicit default empty constructor" will be removed
    // and then you can still create "custom empty constructor"

    // arr with length 0
    int[] arr = new int[] {}; // OK, fixed length array (length=0)
    // arr[0] = 1; // NOT OK, runtime error

    Pokemon pokemon3 = new Pokemon(new String[] { "physical", "myth", "physical2", "myth2" });
        //== line 10

    // 2. setter
    Pokemon pokemon2 = new Pokemon();
    pokemon2.learnSkill(new String[] { "physical", "myth", "physical2", "myth2" });

    String result = pokemon2.getSkill()[1]; // myth
    System.out.println(result);

    result = pokemon2.getSkillsLength(2);
    System.out.println(result); // physical 2

  }
}