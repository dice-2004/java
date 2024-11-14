// 抽象クラス Human8a
public abstract class Human8a {
  String name = "名前はまだない";
  int hp = 100;

  // 引数なしのコンストラクタ
  Human8a() {
  }

  // 引数1つのコンストラクタ
  Human8a(String name) {
    this.name = name;
  }

  // 逃げる
  public void run() {
    System.out.printf("%s %s は逃げ出した！\n", type(), this.name);
  }

  // ステータスを表示
  public void show() {
    System.out.printf("%s HP %3d | %s\n", type(), this.hp, this.name);
  }

  // タイプの文字列を返す抽象メソッドtype()を記述
  public abstract String type();
}
