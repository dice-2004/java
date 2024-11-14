// Human8aクラスを継承
public class Monster8a extends Human8a {

  // 引数なしのコンストラクタ
  Monster8a() {
    super();
  }

  // 引数1つのコンストラクタ
  Monster8a(String name) {
    super(name);
  }

  // 抽象メソッドのtypeを実装
  // "モンスター"とタイプを返すメソッド
  public String type() {
    return "モンスター";
  }
}
