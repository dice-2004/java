public class UltraMonster89 extends Monster88 {

  UltraMonster89() {
  }

  // 課題 8-9 コンストラクタを作成する
  UltraMonster89(String name) {
    super(name);
  }

  // 課題 8-9 Heroに50のダメージを与える
  public void attack(Hero88 h) {
    System.out.println(this.name + "の攻撃！");
    h.hp -= 50;
    System.out.println(h.name + "に50ポイントのダメージをあたえた！");
  }

  // 課題 8-9 UltraHeroに25のダメージを与える
  public void attack(UltraHero88 h) {
    System.out.println(this.name + "の攻撃！");
    h.hp -= 25;
    System.out.println(h.name + "に25ポイントのダメージをあたえた！");
  }

}
