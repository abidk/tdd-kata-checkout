import java.util.HashMap;
import java.util.Map;

public class Checkout {

  private Map<String, Integer> items = new HashMap<String, Integer>();
  private DiscountCalculator discountCalculator;
  private ItemCalculator itemCalculator;

  public Checkout(ItemCalculator itemCalculator) {
    this.itemCalculator = itemCalculator;
  }

  public void scan(String item) {
    int itemCount = items.get(item) != null ? items.get(item) : 0;
    items.put(item, itemCount + 1);
  }

  public int total() {
    int total = itemCalculator.calculate(items);

    if (discountCalculator != null) {
      total -= discountCalculator.calculate(items);
    }
    return total;
  }

  public void setDiscountCalculator(DiscountCalculator discountCalculator) {
    this.discountCalculator = discountCalculator;
  }

}
