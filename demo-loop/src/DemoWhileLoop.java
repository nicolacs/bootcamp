import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DemoWhileLoop {
  public static void main(String[] args) { // i -> counter
    int sum =0;
    for( int i =0 ; i <5 ; i++){
      sum +=i;
    }
    System.out.println("1st 方法: " + sum);//10

    // while 係做D 唔知幾時可以停既情況
    int count = 0;
    sum =0;
    while (count < 5){ // when count == 5, exit loop
      sum += count;   //loop step 1
      count++;        //loop step 2
    }
    System.out.println("2nd 方法: " + sum);//10
    //黎度知道係5次, 所以用for loop 就可以, 亦更好. 唔會無啦啦就用while loop
    //因日常好多事都唔洗估, business 多數有數據
    //寫game就有機會多D用, 因好多被user 影響既因素

    // My example
    count = 0;
    sum = 0;
    while (count <=6){
      sum += count;
      count++;
    }
    System.out.println("My try should be 21: "+ sum);

    // Random
    //new Random().nextInt(5);// 0-4

    //int value = new Random().nextInt(5)+1; //1-5
    //System.out.println("Random no. : " +value);

    // Guess a number
    //Scanner scanner = new Scanner(System.in);
    //int number = -1;
    //while (number != value){
      //System.out.println("Please input a number between 1-5 : ");
      //number = scanner.nextInt(); // capture use input
    //}
    //System.out.println("Congrats!!!");

     System.out.println("~~~~~leetcode case~~~Need to learn~~");
     int code = 1234; //將黎個變 charArray['1' , '2', '3', '4']

     // Approach 1 (not suggest by Vincent)
     // int -> Integer -> String -> char[]
     char[] codes = new Integer(code).toString().toCharArray();
     System.out.println(Arrays.toString(codes));//[1,2,3,4]

     // Approach 2
     // Tips : % and /
     int a = code;
     int arrLength =0;
     while(a>0){ //1234%10 -> 4
      //(char) (a % 10 + '0'); // int to char 所以(char)佢
      // how to convert 4 to '4'
      a =a/10;   //1234 / 10 ->123

      arrLength++;
     }
     codes = new char[arrLength];
     a = code;
     int idx = 0;
     while ( a>0){
      codes[idx] = (char)(a%10+ '0');
      idx++;
      a=a/10;
      arrLength++;
     }
     System.out.println(Arrays.toString(codes));

     // reverse
     char backup = ' ';
     for(int i=0 ; i < codes.length/2 ; i++){
       backup = codes[i];
       codes[i] = codes[codes.length - i -1];
       codes[codes.length -i -1] = backup;
     }
     System.out.println(Arrays.toString(codes));// [1,2,3,4]

     //Use char with ascii code no.
     char c = (char) ('a'+1);
     System.out.println(c);//b

     // Approach 3
     // while (true){ //by default, this is a infinite loop
     count =0;
     sum= 0;
     while (true){ //1000lines ... 6 break
      sum += count;
      count++;
      if(count>4)
      break;
     }
     System.out.println("// Approach 2 " + sum);//10

     // 技巧 Example
     int num = 54321;
     String result = "";
     while (num >0){
      result +=  num % 10; // to retrieve 提取個數字 , String + int
      num /= 10; // 54321 ->5432 -543 -> 54 -> 5 -> 0 (exit)
     }
       System.out.println("技巧 Example : " + result);//12345


  }
  
}
