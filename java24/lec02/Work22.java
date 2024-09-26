public class Work22 {
  public static void main(String[] args) {

    // 以下の変数を作成してください
    // 型：String 変数名：name 初期値："すっきりわかるjava入門第4版 <!-- 2024 -->
    String name = "すっきりわかるjava入門第4版";
    // 型：int 変数名：bookPrice 初期値：2600 <!-- 2024 -->
    int bookPrice = 2600;
    // 型：int 変数名：howMany 初期値：20
    int howMany = 20;
    // 型：double 変数名：taxRate 初期値：0.10
    double taxRate = 0.10;

    // xxxxを適切な変数名に変更してください
    System.out.println(name + "を" + howMany + "冊購入します。");
    // xxxxを適切な変数名に変更してください
    System.out.println("合計は" + (howMany * bookPrice) + "円です。");

    // 税込み価格を表示する計算式をxxxxに記述してください
    // ただし、小数点は表示しないものとします
    System.out.println("税込み価格は" + (int) (howMany * bookPrice * (1.0 + taxRate)) + "円です。");
  }
}
