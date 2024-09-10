public class ExceptionChainExample2 {
     //!!! No exception
    public static void main(String[] args) {
    //Try error in copy page, add try in this page to fix
        method1(10, 0); // 除左0 
 
    }
    public static int method1(int x, int y){
       return method2(x,y); 
    }

    public static int method2(int x, int y){
        //try
        int a = 100;
        try {
            return x/y; //error senerio// throw exception
        } catch (ArithmeticException e){ //catch
           a=-1;
        }
        return a; 
    }
    
    // Exception in thread "main" java.lang.ArithmeticException: / by zero    
    // at ExceptionChainExample.method2(ExceptionChainExample.java:11)
    // at ExceptionChainExample.method1(ExceptionChainExample.java:7) 
    // at ExceptionChainExample.main(ExceptionChainExample.java:3)   
}
