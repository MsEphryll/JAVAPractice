package Order;

public class Products implements Taxables {
  private String name, code;
  protected double price;
  protected double taxRate = 0.25;

  public Products(String name, double price) {
    this.name = name;
    this.price = price;
  }

  // public String getName {
  // return pname;
  // }

  // public void setName(pname){
  // this.name = pname;
  // }

  public Products(String name, double price, double taxRate) {
    this.name = name;
    this.price = price;
    this.taxRate = taxRate;
  }

  public void generateCode() {
    this.code = "Code generated";
    System.out.println(this.code);
  }

  public double computeFinalPrice() {
    return this.price + computeTax();
  }

  @Override
  public double computeTax() {
    return this.price * this.taxRate;
  }

  @Override
  public String toString() {
    return "Product Name: " + this.name + "\tBase price: " + this.price + "\tTax: " + this.taxRate;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
