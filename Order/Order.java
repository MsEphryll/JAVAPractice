package Order;

public class Order implements Taxables {

  private Products[] product;
  private double[] qty;
  private Person customer;
  private int count = 0;

  public Order(Person customer) {
    this.customer = customer;
    product = new Products[10];
    qty = new double[10];
  }

  public void addNewOrder(Products item, double quantity) {
    if (count < product.length) {
      product[count] = item;
      qty[count] = quantity;
      count++;
    } else {
      System.out.println("Order is full");
    }
  }

  public double getOrderPrice() {
    double totalPrice = 0.0;
    for (int i = 0; i < count; i++) {
      totalPrice += product[i].computeFinalPrice() * qty[i];
    }
    return totalPrice;
  }

  @Override
  public double computeTax() {
    double totalTax = 0.0;
    for (int i = 0; i < count; i++) {
      totalTax += product[i].computeTax() * qty[i];
    }
    return totalTax;
  }

  @Override
  public String toString() {
    return "Customer: " + customer + "\t\nNumber of items: " + count + "\tTotal Price: " + getOrderPrice();
  }
}
