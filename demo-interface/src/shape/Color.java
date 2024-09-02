package shape;

public enum Color { // implicit final 你唔可以extend color
      //enum 唔可以用去其他class 做extend = 唔可以做parent class
    RED('R'), YELLOW('Y'), GREEN('G'),;

    private char value;

    //constructor
    private Color(char value){
        this.value = value;
    }
    
}
