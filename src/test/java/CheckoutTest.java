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
  public void totalShouldReturn50WhenScannedA() {
    checkout.scan("A");
    assertEquals(50, checkout.total());
  }
  
  @Test
  public void totalShouldReturn30WhenScanningB() {
    checkout.scan("B");
    assertEquals(30, checkout.total());
  }
  
  @Test
  public void totalShouldReturn80WhenScanningAB() {
    checkout.scan("AB");
    assertEquals(80, checkout.total());
  }
  
  @Test
  public void totalShouldReturn115WhenScanningABCD() {
    checkout.scan("ABCD");
    assertEquals(115, checkout.total());
  }
  
  @Test
  public void totalShouldReturn100WhenScanningAA() {
    checkout.scan("AA");
    assertEquals(100, checkout.total());
  }
}
