public class Work82 {
  public static void main(String[] args) {
    Hero82 h1 = new Hero82();
    h1.show();
    Hero82 h2 = new Hero82("ミライ");
    h2.show();
    Hero82 h3 = new Hero82("函館", 300);
    h3.show();
    Monster82 m1 = new Monster82();
    m1.show();
    h1.attack(m1);
    m1.show();
    h2.attack(m1);
    m1.show();
    h3.attack(m1);
    m1.show();
    m1.attack(h1);
    h1.show();
  }
}
