package work.sendfun.knock.question;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class TestPractice {

    public String greeting(String greet){
        if(StringUtils.isEmpty(greet)) {
            return "Say something...";
        }
        return "hello";
    }
}
