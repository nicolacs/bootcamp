public class Products {
  private String Name;
  private int cartonPcs;
  private double volumn;
  //private String ingredients;

  public String getName(){
    return this.Name;
  }
  public void setName(String Name){
    this.Name = Name;
  }

  public double getVolumn(){
    return this.volumn;
  }
  public void setVolumn(double volumn){
    this.volumn = volumn;
  }
   
  public int getCartonPcs(){
    return this.cartonPcs;
  }
  public void setCartonPcs(int cartonPcs){
    this.cartonPcs = cartonPcs;
  }

  public double getTotalVolumn(){
    return this.cartonPcs * this.volumn;
  }

  public Products(){
    this.volumn = 100;
  }

  public Products(String Name, int cartonPcs, double volumn){
    this.Name = Name;
    this.cartonPcs = cartonPcs;
    this.volumn = volumn;
  }



public static void main(String[] args){
    Products products1 = new Products();
    products1.setName("LiverHealth");
    products1.setCartonPcs(24);
    products1.setVolumn(200);

    System.out.println("1 carton contains(g) : " + products1.getTotalVolumn());

    Products products2 = new Products("Kidney Health", 12, 100);
    System.out.println(products1.getName() + " contains " + products2.getCartonPcs() + " pcs in 1 carton.");
}
}