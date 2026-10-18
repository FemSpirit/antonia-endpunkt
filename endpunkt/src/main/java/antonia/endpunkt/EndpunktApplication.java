package antonia.endpunkt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EndpunktApplication {

	public static void main(String[] args) {
		SpringApplication.run(EndpunktApplication.class, args);
	}

	@GetMapping("/endpunkt/antonia")
    public String sagHallo() {
        return "Hallo, das ist Antonias Spring Boot Endpunkt!";
    }

}
