// import java.util.Arrays;

public class Work41 {
  public static void main(String[] args) {
    int[] numbers = new int[4];
    // Arrays.fill(numbers, 1);
    System.out.println("配列を1で初期化する");
    for (int i = 0; i < numbers.length; i++) {
      // ここに配列の全ての要素に1を格納するコードを書いてください
      numbers[i] = 1;
    }
    // ここに拡張for文を利用して配列numbersの中身を全て表示するコードを書いてください
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }
  }
}
