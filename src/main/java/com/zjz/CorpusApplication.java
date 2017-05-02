package com.zjz;

import com.zjz.service.CorpusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class CorpusApplication {

	public static void main(String[] args) {
		SpringApplication.run(CorpusApplication.class, args);
	}
}
