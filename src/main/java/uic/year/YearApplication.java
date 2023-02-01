package uic.year;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class YearApplication {

	public static void main(String[] args) {
		SpringApplication.run(YearApplication.class, args);
	}

}
