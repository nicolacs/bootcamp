import java.util.Arrays;

public class AnyTry {
  public static void main(String[] args) {
    //2000
    String word = "abcdefd";
    char ch = 'd';
    int idx = 0;
  //char [] arr = word.toCharArray();
  //for ( int i =0 ; i < arr.length; i++){
  //if (arr[i] == ch ){
    for ( int i =0 ; i < word.length(); i++){
      if (word.charAt(i) == ch)
      idx = i;     
     if (idx > 0)
      break;
    }
    //System.out.println(idx);  //checking
  }
    //StringBuilder newword = new StringBuilder(word);
    //System.out.println(newword.reverse(0,idx));
    //System.out.println(arr.toString());
    //System.out.println(word.indexOf(ch));


      
  
}
