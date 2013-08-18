import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProductTest {

  @Test
  public void testConstructorInitiatesObjectCorrectly() {
    Product product = new Product("ABC", 2);

    assertEquals("ABC", product.getBarcode());
    assertEquals(2, product.getPrice());
  }

}
