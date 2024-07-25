package com.Devops.santaolga_devops_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SantaolgaDevopsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SantaolgaDevopsDemoApplication.class, args);
	}
	
	 @GetMapping("")
	    public String hello() {
	      return String.format("Hello There!!!,welcome to my website");
	    }
	//b1 branch code changes
	@GetMapping("/inbox")//y1 + x1 changes
	    public String inbox() {
	      return String.format("All your emails are going to be listed here");
}


}
