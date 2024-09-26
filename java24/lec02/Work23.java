public class Work23 {
  public static void main(String[] args) {

    // 変数を作成
    // 型：String 変数名：name 初期値："工大花子"
    String name = "工大花子";
    // 型：int 変数名：japanese 初期値：70
    int japanese = 70;
    // 型：int 変数名：mathematical 初期値：87
    int mathematical = 87;
    // 国語の点数と数学の点数の平均値を計算（変数名はaverageとする）
    double average = (mathematical + japanese) / 2.0;

    // 国語の点数を表示
    System.out.println(name + "さんの国語の点数は" + japanese + "点です。");
    // 数学の点数を表示
    System.out.println(name + "さんの数学の点数は" + mathematical + "点です。");
    // 国語と数学の平均点を表示
    System.out.println(name + "さんの平均点は" + average + "点です。");
    // 合格または不合格を表示
    if (average >= 80) {
      System.out.println("合格です。");
    } else {
      System.out.println("不合格です。");
    }
  }
}
