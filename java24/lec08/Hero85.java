public class Hero85 {
  String name = "ミナト";
  int hp = 100;

  Hero85() {
    System.out.println("->Hero(引数なし)");
  }

  // 引数1つのコンストラクタ
  Hero85(String name) {
    System.out.println("->Hero(引数あり)");
    this.name = name;
  }

  // ステータスを表示する
  public void show() {
    System.out.printf("HP %3d | %s\n", this.hp, this.name);
  }
}
