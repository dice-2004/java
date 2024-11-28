import java.util.Scanner;

public class WorkA8 {
  public static void main(String[] args) {
    int n = parseCommandLineArguments(args);
    if (n > 0) {
      Scanner sc = new Scanner(System.in);
      ItemA8[] itemList = new ItemA8[n];
      for (int i = 0; i < n; i++) {
        System.out.println("【商品" + (i + 1) + "】");
        itemList[i] = inputItemData(sc);
      }
      sc.close();

      // itemListに格納されたインスタンスの情報を出力し、合計金額を計算する
      int totalPrice = 0;
      for (ItemA8 item : itemList) {
        item.printInfo();
        totalPrice += item.calcTotalPrice();
      }
      System.out.println("合計は" + totalPrice + "円です");

    }
  }

  private static int parseCommandLineArguments(String[] args) {
    if (args.length < 1) {
      System.out.println("リストに入力する数を指定してください");
      return 0;
    }
    int n = Integer.parseInt(args[0]);
    // 0以下の数値が指定された場合にエラーメッセージを出力する
    if (n <= 0) {
      System.out.println("リストに入力する数には正の値を指定してください");
      return 0;
    }
    return n;
  }

  private static ItemA8 inputItemData(Scanner sc) {
    System.out.println("商品コードと単価と数量を入力してください");
    String itemCode = sc.next();
    int price = Integer.parseInt(sc.next());
    int num = Integer.parseInt(sc.next());
    sc.nextLine(); // 行の残りを読み飛ばす
    ItemA8 item = new ItemA8(itemCode, price, num);
    return item;
  }
}
