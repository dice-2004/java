public class Work91 {
  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("コマンドライン引数が2個以上必要");
      return;
    }
    int t = Integer.parseInt(args[0]);
    int count = 0;
    for (String num : args) {
      if (t > Integer.parseInt(num)) {
        count++;
      }
    }
    System.out.println(t + "より小さい数は" + count + "個");
  }
}
