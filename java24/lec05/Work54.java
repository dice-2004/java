import java.util.Scanner;

public class Work54 {
  // main メソッドを変更してはいけません。
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("整数を2個入力");
    int n1 = Integer.parseInt(sc.next());
    int n2 = Integer.parseInt(sc.next());
    if (n1 <= 0) {
      System.out.println("1個目の整数は1以上を指定してください。");
    } else {
      int[] array = new int[n1];
      setArray(array, n2);
      printArray(array);
    }
    sc.close();
  }

  // 仮引数 array に step で指定される整数の3倍、6倍・・・3n 倍の値を格納する。
  // なお、 n は array の要素数である。
  public static void setArray(int[] array, int step) {
    for (int i = 0; i < array.length; i++) {
      array[i] = 3 * step * (i + 1);
    }
  }

  // 仮引数 array の要素を半角スペース区切りで出力する。出力の両端は()で囲む。
  public static void printArray(int[] array) {
    System.out.print("(");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i]);
      if (i < array.length - 1) {
        System.out.print(" ");
      }
    }
    System.out.println(")");
  }
}
