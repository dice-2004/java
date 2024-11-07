public class Point61 {
  // 課題6-1
  // 2次元空間上の座標 x, y に対し、 x, y 両方を d 移動させた座標を出力する。
  public static void movePoint(int x, int y, int d) {
    System.out.println("座標(" + (x + d) + "," + (y + d) + ")");
  }

  // 2次元空間上の座標 x, y をそれぞれ dx, dy 移動させた座標を出力する。
  public static void movePoint(int x, int y, int dx, int dy) {
    System.out.println("座標(" + (x + dx) + "," + (y + dy) + ")");
  }

  // 2次元空間上の座標 x, y を「座標(x,y)」の形式で出力する。
  public static void showPoint(int x, int y) {
    System.out.println("座標(" + x + "," + y + ")");
  }

  // 課題6-2
  // 2次元空間上の x 座標と y 座標が格納された配列に対し先頭から順に全て d だけ移動させる。
  public static void movePoints(int[] x, int[] y, int d) {
    for (int i = 0; i < x.length; i++) {
      x[i] += d;
      y[i] += d;
    }
  }

  // 2次元空間上の x 座標と y 座標が格納された配列 x, y に対し先頭から順に全て dx, dy 移動させる。
  public static void movePoints(int[] x, int[] y, int dx, int dy) {
    for (int i = 0; i < x.length; i++) {
      x[i] += dx;
      y[i] += dy;
    }
  }

  // 2次元空間上の x 座標と y 座標が格納された配列 x, y を先頭から順に「座標(x,y)」の形式で全て出力する。
  public static void showPoints(int[] x, int[] y) {
    for (int i = 0; i < x.length; i++) {
      System.out.println("座標(" + x[i] + "," + y[i] + ")");
    }
  }
}
