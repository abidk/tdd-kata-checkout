import java.util.Map;

public interface DiscountCalculator {

  int calculate(Map<Product, Integer> items);
}
