public class HeroT03 {
  private String name;
  private int health;
  private int attack;
  private int defense;

  public HeroT03(String name, int health, int attack, int defense) {
    this.name = name;
    this.health = health;
    this.attack = attack;
    this.defense = defense;
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

  public int getDefense() {
    return defense;
  }

  public String toString() {
    return String.format("「勇者」%-10s「HP」%5d「攻撃力」%5d「防御力」%5d\n", name, health, attack, defense);
  }
}
