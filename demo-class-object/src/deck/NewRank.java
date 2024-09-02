package deck;

public abstract class NewRank {

  private int value;

  public NewRank(int value) {
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }

  // abstract int compareTo(NewRank rank);
  // set定一個方法去check俾入黎既卡既大細
  public int compareTo(NewRank rank) {
    if (this.value == rank.getValue())
      return 0;
    return this.value > rank.getValue() ? 1 : -1;

  }
}