public class MyPay94 {
  public String id; // 顧客ID
  public String name; // 顧客氏名
  public int balance; // 残高

  public int husoku; // 不足額
  public int henkin; // 返金額

  // (1)コンストラクタを作成
  // 引数はSting型のiとnで，受け取った値をフィールドidとnameに代入します．
  // balance にも何らかの値を代入する必要があります．実行例を見なさい．

  public MyPay94(String i, String n) {
    this.id = i;
    this.name = n;
    this.balance = 20000;
  }

  // (2)chargeメソッドを作成
  // 修飾子はpublic，戻り値の型はvoid，引数はint型のpriceで，
  // price円のチャージを行う（残高をprice分増やす）メソッド．

  public void charge(int price) {
    this.balance += price;
  }

  // (3)payメソッドを作成
  // 修飾子はpublic，戻り値の型はvoid，引数はint型のpriceで，
  // price円の支払いを行う（残高からprice分減らす）メソッド．
  // ただし，残高不足の場合にはフィールドhusokuに不足金額を代入します．

  public void pay(int price) {
    this.balance -= price;
    if (this.balance < 0) {
      this.husoku = -this.balance;
      this.balance = 0;
    }
  }
  // (4)deleteメソッドを作成
  // 修飾子はpublic，戻り値の型はvoid，引数はなしで，
  // 残高をフィールドhenkinに代入し，解約処理(フィールドidはそのまま，nameは文字列"(none)"，balanceは0にする)を行います．

  public void delete() {
    this.henkin = this.balance;
    this.name = "(none)";
    this.balance = 0;
  }

  // MyPay94の状態を出力するprintInfoメソッド（変更しない）
  public void printInfo() {
    System.out.printf("%s\t %s\t %7d\n", this.id, this.name, this.balance);
    if (this.husoku > 0) {
      System.out.println("残高が" + this.husoku + "円不足しています");
      this.husoku = 0;
    }
    if (this.henkin > 0) {
      System.out.println("解約しました");
      System.out.println("返金額は" + this.henkin + "円です");
      this.henkin = 0;
    }
  }
}
