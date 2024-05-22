
public class tryingSomthn extends shorterString {

  public static void main(String[] args) {

    // string added to int will concatenate
    String name3 = 55 + "55";
    System.out.println(name3); // >> 5555

    // could be
    String a = "2000";
    String d = "400";
    System.out.println(Integer.parseInt(a) + d); // >> 2000400

    // int with a double value will result to compilation error
    int j = 12;
    // int k = 15.0;

    // System.out.println(int(k) + j); // compilation error
    // >> the k will be:
    int k = 15; // after the System.out.println(int(k) + j); (updates)
    System.out.println(k + j); // >> 27

    // string added to int will concatenate
    System.out.println("reality" + 40 + 50 + 0); // >> reality40500

    // from shorterString.java
    String s = "Hello World";
    String b = "Hiheyheyheyheyheyheye";

    if (myMinString(s, b) == 1) {
      System.out.println(stringOne());
    } else if (myMinString(s, b) == -1) {
      stringTwo();
    } else {
      stringThree();
    }
  }

}
