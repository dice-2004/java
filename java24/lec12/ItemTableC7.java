import java.util.ArrayList;

public class ItemTableC7 {
  private ArrayList<ItemC7> itemTable;

  // itemListを初期化するコンストラクタ
  public ItemTableC7() {
    itemTable = new ArrayList<ItemC7>();
  }

  // 指定された商品コードで商品を追加する
  public void add(String code, String name) {
    for (ItemC7 item : itemTable) {
      if (item.getCode().equals(code)) {
        throw new IllegalArgumentException("「商品コードはすでに登録済みです」");
      }
    }
    itemTable.add(new ItemC7(code, name));
  }

  // 指定された商品コードの商品を検索する
  public ItemC7 search(String code) throws NoSuchItemExceptionC7 {
    for (ItemC7 item : itemTable) {
      if (item.getCode().equals(code)) {
        return item;
      }
    }
    throw new NoSuchItemExceptionC7("「商品が見つかりません」");
  }

  // 指定された商品コードの商品を削除する
  public void remove(String code) throws NoSuchItemExceptionC7 {
    ItemC7 item = search(code);
    itemTable.remove(item);
  }
}
