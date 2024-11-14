import java.util.Scanner;

public class Work7a {
  public static void main(String[] args) {
    // Scannerクラスのインスタンスを作成
    // 引数で標準入力System.inを指定する
    // ↓↓↓ここにコードを追加↓↓↓
    Scanner sc = new Scanner(System.in);
    // ↑↑↑ここにコードを追加↑↑↑

    // ユーザ入力を促すメッセージ
    System.out.println("所持金を入力");

    // キーボードから初めの所持金を入力
    // その額を所持金とするWallet7a型のインスタンスw1を生成する
    // ↓↓↓ここにコードを追加↓↓↓
    Wallet7a w1 = new Wallet7a(sc.nextInt());
    sc.nextLine();
    // ↑↑↑ここにコードを追加↑↑↑

    // w1の所持金情報をprintInfoメソッドを使って表示
    // ↓↓↓ここにコードを追加↓↓↓
    w1.printInfo();
    // ↑↑↑ここにコードを追加↑↑↑
    System.out.println("-----------------------------");

    // 買い物の金額を4回繰り返し入力
    // そのたびに買い物が可能か否かを実行例のように出力する
    for (int i = 0; i < 4; i++) {
      // ↓↓↓ここにコードを追加↓↓↓
      w1.buy(sc.nextInt());
      sc.nextLine();
      w1.printInfo();

      // ↑↑↑ここにコードを追加↑↑↑
      System.out.println("-----------------------------");
    }

    // Scannerクラスのインスタンスをクローズする
    // ↓↓↓ここにコードを追加↓↓↓
    sc.close();
    // ↑↑↑ここにコードを追加↑↑↑

  }
}
