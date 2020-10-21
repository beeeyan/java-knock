package work.sendfun.knock.question;

import java.util.ArrayList;
import java.util.List;

public class Question2 {

    // 以下のメソッドを「for文、及び if文なし」で書き換えてみてください。
    // 配列をListに変換するメソッド
    public List<String> arrayToList(String[] array) {
        List<String> result = new ArrayList<>();
        if(array != null) {
            for (String str : array) {
                result.add(str);
            }
        }
        return result;
    }
}
