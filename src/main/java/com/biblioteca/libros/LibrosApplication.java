package com.biblioteca.libros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LibrosApplication {
	@GetMapping("/message")
	public String message(){
		return "La app se desplego correctamente";
	}
	public static void main(String[] args) {
		SpringApplication.run(LibrosApplication.class, args);
	}

}
