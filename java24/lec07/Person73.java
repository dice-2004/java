public class Person73 {
  String name; // 名前のフィールド
  int money; // 所持金のフィールド
  // 以下、クラス名でJob73Baseとなっている箇所はJob73に名前を変更すること

  // calcMoneyメソッドを定義する
  // 引数: Job73型の変数j, 戻り値: なし
  // 内容: 仕事jの時給と働いた時間から稼いだ金額を算出。
  // 稼いだ金額を所持金moneyに加算する
  public void calcMoney(Job73 j) {
    // ↓↓↓ここにコードを追加↓↓↓
    money += j.salary * j.time;
    // ↑↑↑ここにコードを追加↑↑↑
  }

  // printJobメソッドを定義する
  // 引数: Job73型の変数j, 戻り値: なし
  // 内容: 仕事jの情報を利用して、実行例の「工大花子は・・・」の行を出力
  public void printJob(Job73 j) {
    // ↓↓↓このコードを修正↓↓↓
    System.out.println(this.name + "は時給" +j.salary+ "円の" +j.name+ "の仕事を" +j.time+ "時間した。");
    // ↑↑↑このコードを修正↑↑↑
  }

  // printMoneyメソッドを定義する
  // 引数: なし, 戻り値: なし
  // 内容: 現在の所持金を実行例どおりに出力する
  public void printMoney() {
    // ↓↓↓このコードを修正↓↓↓
    System.out.println("現在の所持金は" + this.money+"円です。");
    // ↑↑↑このコードを修正↑↑↑
  }

}
