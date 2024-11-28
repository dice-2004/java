public class WorkA3 {
  public static void main(String[] args) {
    MonsterA2[] monsters = new MonsterA2[4];
    monsters[0] = new SlimeA2();
    monsters[1] = new GoblinA2();
    monsters[2] = new MatangoA2();
    monsters[3] = new DeathBatA3();

    // 拡張for文を使用して、すべてのMonsterA2のメソッドrunAwayを呼び出す
    for (MonsterA2 monster : monsters) {
      monster.runAway();
    }
  }
}
