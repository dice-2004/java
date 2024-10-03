import java.util.Scanner;

public class Work38 {
  public static void main(String[] args) {
    int a;
    int m;
    Scanner sc = new Scanner(System.in);
    System.out.println("整数の値を入力してください");
    m = Integer.parseInt(sc.next());
    for (int i = 1; i < 4; i++) {
      System.out.println("整数の値を入力してください");
      a = Integer.parseInt(sc.next());
      m = Math.min(a, m);
    }
    System.out.println("4つの整数で最小は" + m);
    sc.close();
  }
}
