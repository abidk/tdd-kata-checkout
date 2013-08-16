public class Checkout {

  private int total = 0;

  public void scan(String item) {
    if (item.equals("A")) {
      total = 50;
    } else if (item.equals("B")) {
      total = 30;
    } else if (item.equals("AB")) {
      total = 80;
    }
  }

  public int total() {
    return total;
  }
}
