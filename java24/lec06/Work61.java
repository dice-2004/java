import java.util.Scanner;

public class Work61 {
  // main メソッド中の Point61Base を Point61 に変更しなさい。それ以外の箇所を修正してはいけません。
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("整数を2個入力");
    int x = Integer.parseInt(sc.next());
    int y = Integer.parseInt(sc.next());
    System.out.println("---移動前---");
    Point61.showPoint(x, y);

    System.out.println("---移動後(1)---");
    Point61.movePoint(x, y, 19);

    System.out.println("---移動後(2)---");
    Point61.movePoint(x, y, 6, 2);

    sc.close();
  }
}
