import java.util.ArrayList;
import java.util.Scanner;

public class WorkB6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<ItemB6> items = new ArrayList<>();
    // ユーザーにアイテム名と価格を入力させ、それをItemB6クラスのインスタンスに設定します。
    // "end"と入力されるまで繰り返します。
    while (true) {
      ItemB6 item = new ItemB6();
      System.out.println("アイテム名を入力してください（「end」で終了）");
      String itemName = sc.nextLine();
      if (itemName.equals("end")) {
        break;
      }
      item.setItemName(itemName);
      System.out.println("価格を入力してください");
      item.setPrice(sc.nextDouble());
      sc.nextLine();
      items.add(item);
    }

    // ArrayListの要素数（入力されたアイテムの数）を表示します。
    System.out.println("入力されたアイテムの数" + items.size());
    // 入力されたアイテムを表示します。
    System.out.println("入力されたアイテム一覧");
    for (ItemB6 item : items) {
      System.out.println(item);
    }

    // 平均のpriceを計算して表示します。
    double sum = 0;
    for (ItemB6 item : items) {
      sum += item.getPrice();
    }
    System.out.printf("平均価格「%.1f円」\n", sum / items.size());
    // Scannerクラスのインスタンスをクローズします。
    sc.close();
  }
}
