public class Work71 {
  public static void main(String[] args) {

    // 2次元平面上の点p1のインスタンスを生成
    Point71 p1 = new Point71();

    // 点p1のx, y座標を設定
    p1.x = 7;
    p1.y = 8;
    // 別の点p2のインスタンスを生成
    Point71 p2 = new Point71();

    // 点p2のx, y座標を設定
    // ↓↓↓ここにコードを追加↓↓↓
    p2.x = 9;
    p2.y = 10;
    // ↑↑↑ここにコードを追加↑↑↑

    // 現時点での座標を表示してみる
    System.out.println("点p1の座標: (" + p1.x + "," + p1.y + ")");
    System.out.println("点p2の座標: (" + p2.x + "," + p2.y + ")");

    // 点p2のインスタンスの変数に、点p1のインスタンスの変数の内容を
    // コピーした後、点p2の座標の値を違う値に変えるとどうなるか実験。
    // ↓↓↓ここのコメントを外す↓↓↓
    p2 = p1;
    p2.x = 5;
    p2.y = 6;
    // ↑↑↑ここのコメントを外す↑↑↑

    System.out.println("-----------------------");

    // 点p1の座標と点p2の座標を表示してみる
    System.out.println("点p1の座標: (" + p1.x + "," + p1.y + ")");
    System.out.println("点p2の座標: (" + p2.x + "," + p2.y + ")");
  }
}
