package pl.slawek.springio.wizytownik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("pl.slawek.springio.wizytownik")
public class WizytownikApplication {

	public static void main(String[] args) {
		SpringApplication.run(WizytownikApplication.class, args);
	}

}
