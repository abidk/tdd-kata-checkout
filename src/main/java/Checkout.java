import java.util.HashMap;
import java.util.Map;

public class Checkout {

  private Map<String, Integer> items = new HashMap<String, Integer>();
  private DiscountCalculator discountCalculator;

  public Checkout(DiscountCalculator discountCalculator) {
    this.discountCalculator = discountCalculator;

  }

  public void scan(String item) {
    int itemCount = items.get(item) != null ? items.get(item) : 0;
    items.put(item, itemCount + 1);
  }

  public int total() {
    return calculateFullPrice() - discountCalculator.calculate(items);
  }

  private int calculateFullPrice() {
    int totalPrice = 0;
    for (Map.Entry<String, Integer> itemCount : items.entrySet()) {
      String item = itemCount.getKey();
      int count = itemCount.getValue();

      for (int x = 0; x < count; x++) {
        totalPrice += getItemPrice(item);
      }
    }
    return totalPrice;
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
