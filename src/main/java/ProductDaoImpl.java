import java.util.List;

public class ProductDaoImpl implements ProductDao {

  private List<Product> products;

  public ProductDaoImpl(List<Product> products) {
    this.products = products;
  }

  public Product load(String barcode) {
    for (Product product : products) {
      String productBarcode = product.getBarcode();
      if (productBarcode.equals(barcode)) {
        return product;
      }
    }
    return null;
  }

}
