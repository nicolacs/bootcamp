public class ExceptionChainExample4 {
    //!!! No exception
    public static void main(String[] args) {
    //Try error in copy page, add try in this page to fix
    int result = 0;
    try{
        result =  method1(10, 0); 
    } catch  (ArithmeticException e){
        result = -1;
    }
 }
 
    public static int method1(int x, int y){
          return method2(x,y); 
        }

    public static int method2(int x, int y){
        return x/y;   
    }  
}
