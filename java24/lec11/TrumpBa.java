import java.util.ArrayList;

public class TrumpBa {
  private ArrayList<CardBa> cards = new ArrayList<>();

  public TrumpBa(String[] args) {
    for (String card : args) {
      cards.add(new CardBa(card));
    }
  }

  public void show() {
    for (CardBa card : cards) {
      System.out.print(card);
    }
  }

  public CardBa getCards() {
    CardBa card = cards.get(0);
    cards.remove(0);
    return card;
  }
}
