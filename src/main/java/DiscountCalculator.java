import java.util.Map;

public class DiscountCalculator implements Calculator {

  private Map<String, Discount> discounts;

  public DiscountCalculator(Map<String, Discount> discounts) {
    this.discounts = discounts;
  }

  public int calculate(Map<Product, Integer> items) {
    int totalDiscount = 0;

    for (Map.Entry<Product, Integer> itemCount : items.entrySet()) {
      Product product = itemCount.getKey();
      int count = itemCount.getValue();

      totalDiscount += getItemDiscount(product, count);
    }

    return totalDiscount;
  }

  private int getItemDiscount(Product product, int quantity) {
    int itemDiscount = 0;

    Discount discount = discounts.get(product.getBarcode());
    if (discount != null) {
      itemDiscount += discount.getDiscount() * (quantity / discount.getThreshold());
    }
    return itemDiscount;
  }
}
