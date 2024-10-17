public class Work51 {
  public static void main(String[] args) {
    // 処理対象となる点数の配列
    int[] score = { 10, 8, 6, 5, 7, 9 };
    // 配列の値の要素を一つずつprintGradeメソッドに渡す繰り返し文を書いてください。
    for(int personalScore : score) {
      printGrade(personalScore);
    }
  }

  // 以下のメソッドは点数を仮引数として受け取り，成績を表示します。仮引数を入れてください。
  public static void printGrade(int personalScore) {
    // ここに処理するコードを書いてください。
    switch (personalScore) {
      case 10:
        System.out.println("S");
        break;
      case 9:
        System.out.println("A");
        break;
      case 8:
        System.out.println("B");
        break;
      case 7:
        System.out.println("C");
        break;
      case 6:
        System.out.println("D");
        break;
      default:
        System.out.println("F");
        break;
    }
  }
}
