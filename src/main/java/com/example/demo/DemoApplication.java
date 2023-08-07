package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.usuarioControler;

@SpringBootApplication
@RestController
public class DemoApplication {

	
	
	

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
    @GetMapping
	public String hello () {
		return "HELLO WORLD TO ALL NEEGA";
	}


	
}
