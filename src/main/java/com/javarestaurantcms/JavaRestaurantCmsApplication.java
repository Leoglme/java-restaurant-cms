package com.javarestaurantcms;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class JavaRestaurantCmsApplication {
	public static void main(String[] args) {
		SpringApplication.run(JavaRestaurantCmsApplication.class, args);
	}

	@GetMapping
	public String showHome(Model model) {
		return "MesgPage";
	}
	@GetMapping("/toto")
	public String showToto(Model model) {
		return "toto";
	}
}



