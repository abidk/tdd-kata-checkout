import java.util.Map;

public class ItemCalculator implements Calculator {

  public ItemCalculator() {
  }

  public int calculate(Map<String, Integer> items) {
    int totalPrice = 0;
    for (Map.Entry<String, Integer> itemCount : items.entrySet()) {
      String item = itemCount.getKey();
      int count = itemCount.getValue();

      for (int x = 0; x < count; x++) {
        totalPrice += getItemPrice(item);
      }
    }
    return totalPrice;
  }

  private int getItemPrice(String item) {
    if (item.equals("A")) {
      return 50;
    } else if (item.equals("B")) {
      return 30;
    } else if (item.equals("C")) {
      return 20;
    } else if (item.equals("D")) {
      return 15;
    }
    return 0;
  }
}
