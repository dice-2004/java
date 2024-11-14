public class Monster82 {
  String name = "ばったモン";
  int hp = 100;

  // 戦う
  public void attack(Hero82 h) {
    System.out.println(this.name + "の攻撃！");
    System.out.println("ダメージをあたえることができなかった");
  }

  // 逃げる
  public void run() {
    System.out.println(this.name + "は逃げ出した！");
  }

  // ステータスを表示する
  public void show() {
    System.out.printf("HP %3d | %s\n", this.hp, this.name);
  }

}
