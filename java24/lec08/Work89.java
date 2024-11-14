public class Work89 {
  public static void main(String[] args) {
    Hero88 h1 = new Hero88();
    h1.show();
    Hero88 h2 = new Hero88("ミライ");
    h2.show();
    UltraHero88 h3 = new UltraHero88("函館", 300);
    h3.show();
    UltraHero88 h4 = new UltraHero88("小樽", 300, 200);
    h4.show();
    Monster88 m1 = new Monster88();
    m1.show();
    UltraMonster89 m2 = new UltraMonster89("粉モン");
    m2.show();
    for (int i = 0; i < args.length; i++) {
      if (args[i].substring(0, 1).equals("h")) {
        switch (Integer.parseInt(args[i].substring(1, 2))) {
        case 1:
          h1.attack(m1);
          break;
        case 2:
          h2.attack(m1);
          break;
        case 3:
          h3.attack(m1);
          break;
        case 4:
          h4.attack(m1);
          break;
        }
      }
      if (args[i].substring(0, 1).equals("m")) {
        switch (Integer.parseInt(args[i].substring(1, 2))) {
        case 1:
          m1.attack(h1);
          break;
        case 2:
          m1.attack(h2);
          break;
        case 3:
          m1.attack(h3);
          break;
        case 4:
          m1.attack(h4);
          break;
        }
      }
      if (args[i].substring(0, 1).equals("M")) {
        switch (Integer.parseInt(args[i].substring(1, 2))) {
        case 1:
          m2.attack(h1);
          break;
        case 2:
          m2.attack(h2);
          break;
        case 3:
          m2.attack(h3);
          break;
        case 4:
          m2.attack(h4);
          break;
        }
      }
    }
    h1.show();
    h2.show();
    h3.show();
    h4.show();
    m1.show();
    m2.show();
  }
}
