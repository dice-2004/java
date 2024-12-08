import java.util.ArrayList;
import java.util.Scanner;

public class WorkB3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());

    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      list.add(sc.nextInt());
    }
    sc.nextLine();
    int target = Integer.parseInt(sc.nextLine());
    int count = 0;
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) == target) {
        count++;
      }
    }
    if (count == 0) {
      System.out.println(target+"はリストに存在しません");
    } else {
      System.out.println(target + "はリストに" + count + "回存在します");
    }
    sc.close();
  }
}
