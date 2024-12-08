import java.util.ArrayList;

public class WorkB1 {

  public static void main(String[] args) {
    // 配列を宣言，初期化する
    String[] fruits = { "Apple", "Banana", "Cherry", "Elderberry" };

    // ArrayListを宣言，初期化する
    ArrayList<String> list = new ArrayList<String>();

    // 配列の要素をArrayListに追加する
    for (String fruit : fruits) {
      list.add(fruit);
    }
    // ArrayListの要素を取り出して出力する
    for (int i = 0; i < list.size(); i++) {
      System.out.println("フルーツ「"+list.get(i)+"」");
    }
  }
}
