public class Work8a {
  public static void main(String[] args) {
    Hero8a h1 = new Hero8a();
    h1.show();
    Hero8a h2 = new Hero8a("ミナト");
    h2.show();
    Monster8a m1 = new Monster8a();
    m1.show();
    Monster8a m2 = new Monster8a("ばったモン");
    m2.show();
    h1.run();
    m2.run();
  }
}
