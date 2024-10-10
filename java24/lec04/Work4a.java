import java.util.Scanner;

public class Work4a {
  public static void main(String[] args) {
    // 処理対象の配列
    int[] numbers = { 39, 8, 3, 30, 2, 22, 9 };
    int a;
    int b;
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
    System.out.println();

    // 配列の右端から左端への入れ替え操作を(要素数-1)回繰り返します。
    for (int i = 0; i < numbers.length - 1; i++) {
      // 入れ替え操作：右から左方向へ順番に比較します。
      for (int j = numbers.length - 1; j > i; j--) {
        // ここに処理するコードを書いてください。
        // ヒント：左隣の方が大きいときは互いに入れ替えます。
        if (numbers[j] < numbers[j - 1]) {
          int tmp = numbers[j];
          numbers[j] = numbers[j - 1];
          numbers[j - 1] = tmp;
        }
      }
    }
    // ここに処理結果を出力するコードを書いてください。
    // 実行例では最後に改行されていることに注意すること。
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
    System.out.println();

    System.out.println("小さい順に並び替えた配列の要素番号0-6の中から2個の整数を入力してください");
    a = sc.nextInt();
    b = sc.nextInt();
    System.out.println("入力した2要素に対応する配列値の積は" + calcProduct(numbers[a], numbers[b]) + "で商は"
        + calcQuotient(numbers[a], numbers[b]) + "です");

    sc.close();
  }

  public static int calcProduct(int a, int b) {
    return a * b;
  }

  public static int calcQuotient(int a, int b) {
    if (a > b) {
      return a / b;
    } else {
      return b / a;
    }
  }
}
