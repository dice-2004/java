import java.util.Scanner;

public class Work64 {
  // main メソッド中の Room64Base を Room64 に変更しなさい。それ以外の箇所を修正してはいけません。
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 3;
    int min = 1;
    int max = 8;
    Room64 room = new Room64();
    for (int i = 0; i < n; i++) {
      System.out.println(min + "から" + max + "の整数を入力");
      int g = Integer.parseInt(sc.next());
      if (g < min || g > max) {
        System.out.println(min + "から" + max + "の整数を入力してください");
      } else {
        room.addGuests(g);
        room.checkGuests();
      }
    }
    sc.close();
  }
}
