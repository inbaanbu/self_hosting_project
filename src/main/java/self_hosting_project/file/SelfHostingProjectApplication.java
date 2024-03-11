package self_hosting_project.file;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class SelfHostingProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SelfHostingProjectApplication.class, args);
	}
   @GetMapping("/api")
	public String inba() {
		return "hii inba self hosting is running";
		
	}
}
