public class Work42 {
  public static void main(String[] args) {
    // 処理対象の配列
    int[] numbers = { 38, 8, 3, 31, 1, 9, 22 };
    // 偶数と奇数の初期値
    int even = 0, odd = 0;

    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
      // ここに処理するコードを書いてください。
      if (numbers[i] % 2 == 0) {
        even += 1;
      } else {
        odd += 1;
      }
    }
    System.out.println();
    // ここに結果を出力するコードを書いてください。
    System.out.println("偶数の数は" + even + "個で奇数の数は" + odd + "個です");
  }
}
