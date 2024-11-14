import java.util.Scanner;

public class Work7b {
  public static void main(String[] args) {
    // Scannerクラスのインスタンスを作成
    // 引数で標準入力System.inを指定する
    // ↓↓↓ここにコードを追加↓↓↓
    Scanner sc = new Scanner(System.in);
    // ↑↑↑ここにコードを追加↑↑↑

    System.out.println("辺1の長さを入力");
    // int型の変数 side1 に入力された長さを代入
    // ↓↓↓ここにコードを追加↓↓↓
    int side1 = sc.nextInt();
    sc.nextLine();
    // ↑↑↑ここにコードを追加↑↑↑

    System.out.println("辺2の長さを入力");
    // int型の変数 side2 に入力された長さを代入
    // ↓↓↓ここにコードを追加↓↓↓
    int side2 = sc.nextInt();
    sc.nextLine();
    // ↑↑↑ここにコードを追加↑↑↑

    System.out.println("辺3の長さを入力");
    // int型の変数 side3 に入力された長さを代入
    // ↓↓↓ここにコードを追加↓↓↓
    int side3 = sc.nextInt();
    sc.nextLine();
    // ↑↑↑ここにコードを追加↑↑↑

    // Triangle7bクラスのインスタンスt1を生成する
    // t1の三辺はキーボードから入力された辺1,辺2,辺3の値を辺の長さとする。
    // ↓↓↓ここにコードを追加↓↓↓
    Triangle7b t1 = new Triangle7b(side1, side2, side3);
    // ↑↑↑ここにコードを追加↑↑↑

    // Triangle7bクラスのインスタンスt2を生成する
    // t2の三辺は、辺1,辺2,辺3それぞれに12を足した値を辺の長さとする
    // ↓↓↓ここにコードを追加↓↓↓
    Triangle7b t2 = new Triangle7b(side1 + 12, side2 + 12, side3 + 12);
    // ↑↑↑ここにコードを追加↑↑↑

    // printInfoメソッドを呼び出し，t1の判定結果を表示する
    System.out.print("t1");
    // ↓↓↓ここにコードを追加↓↓↓
    Triangle7b.printInfo(t1);
    // ↑↑↑ここにコードを追加↑↑↑

    // printInfoメソッドを呼び出し，t2の判定結果を表示する
    System.out.print("t2");
    // ↓↓↓ここにコードを追加↓↓↓
    Triangle7b.printInfo(t2);
    // ↑↑↑ここにコードを追加↑↑↑

    // Scannerクラスのインスタンスをクローズする
    // ↓↓↓ここにコードを追加↓↓↓
    sc.close();
    // ↑↑↑ここにコードを追加↑↑↑

  }
}
