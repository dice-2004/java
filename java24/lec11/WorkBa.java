import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkBa {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<String> requireCards = new ArrayList<>(Arrays.asList(
        "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"));
    int flag = 0;
    if (args.length > 13) {
      System.out.println("エラー「13枚のカードを引数として指定してください」");
      return;
    } else if (args.length < 13) {
      System.out.println("エラー「13枚のカードを引数として指定してください」");
    } else {
      flag = 1;
    }
    for (String card : args) {
      if (requireCards.contains(card)) {
        requireCards.remove(card);
      } else if (flag == 1) {
        System.out.println("エラー「無効なカードが含まれています」");
        return;
      }
    }
    if (flag != 1) {
      System.out.print("不足しているカード");
      for (String requirecard : requireCards) {
        System.out.print("[" + requirecard + "]");
      }
      return;
    } else {
      System.out.println("ゲームを開始します");
    }

    TrumpBa trump = new TrumpBa(args);
    // trump.show();
    GameBa game = new GameBa(trump);
    game.setUpPlayer();
    System.out.println("Playerのターンです");
    while (true) {
      int pFlag = 0;
      while (true) {
        game.showPlayer();
        System.out.println("HitまたはStand を入力してください");
        String input = sc.nextLine();
        if (input.equalsIgnoreCase("Hit")) {
          pFlag = 1;
          break;
        } else if (input.equalsIgnoreCase("Stand")) {
          pFlag = 0;
          break;
        } else {
          System.out.println("コマンドが間違っています");
        }
      }
      if (pFlag == 1) {
        game.hitPlayer();
      } else {
        game.standPlayer();
        break;
      }
      if (game.getPlayerPoint() > 21) {
        System.out.println("バーストしました");
        break;
      }
    }

    game.setUpDealer();

    System.out.println("Dealerのターンです");
    while (true) {
      game.showDealer();
      if (game.getDealerPoint() < 17) {
        game.hitDealer();
      } else {
        break;
      }

      if (game.getDealerPoint() > 21) {
        game.showDealer();
        break;
      }
    }
    game.judge();
  }
}
