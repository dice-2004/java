public class Work87 {
  public static void main(String[] args) {
    Card87 c1 = new Card87("工大太郎");
    c1.show();
    PointCard87 c2 = new PointCard87("工大次郎");
    c2.show();
    PointCard87 c3 = new PointCard87("工大三郎", 100);
    c3.show();
    for (int i = 0; i < args.length; i++) {
      c3.addPoint(Integer.parseInt(args[i]));
    }
    c3.show();
  }
}
