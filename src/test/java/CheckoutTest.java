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
  public void totalShouldReturnZeroWhenThereAreNoItemsScanned() {
    assertEquals(0, checkout.total());
  }

  @Test
  public void totalShouldReturn50WhenAIsScanned() {
    checkout.scan("A");
    assertEquals(50, checkout.total());
  }
}
