package Order;

public class Person {
  private String fname;
  private String lname;
  private double age;

  public Person(String fname, String lname, double age) {
    this.fname = fname;
    this.lname = lname;
    this.age = age;
  }

  public String getFullName() {
    return fname + " " + lname;
  }

  public String toString() {
    return getFullName() + " \tAge: " + (int) age;
  }
}
