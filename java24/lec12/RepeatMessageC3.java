public class RepeatMessageC3 {
  private String message;
  private int num;

  public RepeatMessageC3(String[] args) {
    // argsが足りない場合には、IllegalArgumentExceptionを投げる
    // argsを解析し、messageとnumに値を代入する
    if (args.length < 2) {
      throw new IllegalArgumentException("");
    }
    message = args[0];
    num = Integer.parseInt(args[1]);
  }

  // toString()をオーバーライドする
  public String toString() {
    String result = "";
    for (int i = 0; i < num; i++) {
      result += message;
      if (i < num - 1) {
      result += "/";
      }
    }
    return result;
  }
}
