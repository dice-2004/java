// AnimalA5クラスを継承する
public class TortoiseA5 extends AnimalA5 {
  // AnimalA5クラスのmoveメソッドをオーバーライドする
  public void move() {
    System.out.print("ゆっくり");
    super.move();
  }
}
