public class City79 {
  String name; // 都市名
  int population; // 人口（人）
  int area; // 面積（平方キロメートル）

  // 3個の引数(String型, int型, int型)をもつコンストラクタを追加
  // フィールドname，population，areaに、引数（String型のn，int型のp，int型のa）の値を
  // それぞれ代入する
  // ↓↓↓ここにコードを追加↓↓↓
  public City79(String n, int p, int a) {
    this.name = n;
    this.population = p;
    this.area = a;
  }
  // ↑↑↑ここにコードを追加↑↑↑

  // 1個の引数(String型)をもつコンストラクタを追加
  // フィールドnameのみ、引数（String型のn）の値を設定し、
  // フィールドpopulation，areaには、それぞれ、デフォルト値の1000，20を設定する
  // ↓↓↓ここにコードを追加↓↓↓
  public City79(String n) {
    this.name = n;
    this.population = 1000;
    this.area = 20;
  }
  // ↑↑↑ここにコードを追加↑↑↑

  // setDataメソッドを定義する
  // 仮引数: 人口(int型のp)，面積(int型のa)
  // 戻り値: なし
  // 内容: 人口と面積の情報をフィールドにセットする
  // （フィールドpopulation，areaにp，aの値を代入する）
  // ↓↓↓ここにコードを追加↓↓↓
  public void setData(int p, int a) {
    this.population = p;
    this.area = a;
  }
  // ↑↑↑ここにコードを追加↑↑↑

  // calcDensityメソッドを定義する
  // 仮引数: なし
  // 戻り値: 人口密度(double型)
  // 内容: フィールドの人口と面積の情報から
  // 人口密度を計算して返却する
  // (人口密度計算の割り算でdoubleへのキャストを忘れないように注意)
  // ↓↓↓ここにコードを追加↓↓↓
  public double calcDensity() {
    return (double) this.population / this.area;
  }
  // ↑↑↑ここにコードを追加↑↑↑

  // printInfoメソッドを定義する
  // 仮引数: なし
  // 戻り値: なし
  // 内容: 実行例のように都市の名前、人口、人口密度を表示する
  // (人口密度の計算には上記のcalcDensityメソッドを利用すること)
  public void printInfo() {
    // ↓↓↓ここにコードを修正↓↓↓
    System.out.println(this.name + "の情報");
    System.out.println("人口" + this.population + "人");
    System.out.printf("人口密度%.1f\n", this.calcDensity());
    // ↑↑↑ここにコードを修正↑↑↑
  }

}
