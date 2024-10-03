import java.util.Scanner;
import java.lang.String;

public class Work39 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str;
    String overline;
    int len;
    System.out.println("文字列を入力してください");
    str = sc.nextLine();
    len = str.length();
    System.out.println("上線の文字を入力してください");
    overline = sc.next();

    for (int i = 0; i < len; i++) {
      System.out.print(overline);
    }
    System.out.print("\n");
    System.out.println(str);
    sc.close();
  }
}
