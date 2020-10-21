package work.sendfun.knock.question;

import org.junit.Before;
import org.junit.Test;
import work.sendfun.knock.answer.Answer1;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Question1Test {

    // private Question1 inst;
    private Answer1 inst;

    @Before
    public void setUp(){
        // inst = new Question1();
        inst = new Answer1();
    }

    @Test
    public void arrayToListNormal(){
        String[] testData = {"a", "b", "c", "d"};
        List<String> expected = Arrays.asList("a", "b", "c", "d");
        assertThat(inst.arrayToList(testData), is(expected));
    }


}
