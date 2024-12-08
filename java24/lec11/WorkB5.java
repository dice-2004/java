import java.util.Scanner;

import javax.swing.plaf.TreeUI;

public class WorkB5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("文字列を入力してください");
    String inputString = sc.nextLine();
    System.out.println("検索する文字を入力してください");
    char searchChar = sc.nextLine().charAt(0);
    System.out.println("置換後の文字を入力してください");
    char replaceChar = sc.nextLine().charAt(0);
    int index = -1;
    String result = "";
    while (true) {
      index = inputString.indexOf(searchChar, index + 1);
      if (index == -1) {
        break;
      }
      result += index + "と";
    }
    if (result.length() == 0) {
      System.out.println("文字「" + searchChar + "」は文字列に存在しません");
    } else {
      System.out.println("文字「" + searchChar + "」は位置" + result.substring(0, result.length() - 1) + "に存在します");
    }

    System.out.println("置換後の文字列「"+inputString.replace(searchChar, replaceChar)+"」");
  }
}
