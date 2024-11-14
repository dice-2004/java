// Human8aクラスを継承
public class Hero8a extends Human8a {

  // 引数なしのコンストラクタ
  Hero8a() {
    super();
  }

  // 引数1つのコンストラクタ
  Hero8a(String name) {
    super(name);
  }

  // 抽象メソッドのtypeを実装
  // "ヒーロー"とタイプを返すメソッド
  public String type() {
    return "ヒーロー";
  }
}
