import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class DiscountCalculatorTest {

  @Test
  public void shouldNotDiscountWhenScannedItemDoesNotExist() {
    Map<String, Discount> discounts = new HashMap<String, Discount>();
    discounts.put("A", new Discount(3, 20));
    DiscountCalculatorImpl calculator = new DiscountCalculatorImpl(discounts);

    Map<Product, Integer> scannedItems = new HashMap<Product, Integer>();
    scannedItems.put(new Product("B", 1), 7);
    assertEquals(0, calculator.calculate(scannedItems));
  }
  
  @Test
  public void shouldReturnCorrectDiscountForItemSpecified() {
    Map<String, Discount> discounts = new HashMap<String, Discount>();
    discounts.put("A", new Discount(3, 20));
    DiscountCalculatorImpl calculator = new DiscountCalculatorImpl(discounts);

    Map<Product, Integer> scannedItems = new HashMap<Product, Integer>();
    scannedItems.put(new Product("A", 1), 2);
    assertEquals(0, calculator.calculate(scannedItems));

    scannedItems.put(new Product("A", 1), 3);
    assertEquals(20, calculator.calculate(scannedItems));
  }

  @Test
  public void shouldReturnCorrectDiscountForMultipleDiscountedItems() {
    Map<String, Discount> discounts = new HashMap<String, Discount>();
    discounts.put("A", new Discount(3, 20));
    DiscountCalculatorImpl calculator = new DiscountCalculatorImpl(discounts);

    Map<Product, Integer> scannedItems = new HashMap<Product, Integer>();
    scannedItems.put(new Product("A", 1), 7);
    assertEquals(40, calculator.calculate(scannedItems));
  }
}
