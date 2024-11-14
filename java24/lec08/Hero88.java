public class Hero88 {
  String name = "ミナト";
  int hp = 100;

  // 引数なしのコンストラクタ
  Hero88(){
  }

  // 引数1つのコンストラクタ
  Hero88(String name){
    this.name = name;
  }
  
  // 引数2つのコンストラクタ
  Hero88(String name, int hp){
    this.name = name;
    this.hp = hp;
  }

  // 戦う
  public void attack(Monster88 m) {
    System.out.println(this.name + "の攻撃！");
    m.hp = m.hp -5; 
    System.out.println(m.name + "に5ポイントのダメージをあたえた！");
  }

  // 逃げる
  public void run() {
    System.out.println(this.name + "は逃げ出した！");
  }

  // ステータスを表示
    public void show() {
    System.out.printf("HP %3d | %s\n", this.hp, this.name);
  }
}
