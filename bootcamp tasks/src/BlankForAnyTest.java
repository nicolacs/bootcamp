public class BlankForAnyTest {
  
  public static void main(String[] args) {


    int x = 3;
    for(int n = 0 ; n <10 ; n++ )
    x =  x + 5;
    System.out.println(x);

        // LeetCode No. 711 
        //solve case 2
        //int output =0;
        //for ( int i =0 ; i< jewels.length() ; i++){
          //if (jewels.charAt(i) == stones)
          //output++;
        //}
        //return output;

        for (int i =0; i< 5 ; i++){
        for (int j =0; j< 5-i ; j++){
    System.out.print("^");
        }System.out.println("");}

        for (int i =0; i< 6 ; i=i+2){
          for (int j =0; j< 6-i ; j++){
      System.out.print("^");
          }System.out.println("");}

       System.out.println("~~~~~Leetcode 485~~~~~");
          int []nums = new int[]{1,1,0,1,1,1};
          int count = 0;
          int max = -10000;
      for (int i = 0 ; i < nums.length ; i++){
      if (nums[i] == 1){
      count ++;
    } else {
      if (count > max);{
          max = count;
        }
        count = 0;
      }
    }
      System.out.println(max);
  }
}
