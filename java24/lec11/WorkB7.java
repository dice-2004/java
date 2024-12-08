import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class WorkB7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<BookB7> books = new ArrayList<>();

    while (true) {
      System.out.println("本のタイトルを入力してください「何も入力せずに改行すると入力を終了します」");
      String title = sc.nextLine();
      if (title.equals("")) {
        break;
      }
      System.out.println("著者名を入力してください");
      String author = sc.nextLine();
      System.out.println("金額を入力してください");
      int price = sc.nextInt();
      sc.nextLine();
      BookB7 book = new BookB7(title, author, price);
      books.add(book);
    }
    System.out.println("検索したい文字列を入力してください");
    String search = sc.nextLine();
    int count = 0;
    int sum = 0;
    for (BookB7 book : books) {
      System.out.println(book);
      if (book.title.contains(search)) {

        count++;
        sum += book.price;
      }
    }
    System.out.println("タイトルに「" + search + "」を含む本の数は" + count + "冊で合計金額は" + sum + "円です");
    sc.close();
  }
}
