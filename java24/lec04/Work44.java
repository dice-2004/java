public class Work44 {
  public static void main(String[] args) {
    // 処理対象の配列
    int[] numbers = { 38, 8, 3, 31, 1, 9, 22 };
    // 最大値の初期値
    int max = numbers[0];
    // 最小値の初期値
    int min = numbers[0];
    // 最大値の時の配列の添え字
    int max_index = 0;
    // 最小値の時の配列の添え字
    int min_index = 0;

    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
    System.out.println();

    for (int i = 1; i < numbers.length; i++) {
      // ここに処理するコードを書いてください。
      if (max < numbers[i] * (i + 1)) {
        max = numbers[i] * (i + 1);
        max_index = i;
      } else if (min > numbers[i] * (i + 1)) {
        min = numbers[i] * (i + 1);
        min_index = i;
      }
    }
    // ここに結果を出力するコードを書いてください。
    System.out.println("配列の「" + (min_index + 1) + "」番目とその要素値「" + numbers[min_index] + "」の掛け算が最小値「" + min + "」です");
    System.out.println("配列の「" + (max_index + 1) + "」番目とその要素値「" + numbers[max_index] + "」の掛け算が最大値「" + max + "」です");
  }
}
