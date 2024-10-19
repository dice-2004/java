import java.util.Scanner;

public class Test1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ballNum = 0;
    String strBall = "";
    char[] ball;
    int correctCount = 0;
    int x;
    int y;

    // (2) strballが5文字未満なら終了
    while (ballNum < 5) {
      System.out.println("ボールの数を入力してください(5以上)");
      ballNum = Integer.parseInt(sc.nextLine());
    }

    while (true) {
      System.out.println("ボールの色を入力して下さい(例 pgrby)");
      strBall = sc.nextLine();
      ball = strBall.toCharArray();
      for (int i = 0; i < ball.length; i++) {
        ball[i] = Character.toLowerCase(ball[i]);
      }

      // (4)
      if (strBall.length() != ballNum) {
        System.out.println("入力された文字列の長さが" + ballNum + "ではありません");
      } else if (checkContainOther(ball)) {
        System.out.println("入力された文字列にrgbyp以外の文字が含まれています");
      } else if (!checkContainAllColor(strBall)) {
        System.out.println("入力された文字列にrgbypすべてが含まれていません");
      } else {
        break;
      }
    }

    System.out.println("並べ替えゲームへようこそ");
    System.out.println("ボールをRGBYPの順に並べ替えてください");
    while (true) {
      changeColorUpLow(ball);
      printArray(ball);
      if (checkAllCollect(ball)) {
        break;
      }

      System.out.println("交換する位置(0から" + (ballNum - 1) + "の番号)を2つ入力してください(例 0 1)");
      x = sc.nextInt();
      y = sc.nextInt();
      if (x < 0 || x >= ballNum || y < 0 || y >= ballNum) {
        System.out.println("入力された位置が範囲外です");
        continue;
      }
      sc.nextLine();

      swap(ball, x, y);
      correctCount += 1;
    }
    System.out.println("正解です");
    System.out.println(correctCount + "回の操作で正しい順に並べました");
    sc.close();

  }

  public static boolean checkContainOther(char[] ball) {
    for (char b : ball) {
      switch (b) {
        case 'r':
        case 'g':
        case 'b':
        case 'y':
        case 'p':
          break;
        default:
          return true;
      }
    }
    return false;
  }

  public static boolean checkContainAllColor(String strBall) {
    if (strBall.contains("r") && strBall.contains("g") && strBall.contains("b") && strBall.contains("y")
        && strBall.contains("p")) {
      return true;
    } else {
      return false;
    }
  }

  // 正しく並んでいるか判定
  public static boolean checkAllCollect(char[] ball) {
    boolean isCollect = true;
    for (int i = 0; i < ball.length; i++) {
      if (!checkOneCollect(ball, i)) {
        isCollect = false;
      }
    }
    return isCollect;
  }

  public static void changeColorUpLow(char[] ball) {
    if (ball.length == 5) {
      for (int i = 0; i < ball.length; i++) {
        if (checkFiveCollect(ball, i)) {
          ball[i] = Character.toUpperCase(ball[i]);
        } else {
          ball[i] = Character.toLowerCase(ball[i]);
        }
      }
    } else {
      for (int i = 0; i < ball.length; i++) {
        if (checkOneCollect(ball, i)) {
          ball[i] = Character.toUpperCase(ball[i]);
        } else {
          ball[i] = Character.toLowerCase(ball[i]);
        }
      }
    }
  }

  public static boolean checkFiveCollect(char[] ball, int i) {
    char[] five = { 'r', 'g', 'b', 'y', 'p' , 'R', 'G', 'B', 'Y', 'P'};
    if (ball[i] == five[i] || ball[i] == five[i+5]) {
      return true;
    }
    return false;

  }

  // 文字一つ一つに対してひとつ前までの文字と比較して正しく並んでいるか判定
  public static boolean checkOneCollect(char[] ball, int i) {
    if(i!=0 && getColorNum(ball[i]) == getColorNum(ball[i-1])) {
      return true;
    }
    for (int j = 1; j < i; j++) {
      if (getColorNum(ball[j]) > getColorNum(ball[i])) {
        return false;
      }
    }
    for (int j=ball.length-1; j>i; j--) {
      if (getColorNum(ball[j]) < getColorNum(ball[i])) {
        return false;
      }
    }
    return true;

  }

  public static int getColorNum(char ball) {
    switch (ball) {
      case 'r':
      case 'R':
        return 0;
      case 'g':
      case 'G':
        return 1;
      case 'b':
      case 'B':
        return 2;
      case 'y':
      case 'Y':
        return 3;
      case 'p':
      case 'P':
        return 4;
      default:
        return -1;
    }
  }

  // swap関数
  public static void swap(char[] ball, int x, int y) {
    char tmp = ball[x];
    ball[x] = ball[y];
    ball[y] = tmp;
  }

  // 配列を表示
  public static void printArray(char[] ball) {
    System.out.println("現在のボールの状態");
    for (char b : ball) {
      System.out.print(b + " ");
    }
    System.out.println();
  }
}
