import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ProductDaoImplTest {

  private ProductDaoImpl dao;

  @Before
  public void setUp() {
    List<Product> products = new ArrayList<Product>();
    products.add(new Product("A", 50));
    products.add(new Product("B", 100));
    dao = new ProductDaoImpl(products);
  }

  @Test
  public void loadShouldReturnNullWhenItemDoesNotExist() {
    assertEquals(null, dao.load("ABC"));
  }

  @Test
  public void loadShouldReturnCorrectProduct() {
    assertEquals(50, dao.load("A").getPrice());
    assertEquals(100, dao.load("B").getPrice());
  }

}
