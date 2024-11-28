public class UserA7 {
  private String name;
  private int rank;

  // 名前を引数にとるコンストラクタ
  UserA7(String name) {
    this.name = name;
    this.rank = 1;
  }

  // ランクアップのメソッド
  public void rankUp() {
    this.rank++;
    System.out.println(this.name + "はランクアップしました");
  }

  // ユーザーのランクを出力するprintInfoメソッド
  public void printInfo() {
    System.out.println(this.name + "のランクは" + this.rank + "です");
  }

}
