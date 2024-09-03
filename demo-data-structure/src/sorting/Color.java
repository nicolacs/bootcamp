package sorting;

public enum Color {
    RED(2), 
    YELLOW(3), 
    GREEN(1),
    ;

    public int value;

    Color(int value){
        this.value = value;
    }
    

    public int getValue(){
       return  this.value;
    }
}
