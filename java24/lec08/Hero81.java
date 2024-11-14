public class Hero81 {
  String name = "ミナト";
  int hp = 100;

  // 戦う
  public void attack(Monster81 m) {
    System.out.println(this.name + "の攻撃！");
    m.hp -= 5;
    System.out.println("5ポイントのダメージをあたえた！");
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