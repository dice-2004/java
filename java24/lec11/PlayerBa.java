import java.util.ArrayList;

public class PlayerBa {
  private ArrayList<CardBa> cards = new ArrayList<>();

  public void addCard(CardBa card) {
    cards.add(card);
  }

  public String toString() {
    String str = "現在の手札/";
    for (CardBa card : cards) {
      str += card + " ";
    }
    return str;
  }

  public int getPoint() {
    int point = 0;
    int aFlag = 0;
    for (CardBa card : cards) {
      String number = card.getNumber();
      if (number.equals("A")) {
        aFlag++;
      } else if (number.equals("J") || number.equals("Q") || number.equals("K")) {
        point += 10;
      } else {
        point += Integer.parseInt(number);
      }
    }
    for (int i = 0; i < aFlag; i++) {
      if (point + 11 > 21) {
        point += 1;
      } else {
        point += 11;
      }
    }
    return point;
  }
}
