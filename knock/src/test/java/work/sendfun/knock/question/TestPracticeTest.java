package work.sendfun.knock.question;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestPracticeTest {

    private TestPractice testPractice;

    @Before
    public void setUp(){
        testPractice = new TestPractice();
    }

    @Test
    public void greetingGreetToNull(){
        assertThat(testPractice.greeting(null), is("Say something..."));
    }

    @Test
    public void greetingGreetExisted(){
        assertThat(testPractice.greeting("something"), is("hello"));
    }

}
