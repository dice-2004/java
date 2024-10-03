import java.lang.String;

public class Work36 {
  public static void main(String[] args) {
    String str;
    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.println("文字を入力してください");
    str = sc.nextLine();
    System.out.println("入力された文字列は" + str + "です");
    System.out.println(str.length() + "文字入力されました");
    sc.close();
  }

}
