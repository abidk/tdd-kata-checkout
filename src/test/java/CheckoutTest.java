import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CheckoutTest {

  private Checkout checkout;

  @Before
  public void setUp() {
    checkout = new Checkout();
  }

  @Test
  public void totalShouldReturnZeroWhenThereAreNoItems() {
    assertEquals(0, checkout.total());
  }
}
