import java.util.Scanner;

public class Work93 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // キーボードから入力した値を変数に格納する
    int n1 = Integer.parseInt(scanner.nextLine());
    int d1 = Integer.parseInt(scanner.nextLine());
    int n2 = Integer.parseInt(scanner.nextLine());
    int d2 = Integer.parseInt(scanner.nextLine());

    // 全ての値が0より大きい場合に演算する、そうでない場合はエラーメッセージを出力する
    if (n1 > 0 && d1 > 0 && n2 > 0 && d2 > 0) {
      // Fraction93型のインスタンスf1、f2を生成する
      // 必要に応じて、他にインスタンスを生成しても良い
      Fraction93 f1 = new Fraction93(n1, d1);
      Fraction93 f2 = new Fraction93(n2, d2);



      // 生成したインスタンス、および各種メソッドを利用して演算し、実行例どおりに出力する
      // 小数を表示する際は、printfを利用して小数点以下4桁まで表示する
      System.out.printf("%d/%dと%d/%dの差は%d/%dまたは%.4f\n", n1, d1, n2, d2, f1.calcSub(f2).num, f1.calcSub(f2).den,
          (double) f1.calcSub(f2).num / f1.calcSub(f2).den);
      System.out.printf("%d/%dと%d/%dの積は%d/%dまたは%.4f\n", n1, d1, n2, d2, f1.calcMulti(f2).num, f1.calcMulti(f2).den,
          (double) f1.calcMulti(f2).num / f1.calcMulti(f2).den);


    } else {
      System.out.println("ERROR");

    }

    // Scannerクラスのインスタンスをクローズする
    scanner.close();

  }
}
