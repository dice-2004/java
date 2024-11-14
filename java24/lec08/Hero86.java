public class Hero86 extends Human86 {
  public void attack(Monster86 m) {
    System.out.println(this.name + "の攻撃！");
    m.hp -= 10;
    System.out.println("10ポイントのダメージをあたえた！");
  }
}
