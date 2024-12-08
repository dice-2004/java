public class BookB7 {
  String title;
  String author;
  int price;

  public BookB7(String title, String author, int price) {
    this.title = title;
    this.author = author;
    this.price = price;
  }
  public String toString() {
    return "本「" + title + "」著者「" + author + "」金額「" + price + "円」";
  }
}
