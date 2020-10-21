package work.sendfun.knock.question;

import org.junit.Before;
import org.junit.Test;
import work.sendfun.knock.answer.Answer2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Question2Test {

    private Question2 inst;
    // 答えチェック用
    // private Answer2 inst;

    @Before
    public void setUp(){
        inst = new Question2();
        // 答えチェック用
        // inst = new Answer2();
    }

    @Test
    public void arrayToListNormal(){
        String[] testData = {"a", "b", "c", "d"};
        List<String> expected = Arrays.asList("a", "b", "c", "d");
        assertThat(inst.arrayToList(testData), is(expected));
    }

    @Test
    public void arrayToListNullCheck(){
        List<String> expected = new ArrayList<>();
        assertThat(inst.arrayToList(null), is(expected));
    }


}
