import java.util.Scanner;

public class Work3b {
  public static void main(String[] args) {
    int dan;
    Scanner sc = new Scanner(System.in);
    System.out.println("二等辺三角形の段数を入力してください");
    dan = Integer.parseInt(sc.next());
    for (int i = 0; i < dan; i++) {
      for (int j = 0; j < dan * 2 - 1; j++) {
        if (j < i || dan * 2 - 1 - i <= j) {
          System.out.print("-");
        } else {
          System.out.print("*");
        }
      }
      System.out.print("\n");
    }
    sc.close();
  }
}
