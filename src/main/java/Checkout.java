import java.util.HashMap;
import java.util.Map;

public class Checkout {

  private Map<String, Integer> items = new HashMap<String, Integer>();

  public void scan(String item) {
    int itemCount = items.get(item) != null ? items.get(item) : 0;
    items.put(item, itemCount + 1);
  }

  public int total() {
    int total = 0;

    for (Map.Entry<String, Integer> itemCount : items.entrySet()) {
      String item = itemCount.getKey();
      int count = itemCount.getValue();

      for (int x = 0; x < count; x++) {
        total += getItemPrice(item);
      }
    }

    total -= calculateDiscounts();

    return total;
  }

  private int calculateDiscounts() {
    int totalDiscount = 0;

    for (Map.Entry<String, Integer> itemCount : items.entrySet()) {
      String item = itemCount.getKey();
      int count = itemCount.getValue();

      totalDiscount += getItemDiscount(item, count);
    }

    return totalDiscount;
  }

  private int getItemDiscount(String item, int count) {
    int itemDiscount = 0;
    for (int x = 0; x <= count; x++) {
      if (item.equals("A")) {
        if (x > 0 && x % 3 == 0) {
          itemDiscount += 20;
        }
      } else if (item.equals("B")) {
        if (x > 0 && x % 2 == 0) {
          itemDiscount += 15;
        }
      }
    }
    return itemDiscount;
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

}
