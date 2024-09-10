public class ExceptionChainExamplecopy {
    public static void main(String[] args) {
        method1(10, 0); // 除左0 //第3次ERROR 未有人救if there is no one handling the exception along the call stack
        // finally, main() method will throw the exception to JVM.
    }
    public static int method1(int x, int y){
       return method2(x,y); //第2次ERROR
    }

    public static int method2(int x, int y){
        return x/y; //第1次ERROR左
    }
    
    // Exception in thread "main" java.lang.ArithmeticException: / by zero    
    // at ExceptionChainExample.method2(ExceptionChainExample.java:11)
    // at ExceptionChainExample.method1(ExceptionChainExample.java:7) 
    // at ExceptionChainExample.main(ExceptionChainExample.java:3)   
}
