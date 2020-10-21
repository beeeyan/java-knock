package work.sendfun.knock.answer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Answer1 {

    // 配列をListに変換するメソッド
    public List<String> arrayToList(String[] array) {
        return Arrays.stream(array).collect(Collectors.toList());
    }

}
