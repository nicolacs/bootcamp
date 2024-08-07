public class BasicStuff240807 {
  public static void main(String[] args){
//>>>>>8 Primitives
//--Higher/Lower lv type
//--Math Operations
//--Comparsion Operators
//>>>>>String
//--Operator
//--equals(), length(), charAt()
//>>>>>If - else

    int ProductA = 100;
    int ProductB = 160;
    double ProductC = 99.90;
    double ProductD = 149.90;
    int ProductBcost = 30;
    float ProductE = 2.9f;

    //ProductA price increase $30
    int ProductAnew = ProductA + 30;
    System.out.println("ProductA New Price : $" + ProductAnew);

    //ProductE price decrease $1
    //double ProductEnew = ProductE--;//1st answer will result in 2.90000095.Why is still 2.9and more .00000. As -- or ++ cannot use in 有小數位.
    double ProductEnew = ProductE - 1;//redo
    System.out.println("ProductE New Price : $" + ProductEnew);

    //Total Selling Price(TSP) of all product
    double TSP = ProductA + ProductB + ProductC + ProductD;
    System.out.println("Total Selling Prices :" + TSP);//Why many .79999 -> As it is a Java fact

    //If I sell 1 ProductB, how many store can I purchase back and how much left.
    int PurchaseBackB = ProductB % ProductBcost;
    System.out.println("Can Restock per piece: " + PurchaseBackB);
    int remainder = ProductB % ProductBcost;
    System.out.println("How Much left After Restock: " + remainder);

    //Comparsion
    boolean AexpensivethanB = ProductA > ProductB;
    System.out.println("Is A price higher than B: " + AexpensivethanB);




  }
  
}
