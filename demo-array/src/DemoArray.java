import java.util.Arrays;

public class DemoArray {
  public static void main(String[] args) {
    // 8 primitives + String
    int x = 3;
    int x2 = 6;
    int x3 = -4;
    int max;
    if (x > x2) {
      if (x > x3) {
        max = x;
      }
    } else { // 對應x2 >x
      if (x2 > x3) {
        max = x2;
      } else {
        max = x3;
      }
    }
    // System.out.println("Max= " + max);//6

    // How about we compare 10 numbers?
    // You have to define the length of array before you use it.
    int[] arr = new int[3]; // 3 means the length of array
    arr[0] = 3;
    arr[1] = 6;
    arr[2] = -4;
    // To print out all numbers from the array
    System.out.println(arr[0]);// 3
    System.out.println(arr[1]);// 6
    System.out.println(arr[2]);// -4
    System.out.println(arr.length);// 3

    // Can use for loop to prnt the values in array
    for (int i = 0; i < arr.length; i++) { // 0 1 2
      System.out.println(arr[i]); // 3 6 -4
    }

    // declare an array for double
    // for loop
    // !!!!!!!!!!!要好熟悉去打出黎!!!!!!!!!!!!
    double[] arr1 = new double[5];
    arr1[0] = 1.1;
    arr1[1] = 2.2;
    arr1[2] = 3.3f; // ok, float 升 double
    arr1[3] = 4; // ok, int 升 double
    arr1[4] = -4.9;
    for (int j = 0; j < arr1.length; j++) {
      System.out.println(arr1[j]);
    }
    // char[]. boolean[], byte[], short[], long[], float[], String[]

    System.out.println("~~~~~~~~~~~Example 1~~~~~~~~~~~~");
    // Example 1
    int[] arr3 = new int[3];
    arr3[0] = 3;
    arr3[1] = 6;
    arr3[2] = -4;
    // Output: find Max number from array , use loop

    System.out.println("~~~~~~ Find Max & Min~~~~~~");
    int max1 = -2_100_000;
    for (int i = 0; i < arr3.length; i++) {
      if (arr3[i] > max1) {
        max1 = arr3[i];
      }
    }
    System.out.println("Max number = " + max1);

    // Example 2 , sample data find min.
    int minNum = 2_100_000_000;
    for (int i = 0; i < arr3.length; i++) {
      if (arr3[i] < minNum) {
        minNum = arr3[i];
      }
    }
    System.out.println("Min number = " + minNum);

    // Example 3
    String[] strings = new String[3];
    strings[0] = "abcd";
    strings[1] = "hello";
    strings[2] = "12309000";
    String longestString = ""; // length =0
    int maxLength = -1;
    // code here...
    for (int i = 0; i < strings.length; i++) {
      if (strings[i].length() > longestString.length()) {
        longestString = strings[i];
      }
    }
    System.out.println("The longest string= " + longestString);

    // Example 4
    double[] prices = new double[4];
    prices[0] = 10.3;
    prices[1] = 7.7;
    prices[2] = 1.5;
    prices[3] = 2.3;
    int[] quantities = new int[4];
    quantities[0] = 10;
    quantities[1] = 2;
    quantities[2] = 5;
    quantities[3] = 4;

    double totalAmount = 0.0;
    for (int i = 0; i < prices.length; i++) {
      totalAmount += prices[i] * quantities[i];
    }
    System.out.println("Total Amount = " + totalAmount);

    // Example 5 - Average
    int[] scores = new int[5];
    scores[0] = 79;
    scores[1] = 70;
    scores[2] = 50;
    scores[3] = 100;
    scores[4] = 90;
    // loop
    double totalScores = 0;
    double average = 0;
    for (int i = 0; i < scores.length; i++) {
      totalScores += scores[i];
    }
    {
      average = totalScores / scores.length;
    }

    System.out.println("Average score = " + average);
    System.out
        .println("2nd Method : Average score = " + totalScores / scores.length);

    // declare and initialize an array
    // approach 1
    String[] arr5 = new String[3];
    // approach 2
    String[] arr6 = new String[] {"abc", "def", "ijk"}; // 此寫法已暗示長度為3 -> 0,1,2
    // As 長度係 0, 1, 2 如你搵arr6[3] 係會error
    // approach 3
    String[] arr7 = {"abc", "def", "ijk"};

    System.out.println(
        "~~~~~~~~~~ Example 6 ~~~~~~~~~~~Always use, from array to array (搬array)");
    // Example 6
    int[] arr8 = new int[] {100, -20, 40, 33, 90, 44, 66};
    // Find all numbers that >40 and divided by 3 //output 66, 90 and moveto int[]answers
    int[] answers = new int[7];
    int idx = 0;
    for (int i = 0; i < arr8.length; i++) {
      // answers[i] = arr8[i] > 40 && arr8[i] % 3 ==0; >>>>>>my answer error
      // System.out.println(answers[i]);
      if (arr8[i] > 40 && arr8[i] % 3 == 0) {
        answers[idx++] = arr8[i];
      }
    }
    // Print out array
    System.out.println(Arrays.toString(answers));

    System.out.println("~~~~~~~~~~ Example 7 ~~~~~~~~~~~Always swap, backup");
    // Example 7
    char[] arr9 = new char[2];
    arr9[0] = 'h';
    arr9[1] = 'a';
    // try to swap by backup
    char backup;

    backup = arr9[0]; // 將 h 放入backup
    arr9[0] = arr9[1]; // 將 a 覆蓋 [0]既h
    arr9[1] = backup; // 將係backup既 h 覆蓋係[1]既 a
    System.out.println(arr9[0]);// a
    System.out.println(arr9[1]);// h

    // Example 8
    // Need loop + swap
    char[] arr10 = new char[] {'9', '4', '3', '2', '1', '0'};
    // Move the first character to the tail
    // You cannot create another array
    char backup1;
    for (int i = 0; i < arr10.length - 1; i++) {
      // 如array 冇-1, //java.lang.ArrayIndexOutOfBoundsException, 你有地方爆左
      // i入面可以選擇同某位置換: i +2, i +3 , i -5 etc
      backup1 = arr10[i];
      arr10[i] = arr10[i + 1];
      arr10[i + 1] = backup1;
    }
    System.out.println(Arrays.toString(arr10));// [4,3,2,1,0,9] !!print array 有獨有code!!

    System.out.println("~~~~~~~~Example 9~~~~~~");
    // Example 9
    int[] arr11 = new int[] {100, -100, -4, 5, -2, 200, 9};
    // Move the max value to tail
    int max3 = -21000000;
    int backup2;
    for (int i = 0; i < arr11.length - 1; i++) {
      if (arr11[i] > arr11[i + 1]) { // swap by condition
        backup2 = arr11[i];
        // if (arr11[i] >= max3){ //my wrong answer line
        arr11[i] = arr11[i + 1];
        arr11[i + 1] = backup2;
      }
    }
    System.out.println(Arrays.toString(arr11));

    // Example 10
    int[] arr12 = new int[] {100, -100, -4, 5, -2, 200, 9};
    // sum all values
    // 208
    int sum3 = 0;
    for (int i = 0; i < arr12.length; i++)
      sum3 += arr12[i]; // same as sum3 = sum3 + arr12[i];

    System.out.println("Example 10 sum3 = " + sum3);

    // Example 11
    // refer to Example 9, sorting the number
    long[] arr13 = new long[] {10, 3, -4, 9, 100, 70};
    // output -4,3,9,10,70,100
    long backup3;
    long backup4;
    for (int i = 0; i < arr13.length - 1; i++) {
      for (int j = 0; j < arr13.length - 1; j++) {
        if (arr13[i] > arr13[i + 1]) {
          backup3 = arr13[i];
          arr13[i] = arr13[i + 1];
          arr13[i + 1] = backup3; // After this output [3, -4, 9, 10, 70, 100]
        }
        if (arr13[j] > arr13[j + 1]) {
          backup4 = arr13[j];
          arr13[j] = arr13[j + 1];
          arr13[j + 1] = backup4;
        }
      }
    }
    System.out
        .println("Example 11 in my way output: " + Arrays.toString(arr13));

    // Example 11 Vincent's approach - Bubble Sort
    // Move the max value to the tail repeatedly
    // 1st round: 10,3,-4,9,70,100
    // 2nd round: x,x,x,x,70,100
    // 3rd round: x,x,x,10,70,100
    // 4th round: ....
    // Last round: -4,3,9,10,70,100

            //my 2nd approach
        //for (int i = 0; i < arr14.length - 1; i++) { // 5 times,  0,1,2,3,4
          //for (int j = 0; j < arr14.length - 1; j++) { // Move max value to tail
            //if (arr14[j] > arr14[j + 1]) {
              //backup5 = arr14[j];
              //arr14[j] = arr14[j + 1];
              //arr14[j + 1] = backup5;
     // Example 11 Vincent's approach - Bubble Sort
    long[] arr14 = new long[] {10, 3, -4, 9, 100, 70};
    long backup5 = -1;
    for (int i = 0; i < arr14.length - 1; i++) { // 5 times,  0,1,2,3,4
      for (int j = 0; j < arr14.length -i - 1; j++) { // Move max value to tail
        if (arr14[j] > arr14[j + 1]) {
          backup5 = arr14[j];
          arr14[j] = arr14[j + 1];
          arr14[j + 1] = backup5;
        }
      }
    }
    System.out
        .println("Example 11 new approach <Bubble Sort> output: " + Arrays.toString(arr14));



    // default value for int[]
    int[] arr15 = new int[4];
    System.out.println(Arrays.toString(arr15)); // 0,0,0,0
    // 0.0 for double / float
    // o for short , byte, long

    // default value for boolean
    boolean[] arr16 = new boolean[3];
    System.out.println(Arrays.toString(arr16));// false, false, false

    // default value for char[]
    char[] arr17 = new char[3];
    arr17[0] = ' ';
    arr17[1] = '\u0000';
    arr17[2] = ' '; // [ , , ]
    System.out.println(Arrays.toString(arr17));

    arr17[1] = ' ';
    System.out.println(Arrays.toString(arr17));

    if (arr17[0] == '\u0000') {
      System.out.println("Space = \u0000");
    }

    // String[], length 3
    // 2 ways to declare String array

    String[] arrstr = new String[] {"abc", "def", "hij"};// fixed length 3
    System.out.println(arrstr[1]); // def
    arrstr = new String[4]; // Create Strng array object in (heap memory)
    // arrstr1 -> Object Reference (Variable) 左邊係OBJECT REFERENCE 右邊係OBJECT
    arrstr[2] = "ijk"; 
    // This step is to Create String object, and assign String address to one of the address inside the array
    System.out.println(Arrays.toString(arrstr)); // [null, null, ijk, null]

    // 2D Array
    int[][] arr18 = new int[2][3];// 2 rows (index 0,1) x 3 columns (0,1,2)
    arr18[1][1] = 100;
    arr18[1][2] = -99;
    arr18[0][1] = 1;
    // arr18[2][1] =11; // will be error
    System.out.println("2D Array " +Arrays.deepToString(arr18));//[[0, 1, 0], [0, 100, -99]]

    // use arr18 to do for loop -> access 2D array
    for(int i=0; i <arr18.length; i++){ // row
      for (int j=0; j< arr18[0].length ; j++){ //column -> reset
        System.out.println("["+ i +"]["+ j +"] =" + arr18[i][j]);
      }
    }

    // Example 12
    int[] arr19 = new int[]{9,4,2,2,3,9,3};
    // count the number of 2 = 2
    int count =0;
    for (int i = 0; i< arr19.length ; i++){
      if (arr19[i] == 2){
        count++;
      }
    }
    System.out.println("There are " + count + " number 2.");

    // Given int value : 0 < x < 9
    int[] arr20 = new int[]{9,4,2,2,0,3,9,9,3};
    // Find the Max. Count's value ->9
    // value -> index
    int[] counts =new int [10]; // 0-9
    for (int i =0 ; i< arr20.length; i++ ){
      counts[arr20[i]]++; // why same num will +1 here?
    }
    int max2 = 0;
    int target = -1;
    for (int i=0; i <counts.length; i++){
      if (counts[i] >max2){
        max2 = counts[i]; // 個counts[i] 已經被max2 覆蓋, 點解 target 會=i??
        target = i;
      }
    }
    System.out.println("Max. Count's value= " + target); // Max .Count's value=9


    //    // Given int value : 10 < x < 99
    int[] arr20a = new int[]{99,14,12,12,10,13,99,99,13};
    // Find the Max. Count's value ->9
    int[] countsa =new int [90]; // 0-89
    for (int i =0 ; i< arr20a.length; i++ ){
      countsa[arr20a[i]-10]++; // why same num will +1 here?
    }
    int max2a = 0;
    int targeta = -1;
    for (int i=0; i <countsa.length; i++){
      if (countsa[i] >max2a){
        max2a = countsa[i]; // 個counts[i] 已經被max2 覆蓋, 點解 target 會=i??
        targeta = i -10;
      }
    }
    System.out.println("Max. Count's value= " + targeta);

  }
}
