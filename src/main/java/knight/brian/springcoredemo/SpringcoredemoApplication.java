package knight.brian.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Packages not within the SpringApplication directory must be specified with annotation parameter
// Test by moving Coach & CricketCoach to util package
@SpringBootApplication(
		scanBasePackages = {"knight.brian.springcoredemo",
							"knight.brian.util"}
)
//@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
