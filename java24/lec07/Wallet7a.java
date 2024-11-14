public class Wallet7a {
  int money;

  // 引数なしコンストラクタ
  // フィールドmoneyにデフォルト値の5000を代入する
  public Wallet7a() {
    this.money = 5000;
  }

  // 1個の引数(int型)をもつコンストラクタ
  // フィールドmoneyにint型の引数mの値を代入する
  // ↓↓↓ここにコードを追加↓↓↓
  public Wallet7a(int m) {
    this.money = m;
  }
  // ↑↑↑ここにコードを追加↑↑↑

  // enoughMoneyメソッドを定義する
  // 仮引数: int型のprice
  // 戻り値: boolean型(priceの額の品物が購入可能なら「真」、お金が不足していたら「偽」)
  // 内容: price円の品物が購入できるだけの所持金があるかを
  // 所持金フィールドの値を参照して判定し、
  // 所持金が足りていれば「真」、そうでなければ「偽」の真偽値を返す。
  // ↓↓↓ここにコードを追加↓↓↓
  public boolean enoughMoney(int price) {
    return this.money >= price;
  }
  // ↑↑↑ここにコードを追加↑↑↑

  // buyメソッドを定義する
  // 仮引数: int型のprice
  // 戻り値: なし
  // 内容: 品物を購入できるかの判定結果を表示する
  // 「xxx円の買い物OK」または「xxx円の買い物NG」
  // と表示した上で、買い物OKなら、priceの金額を
  // 所持金から減らす。
  // (購入可能判定には上記enoughMoneyメソッドを利用する)
  // ↓↓↓ここにコードを追加↓↓↓
  public void buy(int price) {
    if (this.enoughMoney(price)) {
      System.out.printf("%,d円の買い物OK\n", price);
      this.money -= price;
    } else {
      System.out.printf("%,d円の買い物NG\n", price);
    }
  }
  // ↑↑↑ここにコードを追加↑↑↑

  // printInfoメソッド定義する
  // 仮引数: なし
  // 戻り値: なし
  // 内容: 所持金の情報を表示する
  // 実行例のように所持金は3桁ごとにカンマを入れて表示すること
  // （書式指定子を利用）
  // ↓↓↓ここのコードを修正↓↓↓
  public void printInfo() {
    System.out.printf("所持金%,d円\n", this.money);
  }
  // ↑↑↑ここのコードを修正↑↑↑

}
