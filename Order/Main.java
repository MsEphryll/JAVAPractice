package Order;

public class Main {
  public static void main(String[] args) {
    Person person = new Person("April", "Bitang", 20);
    // System.out.println(person);

    Products products = new Products("Green Piattos", "20123", 38, 7);
    // System.out.println(products);

    Order order = new Order(person);
    order.addNewOrder(products, 3);
    order.addNewOrder(products, 3);
    order.addNewOrder(products, 3);
    order.addNewOrder(products, 3);
    order.addNewOrder(products, 4);
    order.addNewOrder(products, 3);
    order.addNewOrder(products, 3);
    order.addNewOrder(products, 3);
    order.addNewOrder(products, 3);
    order.addNewOrder(products, 3);
    order.addNewOrder(products, 4);
    order.addNewOrder(products, 3);
    System.out.println(order);
  }
}
