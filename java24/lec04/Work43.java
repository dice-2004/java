public class Work43 {
  public static void main(String[] args) {
    // 処理対象の配列
    int[] numbers = { 38, 8, 3, 31, 1, 9, 22 };
    // 最大値の初期値
    int max = numbers[0];
    // 最小値の初期値
    int min = numbers[0];
    // 合計値の初期値
    int sum = numbers[0];
    // 平均値
    double ave;

    for (int i = 1; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
      // ここに処理するコードを書いてください。
      if (max < numbers[i]) {
        max = numbers[i];
      } else if (min > numbers[i]) {
        min = numbers[i];
      }
      sum += numbers[i];
    }
    ave = (double) sum / numbers.length;
    System.out.println();
    // ここに処理と結果出力のためのコードを書いてくください。
    System.out.println("最大値=" + max + "\n最小値=" + min + "\n合計値=" + sum + "\n平均値=" + ave);
  }
}
