import java.util.Scanner;

public class Work3a {
  public static void main(String[] args) {
    int dan;
    Scanner sc = new Scanner(System.in);
    System.out.println("直角三角形の段数を入力してください");
    dan = Integer.parseInt(sc.next());
    for (int i = 1; i <= dan; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.print("\n");
    }
    sc.close();
  }
}
