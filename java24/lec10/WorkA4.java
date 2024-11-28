public class WorkA4 {
  public static void main(String[] args) {
    // 以下のような方法で配列を初期化することもできます
    // この初期化により，monsters[0]にはSlimeA2のインスタンス，
    // monsters[1]にはGoblinA2のインスタンス，… が格納されます
    MonsterA2[] monsters = {
        new SlimeA2(),
        new GoblinA2(),
        new MatangoA2(),
        new DeathBatA4(), // <--- DeathBatA4であることに注意
    };

    // 拡張for文を使ってすべてのモンスターの行動を実行する
    // インスタンスが地獄コウモリ（DeathBatA4）の場合はmetamorphose
    // それ以外の場合はrunAway
    for (MonsterA2 monster : monsters) {
      if (monster instanceof DeathBatA4 bat) {
        bat.metamorphose();
      } else {
        monster.runAway();
      }
    }
  }
}
