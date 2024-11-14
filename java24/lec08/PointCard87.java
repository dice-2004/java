public class PointCard87 extends Card87 {
  private int point;

  public PointCard87(String name) {
    super(name);
    this.point = 0;
  }

  public PointCard87(String name, int point) {
    super(name);
    this.point = point;
  }

  public void show() {
    super.show();
    System.out.println(this.point+"ポイント");
  }

  public void addPoint(int price) {
    this.point = this.point + price / 10;
    System.out.println(price/10+"ポイント追加");
  }
}
