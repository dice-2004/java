public class Monster88 {
  String name = "ばったモン";
  int hp = 100;

  Monster88(){
  }

  // 課題 8-8 コンストラクタを作成する
  Monster88(String name) {
    this.name = name;
  }

  // 課題 8-8 Hero88と戦う
  // Heroのhpを5減らす。
  // Hero名、Monster名も表示する
  public void attack(Hero88 h) {
    System.out.println(this.name + "の攻撃！");
    h.hp -= 5;
    System.out.println(h.name + "に5ポイントのダメージをあたえた！");
  }

  // 課題 8-8 UltraHero88と戦う
  // UltraHeroのhpを3減らす。
  // Hero名、Monster名も表示する
  public void attack(UltraHero88 h) {
    System.out.println(this.name + "の攻撃！");
    h.hp -= 3;
    System.out.println(h.name + "に3ポイントのダメージをあたえた！");
  }

  // 逃げる
  public void run() {
    System.out.println(this.name + "は逃げ出した！");
  }

  // ステータスを表示
  public void show() {
    System.out.printf("HP %3d | %s\n", this.hp, this.name);
  }

}
