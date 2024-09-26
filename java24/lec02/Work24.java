public class Work24 {

  public static void main(String[] args) {

    // Scannerクラスのインスタンスを作成
    // 引数で標準入力System.inを指定する
    java.util.Scanner scanner = new java.util.Scanner(System.in);

    // 入力を促すメッセージ
    System.out.println("文字列を入力してください。");

    // 入力された内容を取得（nextLine()を使ってください）
    String str = scanner.nextLine();
    // 入力された内容を画面に表示
    System.out.println("文字列" + str + "が入力されました。");
    // 入力を促すメッセージ
    System.out.println("２つの整数を入力して、積を計算してください。");

    // 入力された内容をインスタンスから取得し、変数に代入(next()を使ってください)
    int a = Integer.parseInt(scanner.next());
    int b = Integer.parseInt(scanner.next());
    // 積を画面に表示
    System.out.println(a + " と " + b + " の積は " + (a * b));

    // Scannerクラスのインスタンスをクローズ
    scanner.close();

  }

}
