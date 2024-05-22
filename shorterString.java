public class shorterString {

  public static int myMinString(String a, String b) {
    if (a.length() < b.length()) {
      return 1;
    } else if (a.length() > b.length()) {
      return -1;
    } else {
      return 0;
    }
  }

  public static String stringOne() {
    return "String 1 is shorter than the second";
  }

  public static void stringTwo() {
    System.out.println("Second string is shorter than String 1");
  }

  public static String stringThree() {
    return "they are equal";
  }

}
