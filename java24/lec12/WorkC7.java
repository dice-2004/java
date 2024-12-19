import java.util.Scanner;

public class WorkC7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ItemTableC7 itemTable = new ItemTableC7();
    while (true) {
      System.out.println("「コマンド(a:追加/s:検索/r:削除/q:終了)」");
      String command = sc.nextLine();
      if (command.equals("a")) {
        addItem(itemTable, sc);
      } else if (command.equals("s")) {
        searchItem(itemTable, sc);
      } else if (command.equals("r")) {
        removeItem(itemTable, sc);
      } else if (command.equals("q")) {
        break;
      }
    }
    sc.close();
  }

  public static void addItem(ItemTableC7 itemTable, Scanner sc) {
    System.out.println("「追加する商品コードを入力してください」");
    String code = sc.nextLine();
    System.out.println("「追加する商品名を入力してください」");
    String name = sc.nextLine();
    try {
      itemTable.add(code, name);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }

  public static void searchItem(ItemTableC7 itemTable, Scanner sc) {
    System.out.println("「検索する商品コードを入力してください」");
    String code = sc.nextLine();
    try {
      ItemC7 item = itemTable.search(code);
      System.out.println("「登録された商品名は" + item.getName() + "です」");
    } catch (NoSuchItemExceptionC7 e) {
      System.out.println(e.getMessage());
    }

  }

  public static void removeItem(ItemTableC7 itemTable, Scanner sc) {
    System.out.println("「削除する商品コードを入力してください」");
    String code = sc.nextLine();
    try {
      itemTable.remove(code);
    } catch (NoSuchItemExceptionC7 e) {
      System.out.println(e.getMessage());
    }
  }
}
