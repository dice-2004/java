public class CommandHandlerT03 {

  private String[] commands;

  public boolean handleCommand(String command, HeroTableT03 heros, MonsterTableT03 monsters, EventTableT03 events)
      throws InvalidCommandExceptionT03, HeroNotFoundExceptionT03, MonsterNotFoundExceptionT03 {
    this.commands = command.split(" ");
    // System.out.println(command);
    try {
      switch (commands[0]) {
        case "h":
          this.handleHeroCommand(heros);
          return true;
        case "m":
          this.handleMonsterCommand(monsters);
          return true;
        case "e":
          this.handleEventCommand(events);
          return true;
        case "c":
          this.handleCreateCommand(events, heros, monsters);
          return true;
        case "q":
          System.out.println("「プログラムを終了します」");
          return false;
        default:
          throw new InvalidCommandExceptionT03("「不明なコマンドです」" + commands[0]);

      }
    } catch (ArrayIndexOutOfBoundsException e) {
      throw new InvalidCommandExceptionT03("「コマンドに指定された引数が正しくありません」");
    }
  }

  private void handleHeroCommand(HeroTableT03 heros) throws InvalidCommandExceptionT03, HeroNotFoundExceptionT03 {
    switch (commands[1]) {
      case "heros":
        heros.printData();
        break;
      case "find":
        if (commands.length < 3) {
          throw new InvalidCommandExceptionT03("「コマンドに指定された引数が正しくありません」");

        } else {
          heros.find(commands[2]);
          break;
        }
      default:
        throw new InvalidCommandExceptionT03("「コマンドに指定された引数が正しくありません」");

    }
  }

  private void handleMonsterCommand(MonsterTableT03 monsters)
      throws InvalidCommandExceptionT03, MonsterNotFoundExceptionT03 {
    switch (commands[1]) {
      case "monsters":
        monsters.printData();
        break;
      case "find":
        if (commands.length < 3) {
          throw new InvalidCommandExceptionT03("「コマンドに指定された引数が正しくありません」");
        } else {
          monsters.find(commands[2]);
          break;
        }

      default:
        throw new InvalidCommandExceptionT03("「コマンドに指定された引数が正しくありません」");

    }
  }

  private void handleEventCommand(EventTableT03 events) throws InvalidCommandExceptionT03, HeroNotFoundExceptionT03 {
    switch (commands[1]) {
      case "events":
        events.printData();
        break;
      case "find":
        if (commands.length < 3) {
          throw new InvalidCommandExceptionT03("「コマンドに指定された引数が正しくありません」");
        } else {
          events.find(commands[2]);
          break;
        }
      case "save":
        events.save();
        break;
      default:
        System.out.println("「コマンドに指定された引数が正しくありません」");
    }
  }

  private void handleCreateCommand(EventTableT03 events, HeroTableT03 heros, MonsterTableT03 monsters) {
    String eventName = commands[1];
    String monsterName = commands[2];
    String[] heroName = new String[commands.length - 3];
    for (int i = 3; i < commands.length; i++) {
      heroName[i - 3] = commands[i];
    }
    events.createEvent(eventName, monsterName, heroName, heros, monsters);
  }
}
