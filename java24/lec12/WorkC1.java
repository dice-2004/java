public class WorkC1 {
  private static String message = null;

  public static void main(String[] args) {
    // try-catchを利用して例外処理を実装する
    try{
        parseCommandLineArguments(args);
        System.out.println(message);
      } catch (IllegalArgumentException e) {
        System.out.println("例外発生");
        System.out.println(e.getMessage());
      }


  }

  // コマンドライン引数の1つ目の文字列を取得して返すメソッド
  // このメソッドはそのまま使用する（変更してはいけない）
  public static void parseCommandLineArguments(String[] args) {
    if (args.length < 1) {
      throw new IllegalArgumentException("コマンドライン引数が指定されていません");
    }
    message = args[0];
  }
}
