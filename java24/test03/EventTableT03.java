import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.io.PrintWriter;

public class EventTableT03 extends BaseTableT03 {
  private ArrayList<EventT03> eventList = new ArrayList<EventT03>();
  private double critRate;
  private double critDamage;

  public EventTableT03(String fname, double rate, double damage) {
    this.fname = fname;
    this.critRate = rate;
    this.critDamage = damage;
  }

  @Override
  public void inputData() {
    try {
      int count = 0;
      for (String line : super.readFile()) {
        String[] data = line.split(",");
        EventT03 matchEvent = serchEvent(data[0]);
        if (matchEvent != null) {
          matchEvent.setHeroName(matchEvent.getHeroName() + "/" + data[2]);
          continue;
        }
        if (data[3].equals("success")) {
          data[3] = "成功";
        } else if (data[3].equals("fail")) {
          data[3] = "失敗";
        }
        EventT03 event = new EventT03(data[0], data[1], data[2], data[3]);
        eventList.add(event);
        count++;
      }
      System.out.println("「" + count + "個のイベントデータを読み込みました」");
    } catch (IOException e) {
      System.out.println("ファイルの読み込みに失敗しました");
    }
  }

  @Override
  public void printData() {
    for (EventT03 event : eventList) {
      System.out.print(event);
    }
  }

  @Override
  public void find(String name) throws HeroNotFoundExceptionT03 {
    int count = 0;
    for (EventT03 event : eventList) {
      String[] heroName = event.getHeroName().split("/");
      for (String hero : heroName) {
        if (hero.equals(name)) {
          System.out.print(event);
          count++;
        }
      }
    }
    if (count == 0) {
      throw new HeroNotFoundExceptionT03("「勇者が見つかりません」" + name);
    }
  }

  private EventT03 serchEvent(String eventName) {
    for (EventT03 event : eventList) {
      if (event.getEventName().equals(eventName)) {
        return event;
      }
    }
    return null;
  }

  public void createEvent(String eventName, String monsterName, String[] heroName, HeroTableT03 heros,
      MonsterTableT03 monsters) {
    try {
      MonsterT03 monster = monsters.serchMonsterT03(monsterName);
      ArrayList<HeroT03> heroList = new ArrayList<HeroT03>();
      heroList = heros.searchHeroT03(heroName);
      int heroHp = 0;
      for (HeroT03 hero : heroList) {
        heroHp += hero.getHealth();
      }
      int heroDefense = 0;
      for (HeroT03 hero : heroList) {
        heroDefense += hero.getDefense();
      }
      int monsterHp = monster.getHealth();
      Random rand = new Random();
      String result;
      while (true) {
        for (HeroT03 hero : heroList) {
          if (rand.nextDouble() * 100 < critRate) {
            monsterHp -= hero.getAttack() * critDamage;
          } else {
            monsterHp -= hero.getAttack();
          }
          monsterHp += 100;
          // System.out.println(monsterHp);
        }
        // System.out.println();
        if (monsterHp <= 0) {
          System.out.println("「" + monsterName + "との戦いに勝利しました」");
          result = "成功";
          critRate -= 5;
          critDamage -= 0.1;
          break;
        }
        for (int i = 0; i < heroList.size() / 2 + 1; i++) {
          if (rand.nextDouble() * 100 < 50) {
            heroHp -= monster.getAttack() * 1.5;
          } else {
            heroHp -= monster.getAttack();
          }
          // System.out.println(heroHp);
        }
        heroHp += heroDefense;
        if (heroHp <= 0) {
          System.out.println("「" + monsterName + "との戦いに敗北しました」");
          result = "失敗";
          critRate += 5;
          critDamage += 0.1;
          break;
        }
      }
      String names = "";
      for (String name : heroName) {
        names += name + "/";
      }
      names = names.substring(0, names.length() - 1);
      EventT03 event = new EventT03(eventName, monsterName, names, result);
      eventList.add(event);
    } catch (MonsterNotFoundExceptionT03 e) {
      System.out.println(e.getMessage());
      return;
    } catch (HeroNotFoundExceptionT03 e) {
      System.out.println(e.getMessage());
      return;
    }

  }

  public void save() {
    try {
      PrintWriter pw = new PrintWriter(fname);
      // System.out.println("「イベントデータを保存します」");
      for (EventT03 event : eventList) {
        String[] heroNames = event.getHeroName().split("/");
        for (String heroName : heroNames) {
          String result;
          if (event.getResult().equals("成功")) {
            result = "success";
          } else {
            result = "fail";
          }
          pw.println(event.getEventName() + "," + event.getMonsterName() + "," + heroName + "," + result);
          System.out.printf("「イベント」%-15s「モンスター」%-10s「勇者」%s「結果」%s\n", event.getEventName(),
              event.getMonsterName(), heroName, result);
        }
      }
      pw.close();
      System.out.println("「イベントデータを保存しました」");
    } catch (IOException e) {
      System.out.println("ファイルの書き込みに失敗しました");
    }
  }
}
