package congtc.dev.appicationProperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AppicationPropertiesApplication {

	@Value("${cong.ten}")
	private String ten;
	public static void main(String[] args) {
		SpringApplication.run(AppicationPropertiesApplication.class, args);
	}

	@GetMapping(value = "/")
	public String index() {
		return "Hello world!" + ten;
	}
}
