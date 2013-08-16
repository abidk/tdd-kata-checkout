import java.util.Map;

public class DiscountCalculator implements Calculator {

  public DiscountCalculator() {
  }

  public int calculate(Map<String, Integer> items) {
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
}
