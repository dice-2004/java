public class UltraHero84 extends Hero82 {
  // UltraHeroはmpを持つ
  int mp = 100;

  //引数なしのコンストラクタ
  UltraHero84(){

  }

  // 課題 8-4 super()を使ってコンストラクタを2つ作成する
  // 引数1つのコンストラクタ
  UltraHero84(String name) {
    super(name);
  }

  // 引数2つのコンストラクタ
  UltraHero84(String name, int hp) {
    super(name, hp);
  }

  // 課題 8-4 this()を使って引数３つのコンストラクタを作成する
  // 引数3つのコンストラクタ
  UltraHero84(String name, int hp, int mp) {
    this(name, hp);
    this.mp = mp;
  }

  // 課題 8-4 「MP 数字3桁 」を表示した後、親クラスのshowを呼び出し「HP 数字3桁 | 名前」を表示する
  public void show() {
    System.out.printf("MP %3d ", this.mp);
    super.show();
  }
}
