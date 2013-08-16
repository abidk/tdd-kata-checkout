public class Checkout {

  private int total = 0;
  private int countA = 0;

  public void scan(String products) {
    String[] items = products.split("");

    for (String item : items) {
      total += getItemPrice(item);
      total -= getDiscountPrice(item);
    }
  }

  private int getDiscountPrice(String item) {
    if (item.equals("A")) {
      countA++;
    }

    if (countA == 3) {
      return 20;
    }
    return 0;
  }

  private int getItemPrice(String item) {
    if (item.equals("A")) {
      return 50;
    } else if (item.equals("B")) {
      return 30;
    } else if (item.equals("C")) {
      return 20;
    } else if (item.equals("D")) {
      return 15;
    }
    return 0;
  }

  public int total() {
    return total;
  }
}
