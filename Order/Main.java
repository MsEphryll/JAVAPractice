package Order;

public class Main {
  public static void main(String[] args) {
    Person person = new Person("April", "Bitang", 20);
    // System.out.println(person);

    Products piattos = new Products("Green Piattos", 38, 7);
    Products laptop = new Products("Dell", 64000);
    System.out.println(laptop);
    System.out.println(piattos);

    Order order = new Order(person);
    order.addNewOrder(piattos, 3);
    order.addNewOrder(laptop, 2);

    System.out.println(order);
  }
}
