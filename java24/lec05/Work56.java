public class Work56 {
  // main メソッドを変更してはいけません。
  public static void main(String[] args) {
    if (args.length > 3) {
      showCmdLineArgs(args);
      System.out.println("--- catString の結果---");
      System.out.println(catString(args));
    } else {
      System.out.println("コマンドライン引数を4個以上指定してください。");
    }
  }

  // プログラム引数を次の形式で全て出力する。
  // [0]=最初のプログラム引数
  // [1]=2番目のプログラム引数
  // ・・・
  public static void showCmdLineArgs(String[] args) {
    for (int i = 0; i < args.length; i++) {
      System.out.println("[" + i + "]=" + args[i]);
    }
  }

  // 仮引数 args の最後の要素を区切り文字として，それ以外の要素を先頭から順番に連結した文字列を返却する。
  public static String catString(String[] args) {
    String result = "";
    for (int i = 0; i < args.length - 1; i++) {
      result += args[i];
      if (i < args.length - 2) {
        result += args[args.length - 1];
      }
    }
    return result;
  }
}
