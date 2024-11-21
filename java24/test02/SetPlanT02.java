public class SetPlanT02 extends BasePlanT02 {
  OptionT02[] options;

  public SetPlanT02(String destination, int price, int distance, double discount, OptionT02[] options) {
    super(destination, price, distance, discount);
    this.options = options;
  }

  public int getPrice() {
    super.roundTrip();
    double optionPrice = 0;
    for (OptionT02 option : options) {
      optionPrice += option.price;
    }
    optionPrice *= 0.8;
    this.price += optionPrice;
    return super.discountPrice();
  }

}
