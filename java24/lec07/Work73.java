import java.util.Scanner;

public class Work73 {
  public static void main(String[] args) {
    // Scannerクラスのインスタンスを作成する
    // ↓↓↓ここにコードを追加↓↓↓
    Scanner sc = new Scanner(System.in);
    // ↑↑↑ここにコードを追加↑↑↑

    // Person73型のインスタンスp1を生成する
    Person73 p1 = new Person73(); // コンストラクタ名およびクラス名をPerson73に変更すること
    p1.name = "工大太郎";
    p1.money = 10000; // 最初の所持金

    // Person73型のprintMoneyメソッドを利用して所持金を表示する
    p1.printMoney();

    // Job73型のインスタンスj1を生成する
    // ↓↓↓ここにコードを追加↓↓↓
    Job73 j1 = new Job73();
    // ↑↑↑ここにコードを追加↑↑↑

    // 仕事の名称をキーボードから入力し，
    // インスタンスj1のnameフィールドに代入する
    System.out.println("新たに行った仕事を入力してください。");
    System.out.println("仕事の名称を入力");
    // ↓↓↓ここにコードを追加↓↓↓
    j1.name = sc.nextLine();
    // ↑↑↑ここにコードを追加↑↑↑

    // 仕事の時給をキーボードから入力し，
    // インスタンスj1のsalaryフィールドにint型として代入する
    System.out.println("仕事の時給を入力");
    // ↓↓↓ここにコードを追加↓↓↓
    j1.salary = sc.nextInt();
    sc.nextLine();
    // ↑↑↑ここにコードを追加↑↑↑

    // 働いた時間をキーボードから入力し，
    // インスタンスj1のtimeフィールドにint型として代入する
    System.out.println("働いた時間を入力");
    // ↓↓↓ここにコードを追加↓↓↓
    j1.time = sc.nextInt();
    sc.nextLine();
    // ↑↑↑ここにコードを追加↑↑↑

    // Person73型のcalcMoneyメソッドを使って、
    // 新たな仕事j1で得たお金を所持金に加算する計算を行う
    // （次行先頭のコメントを外す）
    p1.calcMoney(j1);

    // Person73型のprintJobメソッドを使って、
    // 実行例の「工大太郎は・・・」行の表示を行う
    // （次行先頭のコメントを外す）
    p1.printJob(j1);

    // printMoneyメソッドを利用して所持金を表示する
    // （次行先頭のコメントを外す）
    p1.printMoney();

    // Scannerクラスのインスタンスをクローズする
    // ↓↓↓ここにコードを追加↓↓↓
    sc.close();
    // ↑↑↑ここにコードを追加↑↑↑
  }
}
