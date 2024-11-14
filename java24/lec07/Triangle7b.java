public class Triangle7b {
  int side1; // 辺1の長さ
  int side2; // 辺2の長さ
  int side3; // 辺3の長さ

  // 3つの引数をもつコンストラクタ
  // フィールドside1, side2, side3にint型のa, b, cを代入する
  public Triangle7b(int a, int b, int c) {
    // ↓↓↓ここにコードを追加↓↓↓
    this.side1 = a;
    this.side2 = b;
    this.side3 = c;
    // ↑↑↑ここにコードを追加↑↑↑
  }

  // 三角形が構成可能かを判定するisTriangleメソッドの定義
  // 戻り値の型はboolean型で，仮引数はTriangle7b型のtを持つ
  public static boolean isTriangle(Triangle7b t) {
    boolean result = false;

    // ↓↓↓ここにコードを追加↓↓↓
    result = (t.side1 + t.side2 > t.side3) && (t.side2 + t.side3 > t.side1) && (t.side3 + t.side1 > t.side2);
    // ↑↑↑ここにコードを追加↑↑↑

    return result;
  }

  // 三辺の長さと三角形が構成可能かどうかを表示するprintInfoメソッドの定義
  // 実行例のように表示されるようにする
  // 戻り値はなしで，仮引数はTriangle7b型のtを持つ
  // このメソッド中で、三角形が構成可能かの判定にはisTriangleメソッドを利用する
  static void printInfo(Triangle7b t) {
    // ↓↓↓ここにコードを追加↓↓↓
    if (isTriangle(t)) {
      System.out.println("("+t.side1+","+t.side2+","+t.side3+")は三角形です。");
    } else {
      System.out.println("("+t.side1+","+t.side2+","+t.side3+")は三角形ではありません。");
    }
    // ↑↑↑ここにコードを追加↑↑↑
  }
}
