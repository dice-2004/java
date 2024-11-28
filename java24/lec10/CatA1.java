// AnimalA1クラスを継承する
public class CatA1 extends AnimalA1 {
  // AnimalA1クラスの抽象メソッドmakeSoundをオーバーライドする
  public void makeSound() {
    System.out.print("ニャー");
  }
  // AnimalA1クラスのメソッドrunをオーバーライドする
  public void run() {
    System.out.print("足音を立てずに");
    super.run();
  }
}
