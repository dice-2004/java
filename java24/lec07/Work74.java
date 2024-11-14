import java.util.Scanner;

public class Work74 {
  public static void main(String[] args) {
    // Scannerクラスのインスタンスを作成する
    // ↓↓↓ここにコードを追加↓↓↓
    Scanner sc = new Scanner(System.in);
    // ↑↑↑ここにコードを追加↑↑↑

    // p1のx座標とy座標(実数値)を実行例のようにキーボードから入力してインスタンスp1を生成する
    System.out.println("点p1の座標を入力");
    // ↓↓↓行頭のコメントを外し、このコードを修正↓↓↓
    double x1 = Double.parseDouble(sc.next());
    double y1 = Double.parseDouble(sc.next());
    sc.nextLine();
    Point74 p1 = new Point74(x1, y1);
    // ↑↑↑このコードを修正↑↑↑

    // p2のx座標とy座標(実数値)を実行例のようにキーボードから入力してインスタンスp2を生成する
    System.out.println("点p2の座標を入力");
    // ↓↓↓行頭のコメントを外し、このコードを修正↓↓↓
    double x2 = Double.parseDouble(sc.next());
    double y2 = Double.parseDouble(sc.next());
    sc.nextLine();
    Point74 p2 = new Point74(x2, y2);
    // ↑↑↑このコードを修正↑↑↑

    // calcMidpointメソッドを利用して2点の中点pmを求める
    // ↓↓↓行頭のコメントを外し、このコードを修正↓↓↓
    Point74 pm = new Point74();
    pm = calcMidpoint(p1, p2);
    // ↑↑↑このコードを修正↑↑↑

    // 中点pmの座標を表示
    // ↓↓↓このコードを修正↓↓↓
    System.out.println("中点(" +pm.x +"," +pm.y+ ")");
    // ↑↑↑このコードを修正↑↑↑

    // Scannerクラスのインスタンスをクローズする
    // ↓↓↓ここにコードを追加↓↓↓
    sc.close();
    // ↑↑↑ここにコードを追加↑↑↑
  }

  // 中点を算出して返却するcalcMidpointメソッド
  // 返却値および仮引数の型はPoint74型
  // （以下、行頭のコメントを外した後、
  // 「ここにコードを追加」の部分にコードを追加）
  // ↓↓↓次行から行頭のコメントを外す
  public static Point74 calcMidpoint(Point74 p1, Point74 p2) {
    // ↓↓↓ここにコードを追加↓↓↓
    Point74 pm = new Point74((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
   // ↑↑↑ここにコードを追加↑↑↑

  return pm;
  }
  // ↑↑↑この上の行まで、行頭のコメントを外す
}
