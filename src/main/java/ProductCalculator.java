import java.util.Map;

public class ProductCalculator implements Calculator {

  private Map<String, Product> products;

  public ProductCalculator(Map<String, Product> products) {
    this.products = products;
  }

  public int calculate(Map<String, Integer> items) {
    int totalPrice = 0;
    for (Map.Entry<String, Integer> itemCount : items.entrySet()) {
      String item = itemCount.getKey();
      int count = itemCount.getValue();

      Product product = products.get(item);
      totalPrice += (count * product.getPrice());
    }
    return totalPrice;
  }
}
