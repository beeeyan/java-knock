package work.sendfun.knock.question;

import java.util.ArrayList;
import java.util.List;

public class Question1 {

    // 以下のメソッドを「for文を使わない形」で書き換えてみてください。
    // 配列をListに変換するメソッド
    public List<String> arrayToList(String[] array) {
        List<String> result = new ArrayList<>();
            for (String str : array) {
                result.add(str);
            }
        return result;
    }

}
