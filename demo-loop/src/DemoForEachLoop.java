public class DemoForEachLoop {
  public static void main(String[] args) {
    // for loop
    // i -> array index
    // 多用途
    int[] arr = new int[]{2,9,10,-3};
    for(int i=0 ; i<arr.length ; i++){
      System.out.println(arr[i]); // print out elements
      System.out.println(arr[i] + arr[arr.length -1]);
    }
       //!!! The Main Difference between for-loop and for-each-loop
       // for loop -> able to access all elements during each iteration
       // for-each -> easy to read/use, because no index


    // for-each loop
    // i -> element
    // 單一用途
    // support continue and break
    for (int i : arr){   // ( Variable : 地址)
      System.out.println("for-each loop : " +i);// other method to print out elements
    }
    int sum=0;
    for (int i :arr){ 
      sum += i;
    }
     System.out.println("for-each loop sum: " +sum);


     // Try by Example
     String[] fruits = new String[] {"apple", "orange" , "banana"};
     // for-each loop string array
     // if
     for (String fruit: fruits){
      if (fruit != null && "o".equals(fruit.substring(0,1))){
        System.out.println(fruit.charAt(fruit.length()-1));
      }
     }
        // default value - Wrapper Class / String
        Integer x=null;
        System.out.println(x); //null
        // x.inValue(); //error

        String s = null;
        System.out.println(s);
        // s.charAt(0); // error, Null Pointer Exception 這是空置針

        s = ""; // empty is an String Obj這不是空置針

  }
  
}
