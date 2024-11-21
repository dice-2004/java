public class Work92 {
  public static void main(String[] args) {
    if (args.length != 3) {
      System.out.println("コマンドライン引数を3個指定してください");
    } else {
      Box92 box = new Box92();
      box.height = Integer.parseInt(args[0]);
      box.width = Integer.parseInt(args[1]);
      box.depth = Integer.parseInt(args[2]);
      box.printData();
      System.out.println("-----");
      double hR = 4.0;
      double wR = 0.5;
      double dR = 2.5;
      scale(box, hR, wR, dR);
      box.printData();
      System.out.println("-----");
      double r = 3.0;
      scale(box, r);
      box.printData();
    }
  }

  // 仮引数 c の幅を 高さを hRatio 倍、wRatio 倍、奥行きを dRatio 倍する。
  public static void scale(Box92 c, double hRatio, double wRatio, double dRatio) {
    c.height *= hRatio;
    c.width *= wRatio;
    c.depth *= dRatio;
  }

  // 仮引数 c の幅、高さ、奥行きを ratio 倍する。
  public static void scale(Box92 c, double ratio) {
    scale(c, ratio, ratio, ratio);
  }
}
