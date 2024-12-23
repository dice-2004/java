public class EventT03 {
  private String eventName;
  private String monsterName;
  private String heroName;
  private String result;

  public EventT03(String eventName, String monsterName, String heroName, String result) {
    this.eventName = eventName;
    this.monsterName = monsterName;
    this.heroName = heroName;
    this.result = result;
  }

  public String getEventName() {
    return eventName;
  }

  public String getMonsterName() {
    return monsterName;
  }

  public String getHeroName() {
    return heroName;
  }

  public String getResult() {
    return result;
  }

  public void setHeroName(String heroName) {
    this.heroName = heroName;
  }

  public String toString() {
    return String.format("「イベント」%-15s「モンスター」%-10s「勇者」%s「結果」%s\n", eventName, monsterName, heroName, result);
  }
}
