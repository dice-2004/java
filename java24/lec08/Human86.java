public abstract class Human86 {
  String name = "名前はまだない";
  int hp = 100;

  // ステータスを表示
  public void show() {
    System.out.printf("HP %3d | %s\n", this.hp, this.name);
  }
 
  // 逃げる
  public void run() {
    System.out.println(this.name + "は逃げ出した");
  }

  // モンスターへの攻撃を行う抽象メソッド
  public abstract void attack(Monster86 m);
}
