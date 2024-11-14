public class UltraHero88 extends Hero88 {
  // UltraHeroはmpを持つ
  private int mp = 100;

  // 引数なしのコンストラクタ
  UltraHero88() {
  }

  // 課題8-8 コンストラクタを3つ作成する
  // 引数1つのコンストラクタ
  UltraHero88(String name) {
    super(name);
  }

  // 引数2つのコンストラクタ
  UltraHero88(String name, int hp) {
    super(name, hp);
  }

  // 引数3つのコンストラクタ
  UltraHero88(String name, int hp, int mp) {
    super(name, hp);
    this.mp = mp;
  }

  // ステータスを表示する
  public void show() {
    System.out.printf("MP %3d ", this.mp);
    super.show();
  }

  // 課題 8-8
  // MPを20消費してMonsterに10のダメージを与える
  // Hero名、Monster名も表示する
  public void attack(Monster88 m) {
    System.out.println(this.name + "の攻撃！");
    if (this.mp < 20) {
      System.out.println("MPがたりない");
      super.attack(m);
    } else {
      this.mp -= 20;
      m.hp -= 10;
      System.out.println(m.name + "に10ポイントのダメージをあたえた！");
    }
  }

}
