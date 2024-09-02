// Interface 特點:
// 1. This is 100% abstraction - no implementation
// 2. No attribute
// 3. allow and implicit "public static final" only
// 4. No constructor 這只係一份合約, 係死物
// 5. After Java 8, default & statickeyword inside Interface
// 6. 唔可能private, 因為interface 係要出現係memory到, private 左就出現唔到
// implement 左一個interface, 就好似tag 左黎份合約咁, 可以履行到入面所有野
public interface Walkable {
    // Constant
    public static final double PI = 3.14;
    // This is Constant too
    int x = 24; //implicitly "public static final" <<<所以正常係直接咁寫, 直接 type 名=value

    static int y = 20; // 黎個都係public static final
    final int z = 20; // 黎個都係public static final
    public int w = 20; // 黎個都係public static final
    static final int o = 20; // 點寫都係public static final

    // After Java 8, 2014
    // it is instance method, by default ingerited by the implementation class
    // Can be override
    default int sum(int x, int y){ // implicit public
        return x+y;
    }

    static int substract(int x, int y){// implicit public
        return x-y;
    }

    void walk();

    public static void main(String[] args) {
        System.out.println(Walkable.PI);// 3.14
        System.out.println(Walkable.x); // 24

        //How to call sum(), 用person()黎個OBJ call
        System.out.println(new Person().sum(3,2)); // 5

        System.out.println(Walkable.substract(3, 2)); // 1

        // Person.subtract(3, 2); // NOT OK

    }
}
