public class DemoPrimitive {
  public static void main(String[] args){
    // every line of java code must end with ;
    // Declaration and Assign
    int x = 100;

    // Declaration
    // "int" is a type that can store an integer
    int y;
    // Assignment
    y = -13;
    System.out.println(y); // -13
    // Re-assignment
    y = 9;
    System.out.println(y); //9

    System.out.println(x); // 100
    System.out.println(20); // 20
    System.out.println(x); // 100

    int age = 30;
    //int q = 30.5; // 30.5 is number with decimal, q is declared by int, so cannot store decimal place
    double q = 30.5;
    System.out.println(q); // 30.5

    // double  = 10; // 10 is int value
    // when int value assigned to double type variable
    // Java will help auto-convert int value to double value (10 ->10.0)
    // Finally, assignment -> 10.0 -> u

    double i = 10.0;
    // 10.0 is a double value, assign to variable i

    // int k = 10.0;
    // 10.0 is a double value, you cannot assign double value to int type variable
    // becuase the level of double type is higher than int type

    // char -> Character
    char c = 'i';
    char c2 ='9';
    // char c3 = '';
     char c4 = ' ';  // at least one character

    double d1 = 3.3;// by default 3.3 is double value
    double d2 = 3.3d;// "d" is to describe 3.3 is a double vlue
    //float f1 = 3.3; //3.3 is double, which is higher lv than float
    // float is lower level type comparing with double
    
    float f2 = 3.3f; // assign float value to float variable

    double d3 = 3.3f; // 3.3f is float value, lower value can be assigned to higher type like double

    int h =4; // 4 is a int value
    long l1 = 4; // long is higher lv than int, thus 4int value -> 4 long value

    long l2 = 4L;// 4L is long value

    // Total 8 Types (Primitives):
    // int, long, float, double
    // char, byte, short, boolean
    //To group relationship:
    // >>byte, short, int, long
    // >>float, double
    // >>char
    // >>boolean

    // Interger: byte -> short -> int -> long
    byte b1 =3;// from -128 to 127 total 256 value 常用值
    // assign int value to byte variable, JAVA將int value -> byte value (implicitly)
    //但以下例子講明關係, int cannot be byte
    int i2 = 3;
    //byte b2 = i2;// same, b2 finally = 3, Java does not allow higher lv type to lower lv type, as i2 can be change anytime to make it not a byte

    // Assign byte variable to int variable
    int i3 = b1;//ok
    b1 = -128;
    //b1 = -129;//out of byte range, that's why error
    b1 = 127;
    //b1 = 128;//out of byte range, that's why error

    short s1 =3;// from -32768 to 32767
    // short vs int

    int i5 = s1;
    //s1 = -32769;//out of short range, that's why error
    s1 = -32768;
    s1 = 32767;
    //s1 = 32768;//out of short range, that's why error
    int i6 = 3;//from -2.1b to 2.1b
    long l3 = 3;// from -2^63 to 2^63
    
    // int i4 = 3L; // explicitly assign long value

    int i1 =3;// from -2.1B to 2.1B 正負21億
    long l4 =3;// from -2^63 to 2^63
    // =右手邊既3 is a int value

    boolean bl = false;
    bl = true;

    boolean result = 3 > 2; // true
    System.out.println(result);// ture
    System.out.println(3 > 2);// true
    System.out.println(2 > 3);// false

    int i9 = 200;
    System.out.println(i9 >199);// true

    int age2 = 66;
    boolean isElderly = age2 > 65;// an event or definition
    System.out.println(isElderly);// true

  }
}
