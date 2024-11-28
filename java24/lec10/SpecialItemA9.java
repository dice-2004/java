public class SpecialItemA9 extends ItemA8 {
  private double rate;

  SpecialItemA9(String code, int price, int num) {
    super(code, price, num);
  }

  public void setRate(double rate) {
    if (rate < 0 || rate > 1) {
      throw new IllegalArgumentException("不正な値が入力されました");
    } else {
      this.rate = rate;
    }
  }

  @Override
  public int calcTotalPrice() {
    return (int) (super.calcTotalPrice() * (1 - this.rate));
  }

  @Override
  public void printInfo() {
    System.out.print("特売");
    super.printInfo();
  }
}
