import java.util.HashMap;
import java.util.Map;

public class Checkout {

  private Map<String, Integer> items = new HashMap<String, Integer>();
  private DiscountCalculator discountCalculator;

  public Checkout() {
  }

  public void scan(String item) {
    int itemCount = items.get(item) != null ? items.get(item) : 0;
    items.put(item, itemCount + 1);
  }

  public int total() {
    int total = calculateFullPrice();

    if (discountCalculator != null) {
      total -= discountCalculator.calculate(items);
    }
    return total;
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

  public void setDiscountCalculator(DiscountCalculator discountCalculator) {
    this.discountCalculator = discountCalculator;
  }

}
