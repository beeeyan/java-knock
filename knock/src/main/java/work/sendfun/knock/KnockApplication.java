package work.sendfun.knock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class KnockApplication {

	public static void main(String[] args) {
		SpringApplication.run(KnockApplication.class, args);
	}

}
