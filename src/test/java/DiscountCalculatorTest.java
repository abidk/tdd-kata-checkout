import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class DiscountCalculatorTest {

  @Test
  public void shouldReturnCorrectDiscountForItemSpecified() {
    Map<String, Discount> discounts = new HashMap<String, Discount>();
    discounts.put("A", new Discount(3, 20));
    DiscountCalculator calculator = new DiscountCalculator(discounts);

    Map<String, Integer> items = new HashMap<String, Integer>();
    items.put("A", 2);
    assertEquals(0, calculator.calculate(items));

    items.put("A", 3);
    assertEquals(20, calculator.calculate(items));
  }

  @Test
  public void shouldReturnCorrectDiscountForMultipleDiscountedItems() {
    Map<String, Discount> discounts = new HashMap<String, Discount>();
    discounts.put("A", new Discount(3, 20));
    DiscountCalculator calculator = new DiscountCalculator(discounts);

    Map<String, Integer> items = new HashMap<String, Integer>();
    items.put("A", 7);
    assertEquals(40, calculator.calculate(items));
  }
}
