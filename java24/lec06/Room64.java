public class Room64 {
  int guests = 0;
  final int MAX_GUESTS = 8;

  // 仮引数 g に追加の宿泊人数を与えられたとき、
  // g とフィールド guests とを合計した値が MAX_GUESTS 以下なら、
  // 何も出力せずに guests に g を加算する。
  // そうでない場合は、「n人オーバー」のようなメッセージを出し、 guests は変更しない。
  // ここで、 n は guests と g を加算した人数が MAX_GUESTS を何人超過しているかを示す。
  public void addGuests(int g) {
    if (g + guests <= MAX_GUESTS) {
      guests += g;
    } else {
      System.out.println((g + guests - MAX_GUESTS) + "人オーバー");
    }
  }

  // あと何人まで宿泊客を受け入れ可能かのメッセージを「あと2人まで可能」のように出力する。
  public void checkGuests() {
    System.out.println("あと" + (MAX_GUESTS - guests) + "人まで可能");
  }

}
