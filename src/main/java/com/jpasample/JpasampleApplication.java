package com.jpasample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpasample.controller.ItemController;

@SpringBootApplication
public class JpasampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpasampleApplication.class, args);
	}

}
