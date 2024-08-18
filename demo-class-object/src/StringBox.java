import java.util.Arrays;

public class StringBox {
  private char[] characters;

  // new String
  public StringBox(String s){ //abc
    // s -> char[]
    this.characters = new char[s.length()]; /// 最重點係黎句, 去產生char array
    System.out.println("Before: "+ this.charAt(1)); // '\u0000'
    for ( int i = 0 ; i < s.length() ; i++){
      this.characters[i] = s.charAt(i);
    }
    System.out.println("After: " + this.charAt(1)); //b
  }

  // design: revise the data of the object 你要知你想修改自己定計一樣野放出去
  // difference between setCharAt() and replace()
  public void setCharAt(char c, int index){
    this.characters[index] = c;
  }

  // sb.charAt
  public char charAt(int index){
    return this.characters[index];
  }

  public char[] getCharacters(){
    return this.characters;
  }
  public int length(){
    return this.characters.length;
  }

  // firstIndexOf
  public int indexOf(char c){
    for (int i=0; i < this.characters.length; i++){
      if(this.characters[i] == c){
        return i;
      }
    }
    return -1;
  }

  // replace('c', 'x')
  public String replace(char oldChar, char newChar){
    char[] arr = new char[this.characters.length];
    for(int i=0 ; i< this.characters.length ; i++){
      arr[i] = this.characters[i] == oldChar? newChar : this.characters[i];
    }
    return String.valueOf(arr); // .valueOf 即係 new Striing(arr), 但.valueOf 係最好的
  }

    public String substring(int beginIndex, int endIndex){
      char[] arr = new char[this.characters.length];
      for(int i =beginIndex ; i < endIndex ; i++){
        arr[i] = this.characters[i];
      }
      return String.valueOf(arr); // char[] ->String
    }

  public String toString(){
    return String.valueOf(this.characters);
    
  }

  public static void main(String[] args) {
    String s = new String("abc");
    StringBox sb = new StringBox("abc");

    System.out.println("s: " +s.charAt(1));//b
    System.out.println("sb: " +sb.charAt(1)); //b

    System.out.println("s.length: " +s.length());//3
    System.out.println(sb.length());//3

    System.out.println("s.indexOf: " +s.indexOf('c'));//2
    System.out.println(sb.indexOf('c'));//2

    String newStr = s.replace('c', 'x');
    System.out.println("s.replace: " +newStr);// "abx"
    System.out.println(s); // "abc"

    String newStr2 = sb.replace('c', 'x');
    System.out.println(newStr2);// "abx"
    System.out.println(sb); // "abc"

    System.out.println(s.substring(0, 2)); // "ab"
    System.out.println(sb.substring(0, 2)); // "ab"

    // Pass by Ref
    StringBox sb2 = sb;
    System.out.println("Before : " +sb); // abc
    System.out.println("Before pass by ref: " +sb2); //abc
    sb.setCharAt('a', 2);// abc ->aba
    System.out.println("After adjustment sb.setCharAt('a', 2): " +sb); // aba
    System.out.println("After pass by ref: " +sb2); //aba 因為sb2都同同sb 指住同一個address

    char[] arr = sb.getCharacters();
    arr[0] = 'm';
    System.out.println(sb); //mba
    System.out.println(sb2); // mba

    sb= null;
    sb2 = null;
    // but the char array still exist
    System.out.println(Arrays.toString(arr)); // [m , b ,a]
  }
}
