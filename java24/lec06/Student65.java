public class Student65 {
  final int MAX_CREDITS = 124;
  String name; // 学生の名前
  int id; // 学生番号
  int credits; // 単位数

  // 学生の情報を次の形式で出力する。
  // "_"は半角スペースを表している。スペースの個数は表示する文字数によって変わる。
  // 1,____Alex,120単位,卒業まで__4単位必要
  // 上記出力例では、"1"が「学生番号」、"Alex"が「学生の名前」、"120"が「単位数」、"4"が卒業までに必要な単位数である。
  // 書式指定は以下の通り。
  // 学生番号：「修飾なし」「桁指定なし」の整数。
  // 名前：「修飾なし」「8桁」の文字列。
  // 単位数：「修飾なし」「3桁」の整数。
  // なお、卒業可能な場合は次のような出力となる。
  // 1,___Felix,124単位,卒業可能
  public void print() {
    System.out.printf("%d,%8s,%3d単位,%s\n", this.id, this.name, this.credits, this.getGradState());
  }

  // 取得単位数を表す credits が MAX_CREDITS 以上かどうかを boolean 型で返却する。
  public boolean checkGraduate() {
    return this.credits >= MAX_CREDITS;
  }

  // 取得単位数を表す credits が MAX_CREDITS 以上なら "卒業可能" という文字列を、
  // それ以外なら卒業まで必要な単位数を "卒業まで_14単位必要" のように整形した文字列を返却する。
  // "_"は半角スペースを表している。スペースの個数は表示する文字数によって変わる。
  // 不足単位数表示部分の書式指定は以下の通り。
  // 「修飾なし」「3桁」の整数。
  public String getGradState() {
    if(this.checkGraduate()) {
      return "卒業可能";
    } else {
      return "卒業まで " + (MAX_CREDITS - this.credits) + "単位必要";
    }
  }
}
