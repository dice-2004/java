public class Point76 {
  int x;
  int y;

  // フィールドx，yにデフォルト値 0, 0 を代入する
  // コンストラクタ名はPoint76に変更すること
  public Point76() {
    this.x = 0;
    this.y = 0;
  }

  // フィールドx，yにa，bを代入する
  // コンストラクタ名はPoint76に変更すること
  public Point76(int a, int b) {
    this.x = a;
    this.y = b;
  }

  // フィールドx，yにa，bを小数点以下を切り捨ててint型として代入する
  // コンストラクタ名はPoint76に変更すること
  public Point76(double a, double b) {
    this.x = (int) a;
    this.y = (int) b;
  }

  public Point76(int a) {
    this.x = a;
    this.y = a;
  }

  public Point76(Point76 p1) {
    this.x = p1.x;
    this.y = p1.y;
  }

  // 情報を表示する
  public void printInfo(String name) {
    System.out.println("点" + name + "(" + this.x + "," + this.y + ")");
  }
}
