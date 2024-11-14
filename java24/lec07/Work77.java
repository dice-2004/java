public class Work77 {
  public static void main(String[] args) {
    // 以下、クラス名がRectangle77Baseとなっているところは、
    // Rectangle77に変更すること

    // 引数が0個のコンストラクタを呼び出し、
    // インスタンスr1を生成する
    Rectangle77 r1 = new Rectangle77();

    // 引数をint型2個のコンストラクタを呼び出し、
    // 高さ4, 幅5を持つインスタンスr2を生成する
    // ↓↓↓ここにコードを追加↓↓↓
    Rectangle77 r2 = new Rectangle77(4, 5);
    // ↑↑↑ここにコードを追加↑↑↑

    // 引数をint型1個のコンストラクタを呼び出し、
    // 高さと幅がどちらも9のインスタンスr3を生成する
    // ↓↓↓ここにコードを追加↓↓↓
    Rectangle77 r3 = new Rectangle77(9);
    // ↑↑↑ここにコードを追加↑↑↑

    // printInfoメソッドを呼び出してr1の情報を実行例どおりに出力
    r1.printInfo();

    // printInfoメソッドを呼び出してr2の情報を実行例どおりに出力
    // ↓↓↓ここにコードを追加↓↓↓
    r2.printInfo();
    // ↑↑↑ここにコードを追加↑↑↑

    // printInfoメソッドを呼び出してr3の情報を実行例どおりに出力
    // ↓↓↓ここにコードを追加↓↓↓
    r3.printInfo();
    // ↑↑↑ここにコードを追加↑↑↑
  }
}
