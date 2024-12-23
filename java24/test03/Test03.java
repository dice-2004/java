import java.util.Scanner;

public class Test03 {
  public static void main(String[] args) {
    try {
      if (args.length < 3) {
        throw new IllegalArgumentException("「使い方」java Test03 <heroes.csv> <monsters.csv> <events.csv>");
      }
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
      return;
    }
    Scanner sc = new Scanner(System.in);
    HeroTableT03 heros = new HeroTableT03(args[0]);
    MonsterTableT03 monsters = new MonsterTableT03(args[1]);
    EventTableT03 events = new EventTableT03(args[2], 50.0, 1.5);
    heros.inputData();
    monsters.inputData();
    events.inputData();
    CommandHandlerT03 ch = new CommandHandlerT03();
    boolean flag = true;
    while (flag) {
      try {
        System.out.println("「コマンドを入力してください」");
        String command = sc.nextLine();
        flag = ch.handleCommand(command, heros, monsters, events);
      } catch (InvalidCommandExceptionT03 e) {
        System.out.println(e.getMessage());
      } catch (HeroNotFoundExceptionT03 e) {
        System.out.println(e.getMessage());
      } catch (MonsterNotFoundExceptionT03 e) {
        System.out.println(e.getMessage());
      }
    }
    sc.close();
  }
}
