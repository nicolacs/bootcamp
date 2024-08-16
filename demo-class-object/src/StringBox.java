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

  // sb.charAt
  public char charAt(int index){
    return this.characters[index];
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
  public String toString(){
    return String.valueOf(this.characters);
    
  }

  public static void main(String[] args) {
    String s = new String("abc");
    StringBox sb = new StringBox("abc");

    System.out.println("s: " +s.charAt(1));//b
    System.out.println("sb: " +sb.charAt(1)); //b

    System.out.println(s.length());//3
    System.out.println(sb.length());//3

    System.out.println(s.indexOf('c'));//2
    System.out.println(sb.indexOf('c'));//2

    String newStr = s.replace('c', 'x');
    System.out.println(newStr);// "abx"
    System.out.println(s); // "abc"

    String newStr2 = sb.replace('c', 'x');
    System.out.println(newStr2);// "abx"
    System.out.println(sb); // "abc"
  }
}
