public class DemoLambdaSyntax {
    public static void main(String[] args) {
        Superman superman = new Superman();
        superman.fly(); // Superman is flying...

        Flyable superman2 = new Superman();
        superman2.fly(); // Superman is flying...

        //!!! Create OBJ without class
        // Java 8 - Lambda Expression (For Functional interface only)
        Flyable superman3 = () -> System.out.println("Superman is flying...");  // -> 使用interface唯一既內容
        superman3.fly(); // Superman is flying...

        //!!! Create OBJ without class
        //Anonymous
        Flyable superman4 = new Flyable(){
            @Override
            public void fly(){
                System.out.println("Superman is flying...");
            }
        };
            superman4.fly(); // Superman is flying...

            // Calcultor
            MathOperation addition = (a, b) -> a + b;
            MathOperation subtraction = (x, y) -> x - y;

            System.out.println(addition.compute(3, 2)); //5
            System.out.println(subtraction.compute(3, 2)); //1

            // Other syntax...
            // !!! More than one line of code...
            // !!! 1. Need to add code block {}
            // !!! 2. Need to use return
            MathOperation process = (a, b) -> {  //!!!黎度冇new OBJ
                if (a > 10)
                 return a+b;
                 return a-b;
            };
            MathOperation process2 = (a, b) -> a> 10 ? a+b : a-b;  //一句過既寫法
            System.out.println(process.compute(11, 1)); // 12  //!!! 係黎度先new隻OBJ 出黎
            System.out.println(process.compute(10, 1)); // 9       
            
            StringManager concatHello = str -> str.concat("HELLO");
            System.out.println(concatHello.operate("John")); // Johnhello

            StringManager removeSpace = str -> str.replace(" ", "");
            System.out.println(removeSpace.operate(" abc ccc   ")); // abcccc
    }
}
