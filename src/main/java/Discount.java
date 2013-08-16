public class Discount {

  private int maxQuantity;
  private int discount;

  public Discount(int maxQuantity, int discount) {
    this.maxQuantity = maxQuantity;
    this.discount = discount;
  }

  public int getMaxQuantity() {
    return maxQuantity;
  }

  public void setMaxQuantity(int maxQuantity) {
    this.maxQuantity = maxQuantity;
  }

  public int getDiscount() {
    return discount;
  }

  public void setDiscount(int discount) {
    this.discount = discount;
  }

}
