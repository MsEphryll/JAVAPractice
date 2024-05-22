package Order;

public class Order implements Taxables {
  // public Order(Products[] product, double[] qty, Person customer) {
  // this.product = product;
  // this.qty = qty;
  // this.customer = customer;
  // }

  private Products[] product;
  private double[] qty;
  private Person customer;

  public Order(Person customer) {
    this.customer = customer;
  }

  public void addNewOrder(Products item, double quantity) {

  }

  @Override
  public double computeTax() {

  }
}
