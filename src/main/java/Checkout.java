import java.util.HashMap;
import java.util.Map;

public class Checkout {

  private Map<String, Integer> itemCounter = new HashMap<String, Integer>();
  private int total = 0;

  public void scan(String products) {
    String[] items = products.split("");

    for (String item : items) {
      total += getItemPrice(item);

      int itemCount = itemCounter.get(item) != null ? itemCounter.get(item) : 0;
      itemCounter.put(item, ++itemCount);
    }

    total -= getTotalDiscounts();
  }

  private int getTotalDiscounts() {
    int totalDiscount = 0;

    for (Map.Entry<String, Integer> itemCount : itemCounter.entrySet()) {
      String item = itemCount.getKey();
      int count = itemCount.getValue();
      totalDiscount += getItemDiscount(item, count);
    }

    return totalDiscount;
  }

  private int getItemDiscount(String item, int count) {
    int bundleDiscount = 0;
    for (int x = 0; x <= count; x++) {
      if (item.equals("A")) {
        if (x > 0 && x % 3 == 0) {
          bundleDiscount += 20;
        }
      }
    }
    return bundleDiscount;
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
