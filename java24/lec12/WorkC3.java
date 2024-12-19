public class WorkC3 {
  public static void main(String[] args) {
    try {
      RepeatMessageC3 rmsg = new RepeatMessageC3(args);
      System.out.println(rmsg);
    } catch (NumberFormatException e) {
      System.out.println("2つ目のコマンドライン引数にはメッセージを繰り返す回数を指定してください");
    } catch (IllegalArgumentException e) {
      System.out.println("表示するメッセージと繰り返す回数を指定してください");
    }

  }
}
