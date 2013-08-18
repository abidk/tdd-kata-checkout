import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DiscountTest {

  @Test
  public void testConstructorInitiatesObjectCorrectly() {
    Discount discount = new Discount(1, 2);

    assertEquals(1, discount.getThreshold());
    assertEquals(2, discount.getDiscount());
  }

}
