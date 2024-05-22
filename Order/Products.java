package Order;

public class Products implements Taxables {
  private String name, code;
  protected double price;
  protected double taxRate = 0.25;

  public Products(String name, String code, double price) {
    this.name = name;
    this.code = code;
    this.price = price;
  }

  public Products(String name, String code, double price, double taxRate) {
    this.name = name;
    this.code = code;
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
    return "Name: " + this.name + "\tOrder price: " + computeFinalPrice() + "\tTax: " + this.taxRate;
  }
}
