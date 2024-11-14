import java.util.Scanner;

public class Work72 {
  public static void main(String[] args) {
    // Scannerクラスのインスタンスを作成
    // 引数で標準入力System.inを指定する
    // ↓↓↓ここにコードを追加↓↓↓
    Scanner sc = new Scanner(System.in);
    // ↑↑↑ここにコードを追加↑↑↑

    // Temp72型のインスタンス t1 を生成する(次行先頭のコメントを外してください)
    Temp72 t1 = new Temp72();

    // Temp72型のインスタンス t2 を生成する
    // ↓↓↓ここにコードを追加↓↓↓
    Temp72 t2 = new Temp72();
    // ↑↑↑ここにコードを追加↑↑↑

    // ユーザ入力を促すメッセージ
    System.out.println("t1の気温を入力");
    // キーボードから入力した値をint型としてt1のtempフィールドに代入する
    // ↓↓↓ここにコードを追加↓↓↓
    t1.temp = sc.nextInt();
    sc.nextLine();
    // ↑↑↑ここにコードを追加↑↑↑

    // ユーザ入力を促すメッセージ
    System.out.println("t2の気温を入力");
    // キーボードから入力した値をint型としてt2のtempフィールドに代入する
    // ↓↓↓ここにコードを追加↓↓↓
    t2.temp = sc.nextInt();
    sc.nextLine();
    // ↑↑↑ここにコードを追加↑↑↑

    // diffTempメソッドを利用し、下記のコードを修正し、実行例どおりに出力
    // ↓↓↓ここのコードを修正↓↓↓
    System.out.println("t1とt2の気温差は" +diffTemp(t1, t2)+ "度");
    // ↑↑↑ここのコードを修正↑↑↑

    // Scannerクラスのインスタンスをクローズする
    // ↓↓↓ここにコードを追加↓↓↓
    sc.close();
    // ↑↑↑ここにコードを追加↑↑↑

  }

  // 2つの気温について、高い方から低い方を引いた気温差を計算する
  // diffTempメソッドを定義する
  // 戻り値はint型，仮引数にTemp72型のt1, t2を持つ
  public static int diffTemp(Temp72 t1, Temp72 t2) { // 引数の型をTemp72に変更してください
    int diff = 0;
    // ↓↓↓ここにコードを追加↓↓↓
    diff = Math.abs(t1.temp - t2.temp);
    // ↑↑↑ここにコードを追加↑↑↑

    return diff;
  }
}
