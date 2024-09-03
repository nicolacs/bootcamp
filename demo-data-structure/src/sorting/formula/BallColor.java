package sorting.formula;

public enum BallColor {
        RED(3), 
        YELLOW(1), 
        GREEN(2),
        ;
    
        public int value;
    
        BallColor(int value){
            this.value = value;
        }

        public int getValue(){
            return this.value;
        }
}
