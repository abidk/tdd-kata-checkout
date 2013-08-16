import java.util.Map;

public class DiscountCalculator implements Calculator {

  private Map<String, Discount> discounts;

  public DiscountCalculator(Map<String, Discount> discounts) {
    this.discounts = discounts;
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

  private int getItemDiscount(String item, int quantity) {
    int itemDiscount = 0;

    Discount discount = discounts.get(item);
    if (discount != null) {
      itemDiscount += discount.getDiscount() * (quantity / discount.getThreshold());
    }
    return itemDiscount;
  }
}
