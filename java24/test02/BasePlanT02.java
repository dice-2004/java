public class BasePlanT02 {
  String destination;
  double price;
  int distance;
  double discount;

  public BasePlanT02(String destination, int price, int distance, double discount) {
    this.destination = destination;
    this.price = price;
    this.distance = distance;
    this.discount = discount;
  }

  public int getPrice() {
    roundTrip();
    return discountPrice();
  }

  public void roundTrip() {
    if (this.distance >= 601) {
      this.price = this.price * 0.9 * 2;
    } else {
      this.price = this.price * 2;
    }
  }

  public int discountPrice() {
    return (int) (this.price * (1 - discount));
  }
}
