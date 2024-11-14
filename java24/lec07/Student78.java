public class Student78 {
  String name; // 生徒の名前
  int height; // 身長(cm)
  int weight; // 体重(kg)

  // 引数が0個のコンストラクタ
  // デフォルト値として、
  // フィールドnameに"名前未設定", フィールドheightに158，フィールドweightに50を
  // 設定する
  // ↓↓↓ここにコードを追加↓↓↓
  public Student78() {
    this.name = "名前未設定";
    this.height = 158;
    this.weight = 50;
  }
  // ↑↑↑ここにコードを追加↑↑↑

  // 引数が3個（String型, int型, int型）のコンストラクタ
  // フィールドnameにString型の引数nameの値を代入し、
  // フィールドheightにint型の引数hの値を代入し、
  // フィールドweightにint型の引数wの値を代入する
  // ↓↓↓ここにコードを追加↓↓↓
  public Student78(String name, int h, int w) {
    this.name = name;
    this.height = h;
    this.weight = w;
  }
  // ↑↑↑ここにコードを追加↑↑↑

  // calcBMIメソッドを定義する
  // 引数: なし, 戻り値: double型
  // 内容: フィールドの身長(cm)、体重(kg)の情報から
  // BMIの計算式に基づき、
  // BMI値をdouble型として計算、返却する。
  // (割り算を行う際、doubleへのキャストを忘れないようにすること)
  // ↓↓↓ここにコードを追加↓↓↓
  public double calcBMI() {
    return (double) this.weight / ((double) this.height / 100 * (double) this.height / 100);
  }
  // ↑↑↑ここにコードを追加↑↑↑

  // printInfoメソッドを定義する
  // 引数: なし, 戻り値: なし
  // 内容: BMI値の情報実行例のように表示する
  // （BMI値は書式指定子を使って、小数点以下第1位まで表示する）
  // BMI値の計算には上記のcalcBMIメソッドを利用する
  public void printInfo() {
    // ↓↓↓ここのコードを修正する↓↓↓
    System.out.printf("%sのBMI値は%.1fです。\n", this.name, this.calcBMI());
    // ↑↑↑ここのコードを修正する↑↑↑
  }

}
