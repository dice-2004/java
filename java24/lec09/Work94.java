public class Work94 {
  public static void main(String[] args) {
    // MyPay94クラスに変更します
    MyPay94 p1, p2;

    // 初期状態
    System.out.println("初期状態");

    // コンストラクタを用いてMyPay94クラスのインスタンスp1，p2を生成します．
    p1 = new MyPay94("J22001","Taro"); // 新たに作成した引数付きのMyPay94クラスのコンストラクタを呼び出すように修正しなさい．
    p2 = new MyPay94("J22002","Hanako"); // 新たに作成した引数付きのMyPay94クラスのコンストラクタを呼び出すように修正しなさい．
    // 初期状態の出力
    p1.printInfo(); // 変更してはいけません．
    p2.printInfo(); // 変更してはいけません．
    System.out.println();// 変更してはいけません．

    // 状態1
    System.out.println("状態1");

    int y1 = 1900;
    System.out.println("処理 " + p1.name + "が" + y1 + "円チャージ");
    p1.balance += y1; // MyPay94クラスのメソッドを用いたコードに変更して，実行結果に合うよう操作を行う．

    int y2 = 2850;
    System.out.println("処理 " + p2.name + "が" + y2 + "円支払い");
    // 下の5行をMyPay94クラスのメソッドを用いたコードに変更して，実行結果に合うよう操作を行う．
    p2.balance -= y2;
    if (p2.balance < 0) {
      p2.husoku = -p2.balance;
      p2.balance = 0;
    }

    // 状態1の結果を出力
    p1.printInfo(); // 変更してはいけません．
    p2.printInfo(); // 変更してはいけません．
    System.out.println();// 変更してはいけません．

    // 状態2
    System.out.println("状態2");

    int y3 = 23000;
    System.out.println("処理 " + p1.name + "が" + y3 + "円支払い");
    // 下の5行をMyPay94クラスのメソッドを用いたコードに変更して，実行結果に合うよう操作を行う．
    p1.balance -= y3;
    if (p1.balance < 0) {
      p1.husoku = -p1.balance;
      p1.balance = 0;
    }

    System.out.println("処理 " + p2.name + "が解約");
    // 下の3行をMyPay94クラスのメソッドを用いたコードに変更して，実行結果に合うよう操作を行う．
    p2.henkin = p2.balance;
    p2.name = "(none)";
    p2.balance = 0;

    // 状態2の結果を出力
    p1.printInfo();// 変更してはいけません．
    p2.printInfo();// 変更してはいけません．
  }
}
