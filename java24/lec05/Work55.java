import java.util.Scanner;

public class Work55 {
  // main メソッドを変更してはいけません。
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("1～5の整数を1個入力");
    int n1 = Integer.parseInt(sc.next());
    if (n1 <= 0 || 5 < n1) {
      System.out.println("1個目の整数は1～5を指定してください。");
    } else {
      System.out.println("整数を" + n1 + "個入力");
      int[] array = inputArray(sc, n1);
      int[] result = new int[array.length];
      System.out.println("---処理対象の配列---");
      printArray(array);
      productArray(array, result);
      System.out.println("--- productArray の結果---");
      printArray(result);
    }
    sc.close();
  }

  // キーボードから整数を入力し、配列 array に格納する。
  public static int[] inputArray(Scanner sc, int n) {
    int array[] = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = Integer.parseInt(sc.next());
    }
    return array;
  }

  // 仮引数 array に格納された値の総和を result に格納する。
  // つまり、result[0] には array[0] 、result[1] には result[0] + array[1] ・・・ 、result[n]
  // には result[n-1] + array[n] が格納される。
  public static void productArray(int[] array, int[] result) {
    result[0] = array[0];
    for (int i = 1; i < array.length; i++) {
      result[i] = result[i - 1] + array[i];
    }
  }

  // 仮引数 array の要素を半角スペース区切りで出力する。出力の両端は[]で囲む。
  public static void printArray(int[] array) {
    System.out.print("[");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i]);
      if (i < array.length - 1) {
        System.out.print(" ");
      }
    }
    System.out.println("]");
  }
}
