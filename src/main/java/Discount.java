public class Discount {

  private int threshold;
  private int discount;

  public Discount(int threshold, int discount) {
    this.threshold = threshold;
    this.discount = discount;
  }

  public int getThreshold() {
    return threshold;
  }

  public void setThreshold(int threshold) {
    this.threshold = threshold;
  }

  public int getDiscount() {
    return discount;
  }

  public void setDiscount(int discount) {
    this.discount = discount;
  }

}
