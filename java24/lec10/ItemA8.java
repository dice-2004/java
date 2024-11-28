public class ItemA8 {
  private String code;
  private int price;
  private int num;

  // 商品コードと単価と数量を引数にとるコンストラクタ
  public ItemA8(String code, int price, int num) {
    this.code = code;
    if (price < 0 || num < 0) {
      throw new IllegalArgumentException("不正な値が入力されました");
    } else {
      this.price = price;
      this.num = num;
    }
  }

  // 金額を計算するメソッド
  public int calcTotalPrice() {
    return this.price * this.num;
  }
  // 購入商品の情報を出力するメソッド
  public void printInfo() {
    System.out.println(this.code + "を"+ this.num + "個で"+ this.calcTotalPrice() +"円");
  }
}
