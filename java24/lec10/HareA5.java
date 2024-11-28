// AnimalA5クラスを継承する
public class HareA5 extends AnimalA5 {
  private int energy;

  public HareA5(int energy) {
    this.energy = energy;
  }

  // AnimalA5クラスのmoveメソッドをオーバーライドする
  // energyが11以上であれば10だけ消費し「走る」と出力
  // energyが11未満であれば「寝て」3だけ回復し、回復した後のenergyを出力
  public void move() {
    if (energy >= 11) {
      energy -= 10;
      System.out.println("走る");
    } else {
      energy += 3;
      System.out.println("寝て体力を" + energy + "に回復する");
    }
  }
}
