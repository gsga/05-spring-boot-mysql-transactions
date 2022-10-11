package tup.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("ESTO VA A SALIR EN DEBUG CONSOLE BIEN AL PRINCIPIO");
		SpringApplication.run(DemoApplication.class, args);
	}

}
