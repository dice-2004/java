public class Fraction93 {
  public int num; // 分子
  public int den; // 分母

  // 引数2つのコンストラクタ
  // int型の引数n、dをそれぞれフィールドnum、denに代入する
  // reductionメソッドを利用して約分する
  public Fraction93(int n, int d) {
    this.num = n;
    this.den = d;
    reduction();
  }

  // 2つの値の乗算結果を返す
  // 引数の型はFraction93、戻り値の型はFraction93
  public Fraction93 calcMulti(Fraction93 f) {
    Fraction93 result = new Fraction93(this.num, this.den);
    result.num = this.num * f.num;
    result.den = this.den * f.den;
    result.reduction();
    return result;
  }

  // fを減算した結果を返す
  // 引数の型はFraction93，戻り値の型はFraction93
  public Fraction93 calcSub(Fraction93 f) {
    Fraction93 result = new Fraction93(this.num, this.den);
    result.num = this.num * f.den - f.num * this.den;
    result.den = this.den * f.den;
    result.reduction();
    return result;
  }

  // calcGcdメソッドを利用して、分数を約分するメソッド
  // 分子と分母を最大公約数で割ることで、分数を約分する
  // 引数や戻り値はなし
  public void reduction() {
    int gcd = calcGcd(this.num, this.den);

    this.num /= gcd;
    this.den /= gcd;
  }

  // 2つの数値の最大公約数を計算して返す
  public int calcGcd(int a, int b) {
    int tmp, r;
    if (a < b) {
      tmp = a;
      a = b;
      b = tmp;
    }
    r = a % b;
    while (r != 0) {
      a = b;
      b = r;
      r = a % b;
    }
    return b;
  }
}
