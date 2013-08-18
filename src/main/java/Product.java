public class Product {

  private int price;
  private String barcode;

  public Product(String barcode, int price) {
    this.barcode = barcode;
    this.price = price;
  }

  public String getBarcode() {
    return barcode;
  }

  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}
