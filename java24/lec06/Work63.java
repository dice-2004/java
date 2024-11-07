import java.util.Scanner;

public class Work63 {
  // main メソッド中の Point63Base を Point63 に変更しなさい。それ以外の箇所を修正してはいけません。
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("整数を2個入力");
    int x = Integer.parseInt(sc.next());
    int y = Integer.parseInt(sc.next());
    Point63 p = new Point63();
    p.x = x;
    p.y = y;

    System.out.println("---移動前---");
    p.show();

    p.move(17);
    System.out.println("---移動後(1)---");
    p.show();

    p.move(9, -8);
    System.out.println("---移動後(2)---");
    p.show();
    sc.close();
  }
}
