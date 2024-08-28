public enum Direction {
  EAST(1, 'E'), 
  SOUTH(2, 'S'), 
  WEST(-1, 'W'), 
  NORTH(-2, 'N'),
  ;

  private int value;
  private char initial; // just translate initial = the first charactor

  private Direction(int value, char initial) {
    this.value = value;
    this.initial = initial;
  }

  public int getValue() {
    return this.value;
  }

  public char getInitial() {
    return this.initial;
  }

  // WEST EAST, NORTH SOUTH
  public boolean isOpposite(Direction direction) {
    return this.value * -1 == direction.getValue();
    // or Approach 2: return this.value / direction.getValue() == -1;
  }
  // Approach 3:
  // if (this == direction)
  // return false;
  // if(this.getValue()% 2 ==1 && direction.getValue() %2 ==0 || this.getValue()% 2 ==0 && direction.getValue() %2 ==1)
  // return false;
  // return true;
  // }


  public static void main(String[] args) {
    // define a variable storing Direction WEST
    Direction west = Direction.WEST; // 放一個direction OBJ

    // check if this variable equals to NORTH
    // if yes, print "it is North."
    // if no, print "it is not a North."
    if (west == Direction.NORTH) {
      System.out.println("it is North.");
    } else {
      System.out.println("it is not a North.");
    }

    // valueOf() : from String OBJ to enum OBJ
    Direction east = Direction.valueOf("EAST");
    System.out.println(east); // EAST //getting a String

    // System.out.println(Direction.valueOf("south")); // case sensitive // runtime exception

    if (west.isOpposite(Direction.EAST)) { // true
      System.out.println("They are oppsite.");
    }

    System.out.println(Direction.NORTH.isOpposite(west)); // false

    System.out.println("hello".charAt(1)); // e
  }

}
