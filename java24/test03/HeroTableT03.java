import java.io.IOException;
import java.util.ArrayList;

public class HeroTableT03 extends BaseTableT03 {
  private ArrayList<HeroT03> heroList = new ArrayList<HeroT03>();

  public HeroTableT03(String fname) {
    this.fname = fname;
  }

  @Override
  public void inputData() {
    try {
      int count = 0;
      for (String line : super.readFile()) {
        String[] data = line.split(",");
        HeroT03 hero = new HeroT03(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]),
            Integer.parseInt(data[3]));
        heroList.add(hero);
        count++;
      }
      System.out.println("「" + count + "人の勇者データを読み込みました」");
    } catch (IOException e) {
      System.out.println("ファイルの読み込みに失敗しました");
    }
  }

  @Override
  public void printData() {
    for (HeroT03 hero : heroList) {
      System.out.print(hero);
    }
  }

  @Override
  public void find(String name) throws HeroNotFoundExceptionT03 {
    int count = 0;
    for (HeroT03 hero : heroList) {
      if (hero.getName().equals(name)) {
        System.out.print(hero);
        count++;
      }
    }
    if (count == 0) {
      throw new HeroNotFoundExceptionT03("「勇者が見つかりません」" + name);
    }
  }

  public ArrayList<HeroT03> searchHeroT03(String[] names) throws HeroNotFoundExceptionT03 {
    ArrayList<HeroT03> searchHeroList = new ArrayList<HeroT03>();
    int count = 0;
    for (String name : names) {
      count = 0;
      for (HeroT03 hero : heroList) {
        if (hero.getName().equals(name)) {
          searchHeroList.add(hero);
          count++;
          break;
        }
      }
      if (count == 0) {
        throw new HeroNotFoundExceptionT03("「勇者が見つかりません」" + name);
      }
    }
    return searchHeroList;
  }
}
