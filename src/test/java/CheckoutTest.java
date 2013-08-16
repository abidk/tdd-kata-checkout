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
    scanMultipleItems("AB");
    assertEquals(80, checkout.total());
  }

  @Test
  public void totalShouldReturn115WhenScanningABCD() {
    scanMultipleItems("ABCD");
    assertEquals(115, checkout.total());
  }

  @Test
  public void totalShouldReturn100WhenScanningAA() {
    scanMultipleItems("AA");
    assertEquals(100, checkout.total());
  }

  @Test
  public void totalShouldReturn130WhenScanningAAA() {
    scanMultipleItems("AAA");
    assertEquals(130, checkout.total());
  }

  @Test
  public void totalShouldReturn180WhenScanningAAAA() {
    scanMultipleItems("AAAA");
    assertEquals(180, checkout.total());
  }

  @Test
  public void totalShouldReturn230WhenScanningAAAAA() {
    scanMultipleItems("AAAAA");
    assertEquals(230, checkout.total());
  }

  @Test
  public void totalShouldReturn260WhenScanningAAAAAA() {
    scanMultipleItems("AAAAAA");
    assertEquals(260, checkout.total());
  }

  @Test
  public void totalShouldReturn160WhenScanningAAAB() {
    scanMultipleItems("AAAB");
    assertEquals(160, checkout.total());
  }

  @Test
  public void totalShouldReturn45WhenScanningBB() {
    scanMultipleItems("BB");
    assertEquals(45, checkout.total());
  }

  @Test
  public void totalShouldReturn175WhenScanningAAABB() {
    scanMultipleItems("AAABB");
    assertEquals(175, checkout.total());
  }

  @Test
  public void totalShouldReturn190WhenScanningAAABBD() {
    scanMultipleItems("AAABBD");
    assertEquals(190, checkout.total());
  }

  @Test
  public void totalShouldReturn190WhenScanningDABABA() {
    scanMultipleItems("DABABA");
    assertEquals(190, checkout.total());
  }

  private void scanMultipleItems(String products) {
    String[] items = products.split("");

    for (String item : items) {
      checkout.scan(item);
    }
  }
}
