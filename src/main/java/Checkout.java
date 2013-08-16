public class Checkout {

  private int total = 0;

  public void scan(String products) {
    String[] items = products.split("");

    for (String item : items) {
      if (item.equals("A")) {
        total += 50;
      } else if (item.equals("B")) {
        total += 30;
      } else if (item.equals("C")) {
        total += 20;
      } else if (item.equals("D")) {
        total += 15;
      }
    }
  }

  public int total() {
    return total;
  }
}
