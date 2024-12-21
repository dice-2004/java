public class MonsterT03 {
  private String name;
  private int health;
  private int attack;

  public MonsterT03(String name, int health, int attack) {
    this.name = name;
    this.health = health;
    this.attack = attack;
  }

  public String getName() {
    return name;
  }

  public int getHealth() {
    return health;
  }

  public int getAttack() {
    return attack;
  }

  public String toString() {
    return String.format("「モンスター」%-10s「HP」%5d「攻撃力」%5d\n", name, health, attack);
  }
}
