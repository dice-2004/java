import java.util.Scanner;

public class WorkC5 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try{
      System.out.println("「乱数の種を入力してください」");
      NumbersC5 numbers = new NumbersC5(Integer.parseInt(sc.nextLine()));
      while (true) {
        numbers.playGame(sc);
        System.out.println("「ゲームを継続しますか」");
        String line = sc.nextLine();
        if (!line.toLowerCase().equals("yes")) {
          break;
        }
    }
    }catch(NumberFormatException e){
      System.out.println("「乱数の種に整数値以外が指定されました」");
    } finally {
      sc.close();
    }


  }

}
