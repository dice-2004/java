public class Hero82 {
  String name = "ミナト";
  int hp = 100;

  // 課題8-2 コンストラクタを3つ作成する
  // 引数なしのコンストラクタ
  public Hero82() {
    return;
  }
  // 引数1つのコンストラクタ
  public Hero82(String name) {
    this.name = name;
    return;
  }
  // 引数2つのコンストラクタ
  public Hero82(String name, int hp) {
    this.name = name;
    this.hp = hp;
    return;
  }
  // 戦う
  public void attack(Monster82 m) {
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
