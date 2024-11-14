public class UltraHero85 extends Hero85 {
  // UltraHeroはmpを持つ
  int mp = 100;

  //引数なしのコンストラクタ
  UltraHero85(){
    System.out.println("->UltraHero(引数なし)");
  }

  // 引数1つのコンストラクタ
  UltraHero85(String name) {
    this();
    System.out.println("->UltraHero(引数あり)");
  }

  public void show() {
    System.out.printf("MP %3d HP %3d | %s\n", this.mp, super.hp, super.name);
  }
}
