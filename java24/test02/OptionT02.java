public class OptionT02 {
  String name;
  int price;

  public OptionT02(String name, int price) {
    this.name = name;
    this.price = price;
  }

  public void printOption() {
    System.out.printf("%10s/%8d円\n", this.name, this.price);
  }
}
