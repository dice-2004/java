import java.util.Scanner;
import java.util.ArrayList;

public class WorkB2 {
  public static void main(String[] args) {
    // 配列を宣言，初期化する
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < 2; i++) {
      System.out.println("要素の追加を行うので整数を入力してください");
      int n = Integer.parseInt(sc.nextLine());
      list.add(n);
    }
    for (int i = 0; i < list.size(); i++) {
      System.out.println(i+1 + "番目の要素" + list.get(i));
    }
    sc.close();
  }
}
