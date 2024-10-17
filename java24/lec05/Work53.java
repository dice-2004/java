import java.util.Scanner;

public class Work53 {
  // main メソッドは変更してはいけません。
  public static void main(String[] args) {
    String s1 = "";
    String s2 = "";
    int n1 = 0;
    int n2 = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("文字列1を入力");
    s1 = sc.next();
    System.out.println("文字列2を入力");
    s2 = sc.next();
    System.out.println("整数を2個入力");
    n1 = Integer.parseInt(sc.next());
    n2 = Integer.parseInt(sc.next());

    System.out.println("--- multString(String s, int x) の実行例---");
    multString(s1, n1);
    System.out.println("--- multString(String s, String d, int x) の実行例---");
    multString(s1, s2, n1);
    System.out.println("--- multString(String s, String d, int c, int r) の実行例---");
    multString(s1, s2, n1, n2);
    sc.close();
  }


  // 仮引数 s で指定された文字列を c 回出力する。
  // 引数が3個のmultStringを使う。
  public static void multString(String s, int c) {
    multString(s, "", c);
  }

  // 仮引数 s で指定された文字列を仮引数 d で指定された文字列で区切って c 回出力する。
  public static void multString(String s, String d, int c) {
    for (int i = 0; i < c; i++) {
      System.out.print(s);
      if (i < c - 1) {
        System.out.print(d);
      }
    }
    System.out.println();
  }

  // 仮引数 s で指定された文字列を仮引数 d で指定された文字列で区切って c 回出力する。
  // これを1行分とし、r 行出力する。上で定義したmultStringを使う。
  public static void multString(String s, String d, int c, int r) {
    for (int i = 0; i < r; i++) {
      multString(s, d, c);
    }
  }
}
