package work.sendfun.knock.answer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Answer2 {

    // 配列をListに変換するメソッド
    public List<String> arrayToList(String[] array) {

        Optional<String[]> optionalStrings = Optional.ofNullable(array);
        return Arrays.stream(optionalStrings.orElse(new String[0])).collect(Collectors.toList());
    }

}
