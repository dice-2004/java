public class Work27 {
  public static void main(String[] args) {
    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.println("西暦を入力してください。");
    int year = sc.nextInt();
    if (year <= 0) {
      System.out.println("正の値を入力してください。");
    } else if (year % 400 == 0) {
      System.out.println(year + "年はうるう年です。");
    } else if (year % 100 == 0) {
      System.out.println(year + "年はうるう年ではありません。");
    } else if (year % 4 == 0) {
      System.out.println(year + "年はうるう年です。");
    } else {
      System.out.println(year + "年はうるう年ではありません。");
    }
    sc.close();
  }
}
