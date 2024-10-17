import java.util.Scanner;

public class Work52 {
  // main メソッドを変更してはいけません。
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("整数を2個入力");
    int n1 = Integer.parseInt(sc.next());
    int n2 = Integer.parseInt(sc.next());

    System.out.println("2次元座標の点の情報を出力");
    showPosition("(", n1, n2, ")");
    showPosition(n1, n2);
    showPosition("*", n1, n2);
    sc.close();
  }

  // 2次元空間上の点の座標を半角カンマ区切りで出力するが、仮引数leftとrightで指定された文字列をそれぞれ左右に連結した上で出力する。
  public static void showPosition(String left, int x, int y, String right) {
    System.out.println(left + x + "," + y + right);
  }

  // 2次元空間上の点の座標を半角カンマ区切りで出力する。
  // 上で定義した引数が4個のshowPositionを使う。left、 rightを何も出力しないようにする。
  public static void showPosition(int x, int y) {
    showPosition("", x, y, "");
  }

  // 2次元空間上の点の座標を半角カンマ区切りで出力するが、仮引数leftRightで指定された文字列を左右に連結して出力する。
  // 引数が4個のshowPositionを使って定義する。
  public static void showPosition(String leftRight, int x, int y) {
    showPosition(leftRight, x, y, leftRight);
  }
}
