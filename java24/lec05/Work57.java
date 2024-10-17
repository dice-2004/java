public class Work57 {
  public static void main(String[] args) {
    if (args.length > 0) {
      int[] array = new int[args.length];
      parseArray(args, array);
      System.out.println("---処理対象の配列---");
      printArray(array);
      selectionSort(array);
      System.out.println("--- selectionSort の結果---");
      printArray(array);
    } else {
      System.out.println("コマンドライン引数を1個以上指定してください。");
    }
  }

  public static void parseArray(String[] args, int[] array) {
    for(int i = 0; i < args.length; i++) {
      array[i]= Integer.parseInt(args[i]);
    }
  }

  public static void printArray(int[] array) {
    System.out.print("[");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i]);
      if (i < array.length - 1) {
        System.out.print(" ");
      }
    }
    System.out.println("]");
  }

  public static void selectionSort(int[] array) {
    for(int i=0;i<array.length-1;i++) {
      int minIndex = i;
      for(int j=i+1;j<array.length;j++) {
        if(array[j] < array[minIndex]) {
          minIndex = j;
        }
      }
      int tmp = array[i];
      array[i] = array[minIndex];
      array[minIndex] = tmp;
    }
  }
}
