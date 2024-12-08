public class GameBa {
  private TrumpBa trump;
  private PlayerBa player;
  private PlayerBa dealer;

  public GameBa(TrumpBa trump) {
    this.trump = trump;
    player = new PlayerBa();
    dealer = new PlayerBa();
  }

  public void setUpPlayer() {
    player.addCard(trump.getCards());
    player.addCard(trump.getCards());
  }

  public void setUpDealer() {
    dealer.addCard(trump.getCards());
    dealer.addCard(trump.getCards());
  }

  public void hitPlayer() {
    // System.out.println("Playerのターンです");
    player.addCard(trump.getCards());
    // player.show();
  }

  public void hitDealer() {
    System.out.println("Dealerがカードを引きます");
    dealer.addCard(trump.getCards());
    // dealer.show();
  }

  public void standPlayer() {
    System.out.println("Playerのターンが終了しました");
    // player.show();
  }


  public void judge() {
    int playerPoint = player.getPoint();
    int dealerPoint = dealer.getPoint();
    System.out.println("Playerのスコア「" + playerPoint + "」");
    System.out.println("Dealerのスコア「" + dealerPoint + "」");
    if (playerPoint > 21) {
      System.out.println("Playerの負けです");
    } else if (dealerPoint > 21) {
      System.out.println("Playerの勝ちです");
    } else if (playerPoint > dealerPoint) {
      System.out.println("Playerの勝ちです");
    } else if (playerPoint < dealerPoint) {
      System.out.println("Playerの負けです");
    } else {
      System.out.println("引き分けです");
    }
  }

  public void showPlayer() {
    System.out.println(this.player);
  }

  public void showDealer() {
    System.out.println(this.dealer);
  }

  public int getPlayerPoint() {
    return player.getPoint();
  }

  public int getDealerPoint() {
    return dealer.getPoint();
  }
}
