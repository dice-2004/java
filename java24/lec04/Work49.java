import java.util.Scanner;

public class Work49 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("身長(cm)と体重(kg)を入力してください");
    // 身長を設定
    int height = Integer.parseInt(sc.next());
    // 体重を設定
    int weight = Integer.parseInt(sc.next());
    // BMIの計算結果。以下のメソッドへの実引数を入れてください。
    double bmi = calcBmi(height, weight);
    // 低体重"、"肥満"、"普通体重"を判定した結果。以下のメソッドへの実引数を入れてください。
    String eval = evalWeight(bmi);

    // ここに結果を出力するためのコードを書いてください。
    System.out
        .println("身長が" + height + "cmで体重が" + weight + "kgの場合BMIは" + String.format("%.3f", bmi) + "で「" + eval + "」です");
    // Scannerオブジェクトを生成したままだとメモリリークが起きるため、close()する。
    sc.close();
  }

  // 以下のメソッドは身長と体重からBMIを計算した結果を返します。仮引数を入れてください。
  public static double calcBmi(int height, int weight) {
    double bmi = 0;
    // ここの処理するコードを書いてください。doubleで返すことに注意してください
    bmi = weight / (height * height / 10000.0);
    return bmi;
  }

  // 以下のメソッドは、BMIの値から"低体重(BMIが18.5未満)"、"肥満(BMIが25以上)"、"普通体重"
  // を判定した結果を返します。仮引数を入れてください。
  public static String evalWeight(double bmi) {
    String result = null;
    // ここの処理するコードを書いてください。
    if (bmi < 18.5) {
      result = "低体重";
    } else if (bmi >= 25) {
      result = "肥満";
    } else {
      result = "普通体重";
    }
    return result;
  }
}
