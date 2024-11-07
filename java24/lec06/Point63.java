public class Point63 {
  int x; // x 座標
  int y; // y 座標

  // x, y 座標を両方とも d だけ移動させる。
  public void move(int d) {
    this.x += d;
    this.y += d;
  }

  // x, y 座標をそれぞれ dx, dy だけ移動させる。
  public void move(int dx, int dy) {
    this.x += dx;
    this.y += dy;
  }

  // 座標を "座標(x,y)" の形式で出力する。
  public void show() {
    System.out.println("座標(" + this.x + "," + this.y + ")");
  }
}
