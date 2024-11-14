public class Work81 {
  public static void main(String[] args) {
    Hero81 h1 = new Hero81();
    h1.show();
    h1.name = "ミライ";
    h1.hp = 200;
    h1.show();
    Monster81 m1 = new Monster81();
    m1.show();
    h1.attack(m1);
    m1.show();
    m1.attack(h1);
    h1.show();
  }
}
