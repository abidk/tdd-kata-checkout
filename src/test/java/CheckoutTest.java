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
  
  @Test
  public void totalShouldReturn30WhenBIsScanned() {
    checkout.scan("B");
    assertEquals(30, checkout.total());
  }
  
  @Test
  public void totalShouldReturn80WhenABAreScanned() {
    checkout.scan("AB");
    assertEquals(80, checkout.total());
  }
}
