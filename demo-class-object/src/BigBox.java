import java.util.Arrays;

public class BigBox {
  private Box box;

  public BigBox(){

  }

  public BigBox(Box box){
    this.box = box;
  }

  //
  public long boxValue() { // bb3 -> boxValue() -> totalLongValue()
    return this.box.totalLongValue(); 
  }

  public static void main(String[] args) {
    BigBox bb = new BigBox();
    // Here is in heap memory (BigBox Obj 可以link -> Box Obj -> long[]Obj)
    // BigBox Obj Ref  (in Stack memory)
    // -> BigBox Obj (box obj ref) (in heap memory)
    // -> Box Obj (long[] obj ref)
    // -> long[] Obj
    // -> lots of long value
    // BigBox 冇指去Box, 係搵唔到 long[]Obj

    Box backup = new Box(new long[] {1,2});
    BigBox bb2 = new BigBox(backup); //OK

    System.out.println(Arrays.toString(backup.getArr())); // [1,2]

    // for bb3, you lost the Box Obj address
    // and if you do not provide any access method to box object
    // then you are no longer reaching it.
    BigBox bb3 = new BigBox(new Box(new long[] {1, 2}));
    System.out.println(bb3.boxValue()); // 3

  }
}
