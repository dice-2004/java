public class Rectangle77 {
  int height; // 高さ
  int width; // 幅

  // 引数なしのコンストラクタを定義する
  // フィールドheight，widthにそれぞれ0を代入する
  // ↓↓↓ここにコードを追加↓↓↓
  public Rectangle77() {
    this.height = 0;
    this.width = 0;
  }
  // ↑↑↑ここにコードを追加↑↑↑

  // 2つの引数をもつコンストラクタを定義する
  // フィールドheight，widthにint型の引数h，wの値を代入する
  // ↓↓↓ここにコードを追加↓↓↓
  public Rectangle77(int h, int w) {
    this.height = h;
    this.width = w;
  }
  // ↑↑↑ここにコードを追加↑↑↑

  // 1つの引数をもつコンストラクタを定義する
  // フィールドheight，widthの両方にint型の引数hの値を代入する
  // ↓↓↓ここにコードを追加↓↓↓
  public Rectangle77(int h) {
    this.height = h;
    this.width = h;
  }
  // ↑↑↑ここにコードを追加↑↑↑

  // フィールドの高さと幅の値を使って
  // 長方形の面積を計算して返却する
  // calcAreaメソッドを定義する
  // 引数はなし, 戻り値はint型の面積の値
  // ↓↓↓ここにコードを追加↓↓↓
  public int calcAreea() {
    return this.height * this.width;
  }
  // ↑↑↑ここにコードを追加↑↑↑

  // 実行例のように情報を表示するprintInfoメソッドを定義する
  // 引数: なし, 戻り値: なし
  // このメソッドの中で、面積の値の計算に
  // 上で定義したcalcAreaメソッドを使ってください。
  public void printInfo() {
    // ↓↓↓ここにコードを追加↓↓↓
    if (this.height == this.width) {
      System.out.println("正方形の面積" + "(" + this.height + "x" + this.width + "):" + calcAreea());
    } else {
      System.out.println("長方形の面積" + "(" + this.height + "x" + this.width + "):" + calcAreea());
    }
    // ↑↑↑ここにコードを追加↑↑↑
  }
}
