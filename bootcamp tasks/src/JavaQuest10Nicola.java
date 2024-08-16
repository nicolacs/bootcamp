import java.util.Arrays;
import java.util.Scanner;
public class JavaQuest10Nicola {
/**
 * Input a Index Position: 3
 * Input a new Value: 120
 * Original Array : [25, 14, 56, 15, 36, 56, 77, 18, 29, 49]
 * New Array:       [25, 14, 56, 120, 15, 36, 56, 77, 18, 29]
 */
// Insert an elements into a specific position of the array
// The original last element should be removed accordingly
// if the specified position is the last index, return the original array
  public static void main(String[] args) {

    int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };

    Scanner input = new Scanner(System.in);

    System.out.print("Input an index for inserting the value: ");
    int indexPosition = input.nextInt();

    System.out.print("Input the value: ");
    int newValue = input.nextInt();

    System.out.println("Original Array : " + Arrays.toString(my_array));

    // code here ...

    // my_array = newArr;
    int [] newArr = Arrays.copyOf(my_array, my_array.length);
    //int backup = 0;
    for ( int i = indexPosition ; i < newArr.length -1 ; i++){
       if (indexPosition >= my_array.length){
        System.out.println("Your entry lead to the Original data: " +Arrays.toString(my_array));
      } else 
       newArr[i+1] = my_array[i];
    }
      newArr[indexPosition] = newValue;{
        System.out.println("New Array: " + Arrays.toString(newArr));
      }
      
      
      //if (i == indexPosition){
        //backup6 = newArr[i];
        //newArr[i] = newValue;
        //newArr[i+1] = backup6;
         //newArr[i+2] = newArr[i+1];

      //for (int j =0 ; j < newArr.length -1 ; j++){
        //int backup7 =0;
        //if (j == indexPosition){
          //backup7 = newArr[j+1];
          //newArr[j+1] = backup6;
         // newArr[j+2] = backup7;
         // backup7 = newArr[j+3];
        
        //newArr[j+1] = backup6;
         //newArr[i+1] = newArr[i+2];
         

  }
}

