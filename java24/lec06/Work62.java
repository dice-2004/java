import java.util.Scanner;

public class Work62 {
  // main メソッド中の Point61Base を Point61 に変更しなさい。それ以外の箇所を修正してはいけません。
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int min = 2;
    int max = 5;
    System.out.println(min + "から" + max + "の整数を1個入力");
    int n = Integer.parseInt(sc.next());
    if (n < min || n > max) {
      System.out.println(min + "から" + max + "の整数を1個入力してください");
    } else {
      int[] arrayX = new int[n];
      int[] arrayY = new int[n];
      for (int i = 0; i < n; i++) {
        System.out.println("整数を2個入力");
        arrayX[i] = Integer.parseInt(sc.next());
        arrayY[i] = Integer.parseInt(sc.next());
      }
      System.out.println("---移動前---");
      Point61.showPoints(arrayX, arrayY);

      Point61.movePoints(arrayX, arrayY, 14);
      System.out.println("---移動後(1)---");
      Point61.showPoints(arrayX, arrayY);

      Point61.movePoints(arrayX, arrayY, 6, -3);
      System.out.println("---移動後(2)---");
      Point61.showPoints(arrayX, arrayY);
    }
    sc.close();
  }
}
