public class Work48 {
  public static void main(String[] args) {
    // 処理対象の配列
    int[] numbers = { 37, 12, 5, 3, 4, 13, 1, 35, 6 };
    // 必要に応じて変数を定義してください。
    for (int i = 0; i < numbers.length - 2; i++) {
      for (int j = i + 1; j < numbers.length - 1; j++) {
        for (int k = j + 1; k < numbers.length; k++) {
          if (isRightTriangle(numbers[i], numbers[j], numbers[k]) == true) { // 実引数を指定しましょう。
            // ここに処理と結果出力のためのコードを書いてください。
            System.out.println("(" + numbers[i] + "," + numbers[j] + "," + numbers[k] + ")");
          }
        }
      }
    }
  }

  // 数値を3つ与えると，その3つの数値を辺の長さとした直角三角形が作れるかどうかをtrue/falseで返すメソッド
  // 仮引数を指定し、内部の処理を実装しましょう。
  public static boolean isRightTriangle(int iNum, int jNum, int kNum) {
    if (iNum * iNum + jNum * jNum == kNum * kNum) {
      return true;
    } else if (jNum * jNum + kNum * kNum == iNum * iNum) {
      return true;
    } else if (kNum * kNum + iNum * iNum == jNum * jNum) {
      return true;

    } else {
      return false;
    }
  }
}
