public class ItemB6 {
  private String itemName;
  private double price;

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getItemName() {
    return itemName;
  }

  public double getPrice() {
    return price;
  }

  public String toString() {
      return String.format("アイテム「%s」価格「%.1f円」", itemName, price);
  }
}
