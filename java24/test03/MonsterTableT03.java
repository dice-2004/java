import java.io.IOException;
import java.util.ArrayList;

public class MonsterTableT03 extends BaseTableT03 {
  private ArrayList<MonsterT03> monsterList = new ArrayList<MonsterT03>();

  public MonsterTableT03(String fname) {
    this.fname = fname;
  }

  @Override
  public void inputData() {
    try {
      int count = 0;
      for (String line : super.readFile()) {
        String[] data = line.split(",");
        MonsterT03 monster = new MonsterT03(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]));
        monsterList.add(monster);
        count++;
      }
      System.out.println("「" + count + "匹のモンスターデータを読み込みました」");
    } catch (IOException e) {
      System.out.println("ファイルの読み込みに失敗しました");
    }
  }

  @Override
  public void printData() {
    for (MonsterT03 monster : monsterList) {
      System.out.print(monster);
    }
  }

  @Override
  public void find(String name) throws MonsterNotFoundExceptionT03 {
    int count = 0;
    for (MonsterT03 monster : monsterList) {
      if (monster.getName().equals(name)) {
        System.out.print(monster);
        count++;
      }
    }

    if (count == 0) {
      throw new MonsterNotFoundExceptionT03("「モンスターが見つかりません」" + name);
    }
  }

  public MonsterT03 serchMonsterT03(String name) throws MonsterNotFoundExceptionT03 {
    for (MonsterT03 monster : monsterList) {
      if (monster.getName().equals(name)) {
        return monster;
      }
    }
    throw new MonsterNotFoundExceptionT03("「モンスターが見つかりません」" + name);
  }
}
